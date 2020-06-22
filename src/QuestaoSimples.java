import java.util.Scanner;

public class QuestaoSimples {
	String enunciado;
	String resposta;
	int nota;
	String respostaAluno;
	
	Scanner input = new Scanner(System.in);


	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String aplicarQuestao() {
		return this.enunciado;
	}

	public boolean corrigir(String respostaAluno) {

		if (respostaAluno.equals(this.resposta)) {
			return true;
		}

		return false;
	}

	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setRespostaAluno(String respostaAluno) {
		this.respostaAluno = respostaAluno;
	}
	
	public float getNota() {
		return this.nota;
	}
}
