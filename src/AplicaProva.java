import java.util.Scanner;

public class AplicaProva {

	public static void main(String[] args) {
		
		int nota;
		nota = 0;
		
		QuestaoSimples questoes[] = new QuestaoSimples[5];
		Scanner input = new Scanner(System.in);
		
		questoes[0] = new QuestaoSimples("O que significa SP?", "São Paulo");
		questoes[1] = new QuestaoMultiplaEscolha("Quantos paus se faz uma canoa?", "Um", "Tres", "Um", "Dois", "Quatro");
		questoes[2] = new QuestaoComDica("Qual é a cor do cavalo branco de Napoleao?", "Branco", "White em portugues");
		questoes[3] = new QuestaoSimples("Quanto é 1 + 1?", "11");
		questoes[4] = new QuestaoSimples("Setembro Chove", "Chove");
		
		for (int i=0; i < questoes.length; i++) {
			System.out.println(questoes[i].aplicarQuestao());
			if (questoes[i].corrigir(input.nextLine())) {
				System.out.println("Você acertou!");
				nota += 2 ;
			} else {
				System.out.println("Voce errou:");
			}
		}
		
		System.out.println("======================");
		System.out.println("==== Fim da prova ====");
		System.out.println("======================");
		System.out.println("");
		
		if (nota >=8 && nota <= 10) {
			System.out.println("Parabens!!! You Rock!!!");
			System.out.println("Sua nota foi " + nota);
		} else if (nota < 8 && nota > 4 ) {
			System.out.println("Sua nota foi " + nota);
		} else {
			System.out.println("Sua nota foi " + nota);
			System.out.println("Você precisa estudar mais!!!");
		}
		
		System.out.println("");
		System.out.println("======================");
		
	}

}
