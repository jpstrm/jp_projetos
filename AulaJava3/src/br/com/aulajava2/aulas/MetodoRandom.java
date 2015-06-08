package br.com.aulajava2.aulas;

import javax.swing.JOptionPane;


/*é utilizado para gerar valores de forma aleatória. Toda vez que o método random é chamado
 *será sorteado um valor do tipo double entre 0.0 e 1.0
 */
public class MetodoRandom {
	
	public static void main(String[] args)
	{
		int num = 0, qtd2 = 0;
		String s = "";
		for (int qtde = 0; qtde <= 99; qtde++)
		{
			//for (int x = 1; x <= 2; x++)
			//{
			if (qtd2 == 9)
			{
				qtd2 = 0;
				num = (int) (Math.random() * 100);
				s = s + num + " \n ";
			} else {
				qtd2++;
				num = (int) (Math.random() * 100);
				s = s + num + " - ";
			}
			//} else {
			//	qtd2++;
			//}
		//}
		}
		
		JOptionPane.showMessageDialog(null, s);
	}

}
