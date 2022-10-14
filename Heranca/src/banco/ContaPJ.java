package banco;

public class ContaPJ extends Conta {

	Double limiteEmprestimo = 1000.0;

	Double getLimiteEmprestimo() {
		return this.limiteEmprestimo;
	}
	
	boolean saque(Double valor, Double usoMaximoEmprestimo) {
		if(valor <= 0) {
			return false;
		}
		
		// Saldo = 100;
		// Valor = 150;
		// usoMaximoEmprestimo = 25;
		// valor - saldo = 50
		
		if(valor > saldo) {
			if(valor - saldo <= usoMaximoEmprestimo) {
				saldo -= valor;
				this.limiteEmprestimo -= saldo;
				saldo = 0.0;
				return true;
			} else {
				return false;
			}
		}
		
		saldo -= valor;
		return true;
	}
	
	@Override
	boolean saque(Double valor) {
		if(valor <= 0) {
			return false;
		} else if (valor > this.saldo) {
			if(valor < this.saldo + limiteEmprestimo) {
				this.saldo -= valor;
				limiteEmprestimo += this.saldo;
				this.saldo = 0.0;
			}
		} else {
			this.saldo -= valor;
		}
		return true;
	}
	
	boolean emprestimo(Double valor) {
		if(valor <= 0 || valor > limiteEmprestimo) {
			return false;
		} else {
			this.saldo += valor;
			this.limiteEmprestimo -= valor;
			return true;
		}
	}

}
