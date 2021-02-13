import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JogoTest {
	
	@Test
	public void adicionarPersonagemAoJogo() throws Exception {
		Jogo jogo = new Jogo();
		Mago mago = new Mago("Bruxo");
		Guerreiro guerreiro = new Guerreiro("Valente");
		jogo.adicionarPersonagem(mago);
		jogo.adicionarPersonagem(guerreiro);
		int qtdPersonagens = Jogo.getQtdPersonagens();
		assertEquals(2, qtdPersonagens);
	}

	
}
