package aula04.exer002;

public class Aluno {
    String nome;
    private int n1;
    private int n2;
    private int n3;

    public int getNota1() {
        return n1;
    }

    public void setNota1(int novaNota1) {
        if (novaNota1 > 0) {
            this.n1 = novaNota1;
        } else {
            System.out.println("Impossível");
        }
    }

    public int getNota2() {
        return n2;
    }

    public void setNota2(int novaNota2) {
        if (novaNota2 > 0) {
            this.n2 = novaNota2;
        } else {
            System.out.println("Impossível");
        }
    }

    public int getNota3() {
        return n3;
    }

    public void setNota3(int novaNota3) {
        if (novaNota3 > 0) {
            this.n3 = novaNota3;
        } else {
            System.out.println("Impossível");
        }
    }

    public int setMedia() {
        int media = (n1 + n2 + n3) / 3;
        return media;
    }
}
