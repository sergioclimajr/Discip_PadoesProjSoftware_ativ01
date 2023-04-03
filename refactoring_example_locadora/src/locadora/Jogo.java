package locadora;

public class Jogo implements Alugavel {
	
	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	public static final int ONLINE = 2;
	
	
	private String titulo;
	private ClassificacaoJogo classificacao;
	private String console;
	
	public Jogo(String titulo, int codigoDePreco, String console) {
	    this.titulo = titulo;
	    getClassificacao(codigoDePreco);
	    this.console = console;
	    
	}
	
	private void getClassificacao(int codigoDePreco) {
		switch (codigoDePreco) {
		case NORMAL: {
			this.classificacao = new ClassificacaoNormal();
			break;
		}
		case LANCAMENTO: {
			this.classificacao = new ClassificacaoLancamento();
			break;
		}
		case ONLINE: {
			this.classificacao = new ClassificacaoOnline();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + codigoDePreco);
		}
	}
	
	@Override
	public String getTitulo() {
		return this.titulo;
	}

	@Override
	public double getValorDoAluguel(int diasAlugado) {
		return classificacao.getValorDoAluguel(diasAlugado);
	}

	@Override
	public int getPontosDeAlugadorFrequente(int diasAlugado) {
		return classificacao.getPontosDeAlugadorFrequente(diasAlugado);
	}
	
	public String getConsole(String console) {
		return this.console;
	}

}
