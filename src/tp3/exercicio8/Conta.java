package tp3.exercicio8;

public class Conta {

    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    // Retira um valor do saldo
    void saca(double valor) {
        saldo = saldo - valor;
    }

    // Adiciona um valor ao saldo
    void deposita(double valor) {
        saldo = saldo + valor;
    }

    // Calcula e retorna 10% do saldo
    double calculaRendimento() {
        return saldo * 0.1;
    }
}