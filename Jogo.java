import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha um n�mero entre 0 e 10: ");
		int numeroEscolhido =  input.nextInt();
		
		int numeroAleatorio = (int) Math.round(Math.random() * 10);
		
		if(numeroEscolhido == numeroAleatorio) {
			System.out.println("parece que hoje � seu dia de sorte, voc� acertou em cheio!!!");
		} else { 
			System.out.println("Tente novamente, o resultado era: " + numeroAleatorio);
		}
		input.close();
	}

}
