package exemplo;

import java.util.HashMap;
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

    @Override
    public String toString() {
        return "ProdutoRepository{" +
                "catalogo=" + catalogo +
                '}';
    }
}
