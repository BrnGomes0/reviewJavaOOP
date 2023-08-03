public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar();
        System.out.println(carro.estaLigado());
        System.out.println(carro.motor.giros());

    }

}