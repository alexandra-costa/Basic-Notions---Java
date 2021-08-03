package com.company;
import java.util.Scanner;
public class ExercicioIfElse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite um número: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Este número é PAR. \n");
        }
        else {
            System.out.println("Este número é ÍMPAR. \n");
        }

        sc.close();

    }
}