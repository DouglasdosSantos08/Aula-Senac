
package Exerciciosdoslide;

import java.util.Scanner;


public class exercicio10Aula1_excessodevelocidade {
  
    public static void main(String[] args) {
        
   Scanner teclado = new Scanner(System.in); 
   
  int multa, km; 
        
  
      System.out.println("======================================?");
        System.out.println("Qual a velocidade que você estava?");
      System.out.println("======================================?");
      km = teclado.nextInt();
      if (km > 80) {
          multa = km - 80;
          
          System.out.println("você foi Multado o valor e de "+ (multa * 5));
      }else{
          System.out.println("você não possui nenhuma multa");
          
          
          
      }  
        
        
        
    }
}
