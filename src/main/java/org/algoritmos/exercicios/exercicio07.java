package org.algoritmos.exercicios;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double TaxaDeConsumo;
        double km1;
        double km2;
        double kmtotal;
        double litros;

         System.out.print("Informe o KM inicial: " );   km1 = input.nextDouble();
         System.out.print("Informe o KM final: " );   km2 = input.nextDouble();
         System.out.print("Informe a quantidade de litros consumidos:" );
         litros = input.nextDouble();   kmtotal = km2 - km1;
         TaxaDeConsumo = kmtotal / litros;
         System.out.println("O total percorrido foi de" +kmtotal+ "Km");
         System.out.println("A Taxa media de consumo é de" +TaxaDeConsumo+ "litros por km percorrido");

    } }



