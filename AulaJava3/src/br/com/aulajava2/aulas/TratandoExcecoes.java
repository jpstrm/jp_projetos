package br.com.aulajava2.aulas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TratandoExcecoes {
	
	public static float Divisao(float numerador, float denominador)
	{
		return numerador / denominador;
	}
	
	public static void main (String[] args)
	{
		/*Calendar calendario = Calendar.getInstance();
		JOptionPane.showMessageDialog(null, "Data e Hora atual: " + calendario.getTime());
		JOptionPane.showMessageDialog(null, "Ano: " + calendario.get(Calendar.YEAR));
		if (calendario.get(Calendar.MONTH) == 4)
		{
			JOptionPane.showMessageDialog(null, "M�s: Abril");
		}
		JOptionPane.showMessageDialog(null, "Dia do M�s: " + calendario.get(Calendar.DAY_OF_MONTH));
		Date data = new Date();*/
		float num = 0, den = 0, divisao;
		boolean continua = true;
		DecimalFormat df = new DecimalFormat("#.##");
		
		do {
			try {
				num = Float.parseFloat(JOptionPane.showInputDialog("Digite o numerador: "));
				den = Float.parseFloat(JOptionPane.showInputDialog("Digite o denominador: "));
				divisao = num / den;
				JOptionPane.showMessageDialog(null, "A divis�o �: " + df.format(divisao));
				continua = false;
				
			} catch (ArithmeticException erro)
			{
				//JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro: " + erro.getMessage() + "\nDigite os valores novamente!");
				JOptionPane.showMessageDialog(null, "O denominador n�o pode ser zero!");	
			}
			catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "O denominador tem que ser um n�mero inteiro");
			}
		} while (continua);
		//JOptionPane.showMessageDialog(null, "A hora �: " + data);

	}
}
