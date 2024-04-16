package es.iesmz.tests;

public class Money {
    static final float cambioEURtoUSD = (float) 1.18798;
    static final float cambioUSDtoEUR = (float) 0.841815;
    static final float cambioEURtoGBP = (float) 0.857839;
    static final float cambioGBPtoEUR = (float) 1.165826;

    static float change(TipoMoneda origen, TipoMoneda destino, float money){
        if (money < 0){
            return -1;
        }

        if (origen == TipoMoneda.EUR && destino == TipoMoneda.USD){
            EURtoUSD(money);
        }

        if (origen == TipoMoneda.USD && destino == TipoMoneda.EUR){
            USDtoEUR(money);
        }

        if (origen == TipoMoneda.EUR && destino == TipoMoneda.GBP){
            EURtoGBP(money);
        }

        if (origen == TipoMoneda.GBP && destino == TipoMoneda.EUR){
            GBPtoEUR(money);
        }

        if (origen == TipoMoneda.USD && destino == TipoMoneda.GBP){
            USDtoGBP(money);
        }

        if (origen == TipoMoneda.GBP && destino == TipoMoneda.USD){
            GBPtoUSD(money);
        }
        return 0;
    }

    static float EURtoUSD(float cantidad) {
        return (float) (cantidad * cambioEURtoUSD);
    }

    static float USDtoEUR(float cantidad) {
        return (float) (cantidad * cambioUSDtoEUR);
    }

    static float EURtoGBP(float cantidad) {
        return (float) (cantidad * cambioEURtoGBP);
    }

    static float GBPtoEUR(float cantidad) {
        return (float) (cantidad * cambioGBPtoEUR);
    }

    static float USDtoGBP(float cantidad) {
        return EURtoGBP(USDtoEUR(cantidad));
    }

    static float GBPtoUSD(float cantidad) {
        return GBPtoEUR(EURtoUSD(cantidad));
    }

}
