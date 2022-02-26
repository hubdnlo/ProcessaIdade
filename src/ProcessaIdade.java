import java.util.Scanner;

public class ProcessaIdade {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a idade do aluno");
		idade=teclado.nextInt();
		
		// criar um procedimento de análise
		// idade > 18 Maior de idade
		// idade < 18 Menor de idade
		
		if(idade<18) {
			System.out.println("Menor de idade");
				}else {
					System.out.println("Maior de idade");
				}

}
}