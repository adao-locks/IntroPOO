package aula04.poo.br.senai;

public class Pessoa {
    private int idade;
    String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
            if (novaIdade > 0) {
                this.idade = novaIdade;
            } else {
                System.out.println("Impossível");
            }
    }
}
