package corrida;


public class Corrida {

    public static void main(String[] args) {

        
        Carro c1 = new Carro(1300, 2.0);
        Carro c2 = new Carro(1250, 2.0);
        Carro c3 = new Carro(1400, 1.8);
        Carro c4 = new Carro(1100, 1.6);

        
        Moto m1 = new Moto(190, 0.5);
        Moto m2 = new Moto(180, 0.7);
        Moto m3 = new Moto(200, 0.6);
        Moto m4 = new Moto(195, 0.75);

        
        for (int segundo = 1; segundo <= 20; segundo++) {
            if (segundo == 6 || segundo == 11 || segundo == 15) {
                c1.frear(); c2.frear(); c3.frear(); c4.frear();
            } else {
                c1.acelerar(); c2.acelerar(); c3.acelerar(); c4.acelerar();
            }
        }

       
        for (int segundo = 1; segundo <= 20; segundo++) {
            if (segundo == 6 || segundo == 11 || segundo == 15) {
                m1.frear(); m2.frear(); m3.frear(); m4.frear();
            } else {
                m1.acelerar(); m2.acelerar(); m3.acelerar(); m4.acelerar();
            }
        }

       
        System.out.println("\n RESULTADO FINAL DOS CARROS ");
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
        c4.imprimir();

        System.out.println("\n RESULTADO FINAL DAS MOTOS ");
        m1.imprimir();
        m2.imprimir();
        m3.imprimir();
        m4.imprimir();
    }
}

    