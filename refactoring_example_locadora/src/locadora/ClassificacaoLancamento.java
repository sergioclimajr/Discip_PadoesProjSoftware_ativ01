package locadora;

public class ClassificacaoLancamento implements ClassificacaoDVD, ClassificacaoJogo {

	@Override
	public int getCodigoDePreço() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double getValorDoAluguel(int diasAlugado) {
		 return diasAlugado * 3.00;
	}

	@Override
	public int getPontosDeAlugadorFrequente(int diasAlugado) {
		return diasAlugado > 1? 2:1;
	}
}
