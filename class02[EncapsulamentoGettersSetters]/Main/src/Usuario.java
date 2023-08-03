public class Usuario {
    private int idade;

    Usuario(int idade) {
        setIdade(idade);
    }
//    public int getIdade() {
//        return idade; // Apenas acessa a variável
//    }
//
//    public void setIdade(int idade) {// Precisa do parâmetro para alterar a idade
//        if (idade <= 0) {
//            this.idade = 1;
//        }else {
//            this.idade = idade;
//        }
//    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
