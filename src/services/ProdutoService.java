package services;

import exemplo.Lote;
import exemplo.LoteRepository;
import exemplo.Produto;
import exemplo.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    ProdutoRepository pr = new ProdutoRepository();
    LoteRepository lr = new LoteRepository();

    public ProdutoService() {}

    public List<Produto> getProductFromLotes(List<Lote> lotes) {
        List<Produto> products = new ArrayList<>();
        for (Lote l : lotes) {
            products.add(l.getProduto());
        }

        return products;
    }

    public List<Produto> getProductsByName(String name, List<Produto> products) {
        List<Produto> productsFounded = new ArrayList<Produto>();

        for (Produto p : products) {
            if (p.getNome().contains(name)) {
                productsFounded.add(p);
            }
        }

        return productsFounded;
    }

    public List<Produto> ListProductsLote(String name) {
        List<Lote> lotes = lr.getAll();

        List<Produto> products = getProductFromLotes(lotes);

        List<Produto> productsFoundedByName = getProductsByName(name, products);

        return productsFoundedByName;
    }

    public List<Produto> listProductByName(String name) {
        List<Produto> products = pr.getAll();
        List<Produto> productsByName = getProductsByName(name, products);

        return productsByName;
    }
}
