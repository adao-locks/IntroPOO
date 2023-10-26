package aula04.poo.br.senai;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "João";
        p1.setIdade(-5);

        System.out.println("Nome: " + p1.nome);
        System.out.println("idade: " + p1.getIdade());
    }
}
