package service;

import model.Produto;
import repository.ProdutoRepository;

import java.util.List;

public class ProdutoService {

    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public void cadastrarProduto(Produto produto) {
        if (produto.getNome() == null || produto.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto é obrigatório");
        }

        if (produto.getPreco() <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }

        if (produto.getQuantidade() < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        repository.salvar(produto);
    }

    public List<Produto> listarProdutos() {
        return repository.listar();
    }

    public void atualizarProduto(Produto produto) {
        if (produto.getId() <= 0) {
            throw new IllegalArgumentException("ID inválido");
        }

        repository.atualizar(produto);
    }

    public void removerProduto(int id) {
        repository.excluir(id);
    }

    public void darEntradaEstoque(int id, int quantidade) {
        Produto produto = repository.buscarPorId(id);

        if (produto == null) {
            throw new IllegalArgumentException("Produto não encontrado");
        }

        produto.setQuantidade(produto.getQuantidade() + quantidade);
        repository.atualizar(produto);
    }

    public void darSaidaEstoque(int id, int quantidade) {
        Produto produto = repository.buscarPorId(id);

        if (produto == null) {
            throw new IllegalArgumentException("Produto não encontrado");
        }

        if (produto.getQuantidade() < quantidade) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }

        produto.setQuantidade(produto.getQuantidade() - quantidade);
        repository.atualizar(produto);
    }
}
