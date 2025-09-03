//Importação Scanner
import java.util.Scanner;

//Iniciação da classe (Mesmo nome do arquivo)
public class QuadradoVazio{
	//Iniciação método main ( Método inicial)
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);		
		int tamanho = scanner.nextInt();
		for(int i = 1; i <= tamanho; i++){
			for(int j = 1; j <= tamanho; j++){
				if(i == 1 || i == tamanho || j == 1 || j == tamanho){
				  System.out.printf("*");
				}else{
				  System.out.printf(" ");
				}
			}
			System.out.println("");
		}

	}
}