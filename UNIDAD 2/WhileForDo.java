
public class WhileForDo {
	public static void main(String[] args) {
		System.out.println("Numeros del 1 al 100 con while");
		int i = 1;
		while(i <= 100) {
			System.out.println(i);
			i++;
		}
		System.out.println("Numero del 1 al 100 con for");
		for(int j = 1;j < 101; j++) {
			System.out.println(j);
		}
		System.out.println("Numeros del 1 al 100 con do");
		int k= 1;
		do{
			System.out.println(k);
			k++;
		}while(k < 101);
	}
}
