package aula04.exer002;

public class Nota {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.nome = "João";
        a1.setNota1(9);
        a1.setNota2(10);
        a1.setNota3(8);

        System.out.println("Nome: " + a1.nome);
        System.out.println("Primeira nota: " + a1.getNota1());
        System.out.println("Segunda nota: " + a1.getNota2());
        System.out.println("Terceira nota: " + a1.getNota3());
        System.out.println("Sua média: " + a1.setMedia());
    }
}
