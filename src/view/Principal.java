package view;

import controller.DivisaoRecursividade;

public class Principal {

	public static void main(String[] args) {
		DivisaoRecursividade div = new DivisaoRecursividade();
		int dividendo = 50;
		int divisor = 10;
		int resultado = div.divisao(dividendo, divisor);
		System.out.println(resultado);

	}

}
