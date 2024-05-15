package Strategy;

public class Aritmética implements ICalcMedia{
	 
	@Override
	public double calculaMedia(double a, double b) {
		
		return (a+b)/2;
	}
 
	@Override
	public String situação(double media) {
		String situacao;
		if(media >= 5) {
			situacao = "Aprovado";
			return situacao;
		}
		situacao = "Reprovado";
		return situacao;
	}
 
	
	}
