
package Exerciciosdoslide;

import java.util.Scanner;

public class exercicio9Aula1_SalariodoCupincha {
    
    
    public static void main(String[] args) {
     
      Scanner teclado = new Scanner(System.in);
        
      int hora, inf;  
     
     hora = 200;
     
      System.out.println("===========================");  
     System.out.println("Quantos Dias você trabalhou?");
     System.out.println("===========================");  
       inf = teclado.nextInt();
        System.out.println("Seu novo Salário é "+ (inf * hora));
     
     
     
     
    }
    
    
}
