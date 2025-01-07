public class ContaPoupanca extends Conta {



    public ContaPoupanca(Cliente cliente){
        super(cliente);

    }

    protected void imprimirInformacoes(){
        System.out.println("Extrato do Conta Poupança");


    }



}
