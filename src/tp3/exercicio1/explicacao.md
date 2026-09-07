# Exercício 1 — Conceitos de Classe, Objeto, Campos e Métodos

Na **Programação Orientada a Objetos (POO)**, utilizamos classes e objetos para representar elementos do mundo real dentro de um programa.

### Classe

Uma **classe** funciona como um modelo que define as características e os comportamentos que seus objetos poderão ter. Por exemplo, podemos criar uma classe chamada `Carro` para representar carros dentro de um sistema.

### Objeto

Um **objeto** é uma instância de uma classe. Isso significa que, a partir da classe `Carro`, podemos criar diferentes objetos, cada um com seus próprios valores.

Por exemplo, podemos criar um carro da marca Toyota e outro da marca Honda. Os dois pertencem à mesma classe `Carro`, mas são objetos diferentes.

### Campos ou atributos

Os **campos**, também chamados de **atributos**, armazenam as informações ou características de um objeto.

Na classe `Carro`, podemos ter:

* `marca`: armazena a marca do carro.
* `velocidade`: armazena a velocidade atual do carro.

### Métodos

Os **métodos** representam ações ou comportamentos que um objeto pode executar. Eles também podem acessar ou modificar os campos do objeto.

Por exemplo, podemos criar o método `acelerar()`, que aumenta a velocidade do carro.

## Exemplo em Java

```java
public class Carro {

    // Campos ou atributos
    String marca;
    int velocidade;

    // Método
    void acelerar() {
        velocidade = velocidade + 10;
        System.out.println("O carro está a " + velocidade + " km/h.");
    }

    public static void main(String[] args) {

        // Criação de um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Definindo os valores dos campos
        meuCarro.marca = "Toyota";
        meuCarro.velocidade = 0;

        // Chamando o método
        meuCarro.acelerar();
    }
}
```

### Explicação do exemplo

Nesse exemplo, `Carro` é a **classe**, ou seja, o modelo utilizado para representar um carro.

`marca` e `velocidade` são os **campos ou atributos** da classe. Eles armazenam informações sobre cada carro criado.

O método `acelerar()` representa uma ação do carro. Quando ele é executado, o valor do campo `velocidade` aumenta em 10 km/h.

A instrução:

```java
Carro meuCarro = new Carro();
```

cria um **objeto** chamado `meuCarro` a partir da classe `Carro`.

Depois, atribuímos valores aos campos:

```java
meuCarro.marca = "Toyota";
meuCarro.velocidade = 0;
```

Por fim, executamos o método:

```java
meuCarro.acelerar();
```

Como a velocidade inicial é `0`, depois da execução do método ela passa para `10 km/h`.

### Conclusão

Podemos resumir os conceitos da seguinte maneira:

* **Classe:** é o modelo que define como os objetos serão estruturados.
* **Objeto:** é uma instância criada a partir de uma classe.
* **Campos/Atributos:** representam as características e armazenam os dados do objeto.
* **Métodos:** representam os comportamentos ou ações que o objeto pode realizar.

Assim, a Programação Orientada a Objetos permite organizar um programa relacionando **dados (atributos)** e **comportamentos (métodos)** dentro de classes e objetos.
