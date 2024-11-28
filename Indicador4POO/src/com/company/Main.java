package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carrinho carrinhoCompras = criarCarrinho(sc);
        Catalogo catalogo = criarCatalogo();

        while (true) {
            System.out.println("\n--- Catálogo do Mercado ---");
            System.out.println("Selecione uma opção: ");
            System.out.println("1- Ver os produtos");
            System.out.println("2- Adicionar produto na sua lista de compras");
            System.out.println("3- Remover produto da sua lista de compras");
            System.out.println("4- Eliminar produto da sua lista de compras");
            System.out.println("5- Ver o valor total da sua lista de compras");
            System.out.println("6- Ver os itens da sua lista de compras");
            System.out.println("7- Sair\n");

            String opcao = sc.next();

            switch (opcao) {
                case "1":
                    verProdutos(catalogo);
                    break;
                case "2":
                    adicionarProdutos(sc, carrinhoCompras, catalogo);
                    break;
                case "3":
                    removerProduto(sc, carrinhoCompras, catalogo);
                    break;
                case "4":
                    eliminarProduto(sc, carrinhoCompras, catalogo);
                    break;
                case "5":
                    verValorCarrinho(carrinhoCompras);
                    break;
                case "6":
                    verItensCarrinho(carrinhoCompras);
                    break;
                case "7":
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }

    private static Carrinho criarCarrinho(Scanner sc) {
        Carrinho carrinhoCompras = new Carrinho();

        System.out.println("Diga seu nome: ");
        String nome = sc.next();

        System.out.println("Pessoa fisica ou juridica?");
        String tipoPessoa = sc.next();

        while (true) {
            if (tipoPessoa.equalsIgnoreCase("fisica")) {
                System.out.println("Diga seu cpf");
                String cpf = sc.next();
                Cliente cliente = new PessoaFisica(nome, cpf);
                carrinhoCompras.setCliente(cliente);
                break;
            } else if (tipoPessoa.equalsIgnoreCase("juridica")) {
                System.out.println("Diga seu cnpj");
                String cnpj = sc.next();
                Cliente cliente = new PessoaJuridica(nome, cnpj);
                carrinhoCompras.setCliente(cliente);
                break;
            }

            System.out.println("Resposta inválida! Tente novamente:");
        }
        return carrinhoCompras;
    }

    private static Catalogo criarCatalogo() {
        Produto produto1 = new Produto("Banana", "Fruta", 3.50, 25897);
        Produto produto2 = new Produto("Arroz", "Legumes", 5.00, 12345);
        Produto produto3 = new Produto("Café", "Bebida", 2.50, 67890);
        Produto produto4 = new Produto("Leite", "Bebida", 3.00, 98765);

        ArrayList<Produto> produtos = new ArrayList<>(Arrays.asList(produto1, produto2, produto3, produto4));
        return new Catalogo("Catálogo do mercado", produtos);
    }

    private static void verItensCarrinho(Carrinho carrinhoCompras) {
        System.out.println("Itens da lista de compras:");
        for (ItemDeCompra item : carrinhoCompras.getItems()) {
            System.out.println(item.getProduto().getNome() + " - "
                    + item.getQuantidade() + " unidades");
        }
    }

    private static void verValorCarrinho(Carrinho carrinhoCompras) {
        System.out.println("Valor total da sua lista de compras: R$"
                + carrinhoCompras.calcularTotal());
    }

    private static void eliminarProduto(Scanner sc, Carrinho carrinhoCompras, Catalogo catalogo) {
        try {
            System.out.println("Digite o nome do produto que deseja eliminar:");
            String nomeProdutoEliminar = sc.next();

            Produto produtoEncontradoEliminar = catalogo.getProdutos().stream()
                    .filter(produto -> produto.getNome().equalsIgnoreCase(nomeProdutoEliminar))
                    .findFirst().orElse(null);

            if (produtoEncontradoEliminar != null) {
                carrinhoCompras.eliminar(produtoEncontradoEliminar);
                System.out.println("Eliminado com sucesso!");
            } else {
                System.out.println("Produto não encontrado!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao eliminar produto: " + e.getMessage());
        }
    }

    private static void removerProduto(Scanner sc, Carrinho carrinhoCompras, Catalogo catalogo) {
        try {
            System.out.println("Digite o nome do produto que deseja remover:");
            String nomeProdutoRemover = sc.next();
            System.out.println("Digite a quantidade do produto que deseja remover:");
            int quantidadeRemover = sc.nextInt();

            Produto produtoEncontradoRemover = catalogo.getProdutos().stream()
                    .filter(produto -> produto.getNome().equalsIgnoreCase(nomeProdutoRemover))
                    .findFirst().orElse(null);

            if (produtoEncontradoRemover != null) {
                carrinhoCompras.remover(produtoEncontradoRemover, quantidadeRemover);
                System.out.println("Removido com sucesso!");
            } else {
                System.out.println("Produto não encontrado!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Quantidade inválida! Por favor, insira um número.");
            sc.next();
        } catch (Exception e) {
            System.out.println("Erro ao remover produto: " + e.getMessage());
        }
    }

    private static void adicionarProdutos(Scanner sc, Carrinho carrinhoCompras, Catalogo catalogo) {
        try {
            System.out.println("Digite o nome do produto que deseja adicionar:");
            String nomeProduto = sc.next();
            System.out.println("Digite a quantidade do produto que deseja adicionar:");
            int quantidade = sc.nextInt();

            Produto produtoEncontrado = catalogo.getProdutos().stream()
                    .filter(produto -> produto.getNome().equalsIgnoreCase(nomeProduto))
                    .findFirst().orElse(null);

            if (produtoEncontrado != null) {
                carrinhoCompras.adicionar(produtoEncontrado, quantidade);
                System.out.println("Adicionado com sucesso!");
            } else {
                System.out.println("Produto não encontrado!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Quantidade inválida! Por favor, insira um número.");
            sc.next();
        } catch (Exception e) {
            System.out.println("Erro ao adicionar produto: " + e.getMessage());
        }
    }

    private static void verProdutos(Catalogo catalogo) {
        System.out.println("--- Produtos Disponíveis ---");
        for (Produto produto : catalogo.getProdutos()) {
            System.out.println(produto.getNome() + " ("
                    + produto.getDescricao() + "), R$"
                    + produto.getPreco() + " - "
                    + produto.getCodigo());
        }
    }
}
