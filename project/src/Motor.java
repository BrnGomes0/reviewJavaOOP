public class Motor {
    double faotrInjecao=1;
    boolean ligado=false;

    int giros(){
        if (!ligado) {
            return 0;
        }else {
            return (int) Math.round(faotrInjecao*3000);
        }
    }
}
