package com.company;
import java.util.Scanner;
public class ExercicioSintaxeOpcional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos;

        double conta = 50.0;

        System.out.println("Digite quantos minutos você utilizou esse mês: ");
        minutos = sc.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

     System.out.printf("Valor da conta = R$ %.2f \n", conta);



      sc.close();
    }
}
