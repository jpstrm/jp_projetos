package br.com.aulajava2.aulas;


import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args)
	{
		//String numero1, numero2, oper;
		String oper;
		double n1, n2, resultado;
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor: "));
		oper = JOptionPane.showInputDialog("Informe a operação: ");
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));
		
		if ("+".equals(oper)) {
			resultado = n1 + n2;
			JOptionPane.showMessageDialog(null, "\nResultado: " + resultado);
		} else if ("-".equals(oper)) {
			resultado = n1 - n2;
			JOptionPane.showMessageDialog(null, "\nResultado: " + resultado);
		} else if ("*".equals(oper)) {
			resultado = n1 * n2;
			JOptionPane.showMessageDialog(null, "\nResultado: " + resultado);
		} else if ("/".equals(oper)) {
			resultado = n1 / n2;
			JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
		}
		
	}

}
