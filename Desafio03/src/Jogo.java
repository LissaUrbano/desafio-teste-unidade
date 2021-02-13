import java.util.ArrayList;
import java.util.List;

public class Jogo {

	private List<Personagem> personagens = new ArrayList<Personagem>();
	private static int qtdPersonagens;
		
	public void adicionarPersonagem(Personagem personagem) {
		personagens.add(personagem);
		qtdPersonagens++;
	}

	public static int getQtdPersonagens() {
		return qtdPersonagens;
	}
}
