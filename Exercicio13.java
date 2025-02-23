package Exercicios;

import javax.swing.JOptionPane;

import controller.Controller13;

public class Exercicio13 {
	
	public static void main(String[] args) {
	
	Controller13 somaDigito = new Controller13();
	
	 int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
	
	 int resultado = somaDigito.SomaDigitos(n);
	
	 System.out.println(resultado);

 }
}