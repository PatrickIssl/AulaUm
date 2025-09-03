//Importação Scanner
import java.util.Scanner;

//Iniciação da classe (Mesmo nome do arquivo)
public class Triangulo{
	//Iniciação método main ( Método inicial)
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);		
		int tamanho = scanner.nextInt();
		for(int i = 0; i < tamanho; i++){
			for(int j = 0; j < i; j++){
				System.out.printf("*");
			}
			System.out.println("");
		}

	}
}