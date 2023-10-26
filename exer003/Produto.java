package aula04.exer003;

public class Produto {
    String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public int getEstoque() {
        return quantidadeEmEstoque;
    }

    public void setEstoque(int addEstoque) {
        if (addEstoque >= 0) {
            this.quantidadeEmEstoque = addEstoque;
        } else {
            System.out.println("Impossível");
        }
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double addPreco) {
        if (addPreco >= 0) {
            this.preco = addPreco;
        } else {
            System.out.println("\nImpossível\n");
        }
    }
}
