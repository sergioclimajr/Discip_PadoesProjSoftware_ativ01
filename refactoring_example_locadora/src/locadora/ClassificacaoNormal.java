package locadora;

public class ClassificacaoNormal implements ClassificacaoJogo, ClassificacaoDVD {

	@Override
	public int getCodigoDePreço() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getValorDoAluguel(int diasAlugado) {
		double valorCorrente = 2.0;
		if(diasAlugado > 2) {
			valorCorrente += (diasAlugado - 2) * 1.5;
		}
		return valorCorrente;
	}

	
}