import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPedido {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        EstoqueProdutos.estoque = new ArrayList<>();
        Pedido.estoqueProdutos = new ArrayList<>();
        menu();
    }

    static void menu(){
        System.out.println("Sistema de Pedidos");
        System.out.println("Café na teta do Daniteta");
        System.out.println("Selecione uma opção Daniteta San");
        System.out.println("Opção 1 - Cadastrar produtos  no estoque");
        System.out.println("Opção 2 - Remover produtos do estoque");
        System.out.println("Opção 3 - Listar produtos do estoque");
        System.out.println("Opção 4 - Adicionar produto ao carrinho");
        System.out.println("Opção 5 - Sair");

        int opcao = input.nextInt();

        switch (opcao){
            case 1: EstoqueProdutos.cadastrarProdutos();
                    break;
            case 2: EstoqueProdutos.removerProdutos();
                    break;
            case 3: EstoqueProdutos.listarProdutos();
                    break;
            case 4: Pedido.adicionarProduto();
                    break;
            case 5:
                System.out.println("Valeu pela preferência pega aqui");
                break;
            default:
                System.out.println("opcão incorreta animal");
                menu();
                break;
        }

    }



}
