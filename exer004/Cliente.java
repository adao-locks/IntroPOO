package aula04.exer004;

public class Cliente {
    public static void main(String[] args) {
        Banco c1 = new Banco();

        c1.nome = "Adão";
        c1.cnpj = "XX. XXX. XXX/0001-XX";
        c1.setSaldo(1000.59);

        System.out.println(c1.nome);
        System.out.println(c1.cnpj);
        System.out.println(c1.getSaldo());
    }
}
