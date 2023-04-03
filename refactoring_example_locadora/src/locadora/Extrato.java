package locadora;

public abstract class Extrato {
    protected ICliente iCliente;
    
    protected abstract String gerarCabecalho();
    protected abstract String gerarRodape();
    protected abstract String gerarCorpo();
    
    public Extrato(ICliente cliente) {
        this.iCliente = cliente;
    }
    
    public String gerarExtrato() {
        String cabecalho = gerarCabecalho();
        String corpo = gerarCorpo();
        String rodape = gerarRodape();
        
        return cabecalho + corpo + rodape;
    }
    
}

