public class Conta implements IConta{

    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia =  AGENCIA_PADRAO;
        this.numero =  SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;

    public void sacar(double valor){
        saldo = saldo - valor;

    }

    public void depositar(double valor){
        saldo = saldo + valor;

    }

    public void transferir(double valor, Conta destino){
        this.sacar(valor);
        destino.depositar(valor);


    }

    public void imprimirExtrato(){

        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println();
        System.out.printf("Agencia: %d", this.agencia);
        System.out.println();
        System.out.printf("Numero: %d", this.numero);
        System.out.println();
        System.out.println("Saldo: R$ " + this.saldo);

    }
}
