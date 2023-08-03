package CasaUm;

public class Jose {
    Maria esposa = new Maria();


    void teste() {
//        System.out.println(esposa.segredo); // Não é possível, só ela sabe;
        System.out.println(esposa.faciDentroDeCasa); // Consegue pois está dentro de casa
        System.out.println(esposa.familiaSabe); // Consegue pois ele é da familia dela
        System.out.println(esposa.todoMundoSabe); // Todos tem acesso
    }
}
