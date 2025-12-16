package main;

import controller.ProdutoController;
import model.Produto;
import repository.ProdutoRepository;
import service.ProdutoService;

public class Main {
    public static void main(String[] args) {

        ProdutoRepository repository = new ProdutoRepository();
        ProdutoService service = new ProdutoService(repository);
        ProdutoController controller = new ProdutoController(service);

        Produto produto = new Produto();
        produto.setNome("Arroz 5kg");
        produto.setPreco(27.90);
        produto.setQuantidade(20);

        controller.cadastrarProduto(produto);

        controller.entradaEstoque(1, 10);
        controller.saidaEstoque(1, 5);

        controller.listarProdutos().forEach(p ->
            System.out.println(
                p.getId() + " - " +
                p.getNome() +
                " | Estoque: " + p.getQuantidade()
            )
        );
    }
}
