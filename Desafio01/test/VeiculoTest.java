import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Veiculo;

public class VeiculoTest {

	Veiculo veiculo;
	
	@BeforeEach
	public void setup() throws Exception {
		veiculo = new Veiculo("Volkswagen", "POLO", "BDS0000", "Azul", 5000, 0, 80000);
	}
	
	@Test
	void deveLigarOVeiculo() throws Exception {
		veiculo.ligar();
		assertTrue(veiculo.isLigado());
	}
	
	@Test
	void deveDesligarOVeiculo() throws Exception {
		veiculo.ligar();
		veiculo.desligar();
		assertFalse(veiculo.isLigado());
	}
	
	@Test
	void naoDeveAcelerarVeiculoDesligado() throws Exception {
		veiculo.desligar();
		veiculo.acelerar(); 
		assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	void deveAcelerarVeiculoLigado() throws Exception {
		veiculo.ligar();
		veiculo.acelerar(); // +20
		veiculo.acelerar(); // +20
		assertEquals(40, veiculo.getVelocidade());
	}
	
	@Test
	void deveFrearVeiculoLigadoEmMovimento() throws Exception {
		veiculo.ligar();
		veiculo.acelerar(); // +20
		veiculo.acelerar(); // +20
		veiculo.frear(); // -20
		assertEquals(20, veiculo.getVelocidade());
	}
	
	@Test
	void deveAbastecerVeiculoComlimiteTotal() throws Exception {
		veiculo.abastecer(60);
		assertEquals(60, veiculo.getLitrosCombustivel());
	}
	
	@Test
	void naoDeveAbastecerVeiculoComlimiteTotalUltrapassado() throws Exception {
		veiculo.abastecer(50); 
		veiculo.abastecer(20);
		assertEquals(50, veiculo.getLitrosCombustivel());
	}

	@Test
	void avisoVeiculoParadoQuandoVelocidadeZero() throws Exception {
		veiculo.ligar();
		veiculo.frear();
		assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	void avisoVeiculoParadoEDesligadoQuandoFrearCarroDesligado() throws Exception {
		veiculo.desligar();
		veiculo.frear();
		assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	void avisoVeiculoEmEstadoJaLigado() throws Exception {
		veiculo.ligar();
		veiculo.ligar();
		assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	void naoPermitirDesligarQuandoVeiculoEmMovimento() throws Exception {
		veiculo.ligar();
		veiculo.acelerar(); // +20
		veiculo.desligar();
		assertEquals(20, veiculo.getVelocidade());
	}
	
}
