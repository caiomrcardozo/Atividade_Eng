package Strategy;

public class Main {
	public static void main(String[] args) {
		//Aritmética calculo = new Aritmética(); 
		Geométrica calculo = new Geométrica();
		
		Disciplina d = new Disciplina(calculo);
		
		d.setNome( "Padroes de Desenvolvimento");
		d.setP1(10); d.setP2(5);
		d.CalcularMedia();
		System.out.println(
				
				String.format("P1:%.2f P2:%.2f Media:%.2f  Situacao: %s",
						
			d.getP1(),d.getP2(), d.getMedia(), d.getSituação()));

	}
}