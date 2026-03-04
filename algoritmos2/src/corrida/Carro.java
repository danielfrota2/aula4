package corrida;
public class Carro {

    double velocidade = 0;
    double peso;
    double cilindrada;

    public Carro(double peso, double cilindrada) {
        this.peso = peso;
        this.cilindrada = cilindrada;
    }

    public void acelerar() {
        velocidade += 5;
        velocidade += velocidade * (0.15 * cilindrada) - (peso / 300);
    }

    public void frear() {
        velocidade -= velocidade * 0.25;
    }

    public void imprimir() {
        System.out.println("Velocidade Final: " + velocidade);
        System.out.println("Peso: " + peso);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("----------------------");
    }
}
