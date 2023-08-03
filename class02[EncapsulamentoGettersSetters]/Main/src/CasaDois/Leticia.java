package CasaDois;

import CasaUm.Maria;

public class Leticia {
    Maria sogra = new Maria();

    void teste () {
//        System.out.println(sogra.segredo); // Private -> So a maria vê
//        System.out.println(sogra.facoDentroDeCasa); // Package
//        System.out.println(sogra.familiaSabe); // Não da para ver pois não tem relação de herança
        System.out.println(sogra.todoMundoSabe); // Public -> Todos tem acesso
    }
}
