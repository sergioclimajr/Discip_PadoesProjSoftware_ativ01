package locadora;

public class DVD implements Alugavel {
	  public static final int NORMAL = 0;
	  public static final int LANCAMENTO = 1;
	  public static final int INFANTIL = 2;

	  private String titulo;
	  private ClassificacaoDVD classificacao;

	  public DVD(String titulo, int codigoDePreco) {
	    this.titulo = titulo;
	    getClassificacao(codigoDePreco);
	    
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
		case INFANTIL: {
			this.classificacao = new ClassificacaoInfantil();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + codigoDePreco);
		}
	}
	
	  @Override
	  public String getTitulo() {
	    return titulo;
	  }
	 
	  @Override
	  public int getPontosDeAlugadorFrequente (int diasAlugado) {
			return classificacao.getPontosDeAlugadorFrequente(diasAlugado);
		}
	   
	   
	   @Override
	   public double getValorDoAluguel(int diasAlugado) {
			return classificacao.getValorDoAluguel(diasAlugado);
			}
}
