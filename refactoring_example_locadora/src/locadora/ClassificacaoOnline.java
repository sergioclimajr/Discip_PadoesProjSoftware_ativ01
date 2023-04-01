package locadora;

public class ClassificacaoOnline implements ClassificacaoJogo {

	@Override
	public int getCodigoDePreço() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double getValorDoAluguel(int diasAlugado) {
		double valorCorrente = 4;
		
		if(diasAlugado > 3) {
			valorCorrente += (diasAlugado - 3) * 3;
		}
		
		return valorCorrente;
		
	}
	
	
	

}
