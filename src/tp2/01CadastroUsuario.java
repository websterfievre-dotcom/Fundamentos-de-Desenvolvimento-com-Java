package tp2;

import java.util.Scanner;

class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da sua mae: ");
        String nomeMae = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();

        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da mae: " + nomeMae);
        System.out.println("Nome do pai: " + nomePai);

        int tamanhoNome = nome.length();
        int tamanhoNomeMae = nomeMae.length();
        int tamanhoNomePai = nomePai.length();

        System.out.println("\n--- Comparacao de Nomes ---");
        if (tamanhoNome > tamanhoNomeMae) {
            System.out.println("Seu nome tem mais letras que o nome da sua mae.");
        } else if (tamanhoNome < tamanhoNomeMae) {
            System.out.println("O nome da sua mae tem mais letras que o seu.");
        } else {
            System.out.println("Seu nome tem a mesma quantidade de letras que o nome da sua mae.");
        }

        if (tamanhoNome > tamanhoNomePai) {
            System.out.println("Seu nome tem mais letras que o nome do seu pai.");
        } else if (tamanhoNome < tamanhoNomePai) {
            System.out.println("O nome do seu pai tem mais letras que o seu.");
        } else {
            System.out.println("Seu nome tem a mesma quantidade de letras que o nome do seu pai.");
        }

        scanner.close();
    }
}
