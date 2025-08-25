
package Exerciciosdoslide;

import java.util.Scanner;


public class Exercicio2Aula1_antecessoresucessor {
 
    
    public static void main(String[] args) {
        
    int num;    
        
    
    Scanner teclado = new Scanner(System.in);

    
        System.out.println("===============");
        System.out.println("Fale um numero");
        System.out.println("===============");
        num =  teclado.nextInt();
        System.out.println("Seu numero sucessor e "+ (num + 1));
        System.out.println("6"
                + "Seu numero antecessor e "+(num - 1));
       
        
        
    }
 
}
