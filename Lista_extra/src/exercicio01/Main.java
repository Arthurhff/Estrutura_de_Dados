package exercicio01;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) { //get puxa e set altera

        Ponto ponto1 = new Ponto(1, 2);
        Ponto ponto2 = new Ponto(3, 4);
        Ponto ponto3 = new Ponto(5, 6);

        ponto1.setX(123);
        ponto1.setY(456);
        ponto2.setX(321);
        ponto2.setY(654);
        ponto3.setX(172);
        ponto3.setY(839);

        System.out.println("Coordenadas do ponto 1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
        System.out.println("Coordenadas do ponto 2: (" + ponto2.getX() + ", " + ponto2.getY() + ")");
        System.out.println("Coordenadas do ponto 3: (" + ponto3.getX() + ", " + ponto3.getY() + ")");
    }
}
