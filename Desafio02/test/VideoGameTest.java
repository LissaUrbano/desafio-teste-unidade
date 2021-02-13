import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.VideoGame;

public class VideoGameTest {
	
	@Test
	void deveCalcularImpostoDeVideoGameNovo() throws Exception {
		VideoGame xbox = new VideoGame("XBOX novo", 1500, 500, "Microsoft", "One", false);
		double imposto = xbox.calculaImposto();
		assertEquals(675, imposto);
	}
	
	@Test
	void deveCalcularImpostoDeVideoGameUsado() throws Exception {
		VideoGame ps4 = new VideoGame("PS4 Usado", 1000, 7, "Sony", "Slim", true);
		double imposto = ps4.calculaImposto();
		assertEquals(250, imposto);
	}

}
