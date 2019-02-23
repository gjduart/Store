import java.util.ArrayList;
public class Loja {
	ArrayList< Object > Produtos = new ArrayList< Object >();
	


public void cadastrarProduto(Object p ){
			Produtos.add(p);
}
	public void listarProdutos() {
  System.out.println(Produtos.toString());
		
}

}
