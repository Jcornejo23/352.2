import java.util.Scanner;
import java.text.DecimalFormat;
public class ExamenIMC {
	public static void main(String[] args) {
MenuElegido(calcularImc());
		
	}
	
	public static double calcularImc() {
		//Resultado a dos decimales
		DecimalFormat df = new DecimalFormat("#.00");
		//Solicitud de datos
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su peso");
		double peso = entrada.nextFloat();
		System.out.println("Ingrese su altura");
		double altura = entrada.nextFloat();
		//Cálculo IMC
		double imc = peso/(altura*altura);
		//Resultado a dos decimales
		System.out.println("Su IMC es: " + df.format(imc));
		return imc;
	}
	
	public static void MenuElegido(double imc) {
		//Ticket
		if(imc < 16) {
			System.out.println("Deslagdez severa \n Menú 2");
		}
		else if(imc > 16 && imc < 16.99) {
			System.out.println("Delgadez moderada \n Menu 2");
		}
		else if(imc > 17 && imc < 18.49) {
			System.out.println("Delgadez aceptable \n Menu 2");
		}
		else if(imc > 18.5 && imc < 24.99)
			System.out.println("Peso normal \n Menu Normal");
		else if(imc > 25 && imc < 29.99)
			System.out.println("Sobre peso \n Menu 3");
		else if(imc > 30 && imc < 34.99)
			System.out.println("Obeso tipo I \n Menu 3");
		else if(imc > 35 && imc < 40)
			System.out.println("Obeso tipo II \n Menu 3");
		else
			System.out.println("No existe clasificacion \n No aplica");
		
	}
}
