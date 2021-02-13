package main;

import model.Veiculo;

public class Main {

	public static void main(String[] args) {

		Veiculo carro1 = new Veiculo("Volkswagen", "POLO", "BDS0000", "Azul", 5000, 0, 80000);

		// teste de ligar e desligar
		carro1.desligar();
		carro1.ligar();
		carro1.ligar();

		// teste com carro desligado
		carro1.desligar();
		carro1.acelerar();
		carro1.frear();

		// teste com carro ligado acelerar e frear
		carro1.ligar();
		System.out.println(Integer.toString(carro1.getVelocidade())); // velocidade incial zero
		carro1.acelerar(); // +20
		carro1.acelerar(); // +20
		carro1.acelerar(); // +20
		System.out.println(Integer.toString(carro1.getVelocidade()));
		carro1.frear(); // -20
		carro1.frear(); // -20
		System.out.println(Integer.toString(carro1.getVelocidade()));
		carro1.frear(); // -20
		System.out.println(Integer.toString(carro1.getVelocidade()));
		carro1.frear();
		carro1.acelerar();

		// teste abastecer
		System.out.println(Integer.toString(carro1.getLitrosCombustivel()));
		carro1.abastecer(58);
		System.out.println(Integer.toString(carro1.getLitrosCombustivel()));
		carro1.abastecer(50);

		// teste mudança nos valores dos atributos
		System.out.println(carro1.toString());
		carro1.pintar("Vermelho");
		carro1.setKm(8000);
		carro1.setMarca("chevrolet");
		carro1.setModelo("tracker");
		carro1.setPlaca("AAA0001");
		carro1.setPreco(150000);
		System.out.println(carro1.toString());
	}

}
