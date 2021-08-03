package com.company;
import java.util.Scanner;
public class ExercicioDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         char resposta;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Farenheit: %.2f \n\n", F);
            System.out.print("Deseja repetir? (s/n) \n");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');
        sc.close();
    }
}

