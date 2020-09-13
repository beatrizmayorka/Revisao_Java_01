package exercicio_04;

public class CartaTeste {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();

        System.out.println(" Embaralhando o monte! ");
        baralho.embaralhar();

        System.out.println();
        System.out.println(" Distribuindo ... ");
        System.out.println();
        baralho.distribuir();

    }
}