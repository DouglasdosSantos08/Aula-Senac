
package Exerciciosdoslide;

import java.util.Scanner;


public class exercicio5Aula1Conversordemoedas {

    public static void main(String[] args) {
        
   Scanner teclado = new Scanner(System.in);
     
     Double dolar, real;    
        
     dolar = 5.45;
     
        System.out.println("============================");
        System.out.println("Quanto voce quer converter?");
         System.out.println("============================");
        real = teclado.nextDouble();
         System.out.println("=============================================");
        System.out.println("Seu Valor Convertido de R$ e "+ (dolar * real));
         System.out.println("=============================================");
        
        
    }




    
}
