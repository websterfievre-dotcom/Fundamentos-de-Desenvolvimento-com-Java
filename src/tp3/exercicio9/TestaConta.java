package tp3.exercicio9;

public class TestaConta {

    public static void main(String[] args) {

        // Criando uma conta
        Conta conta = new Conta();

        // Atribuindo valores
        conta.titular = "Webster";
        conta.numero = 12345;
        conta.agencia = "001";
        conta.saldo = 1000.00;
        conta.dataAbertura = "09/09/2026";

        // Mostrando o saldo inicial
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo inicial: R$ " + conta.saldo);

        // Testando o saque
        conta.saca(200.00);
        System.out.println("Saldo após saque: R$ " + conta.saldo);

        // Testando o depósito
        conta.deposita(500.00);
        System.out.println("Saldo após depósito: R$ " + conta.saldo);

        // Testando o rendimento
        double rendimento = conta.calculaRendimento();
        System.out.println("Rendimento: R$ " + rendimento);
    }
}