public class main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.estaLigado());
        carro.ligar();
        System.out.println(carro.estarLigado());
        System.out.println(carro.motor.giros());
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.motor.giros());
        carro.frear();
        System.out.println(carro.motor.giros());
    }
}
