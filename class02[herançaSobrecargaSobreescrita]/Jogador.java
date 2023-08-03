public class Jogador {
    int x;
    int y;
    int vida = 100;
    // Using Enum

    boolean walk(Direct direct) {
        switch (direct) {
            case NORTE -> y++;
            case SUL -> y--;
            case LESTE -> x++;
            case OESTE -> x--;
        }
        return true;
    }
    boolean atacar (Jogador oponente) {
        int deltaX = Math.abs(this.x-oponente.x); // Absolute, value only in positive
        int deltaY = Math.abs(this.y-oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        }
        else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        }
        else {
            return false;
        }
    }
















//    boolean walk(String direct) {
//        if ("North".equalsIgnoreCase(direct)) {
//            y++;
//        }
//        else if ("Sul".equalsIgnoreCase(direct)){
//            y--;
//        }
//        else if ("Leste".equalsIgnoreCase(direct)) {
//            x++;
//        } else if ("Oeste".equalsIgnoreCase(direct)) {
//            x--;
//        }
//        else{
//            return false;
//        }
//        return true;
//    }
}

