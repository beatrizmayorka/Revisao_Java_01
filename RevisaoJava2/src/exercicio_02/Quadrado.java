package exercicio_02;

public class Quadrado extends Retangulo {

    public Quadrado() { }

    public Quadrado(double ladoInformado) {
        super(ladoInformado, ladoInformado);
    }

    public Quadrado(double ladoInformado, String corInformado, boolean preenchidoInformado) {
        super(ladoInformado, ladoInformado, corInformado, preenchidoInformado);
    }

    public double getLado() {
        return super.getBase();
    }

    public void setLado(double primeiroLadoInformado, double segundoLadoInformado) {
        super.setAltura(primeiroLadoInformado);
        super.setBase(segundoLadoInformado);
    }

    public double getArea() {
        return super.getBase() * super.getAltura();
    }

    public double getPerimetro() {
        return (super.getBase() + super.getBase() + super.getAltura() + super.getAltura());
    }

    public String toString() {
        return " | Quadrado  | -> ( lado = " + super.getBase() + ", Area = " + this.getArea() + ", Perimetro = " + this.getPerimetro() + ", Cor = " + super.getCor() + ", Preenchido = " + super.getPreenchido() + " ) ";
    }
}