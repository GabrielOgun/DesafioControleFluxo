import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();
		


		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println ("O segundo parâmetro deve ser maior que o primeiro");
		}


        scan.close();
    
    




		
	}




	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm < parametroDois){
            throw new ParametrosInvalidosException();
        }
		
		int contagem =  parametroUm  -  parametroDois;

        for(int i = 0; contagem >= i; i++){
            System.out.println( "imprimindo o numero " + i);
        }
		
	}
}