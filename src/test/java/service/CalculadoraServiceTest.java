package service;

import model.Quadrado;
import model.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {

    CalculadoraService calculadoraService;

    @Before
    public void before() {
        //Executa antes de cada teste.
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void doisQuadradosComMesmaArea() {
        //Given: Dois quadrados
        Quadrado quadrado1 = new Quadrado();
        Quadrado quadrado2 = new Quadrado();

        //When: Com lados iguais
        quadrado1.setLado(5);
        quadrado2.setLado(5);

        //Then: Os quadrados possuem a mesma área
        Assert.assertEquals(quadrado1, quadrado2);
    }

    @Test
    public void doisQuadradosComAreasDiferentes() {
        //Given: Dois quadrados
        Quadrado quadrado1 = new Quadrado();
        Quadrado quadrado2 = new Quadrado();

        //When: Possuem lados diferentes
        quadrado1.setLado(10);
        quadrado2.setLado(6);

        //Then: Os quadrados não são iguais
        Assert.assertNotEquals(quadrado1, quadrado2);
    }

    @Test
    public void triangulosComMesmaArea() {
        // Given: Dois Triangulos
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();

        // When: Dado as bases e as alturas
        triangulo1.setBase(10);
        triangulo1.setAltura(4);
        triangulo2.setBase(8);
        triangulo2.setAltura(5);

        // Then: Áreas iguais, retorna Null
        Triangulo triangulo = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);
        Assert.assertNull(triangulo);
    }

    @Test
    public void quadradosComAreasDiferentesDeZero() {
        // Given: Dois Quadrados
        Quadrado quadrado1 = new Quadrado();
        Quadrado quadrado2 = new Quadrado();

        // When: Quadrados com Áreas Diferentes
        quadrado1.setLado(8);
        quadrado2.setLado(9);

        // Then: O quadrado não é nulo
        Quadrado quadrado = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);
        Assert.assertNotNull(quadrado);
    }
}