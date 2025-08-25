package Exerciciosdoslide;

import java.util.Scanner;

public class Exercicio1Aula1_salariodefuncionario {

    public static void main(String[] args) {

        String nome, salario;

        Scanner teclado = new Scanner(System.in);
        System.out.println("================");
        System.out.println("Qual seu nome?");
        System.out.println("================");
        nome = teclado.nextLine();
        System.out.println("================");
        System.out.println("qual seu salario?");
        System.out.println("================");
        salario = teclado.nextLine();
        System.out.println("seu nome e " + nome + " e voce recebe " + salario + "");

    }

}
