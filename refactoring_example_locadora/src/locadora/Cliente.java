package locadora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Aluguel> getDvdsAlugados() {
	    return dvdsAlugados;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		dvdsAlugados.add(aluguel);
	}
	
	public double getValorTotal() {
		double subtotal = 0;
		
		for (Aluguel aluguel : dvdsAlugados) {
			subtotal += aluguel.getValorDeAluguel();
			
		}
		return subtotal;
	}
	
	public int getPontosTotaisDeAlugadorFrequente() {
		int saldoAtualPontos = 0;
		for (Aluguel aluguel : dvdsAlugados) {
			saldoAtualPontos += aluguel.getPontosAlugadorFrequente();
		}
		return saldoAtualPontos;
	}
	
}
