package aulajava1;

public class String1 {
	public static void main(String args[]) {
		//String valor = "DEVMEDIA - Java";
		//vetor de char e String
		/*char data[] = {'a', 'b', 'c'};
		String str = new String(data);
		System.out.println(str);*/
		
		//Uso do charAt
		//System.out.println(valor.charAt(0)); //retorna primiero posição de valor
		
		//Uso do codePointAt
		//System.out.println(valor.codePointAt(0)); //retorna codigo do caractere em UNICODE
		
		//Uso do compareTo e compareToIgnoreCase
		/*System.out.println(valor.compareTo("DEVMEDIA - Java") == 0 ? true : false); //compara as strings diferenciando maísculas
		System.out.println(valor.compareTo("DEVMEDIA - JAVA") == 0 ? true : false); 
		System.out.println(valor.compareToIgnoreCase
			("DEVMEDIA - JAVA") == 0 ? true : false); //compara as strings NÃO diferenciando maísculas*/
		
		//Uso do endsWith, startsWith e startsWith com tooffset
		/*System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("DEV"));
		System.out.println(valor.startsWith("ME", 3));*/
		
		//Uso do toCharArray
		/*for(char c : valor.toCharArray()){
			System.out.println("Char: " + c);
		}*/
		
		//Uso do getBytes
		/*for (byte b : valor.getBytes()) {
			System.out.println("byte: " + b);
		}*/
		
		//Usando isEmpty de forma errada
		/*String valor2 = null;
		
		try{
			System.out.println(valor2.isEmpty());
			
		}catch (Exception e) {
			System.out.println("A variável está apontando para NULL");
		}*/
		
		//Usando split e split com limit
		/*String[] valorComSplit = valor.split("-"); //sem o limite
		
		for(String s : valorComSplit){
			System.out.println(s);
		}
		
		String valor2 = "DEVMEDIA - Java - Engenharia - Software";
		String[] valorComSplit2 = valor2.split("-", 2); //com o limite
		
		for(String s2 : valorComSplit2){
			System.out.println(s2);
		}*/
		
		//Usando substring e subSequence
		/*System.out.println(valor.subSequence(0,  5));
		System.out.println(valor.substring(0,  5));*/
		
		//float
		/*float c = 9;
		System.out.println(String.valueOf(c));*/
		String result = String.format("Hoje nós processamos %,d transações", 100000);
		System.out.println(result);
		result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
		System.out.println(result);

	}

}
