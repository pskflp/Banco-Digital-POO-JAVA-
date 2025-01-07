public class ContaCorrente extends Conta {



    public ContaCorrente(Cliente cliente){
        super(cliente);

    }

    protected void imprimirInformacoes(){

        System.out.println("Extrato do Conta Corrente");
    }


}



