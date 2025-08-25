
package Exerciciosdoslide;

import java.util.Scanner;


public class exercicio12Aula1_AprovadoouReprovado {

public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double media, nota1, nota2;
     String nome;
        
       
        
    System.out.println("=========================");      
       System.out.println("Nome do Aluno."); 
       System.out.println("=========================");
         nome = teclado.nextLine(); 
           System.out.println("Digite sua Primeira Nota.");
           System.out.println("=========================");
        nota1 = teclado.nextDouble(); 
         System.out.println("Digite sua segunda Nota."); 
         System.out.println("=========================");
          nota2 = teclado.nextDouble(); 
         
         media = nota1 + nota2 / 2;
         if (media > 7) {
             System.out.println("Você foi Aprovado!! "+ media);
         }else{
             System.out.println("você foi Reprovado. "+ media);   
             
             
             
             
             
             
         }
        
        
        
        
     }
}
