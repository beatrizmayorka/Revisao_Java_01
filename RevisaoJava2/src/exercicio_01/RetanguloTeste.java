package exercicio_01;

import java.util.Scanner;

public class RetanguloTeste {
    public static void main(String args[]) {
        Retangulo oj = new Retangulo();
        Scanner entrada = new Scanner(System.in);

        System.out.print(" Comprimento: ");
        oj.setComprimento(entrada.nextFloat());

        System.out.print(" largura: ");
        oj.setLargura(entrada.nextFloat());

        System.out.print(" Perimetro: " + oj.perimetro() + " Area: "
        + oj.area() );
    }
}
