package exercicioDois;

public class Calculadora {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Por favor, insira dois numeros.");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

        if (num1 > num2) {
            System.out.println(num1 + " É maior.");
        }

        if (num2 > num1) {
            System.out.println(num2 + " É maior.");
        }

        if (num1 == num2) {
            System.out.println("num1 e num2 sao iguais.");
        }

            System.out.println();
            System.out.println(num1 + num2);
            System.out.println(num1 * num2);
            System.out.println(num1 - num2);
            System.out.println(num1 / num2);

        }
    }

}
