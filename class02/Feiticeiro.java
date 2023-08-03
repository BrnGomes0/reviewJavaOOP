public class Feiticeiro extends Jogador{
    // Herdando de Jogador
    @Override // Existe esse método na classe pai
    boolean atacar(Jogador oponente) {
        super.atacar(oponente);
        super.atacar(oponente);
        super.atacar(oponente);

        return true;
    }



}
