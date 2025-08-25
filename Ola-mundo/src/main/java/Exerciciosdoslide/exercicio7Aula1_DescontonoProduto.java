
package Exerciciosdoslide;

import java.util.Scanner;


public class exercicio7Aula1_DescontonoProduto {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
  Double desconto,desconto1,valor, valorfinal;    
        
 
   
   
        System.out.println ("DESCONTO DE 5%");
        System.out.println("========================");
        System.out.println("Qual o Valor do Produto??");
        System.out.println("========================");
       valor = teclado.nextDouble();
       
       
       
       
   desconto = valor * 0.05;
   valorfinal = valor - desconto;      
       
       
        System.out.println("Seu desconto é de "+(valorfinal));
        
        

  
  
        
       }  
        
    } 
