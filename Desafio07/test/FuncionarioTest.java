import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {
	
	@Test
	public void calcularBonificaoDeGerente() throws Exception {
		Funcionario gerente = new Gerente("Ana", 27, 18000.00);
		double bonificacao = gerente.bonificacao();
		assertEquals(28000, bonificacao);
	}
	
	@Test
	public void calcularBonificaoDeSupervisor() throws Exception {
		Funcionario supervisor = new Supervisor("João", 35, 13000.00);
		double bonificacao = supervisor.bonificacao();
		assertEquals(18000, bonificacao);
	}
	
	@Test
	public void calcularBonificaoDeVendedor() throws Exception {
		Funcionario vendedor = new Vendedor("Julia", 18, 3000.00);
		double bonificacao = vendedor.bonificacao();
		assertEquals(6000, bonificacao);
	}

}
