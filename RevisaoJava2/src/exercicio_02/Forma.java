package exercicio_02;

public abstract class Forma {

    protected String cor = "Vermelho";
    protected boolean preenchido = true;

    public Forma(){ }

    public Forma(String corInformado, boolean preenchidoInformado){
        this.cor = corInformado;
        this.preenchido = preenchidoInformado;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String corInformado){
        this.cor = corInformado;
    }

    public boolean getPreenchido(){
        return this.preenchido;
    }

    public void setPreenchido(boolean preenchidoInformado){
        this.preenchido = preenchidoInformado;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

    public abstract String toString();
}