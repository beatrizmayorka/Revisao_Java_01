package exercicio_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baralho {

    private List<Carta> monte;
    private Integer cartaAtual = 0;
    private static final int TOTAL_DE_CARTAS = 52;
    private static final List<String> VALORES = Arrays.asList("Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei");
    private static final List<String> NAIPES = Arrays.asList("Paus", "Ouros", "Copas", "Espada");

    public Baralho() {
        monte = new ArrayList<>(TOTAL_DE_CARTAS);

        for( int contadorNaipes = 0; contadorNaipes < NAIPES.size(); contadorNaipes++ ) {
            for(int contadorValores = 0; contadorValores < VALORES.size(); contadorValores++) {
                monte.add(new Carta(NAIPES.get(contadorNaipes), VALORES.get(contadorValores)));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(this.monte);
    }

    public void distribuir() {
        for(int contador = 0; contador < monte.size(); contador++) {
            if( monte.size() - 1 != cartaAtual ) {
                Carta carta = monte.get(contador);
                System.out.println("Distribuindo " + carta.toString());
            } else {
                System.out.println();
                System.out.println("Nenhuma carta no baralho! Fim de jogo!");
            }
            cartaAtual++;
        }
    }
}