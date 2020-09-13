package exercicio_01;

public class Retangulo {
    private static float largura;
    private static float comprimento;

    public float getLargura() {
        return largura;
    }

    public boolean setLargura(float largura) {

        if ((largura < 0.0) || (largura == 0.0)) {
            System.out.println("Erro: Um dos lados do retângulo é igual ou menor que zero.");
            return false;
        } else {
            this.largura = largura;
            return true;
        }
    }

    public float getComprimento() {
        return comprimento;
    }

    public boolean setComprimento(float comprimento) {

        if ((comprimento < 0.0) || (comprimento == 0.0)) {
            System.out.println("Erro: Um dos lados do retângulo é igual ou menor que zero");
            return false;


        } else {
            this.comprimento = comprimento;
            return true;
        }
    }

    public float perimetro() {
        float p = 2 * (largura + comprimento);
        return p;
    }

    public float area() {
        float a = (largura * comprimento);
        return a;
    }

}
