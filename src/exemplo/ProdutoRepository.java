package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepository {
    private Map<String, Produto> catalogo;

    public ProdutoRepository() {
        this.catalogo = new HashMap<>();
    }

    public String addProduto(Produto produto) {
        catalogo.put(produto.getId(), produto);

        return produto.getId();
    }

    public void removeProduto(Produto produto) {
        catalogo.remove(produto.getId());
    }

    public String atualizaProduto(Produto produto, String fabricante) {
        produto.setFabricante(fabricante);

        return produto.getId();
    }

    public Produto getProduto(String id) {
        return catalogo.get(id);
    }

    public String listProdutos() {
        String res = "";
        for (Produto p : catalogo.values()) {
            res += p.getFabricante() + " " + p.getNome() +  System.lineSeparator();
        }

        return res;
    }

    public List<Produto> getAll() {
        List<Produto> products = new ArrayList<Produto>();

        for (Produto p : this.catalogo.values()) {
            products.add(p);
        }

        return products;
    }

    public Map<String, Produto> listProductByName(String query) {
        Map<String, Produto> productsFounded = new HashMap<>();

        for (Produto p : this.catalogo.values()) {
            if (p.getNome().contains(query)) {
                productsFounded.put(p.getId(), p);
            }
        }

        return productsFounded;
    }

    @Override
    public String toString() {
        return "ProdutoRepository{" +
                "catalogo=" + catalogo +
                '}';
    }
}
