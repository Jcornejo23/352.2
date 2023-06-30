import java.util.Scanner;
public class WhileMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, suma = 0, elementos = 0;
		float media;
		System.out.println("Introduzca un numero");
		num = sc.nextInt();
		
		while(num >= 0) {
			suma += num;
			elementos++;
			System.out.println("Desea ingresar otro numero?");
			char eleccion = sc.next().charAt(0);
			if(eleccion == 121){
				System.out.println("Introduce otro numero");
				num = sc.nextInt();
			}
			else {
				media = (float)suma/elementos;
				System.out.println("La media es " + media);
				break;
			}
							
		}
		System.out.println("FIN DEL PROGRAMA");
	}
}
