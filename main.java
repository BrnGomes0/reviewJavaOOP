import javax.lang.model.element.ModuleElement;
import java.awt.image.CropImageFilter;
import java.lang.reflect.Type;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {

//        Produto p = new Produto();
//        Produto p1 = new Produto("Notebook");
//        Produto p2 = new Produto("Geladeira", 3000);
//        Produto p3 = new Produto("Celular", 4000, 0.10);
//        System.out.println(p3.retornaStringFormatado());

        // Instanciando um objeto da classe Circulo

//        Circulo c1 = new Circulo(2);
//        Circulo c2 = new Circulo(3);
//        Circulo c3 = new Circulo(4);
//
//        System.out.println(c1.calcularArea());
//        System.out.println(c1.calcularArea());
//        System.out.println(Circulo.calcularArea(2));


        Produto p1 = new Produto("Notebook", 5000);
        Produto p2;
        p2 = p1.clone();
        p2.name = "Geladeira";
        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
