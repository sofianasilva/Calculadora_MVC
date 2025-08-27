package org.example.view;
import org.example.controller.CalculadoraController;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        CalculadoraController controller = new CalculadoraController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma operação:");
            controller.listarOperacoes();
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();
            if (escolha == 0) break;

            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();

            try {
                double resultado = controller.executarOperacao(escolha, a, b);
                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
