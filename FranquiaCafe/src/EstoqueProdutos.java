import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueProdutos {
    private static Scanner input = new Scanner(System.in);
    public static ArrayList<Produto> estoque;

    public EstoqueProdutos(int id, String nome, int quantidadeCompra) {
    }


    public static void cadastrarProdutos() {
        System.out.println("Insira o Nome do Produto: ");
        String nome = input.next();

        System.out.println("Insira a quantidade do Produto: ");
        int quantidade = input.nextInt();

        System.out.println("Insira a descrição do Produto: ");
        String descricao = input.next();

        System.out.println("Insira o preço do Produto: ");
        float preco = input.nextFloat();

        Produto produto = new Produto(nome, quantidade, descricao, preco);
        estoque.add(produto);

        System.out.println(produto.getNome() + " cadastrado com sucesso");
        SistemaPedido.menu();
    }

    public static void listarProdutos() {
        if (estoque.size() > 0) {
            System.out.println("Lista de produtos cadastrados! \n");

            for (Produto p : estoque) {
                System.out.println(p);
            }
        }else{
            System.out.println("Nenhum produto cadastrado");
        }
        SistemaPedido.menu();

    }

    public static void removerProdutos() {
        System.out.println("Qual produto deseja remover?");
        System.out.println(estoque);
        System.out.println("Coloque o Id que deseja remover");
        int idRemove = input.nextInt();
        System.out.println("Coloque a quantidade que deseja remover");
        int quantidadeRemove = input.nextInt();
        for (Produto produto : estoque) {
            if (produto.getId() == idRemove) {
                // Remoção da quantidade
                produto.setQuantidade(produto.getQuantidade() - quantidadeRemove);
                System.out.println("Item removido: " + "agora sua quantidade é: "
                        + produto.getQuantidade() + "\n");
                SistemaPedido.menu();
                break;
            } else System.out.println("n fiz nada");
            SistemaPedido.menu();
        }
    }
}

