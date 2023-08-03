package CasaDois;

import CasaUm.Maria;

public class Joao extends Maria { // Filho de Maria

    void teste () {
//        System.out.println(super.segredo); // Segredo é privado.
//        System.out.println(super.facoDentroDeCasa); // Package -> Não está dentro de casa
        System.out.println(super.familiaSabe); // Protected -> Pois ele é da família dela
        System.out.println(super.todoMundoSabe); // Public -> Todos sabem
    }
}
