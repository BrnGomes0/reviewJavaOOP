import com.sun.source.tree.AssignmentTree;

public class Produto implements Cloneable {
    String name;
    double price;
    double descont;

    Produto () {
        System.out.println("Print do construtor sem parametros.");
    }

    Produto (String name) {
        this.name = name;
        System.out.println("Print do construtor com um parametro.");
    }

    public Produto(String name, double price) {
        this.name= name; // this --> Faz referência o objeto atual. Atributo da Classe
        this.price = price;
    }

    public Produto(String name,double price,double descont) {
        this.name = name;
        this.price = price;
        this.descont = descont;
    }

    String retornaStringFormatado() {
        return String.format("O produto %s está"
        + " com o preço %.2f com o desconto %.2f", this.name, this.price, this.descont);

    }

    @Override
    public Produto clone() {
        try {
            // Ele vai tentar realizar isso, caso não seja, irá lançar um erro
            Produto clone = (Produto) super.clone();
            return clone;
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Lança um erro que pode ser tratado
        }
    }


}
