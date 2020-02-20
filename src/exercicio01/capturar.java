package exercicio01;
import java.util.Scanner;

public class capturar {
	 int n = 4; 
	    int v[] = new int[n]; 
	    int i,alto;
 
 

	void start() {
		Scanner ler = new Scanner(System.in);
		for (i=0; i<n; i++) {
		      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
		      v[i] = ler.nextInt();
		    }
	
	   
	    int menor = v[0]; 
	    int maior = v[0];
	    for (i=0; i<n; i++) {
	     
	 
	      if (v[i] < menor)
	         menor = v[i];
	 
	      if (v[i] > maior)
	         maior = v[i];
	      
	      if (v[i]>50)
	    	  alto = 1;
	    	  System.out.println("va");
	    }
	 

	    System.out.printf("\n");
	    for (i=0; i<n; i++) {
	      if (v[i] == menor)
	        System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
	      else if (v[i] == maior)
	              System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
	           else System.out.printf("v[%d] = %2d\n", i, v[i]);
	    }if (alto== 1)
	    System.out.println("Valor muito alto");
	   
	  }
	 
	



		
	
  
	
	
	
	void mn() {
		
	}
}