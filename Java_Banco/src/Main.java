public class Main {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");
        Conta cc = new ContaCorrente(matheus);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(matheus);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}