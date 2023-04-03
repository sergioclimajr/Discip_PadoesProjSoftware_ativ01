package locadora;

import java.util.List;

public interface ICliente {
	
	public String getNome();
	
	public List<Aluguel> getDvdsAlugados();

	public void adicionaAluguel(Aluguel aluguel);
	
	public double getValorTotal();
	
	public int getPontosTotaisDeAlugadorFrequente();
	
}
