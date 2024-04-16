package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void test1(){
        float resultadoEsperado = Money.change(TipoMoneda.EUR,TipoMoneda.USD, 23.88f);
        float resultadoReal = 28.37f;
        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void test2(){
        float resultadoEsperado = Money.change(TipoMoneda.GBP,TipoMoneda.EUR, 1000.0f);
        float resultadoReal = 1165.83f;
        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void test3(){
        float resultadoEsperado = Money.change(TipoMoneda.EUR,TipoMoneda.GBP, 234.56f);
        float resultadoReal = 201.21f;
        assertEquals(resultadoEsperado,resultadoReal);
    }
    @Test
    public void test4(){
        float resultadoEsperado = Money.change(TipoMoneda.USD,TipoMoneda.EUR, 44.56f);
        float resultadoReal = 37.51f;
        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void test5(){
        float resultadoEsperado = Money.change(TipoMoneda.GBP,TipoMoneda.USD, 100.0f);
        float resultadoReal = 138.49f;
        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void test6(){
        float resultadoEsperado = Money.change(TipoMoneda.USD,TipoMoneda.GBP, 1000.0f);
        float resultadoReal = 722.14f;
        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void test7(){
        float resultadoEsperado = Money.change(TipoMoneda.PTS,TipoMoneda.EUR, 100.0f);
        float resultadoReal = -1f;
        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void test8(){
        float resultadoEsperado = Money.change(TipoMoneda.EUR,TipoMoneda.PTS, 123.3f);
        float resultadoReal = -1f;
        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    public void test9(){
        float resultadoEsperado = Money.change(TipoMoneda.USD,TipoMoneda.PTS, -167.34f);
        float resultadoReal = -1f;
        assertEquals(resultadoEsperado,resultadoReal);
    }

}