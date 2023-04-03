
import locadora.Cliente;
import locadora.Aluguel;
import locadora.DVD;
import locadora.Jogo;
import locadora.ExtratoTexto;
import locadora.ExtratoHTML;

public class Locadora {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alex Sandro");
		Cliente c2 = new Cliente("Sergio Lima");
		
		c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", DVD.NORMAL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Luca", DVD.INFANTIL), 2));
		c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", DVD.LANCAMENTO), 30));
		c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", DVD.LANCAMENTO), 4));
		c1.adicionaAluguel(new Aluguel(new DVD("Moana", DVD.INFANTIL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", DVD.NORMAL), 3));
		c2.adicionaAluguel(new Aluguel(new Jogo("Resident Evil", Jogo.ONLINE, "PS5"), 4));
		c2.adicionaAluguel(new Aluguel(new Jogo("God of War", Jogo.ONLINE, "PS5"), 9));
		
		
		ExtratoHTML extratoHTML = new ExtratoHTML(c1);
        System.out.println(extratoHTML.gerarExtrato());
	}
}
