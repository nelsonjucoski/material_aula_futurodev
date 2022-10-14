package banco;

public class Conta {

	Integer numero;
	String titular;
	Double saldo = 0.0;
	
	Double getSaldo() {
		return this.saldo;
	}
	
	boolean saque(Double valor) {
		if(valor > this.saldo) {
			return false;
		}
		
		this.saldo -= valor;
		return true;
	}
	
	boolean deposito(Double valor) {
		if(valor <= 0) {
			return false;
		}
		
		this.saldo += valor;
		return true;
	}
}
