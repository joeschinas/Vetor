
package Entidade;

public class Produto {
    private String nomeProduto;
    private double price;

    public Produto() {
    }

    public Produto(String nomeProduto, double price) {
        this.nomeProduto = nomeProduto;
        this.price = price;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
