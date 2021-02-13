import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem {

	private List<String> magiaList = new ArrayList<String>();

	public Mago(String nome) {
		super(nome, 50, 150, 80);
	}

	public String aprenderMagia(String novamagia) {
		magiaList.add(novamagia);
		System.out.println("Magia " + novamagia + " adicionada com sucesso.");
		return getMagiaList().get(magiaList.size()-1);
	}

	@Override
	public void lvlUP() {
		setForca(getForca() + 1);
		setInteligencia(getInteligencia() + 5);
		setLevel(getLevel() + 1);
		setMana(getMana() + 5);
		setVida(getVida() + 1);
		setXp(getXp() + 10);
	}

	@Override
	public int attack() {
		double random = (Math.random() * 300);
		return (getInteligencia() * getLevel()) + (int) random;
	}

	public List<String> getMagiaList() {
		return magiaList;
	}

	public void setMagiaList(List<String> magiaList) {
		this.magiaList = magiaList;
	}

}
