package service;

import model.Quadrado;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {

    CalculadoraService calculadoraService;

    @Before
    public void before(){
        //Executa antes de cada teste.
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void assertEquals_Exemplo(){
        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLado(5);
        Quadrado quadrado2 = new Quadrado();
        quadrado2.setLado(5);

        Assert.assertEquals(quadrado1, quadrado2);
    }

    @Test
    public void assertNotEquals_Exemplo(){
        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLado(10);
        Quadrado quadrado2 = new Quadrado();
        quadrado2.setLado(6);

        Assert.assertNotEquals(quadrado1, quadrado2);
    }

    @Test
    public void assertNull_Exemplo(){
        Quadrado quadrado = null;
        Assert.assertNull(quadrado);
    }

    @Test
    public void assertNotNull_Exemplo(){
        Quadrado quadrado = new Quadrado();
        Assert.assertNotNull(quadrado);
    }
}
