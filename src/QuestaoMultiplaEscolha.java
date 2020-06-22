
public class QuestaoMultiplaEscolha extends QuestaoSimples{
	String alter1;
	String alter2;
	String alter3;
	String alter4;
	
	public QuestaoMultiplaEscolha(String enunciado, String resposta, String alter1, String alter2, String alter3,
			String alter4) {
		super(enunciado, resposta);
		this.alter1 = alter1;
		this.alter2 = alter2;
		this.alter3 = alter3;
		this.alter4 = alter4;
	}
	
	public String aplicarQuestao() {
		return super.enunciado + "\n" + this.alter1 + "\n" + this.alter2 + "\n" + this.alter3 + "\n" + this.alter4;
	}
	
	public float getNota() {
		return super.nota;
	}
	

	public String getAlter1() {
		return alter1;
	}
	public void setAlter1(String alter1) {
		this.alter1 = alter1;
	}
	public String getAlter2() {
		return alter2;
	}
	public void setAlter2(String alter2) {
		this.alter2 = alter2;
	}
	public String getAlter3() {
		return alter3;
	}
	public void setAlter3(String alter3) {
		this.alter3 = alter3;
	}
	public String getAlter4() {
		return alter4;
	}
	public void setAlter4(String alter4) {
		this.alter4 = alter4;
	}
	

}
