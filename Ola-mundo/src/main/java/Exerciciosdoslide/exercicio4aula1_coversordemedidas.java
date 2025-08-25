
package Exerciciosdoslide;

import java.util.Scanner;

public class exercicio4aula1_coversordemedidas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double metros,distancia, cm,km;
        
    km = 1000;
    cm = 100;    
    
        System.out.println("qual a distancia em metros?");
        metros =  teclado.nextDouble();
       System.out.println("sua distancia em quilometros e de "+ metros / km );
        System.out.println("Sua distancia em cm e de "+ metros * cm);
        
        
        
        
        
        
        
    }





    
}
