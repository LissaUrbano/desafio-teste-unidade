import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Livro;

public class LivroTest {
	
	@Test
	void deveCalcularImpostoDeLivroComCategoriaEducativa() throws Exception {
		Livro l1 = new Livro("Java", 100, 50, "GFT", "educativo", 500);
		double imposto = l1.calculaImposto();
		assertEquals(0, imposto);
	}
	
	@Test
	void deveCalcularImpostoDeLivroSemCategoriaEducativa() throws Exception {
		Livro l2 = new Livro("Harry Potter", 80, 50, "J. K. Rowling", "fantasia", 300);
		double imposto = l2.calculaImposto();
		assertEquals(8, imposto);
	}
	
}
