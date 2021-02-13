package model;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public Veiculo(String marca, String modelo, String placa, String cor, float km, int litrosCombustivel,
			double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = false;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = 0;
		this.preco = preco;
	}

	public Veiculo() {

	};

	public void acelerar() {
		if (isLigado) {
			this.velocidade += 20;
		} else {
			System.out.println("N�o � possivel acelerar, o ve�culo est� desligado.");
		}
	}

	public void abastecer(int combustivel) {
		if ((litrosCombustivel + combustivel) <= 60) {
			this.litrosCombustivel += combustivel;
		} else {
			System.out.println(
					"N�o � possivel abastecer esta quantidade, pois ultrapassa a capacidade maxima de 60 litros.\nO tanque est� com "
							+ getLitrosCombustivel() + " litros de combust�vel.");
		}
	}

	public void frear() {
		if (isLigado) {
			if (velocidade >= 20) {
				this.velocidade -= 20;
			} else {
				System.out.println("O ve�culo est� parado.");
			}
		} else {
			System.out.println("O ve�culo est� desligado e parado.");
		}
	}

	public void pintar(String cor) {
		this.cor = cor;
	}

	public void ligar() {
		if (isLigado) {
			System.out.println("O ve�culo ja se encontra ligado");
		} else {
			this.isLigado = true;
			System.out.println("O ve�culo est� ligado");
		}
	}

	public void desligar() {
		if (!isLigado) {
			System.out.println("O ve�culo ja se encontra desligado");
		} else {
			if (velocidade > 0) {
				System.out.println("N�o � possivel desligar o ve�culo, pois se encontra em movimento");
			} else {
				this.isLigado = false;
				System.out.println("O ve�culo est� desligado");
			}
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		return "Veiculo [cor=" + cor + ", isLigado=" + isLigado + ", km=" + km + ", litrosCombustivel="
				+ litrosCombustivel + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", preco="
				+ preco + ", velocidade=" + velocidade + "]";
	}

}
