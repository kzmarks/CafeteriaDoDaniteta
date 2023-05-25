public class Produto {
    private static int count = 1;
    private int id;
    private int quantidade;
    private String nome;
    private String descricao;
    private float preco;

    public Produto(String nome, int quantidade, String descricao, float preco) {
        this.id = count;
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.preco = preco;
        Produto.count +=1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String toString() {
        return  "\nId: " + this.getId() +
                "\nNome: " + this.getNome() +
                "\nQuantidade: " + this.getQuantidade() +
                "\nDescrição: " + this.getDescricao() +
                "\nPreço: R$" + this.getPreco() + "\n";
    }
}
