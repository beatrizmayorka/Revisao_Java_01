package exercicio_02;

public class Circulo extends Forma {

    protected double raio;

    public Circulo() { }

    public Circulo(double raioInformado) {
        this.raio = raioInformado;
    }

    public Circulo(double raioInformado, String corInformado, boolean preenchidoInformado){
        super(corInformado, preenchidoInformado);
        this.raio = raioInformado;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raioInformado) {
        this.raio = raioInformado;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * getRaio();
    }

    public String toString() {
        return " | Circulo   | -> (  Area = " + getArea() + ", Raio = " + getRaio() + ", Perimetro = " + getPerimetro() + ", Cor = " + super.getCor() + ", Preenchido = " + super.getPreenchido() + " ) ";
    }
}