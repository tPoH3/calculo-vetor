
import java.util.Arrays;
import java.util.Scanner;


public class calcular {
        public static void main(String args[]){  
   
        Scanner teclado = new Scanner(System.in);
        
        int quantidade;
        double  soma        = 0;
        double  media       = 0;
        double pergunta    = 0;
        double    menor       = 0;
        double maior = 0;
        
        System.out.print("Por favor insira a quantidade de repeticoes:\n");
        
        quantidade = teclado.nextInt();
        
        Double[] numeros = new Double[quantidade];
        
        for(int i = 0; i < quantidade; i++){
            System.out.printf("digite %d° valor: \n",i + 1);
            numeros[i] = teclado.nextDouble();
        }
        
        for(int i = 0; i < quantidade; i++){
           soma += numeros[i];
        }
        
        for(int i = 0; i < quantidade; i++){
            
           if(numeros[i] < menor){
               menor = numeros[i];
           }
           
           if(numeros[i] > maior){
               maior = numeros[i];
           }
             
        }
        
        
        
        System.out.printf("%f", soma /  quantidade);   
         System.out.printf("%f", maior);   
          System.out.printf("%f", menor);   
         
                
    	System.exit(0);
		
    }
}
