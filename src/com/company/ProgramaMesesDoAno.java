package com.company;
import java.util.Scanner;
public class ProgramaMesesDoAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String mes;

        System.out.println("Em números, em que mês estamos?");
        x = sc.nextInt();

        switch (x) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default: // caso todos os casos falhem, estabelecemos um padrão.
                mes = "ERRO: Valor Inválido. São permitidos apenas números de 1 a 12.\n";
                break;
        }

        System.out.printf("Estamos no mês: %s. \n", mes);

        sc.close();

    }
}