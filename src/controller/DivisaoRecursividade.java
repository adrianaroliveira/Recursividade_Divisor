package controller;

public class DivisaoRecursividade {
	public DivisaoRecursividade() {
		super();
	}
	public int divisao(int dividendo, int divisor) {
		if (dividendo < divisor) { //se o valor a ser dividido for menor que o divisor o resultado é zero
			return 0; // resultado
		} else {
			dividendo = dividendo - divisor; //enquanto o dividendo for maior que o divisor deve-se dividir, ou seja, diminuir o divisor
			return 1 + divisao(dividendo, divisor); // retorna para a função
		}
	}

}
