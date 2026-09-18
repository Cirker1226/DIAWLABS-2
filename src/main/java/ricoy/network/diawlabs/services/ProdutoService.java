package ricoy.network.diawlabs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ricoy.network.diawlabs.models.Produto;
import ricoy.network.diawlabs.repositories.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto adicionarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    // Implemente métodos para atualizar, deletar e buscar produtos...
}