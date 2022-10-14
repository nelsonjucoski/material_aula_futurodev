package banco;

public class TestaBanco {

	public static void main(String[] args) {
		
//		Conta contaFrancisco = new Conta();
//		System.out.println(contaFrancisco.getSaldo());
//		contaFrancisco.deposito(500.0);
//		System.out.println(contaFrancisco.getSaldo());
//		contaFrancisco.saque(400.0);
//		System.out.println(contaFrancisco.getSaldo());
		
		ContaPJ contaEspecial = new ContaPJ();
		System.out.println(contaEspecial.getSaldo());
		System.out.println(contaEspecial.getLimiteEmprestimo());
		contaEspecial.saque(200.0);
		System.out.println(contaEspecial.getSaldo());
		System.out.println(contaEspecial.getLimiteEmprestimo());
		contaEspecial.saque(500.0);
		contaEspecial.saque(500.0, 200.0);
	}
	
}
