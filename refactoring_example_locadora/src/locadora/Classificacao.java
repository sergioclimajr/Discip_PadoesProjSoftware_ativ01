package locadora;

public interface Classificacao {
	abstract int getCodigoDePreço();
	abstract double getValorDoAluguel(int diasAlugado);
	default int getPontosDeAlugadorFrequente(int diasAlugado) {
		return 1;
	}
}

