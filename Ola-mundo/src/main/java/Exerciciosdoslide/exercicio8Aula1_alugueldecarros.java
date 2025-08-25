
package Exerciciosdoslide;

import java.util.Scanner;


public class exercicio8Aula1_alugueldecarros {
    public static void main(String[] args) {
        
  Scanner teclado = new Scanner(System.in);
  
  Double quilometros, dia, valorfinal, km, diaria;
  
  
  

  
  
        System.out.println("Quantos Quilometros você Percorreu?");
       quilometros = teclado.nextDouble();
        System.out.println("Quantos dias você ficou com o carro?");
        dia = teclado.nextDouble();
        
        diaria = dia * 90;
        km = quilometros * 0.20;
        
        System.out.println("Seu Preço total é de "+ (km + diaria));
        
        
        
        
        
    }
  
    
    
}
