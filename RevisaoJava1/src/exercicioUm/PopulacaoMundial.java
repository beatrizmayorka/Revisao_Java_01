package exercicioUm;

public class PopulacaoMundial {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Por favor, insira um numero que mostre o crescimento demografico adiante.");
        } else {
            int NumeroFornecido = Integer.parseInt(args[0]);

            double PopulacaoAtual =  (7.807433145);

            double CrescimentoAnual = (1.5 / 100.0);
            double Resultado = (CrescimentoAnual * NumeroFornecido);
            double PopulacaoFinal = PopulacaoAtual * Resultado ;

            System.out.println();
            System.out.println(PopulacaoAtual + PopulacaoFinal);
        }
    }
}
