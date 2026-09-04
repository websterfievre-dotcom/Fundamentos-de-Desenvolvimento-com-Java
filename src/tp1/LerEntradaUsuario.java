package tp1;

import java.util.Scanner;

public class LerEntradaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");

        scanner.close();
    }
}
