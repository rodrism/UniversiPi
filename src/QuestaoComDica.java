
public class QuestaoComDica extends QuestaoSimples {
	String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	public String aplicarQuestao() {
		return this.enunciado + "\n\nDica: " + this.dica;
	}
	
	
}
