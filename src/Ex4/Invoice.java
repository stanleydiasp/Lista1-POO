package Ex4;

public class Invoice {

    public Invoice(int idItem, String descricaoItem, int quantidadeCompraItem, double precoUnitarioItem) {
        this.idItem = idItem;
        this.descricaoItem = descricaoItem;
        this.quantidadeCompraItem = quantidadeCompraItem;
        this.precoUnitarioItem = precoUnitarioItem;
    }

    private int idItem;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    private String descricaoItem;

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    private int quantidadeCompraItem;

    public int getQuantidadeCompraItem() {
        return quantidadeCompraItem;
    }

    public void setQuantidadeCompraItem(int quantidadeCompraItem) {
        this.quantidadeCompraItem = quantidadeCompraItem;
    }

    private double precoUnitarioItem;

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        this.precoUnitarioItem = precoUnitarioItem;
    }

    public double getInvoiceAmount() {
        double fatura;

        fatura = precoUnitarioItem * quantidadeCompraItem;

        return fatura;

    }

}
