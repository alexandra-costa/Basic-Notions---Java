package com.company;

import java.util.Scanner;

public class ExercicioIfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.println("Digite o valor de A: \n");
        A = sc.nextInt();

        System.out.println("Digite o valor de B: \n");
        B = sc.nextInt();

        if (A % B == 0) {
            System.out.println("A E B SÃO MÚLTIPLOS.");
        }
        else {
            System.out.println("A E B NÃO SÃO MÚLTIPLOS.");
        }

        sc.close();
    }
}