package com.company;

import java.util.Scanner;

public class StringVect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Maçã Banana Laranja Uva Morango";
        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
        System.out.println(vect[4]);



        sc.close();
    }
}


