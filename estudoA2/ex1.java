/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudoA2;

/**
 *
 * @author Rubens
 */
import java.util.Scanner;
public class ex1 {

public static void saudacao(String nome, int idade) {
System.out.println("Olá " + nome + ", Você tem " + idade);
}
public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
String[][] dados = new String[5][2];
int i = 0;
while (i < 5){
    
    
System.out.print("Digite o seu nome: ");
dados[i][0] = entrada.next();
System.out.print("Digite a idade: ");
dados[i][1] = entrada.next();
i = i + 1;
}

System.out.println("\n--- Saudações ---");
for(int j = 0; j < 5; j++){
String nome = dados[j][0];
int idade = Integer.parseInt(dados[j][1]);
saudacao(nome, idade);


       }
entrada.close();
     }
}
        
    
