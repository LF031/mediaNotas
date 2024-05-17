import java.util.*;
public class Exercicio2_3 {

	public static void main(String[] args) {
		// 1 - variaveis
		String nomeAluno;
		byte nota1;
		byte nota2;
		byte nota3;
		float mediaNotas;
		Scanner leia = new Scanner (System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o nome do aluno: ");
		nomeAluno = leia.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextByte();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextByte();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextByte();

		// 3 - calculos e saida de dados
		mediaNotas = (nota1 + nota2 + nota3) / (float)3;
		if (mediaNotas <= 4) {
			System.out.println("Aluno reprovado!");
		} else if (mediaNotas < 7) {
			System.out.println("Aluno em recuperacao");
		} else {
			System.out.println("Aluno aprovado");
		}
		
		System.out.println("Media de nota: " + mediaNotas);
	}

}
