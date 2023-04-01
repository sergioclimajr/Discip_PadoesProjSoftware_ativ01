package locadora;

public class ExtratoTexto extends Extrato {
    public ExtratoTexto(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    protected String gerarCabecalho() {
        return "Registro de Alugueis de " + cliente.getNome() + System.getProperty("line.separator");
    }
    
    @Override
    protected String gerarRodape() {
        return "Valor total pago: R$ " + cliente.getValorTotal() + System.getProperty("line.separator") +
               "Voce acumulou " + cliente.getPontosTotaisDeAlugadorFrequente() +
               " pontos de alugador frequente \\n\\nExtrato em Texto emitido com sucesso!";
    }

	@Override
	protected String gerarCorpo() {
    String resultado = "";
    for (Aluguel aluguel: cliente.getDvdsAlugados()) {
        resultado += "\t" + aluguel.getAlugavel().getTitulo() + "\t R$ " + aluguel.getValorDeAluguel() + System.getProperty("line.separator");
    }
    
    return resultado;
    }
}