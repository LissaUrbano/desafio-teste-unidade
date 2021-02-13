
public class Supervisor extends Funcionario {

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return getSalario() + 5000.00;
	}

	@Override
	public String toString() {
		return super.toString() + " Cargo= Supervisor, bonificação=" + bonificacao() + "]";
	}

}
