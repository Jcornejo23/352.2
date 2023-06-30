import java.util.*;
public class DoAcumulador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, suma = 0;
		do {
			System.out.println("Introduzca el numero");
			num = sc.nextInt();
			suma += num;
			
		}while(num != 0);
		System.out.println("La suma de todos los numeros es: " + suma);
	}
}
