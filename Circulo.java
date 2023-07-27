public class Circulo {
    static final double pi = 3.14; // Final --> Uma variável constante, ou seja, nunca muda
    // Static --> Alocando um pi e raio para cada objeto. Quando há uma constante há um lugar na memória para uma constante -> Pertencendo a Classe
    // Dinamico -> Raio e Cor e um pi continua constante (static) --> Pertencendo a instância
    // Atribuição por valor -> Tipos primitivos
    // Atribuição por referência -> Objetos
    // .clone para modicar o local diferente da memória
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    double calcularArea() {
        return pi * raio * raio;
    }

    static double calcularArea(double meuRaio) {
        return pi * meuRaio * meuRaio;
    }



}

