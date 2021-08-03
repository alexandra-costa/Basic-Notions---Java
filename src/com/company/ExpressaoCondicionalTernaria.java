package com.company;
import java.util.Scanner;
public class ExpressaoCondicionalTernaria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double preco = 34.5;               //    V             F
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;

        System.out.printf("O desconto foi de R$ %.2f \n", desconto);

     sc.close();
    }
}
