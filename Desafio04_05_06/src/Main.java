import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// EXERCICIO 04
		Pessoa pessoa1 = new Pessoa(15, "João");
		Pessoa pessoa2 = new Pessoa(21, "Leandro");
		Pessoa pessoa3 = new Pessoa(17, "Paulo");
		Pessoa pessoa4 = new Pessoa(18, "Jessica");

		List<Pessoa> pessoasList = new ArrayList<>();

		pessoasList.add(pessoa1);
		pessoasList.add(pessoa2);
		pessoasList.add(pessoa3);
		pessoasList.add(pessoa4);

		Pessoa pessoaMaisVelha = pessoa1;

		for (Pessoa pessoa : pessoasList) {
			if (pessoa.getIdade() > pessoaMaisVelha.getIdade()) {
				pessoaMaisVelha = pessoa;
			}
		}

		System.out.println("A pessoa mais velha é o(a): " + pessoaMaisVelha.getNome());

		// EXERCICIO 05

		List<Pessoa> menoresDeIdade = new ArrayList<>();

		for (Pessoa pessoa : pessoasList) {
			if (pessoa.getIdade() < 18) {
				menoresDeIdade.add(pessoa);
			}
		}

		System.out.println("Existem " + pessoasList.size() + " Pessoas na lista.");
		pessoasList.removeAll(menoresDeIdade);
		System.out.println("Existem " + pessoasList.size() + " Pessoas na lista.");

		// EXERCICIO 06

		for (Pessoa pessoa : pessoasList) {
			if ("Jessica".equals(pessoa.getNome())) {
				System.out.println("A idade de Jessica é " + pessoa.getIdade() + " anos.");
			}
		}

	}

}
