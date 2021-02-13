package model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	List<Livro> livros;
	List<VideoGame> videoGames;

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public Loja() {

	}

	public List<Livro> listarLivros() {
		if (!livros.isEmpty()) {
			imprimirListaLivros();
			return livros;
		} else {
			System.out.println("A loja não tem livros no seu estoque.");
			return null;
		}
	}

	private void imprimirListaLivros() {
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("A loja " + getNome() + " possui estes livros para venda:");
		for (Livro livro : livros) {
			System.out.println("Titulo: " + livro.getNome() + ", preço: R$" + livro.getPreco() + ", quantidade: "
					+ livro.getQtd() + " em estoque.");
		}
	}

	public List<VideoGame> listarVideoGames() {
		if (!videoGames.isEmpty()) {
			imprimirListaVideoGames();
			return videoGames;
		} else {
			System.out.println("A loja não tem video-games no seu estoque.");
			return null;
		}
	}

	private void imprimirListaVideoGames() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("A loja " + getNome() + " possui estes video-games para venda:");
		for (VideoGame videoGame : videoGames) {
			System.out.println("Video-game: " + videoGame.getModelo() + ", preço: R$" + videoGame.getPreco()
					+ ", quantidade: " + videoGame.getQtd() + " em estoque.");
		}
	}

	public double calcularPatrimonio() {
		double somatoria = 0;
		for (Livro livro : livros) {
			somatoria += (livro.getPreco() * livro.getQtd());
		}
		for (VideoGame videoGame : videoGames) {
			somatoria += (videoGame.getPreco() * videoGame.getQtd());
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("O patrimonio da loja: " + getNome() + " é de R$ " + somatoria);
		return somatoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
