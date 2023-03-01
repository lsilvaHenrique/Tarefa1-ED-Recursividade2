package view;

import javax.swing.JOptionPane;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
		SomatorioController som = new SomatorioController();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero natural"));
		System.out.println(som.somatorioNumeros(num));
	}

}