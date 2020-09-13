package exercicio_02;

public class Retangulo extends Forma {

    protected double base;
    protected double altura;

    public Retangulo() { }

    public Retangulo(double baseInformado, double alturaInformado) {
        this.base = baseInformado;
        this.altura = alturaInformado;
    }

    public Retangulo(double baseInformado, double alturaInformado, String corInformado, boolean preenchidoInformado) {
        super(corInformado, preenchidoInformado);
        this.base = baseInformado;
        this.altura = alturaInformado;
    }

    public double getBase(){
        return this.base;
    }

    public void setBase(double baseInformado){
        this.base = baseInformado;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double alturaInformado){
        this.altura = alturaInformado;
    }

    public double getArea() {
        return getBase() * getAltura();
    }

    public double getPerimetro() {
        return 2 * (getBase() + getAltura());
    }

    public String toString() {
        return " | Retangulo | -> ( Base = " + this.getBase() + ", Altura = " + this.getAltura() + ", Area = " + getArea() +  ", Perimetro = " + getPerimetro() + ", Cor = " + super.getCor() + ", Preenchido = " + super.getPreenchido() + " ) ";
    }
}