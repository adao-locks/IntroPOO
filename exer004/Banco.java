package aula04.exer004;

public class Banco {
    String nome;
    String cnpj;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double addSaldo) {
        if (addSaldo > 0 && addSaldo < 5000) {
            this.saldo = addSaldo;
        } else {
            System.out.println("\nNão foi possível!\n");
        }
    }
}
