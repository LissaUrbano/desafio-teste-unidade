import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem {

	private List<String> habilidadeList = new ArrayList<String>();

	public Guerreiro(String nome) {
		super(nome, 50, 100, 150);
	}

	public String aprenderHabilidade(String novaHabilidade) {
		habilidadeList.add(novaHabilidade);
		System.out.println("Magia " + novaHabilidade + " adicionada com sucesso.");
		return getHabilidadeList().get(habilidadeList.size()-1);
	}

	@Override
	public void lvlUP() {
		setForca(getForca() + 5);
		setInteligencia(getInteligencia() + 1);
		setLevel(getLevel() + 1);
		setMana(getMana() + 1);
		setVida(getVida() + 5);
		setXp(getXp() + 10);
	}

	@Override
	public int attack() {
		double random = (Math.random() * 300);
		return (getForca() * getLevel()) + (int) random;
	}

	public List<String> getHabilidadeList() {
		return habilidadeList;
	}

	public void setHabilidadeList(List<String> habilidadeList) {
		this.habilidadeList = habilidadeList;
	}

}
