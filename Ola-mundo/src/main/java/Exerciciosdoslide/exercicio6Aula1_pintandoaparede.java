
package Exerciciosdoslide;

import java.util.Scanner;


public class exercicio6Aula1_pintandoaparede {

    public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in);
int valor;
Double altura, largura; 

valor = 2;


System.out.println("============================");
        System.out.println("Qual a Altura da sua parade?");
         System.out.println("============================");
        altura = teclado.nextDouble();
         System.out.println("=============================================");
        System.out.println("qual a largura da sua parade?");
         System.out.println("=============================================");     
         largura = teclado.nextDouble();
        System.out.println("Voce precisara de "+ (altura * largura / valor));

       
        
        
    }



    
}
