import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MagoTest {
	
	Mago mago;
	
	@BeforeEach
	public void setup() throws Exception {
		mago = new Mago("Bruxo");
	}
	
	@Test
	void adicionarMagiaParaMago() throws Exception {
		String magia = mago.aprenderMagia("Ventania");
		assertEquals("Ventania", magia);
	}
	
	@Test
	void levelUPParaMago() throws Exception {
		mago.lvlUP();
        assertAll("mago",
                () -> assertEquals(81, mago.getForca()),
                () -> assertEquals(155, mago.getInteligencia()),
                () -> assertEquals(2, mago.getLevel()),
                () -> assertEquals(55, mago.getMana()),
                () -> assertEquals(6, mago.getVida()),
                () -> assertEquals(10, mago.getXp())
            );
	}
	
	@Test
	void valorAttackParaMago() throws Exception {
		int ataque = mago.attack();
		assertNotEquals(0, ataque);
	}

}
