package tp3.exercicio9;

public class Conta {

    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    void saca(double valor) {
        saldo = saldo - valor;
    }

    void deposita(double valor) {
        saldo = saldo + valor;
    }

    double calculaRendimento() {
        return saldo * 0.1;
    }
}