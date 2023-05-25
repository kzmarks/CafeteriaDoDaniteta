import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Pedido {

    private static Scanner input = new Scanner(System.in);
    public static ArrayList<EstoqueProdutos> estoqueProdutos;
    private double valorTotal;
    private Date dataHoraPedido;

    public static void adicionarProduto() {
        System.out.println("Qual produto deseja comprar?");
        System.out.println(EstoqueProdutos.estoque);
        System.out.println("Coloque o Id que deseja comprar");
        int idCompra = input.nextInt();
        System.out.println("Coloque a quantidade que deseja comprar");
        int quantidadeCompra = input.nextInt();
        for (Produto produto : EstoqueProdutos.estoque) {
            if (produto.getId() == idCompra) {
                // Remoção da quantidade
                EstoqueProdutos itemLista = new EstoqueProdutos(produto.getId(), produto.getNome(),
                        quantidadeCompra);
                produto.setQuantidade(produto.getQuantidade() - quantidadeCompra);
                estoqueProdutos.add(itemLista);
                System.out.println("Item comprado: " + "\n");
                for (EstoqueProdutos p : estoqueProdutos) {
                    System.out.println(p);
                }
                // Calculate the value of the purchase
                double valorTotal = calcularValor(produto.getPreco(), quantidadeCompra);
                System.out.println("Valor total da compra: " + valorTotal + "\n");

                // Register the date of the purchase
                registrarDataHora();
                SistemaPedido.menu();
                break;
            } else
                System.out.println("n fiz nada");
            SistemaPedido.menu();
        }
    }

    private static double calcularValor(double preco, int quantidade) {
        return preco * quantidade;
    }

    private static void registrarDataHora() {
        Date dataCompra = new Date();
        System.out.println("Data da compra: " + dataCompra + "\n");
    }
}