package locadora;

public interface Classificacao {
	abstract int getCodigoDePre�o();
	abstract double getValorDoAluguel(int diasAlugado);
	default int getPontosDeAlugadorFrequente(int diasAlugado) {
		return 1;
	}
}

