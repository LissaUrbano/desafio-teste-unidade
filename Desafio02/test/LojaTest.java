import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.Livro;
import model.Loja;
import model.VideoGame;

public class LojaTest {
	
	List<Livro> livros;
	List<VideoGame> games;
	Loja loja;

	@BeforeEach
	public void setup() throws Exception {
		livros = new ArrayList<>();
		games = new ArrayList<>();
		loja = new Loja("Americanas", "12345678", livros, games);
	}
	
	@Test
	void avisoListaDeLivrosVazia() throws Exception {
		assertNull(loja.listarLivros());
	}
	
	@Test
	void listarLivros() throws Exception {
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		livros.add(l1);
		assertNotNull(loja.listarLivros());
	}

	@Test
	void avisoListaDeVideoGamesVazia() throws Exception {
		assertNull(loja.listarVideoGames());
	}
	
	@Test
	void listarVideoGames() throws Exception {
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		games.add(ps4);
		assertNotNull(loja.listarVideoGames());
	}
	
	@Test
	void deveCalcularPatrimonio() throws Exception {
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		livros.add(l1);
		livros.add(l3);
		games.add(ps4);
		games.add(xbox);

		double patrimonio = loja.calcularPatrimonio();
		assertEquals(933000, patrimonio);
	}

	
}
