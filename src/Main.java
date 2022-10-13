public class Main {
    public static void main(String[] args) {


        Cliente igor = new Cliente();
        igor.setNome("Igor");
        Conta cc = new ContaCorrente(igor);
        Conta poupanca = new ContaPoupanca(igor);

        poupanca.depositar(100);
        poupanca.imprimirExtrato();


        poupanca.transferir(100,cc);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.emprestimo(1200);
    }
}
