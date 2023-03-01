package controller;

public class SomatorioController {

	public SomatorioController() {}
	
	public int somatorioNumeros(int numero) {
		// Condição de parada --> Quando o numero for menor ou igual a zero
		if (numero <= 0)
			return 0;
		else
			return numero + somatorioNumeros(numero - 1);
			/*
			3 + 2 + 1 = 6
			5 + 4 + 3 + 2 + 1 = 15 
			10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 55
			-1 = 0
			0 = 0 
			 */
	}

}

