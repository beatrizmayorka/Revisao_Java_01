package exercicio_04;

public class Carta {
    private String naipe;
    private String valor;

    public Carta(String naipeInformado, String valorInformado) {
        this.naipe = naipeInformado;
        this.valor = valorInformado;
    }

    public String toString() {
        return this.valor + " de " + this.naipe;
    }
}