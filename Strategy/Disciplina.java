package Strategy;

public class Disciplina {
	
	private ICalcMedia calcMedia;
	double media;
	private String nome;
	private double p1;
	private double p2;
	String situação;
	
	
	public ICalcMedia getCalcMedia() {
		return calcMedia;
	}
	public void setCalcMedia(ICalcMedia calcMedia) {
		this.calcMedia = calcMedia;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getP1() {
		return p1;
	}
	public void setP1(double p1) {
		this.p1 = p1;
	}
	public double getP2() {
		return p2;
	}
	public void setP2(double p2) {
		this.p2 = p2;
	}
	public String getSituação() {
		return calcMedia.situação(media);
	}
	public void setSituação(String situação) {
		this.situação = situação;
	}
	
	
	public void CalcularMedia() {
		media = calcMedia.calculaMedia(p1, p2);
	}
	
	public Disciplina (ICalcMedia calcMedia) {
		this.calcMedia = calcMedia;
	}
}