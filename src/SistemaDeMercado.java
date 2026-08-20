import java.util.Scanner;

public class SistemaDeMercado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomesProdutos = {"Arroz", "Feijão", "Leite"};
        double[] precosProdutos = {30.00, 15.00, 5.00};
        int[] quantidadesCarrinho = new int[3];

        int opcao;

        do {

            exibirMenu();

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1 ->
                        listarProdutos(nomesProdutos, precosProdutos);

                case 2 ->
                        adicionarAoCarrinho(
                                scanner,
                                nomesProdutos,
                                quantidadesCarrinho
                        );

                case 3 ->
                        visualizarCarrinho(
                                nomesProdutos,
                                precosProdutos,
                                quantidadesCarrinho
                        );

                case 4 ->
                        finalizarCompra(
                                nomesProdutos,
                                precosProdutos,
                                quantidadesCarrinho
                        );

                case 5 ->
                    System.out.println("\nEncerrando sistema...");


                default ->
                    System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }

    public static void exibirMenu() {

        System.out.println("\n===== SISTEMA DE MERCADO =====");
        System.out.println("1 - Listar produtos");
        System.out.println("2 - Adicionar ao carrinho");
        System.out.println("3 - Ver carrinho");
        System.out.println("4 - Finalizar compra");
        System.out.println("5 - Sair");
    }

    public static void listarProdutos(
            String[] nomesProdutos,
            double[] precosProdutos) {

        System.out.println("\n=== PRODUTOS DISPONÍVEIS ===");

        for (int i = 0; i < nomesProdutos.length; i++) {

            System.out.printf(
                    "%d - %s | R$ %.2f%n",
                    i,
                    nomesProdutos[i],
                    precosProdutos[i]
            );
        }
    }

    public static void adicionarAoCarrinho(
            Scanner scanner,
            String[] nomesProdutos,
            int[] quantidadesCarrinho) {

        System.out.print("\nDigite o código do produto: ");
        int codigoProduto = scanner.nextInt();

        if (codigoProduto >= 0 && codigoProduto < nomesProdutos.length) {

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            if (quantidade > 0) {

                quantidadesCarrinho[codigoProduto] += quantidade;

                System.out.println("Produto adicionado ao carrinho!");

            } else {

                System.out.println("Quantidade inválida!");
            }

        } else {

            System.out.println("Produto inválido!");
        }
    }

    public static void visualizarCarrinho(
            String[] nomesProdutos,
            double[] precosProdutos,
            int[] quantidadesCarrinho) {

        System.out.println("\n=== CARRINHO ===");

        boolean carrinhoVazio = true;
        double total = 0;

        for (int i = 0; i < nomesProdutos.length; i++) {

            if (quantidadesCarrinho[i] > 0) {

                carrinhoVazio = false;

                double subtotal =
                        quantidadesCarrinho[i] * precosProdutos[i];

                total += subtotal;

                System.out.printf(
                        "%s | Qtd: %d | Subtotal: R$ %.2f%n",
                        nomesProdutos[i],
                        quantidadesCarrinho[i],
                        subtotal
                );
            }
        }

        if (carrinhoVazio) {

            System.out.println("Carrinho vazio!");

        } else {

            System.out.println("---------------------------");
            System.out.printf("TOTAL: R$ %.2f%n", total);
        }
    }

    public static void finalizarCompra(
            String[] nomesProdutos,
            double[] precosProdutos,
            int[] quantidadesCarrinho) {

        double total = calcularTotal(
                precosProdutos,
                quantidadesCarrinho
        );

        System.out.println("\n=== COMPRA FINALIZADA ===");
        System.out.printf("TOTAL A PAGAR: R$ %.2f%n", total);

        limparCarrinho(quantidadesCarrinho);

        System.out.println("Obrigado pela compra!");
    }

    public static double calcularTotal(
            double[] precosProdutos,
            int[] quantidadesCarrinho) {

        double total = 0;

        for (int i = 0; i < precosProdutos.length; i++) {

            total += quantidadesCarrinho[i] * precosProdutos[i];
        }

        return total;
    }

    public static void limparCarrinho(int[] quantidadesCarrinho) {

        for (int i = 0; i < quantidadesCarrinho.length; i++) {

            quantidadesCarrinho[i] = 0;
        }
    }
}

