import java.util.Scanner;
public class WhileCuadrado {
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			double cuadrado=0;
			System.out.println("Introduzca un numero mayor a 0");
			double numero = entrada.nextInt();
			while(numero > 0) {
				cuadrado = numero*numero;
				System.out.println("El cuadrado de " + numero + " es "+ cuadrado);
				System.out.println("Introduzca otro numero");
				numero = entrada.nextDouble();
			}
			System.out.println("El numero ingresado debia ser mayor a 0 \n Programa finalizado");
	}
}
