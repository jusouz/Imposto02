


	import java.util.ArrayList;
    import java.util.List;

class Produto {
    private String nome;
    private double precoCusto;
    private List<Double> impostos;
    private double margemLucro;

    public Produto(String nome, double precoCusto, double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.impostos = new ArrayList<>();
        this.margemLucro = margemLucro;
    }

    public void adicionarImposto(double imposto) {
        this.impostos.add(imposto);
    }

    public double calcularPrecoVenda() {
        double precoVenda = precoCusto;

        for (Double imposto : impostos) {
            precoVenda += precoVenda * imposto;
        }

        precoVenda += precoVenda * margemLucro;

        return precoVenda;
    }

    public String getNome() {
        return nome;
    }
}



