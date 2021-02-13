import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuerreiroTest {

	Guerreiro guerreiro;
	
	@BeforeEach
	public void setup() throws Exception {
		guerreiro = new Guerreiro("Valente");
	}
	
	@Test
	void adicionarHabilidadeParaGuerreiro() throws Exception {
		String habilidade = guerreiro.aprenderHabilidade("Dança das espadas");
		assertEquals("Dança das espadas", habilidade);
	}
	
	@Test
	void levelUPParaGuerreiro() throws Exception {
		guerreiro.lvlUP();
        assertAll("guerreiro",
                () -> assertEquals(155, guerreiro.getForca()),
                () -> assertEquals(101, guerreiro.getInteligencia()),
                () -> assertEquals(2, guerreiro.getLevel()),
                () -> assertEquals(51, guerreiro.getMana()),
                () -> assertEquals(10, guerreiro.getVida()),
                () -> assertEquals(10, guerreiro.getXp())
            );
	}
	
	@Test
	void valorAttackParaGuerreiro() throws Exception {
		int ataque = guerreiro.attack();
		assertNotEquals(0, ataque);
	}
	
}
