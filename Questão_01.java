/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_17;

import java.util.Scanner;

public class Questão_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorQtdMenos30 = 0;
        double somaGastos30mais = 0;
        int cont30mais = 0;

        System.out.println("Digite a quantidade de livros: ");
        int quantidade = sc.nextInt();

        while (quantidade > 0) {

            System.out.println("Digite a idade do cliente: ");
            int idade = sc.nextInt();

            double gasto = quantidade * 25.0;
            System.out.println("Valor gasto pelo cliente: R$ " + gasto);

            if (idade < 30) {
                if (quantidade > maiorQtdMenos30) {
                    maiorQtdMenos30 = quantidade;
                }
            }

            if (idade >= 30) {
                somaGastos30mais = somaGastos30mais + gasto;
                cont30mais = cont30mais + 1;
            }

            System.out.println("\nDigite a quantidade de livros (0 para encerrar): ");
            quantidade = sc.nextInt();
        }

        System.out.println("Maior qt clientes com menos de 30 anos: " + maiorQtdMenos30);

        if (cont30mais > 0) {
            double media = somaGastos30mais / cont30mais;
            System.out.println("Média dos gastos 30 anos ou mais: R$ " + media);
        } else {
            System.out.println("Nenhum cliente com 30 anos ou mais realizou compras.");
        }
        sc.close();
    }
    
}
