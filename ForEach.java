package Desafios;

public class ForEach {
	public static void main(String[] args) {
		String [] nomes = new String[3]; 

		nomes[0] = "Lisa";
		nomes[1]= "Kevin"; 
		nomes[2] = "Roger"; 

		for (String nome : nomes) { 

		System.out.println(nome + ", ");
	}

}
}