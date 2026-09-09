package tp3.exercicio12;

public class Esfera {

    double raio;

    // Calcula e retorna o volume da esfera
    double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }
}