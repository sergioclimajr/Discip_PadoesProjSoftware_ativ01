package locadora;

public class ClassificacaoInfantil implements ClassificacaoDVD {

	@Override
	public int getCodigoDePreço() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double getValorDoAluguel(int diasAlugado) {
		double valorCorrente = 1.5;

		if(diasAlugado > 3) {
			valorCorrente += (diasAlugado - 3) * 1.5;
		}
		return valorCorrente;
	}

	

}