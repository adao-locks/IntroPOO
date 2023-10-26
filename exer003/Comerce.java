package aula04.exer003;

public class Comerce {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.nome = "João";
        p1.setPreco(9.99);
        p1.setEstoque(-100);

        System.out.println("Nome: " + p1.nome);
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Estoque: " + p1.getEstoque());
    }
}