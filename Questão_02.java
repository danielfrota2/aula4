/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_17;

import java.util.Random;
import java.util.Arrays;


public class Questão_02 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numeros = new int[20];


        int i = 0;
        while (i < 20) {
            numeros[i] = random.nextInt(101);
            i = i + 1;
        }

        System.out.println("\nNúmeros: " + Arrays.toString(numeros));
        
        int maior = 0;  
        i = 1;
        while (i < 20) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            i = i + 1;
        }
        System.out.println("\nMaior elemento do vetor: " + maior);

        int contador = 0;

        i = 0;
        while (i < 20) {
            if (numeros[i] == numeros[0]) {
                contador = contador + 1;
            }
            i = i + 1;
        }

        System.out.println("\nO primeiro elemento aparece " + contador);

        i = 0;
        while (i < 20) {
            if (i == 0) {
                System.out.println("\nAntecessor: não existe");
                System.out.println("Elemento: " + numeros[i]);
                System.out.println("Sucessor: " + numeros[i + 1]);
            }
            else if (i == 19) {
                System.out.println("\nAntecessor: " + numeros[i - 1]);
                System.out.println("Elemento: " + numeros[i]);
                System.out.println("Sucessor: não existe");
            }
            else {
                System.out.println("\nAntecessor: " + numeros[i - 1]);
                System.out.println("Elemento: " + numeros[i]);
                System.out.println("Sucessor: " + numeros[i + 1]);
            }

            i = i + 1;
        }

    }
    
}
