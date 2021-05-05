package prova04.pkg05;

import java.util.Scanner;

/**
 * @author Denise
 */
public class Prova0405 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        double r,per,area,dia;
        System.out.println("Coloque o raio do círculo");
	r = teclado.nextDouble();
	per = 2*3.14*r;
	area = 3.14*Math.pow(r,2);
	dia = 2*r;
	System.out.println("O perímetro do círculo é "+per);
	System.out.println("A área do círculo é "+area);
	System.out.println("O diâmetro do círculo é "+dia);
    teclado.close();
    }
    
}
