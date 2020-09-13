package exercicio_02;

public class GeometriaTeste {

    public static void main(String[] args) {

        if (args.length != 4) {
            System.err.println(" -> Erro <- Informe ao menos 4 numeros :) ");
            System.err.println(" Informe os numeros! ");
        }
        else {

            double primeiroDigitoRaio = Double.parseDouble(args[0]);
            double segundoDigitoBase = Double.parseDouble(args[1]);
            double terceiroDigitoAltura = Double.parseDouble(args[2]);
            double quartoDigitoLado = Double.parseDouble(args[3]);

            Circulo circulo = new Circulo(primeiroDigitoRaio);
            Retangulo retangulo = new Retangulo(segundoDigitoBase, terceiroDigitoAltura);
            Quadrado quadrado = new Quadrado(quartoDigitoLado);

            System.out.println(circulo.toString());
            System.out.println(retangulo.toString());
            System.out.println(quadrado.toString());
        }
    }
}