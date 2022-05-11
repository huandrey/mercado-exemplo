import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {

		Produto produto = new Produto("Leite", "Parmalat");
		Produto produto2 = new Produto("Pao", "da Padaria");
		Produto produto3 = new Produto("Ovo", "Ovos LTDA");
		Lote lote = new Lote(produto, 10L);
		ProdutoRepository PR = new ProdutoRepository();
		PR.addProduto(produto);
		PR.addProduto(produto2);
		PR.addProduto(produto3);
//		System.out.println(PR.removeProduto(produto));
//		System.out.println(PR.removeProduto(produto));

		System.out.println(PR.listProdutos());
		System.out.println(PR.toString());
		System.out.println(produto);
		System.out.println(lote);


	}
}
