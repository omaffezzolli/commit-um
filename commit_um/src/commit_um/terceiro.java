package commit_um;

public class terceiro {
	
	public static void main(String[] args ) {
		
		int[] numeros = new int[]{78, 22, 11, 13, -1, 6, -31};
	    
	       int soma = 0;
	       for(int i=0; i < numeros.length ; i++)
	        soma = soma + numeros[i];
	      
	        double media = soma / numeros.length;
	        System.out.println("A media dos valores é: " + media);
		
	}

}
