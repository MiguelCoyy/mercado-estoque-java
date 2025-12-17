package controller;

import model.Produto;
import service.ProdutoService;

import java.util.List;

public class ProdutoController {

    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    public void cadastrarProduto(Produto produto) {
        service.cadastrarProduto(produto);
    }

    public List<Produto> listarProdutos() {
        return service.listarProdutos();
    }

    public void atualizarProduto(Produto produto) {
        service.atualizarProduto(produto);
    }

    public void excluirProduto(int id) {
        service.removerProduto(id);
    }

    public void entradaEstoque(int id, int quantidade) {
        service.darEntradaEstoque(id, quantidade);
    }

    public void saidaEstoque(int id, int quantidade) {
        service.darSaidaEstoque(id, quantidade);
    }
}
