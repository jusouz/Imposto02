import java.util.ArrayList;
import java.util.List;

public class CalculoPrecoVenda {
    public static void main(String[] args) {
        
        List<Produto> produtos = new ArrayList<>();
        Produto arroz = new Produto("Arroz", 7.00, 0.20);
        arroz.adicionarImposto(0.05);
        arroz.adicionarImposto(0.05);
        produtos.add(arroz);

        Produto feijao = new Produto("Feijão", 7.00, 0.25);
        feijao.adicionarImposto(0.05);
        feijao.adicionarImposto(0.05);
        produtos.add(feijao);

        Produto carne = new Produto("Carne", 7.00, 0.35);
        carne.adicionarImposto(0.05);
        carne.adicionarImposto(0.08);
        produtos.add(carne);

        Produto cerveja = new Produto("Cerveja", 7.00, 0.30);
        cerveja.adicionarImposto(0.05);
        cerveja.adicionarImposto(0.05);
        cerveja.adicionarImposto(0.08);
        produtos.add(cerveja);

        Produto gas = new Produto("Gás", 7.00, 0.15);
        gas.adicionarImposto(0.05);
        gas.adicionarImposto(0.08);
        produtos.add(gas);

        Produto gasolina = new Produto("Gasolina", 7.00, 0.15);
        gasolina.adicionarImposto(0.05);
        produtos.add(gasolina);

        
        for (Produto produto : produtos) {
            double precoVenda = produto.calcularPrecoVenda();
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço de Venda: R$" + precoVenda);
            System.out.println();
        }
    }
}


