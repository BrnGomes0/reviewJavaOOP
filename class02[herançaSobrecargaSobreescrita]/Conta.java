public class Conta {
    double saldo;

    // Métodos com assinaturas diferentes, porem fazendo coisas parecidas

    void deposito(double valor) {
        this.saldo = this.saldo + valor;
    }

    void deposito(double valor, String texto) { // This is Sobrecarga
        this.saldo = this.saldo + valor;
        System.out.println("Texto");
    }


}
