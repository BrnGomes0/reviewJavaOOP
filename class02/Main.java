import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
//        Jogador j1 = new Jogador();
//        j1.x = 10;
//        j1.y = 10;
//
//        Jogador j2 = new Jogador();
//        j2.x = 10;
//        j2.y = 11;
//
//        j1.atacar(j2);
//
//        System.out.println(j1.vida);
//        System.out.println(j2.vida);




        Rei leo = new Rei();
        leo.x = 10;
        leo.y = 10;

        Feiticeiro luca = new Feiticeiro();
        luca.x = 10;
        luca.y = 11;

        System.out.println(leo.atacar(luca));
        System.out.println(leo.vida);
        System.out.println(luca.vida);

    }

}
