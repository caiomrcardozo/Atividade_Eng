package Strategy;

public class Geométrica implements ICalcMedia{
	 
	@Override
	public double calculaMedia(double a, double b) {
		
		return Math.sqrt(a * b);
	}
 
	@Override
	public String situação(double media ) {
		String situacao;
		if (media >= 7)
		{
			situacao = "Aprovado";
			return situacao;
		}
		
		situacao = "Reprovado";
		return situacao;
	}	
}