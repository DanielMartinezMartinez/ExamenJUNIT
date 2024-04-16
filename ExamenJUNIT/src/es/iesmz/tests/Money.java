package es.iesmz.tests;

public class Money {
    static final float cambioEURtoUSD = (float) 1.18798;

    static float change(TipoMoneda origen, TipoMoneda destino, float money){
        if (money < 0){
            return -1;
        }

        if (origen == TipoMoneda.EUR && destino == TipoMoneda.USD){
            EURtoUSD(money);
        }

        if (origen == TipoMoneda.EUR && destino == TipoMoneda.USD){

        }

    }

    static float EURtoUSD(float cantidad) {
        return (float) (cantidad * cambioEURtoUSD);
    }


}
