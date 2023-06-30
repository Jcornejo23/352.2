import java.util.Scanner;
public class ForFactorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el numero a calucular su factoriual");
		int num = entrada.nextInt();
		double factorial = 1;
		for(int i = num; i > 0; i--) {
			factorial *= i;
		}
		System.out.println("El factorial de " + num + " es " + factorial);
	}
}
