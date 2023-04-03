package locadora;

public class Aluguel {
	private Alugavel alugavel;
	private int diasAlugado;
	
	   public Aluguel(Alugavel alugavel, int diasAlugado) {
	      this.alugavel = alugavel;
	      this.diasAlugado = diasAlugado;
	   }
	 
	   public Alugavel getAlugavel() {
	      return alugavel;
	   }
	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }
	   
	   public int getPontosAlugadorFrequente() {
		  return this.alugavel.getPontosDeAlugadorFrequente(this.diasAlugado);
	   }
	   
	   public double getValorDeAluguel() {
		   return this.alugavel.getValorDoAluguel(this.diasAlugado);
		   
	   }
	   
}
