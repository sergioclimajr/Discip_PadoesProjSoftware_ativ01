package locadora;

public abstract class Extrato {
    protected Cliente cliente;
    
    protected abstract String gerarCabecalho();
    protected abstract String gerarRodape();
    protected abstract String gerarCorpo();
    
    public Extrato(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String gerarExtrato() {
        String cabecalho = gerarCabecalho();
        String corpo = gerarCorpo();
        String rodape = gerarRodape();
        
        return cabecalho + corpo + rodape;
    }
    
}

