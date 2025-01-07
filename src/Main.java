public class Main {
    public static void main(String[] args) {

        Cliente Josue = new Cliente("Josue");
        Conta contaCorrente = new ContaCorrente(Josue);
        Conta contaPoupanca = new ContaPoupanca(Josue);

        contaCorrente.depositar(100);
        contaPoupanca.depositar(100);

        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();

        contaCorrente.sacar(50);
        contaPoupanca.transferir(50, contaCorrente);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();


    }
}