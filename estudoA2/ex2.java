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
public class ex2 {
    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[][] dados = new String[20][4];
double maiorValor = 0;
int associados = 0;


System.out.println("=== Cadastro dos 20 cachorros ===\n");
for (int i = 0; i < 2; i++) {
System.out.print("Nome do dono: ");
dados[i][0] = sc.nextLine();
System.out.print("Quantidade de dias: ");
int dias = sc.nextInt();
sc.nextLine();

System.out.print("É associado (sim/nao): ");
dados[i][2] = sc.nextLine().toLowerCase();

double valor = dias * 20.0;
if (dados[i][2].equals("sim")) {
valor *= 0.8;
associados++;
}
dados[i][1] = String.valueOf(dias);
dados[i][3] = String.valueOf(valor);
if (valor > maiorValor) {
maiorValor = valor;
}
System.out.println();
}
System.out.println("\n=== Nome e valor da conta ===");
for (int i = 0; i < 20; i++) {
System.out.println(dados[i][0] + " - R$ " + dados[i][3]);
}


System.out.println("\nMaior valor da conta: R$ " + maiorValor);
System.out.println("\nDonos que pagaram o maior valor:");

for (int i = 0; i < 20; i++) {
if (Double.parseDouble(dados[i][3]) == maiorValor) {
System.out.println(dados[i][0]);
}
}
double percentual = (associados * 100.0) / 20.0;
System.out.println("\nPercentual de associados: " + percentual + "%");
sc.close();
}
}

