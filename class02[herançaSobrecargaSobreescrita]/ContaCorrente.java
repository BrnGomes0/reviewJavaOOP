public class ContaCorrente extends Conta{
    // Herdando de Conta
        @Override // SobreEscrita
    void deposito (double valor) {
        this.saldo = this.saldo + valor + 1;
    }
}
