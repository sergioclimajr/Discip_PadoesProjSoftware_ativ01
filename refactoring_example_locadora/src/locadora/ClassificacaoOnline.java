package locadora;

public class ClassificacaoOnline implements ClassificacaoJogo {

	@Override
	public int getCodigoDePreço() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double getValorDoAluguel(int diasAlugado) {
		double valorCorrente = 4 * diasAlugado;
		
		if(diasAlugado > 3) {
			valorCorrente = 3 * diasAlugado;
		}
		
		return valorCorrente;
		
	}
	
	
	

}
