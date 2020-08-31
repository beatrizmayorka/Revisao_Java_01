package exercicioQuatro;

public class Fatura {
    String codFatura;
    String descricao;
    Integer quantidadeItem;
    double precoItem;

    public String getCodFatura() {
        return codFatura;
    }

    public void setCodFatura(String codFatura) {
        this.codFatura = codFatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(Integer quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public Double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(Double precoItem) {
        this.precoItem = precoItem;
    }

    public double totalFaturado () {

        double preco = quantidadeItem * precoItem;

        return preco;
    }
}