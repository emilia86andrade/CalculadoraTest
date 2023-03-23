package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {
    public int somar(int a, int b) {
        return a+b;
    }

    public int subtrair(int a, int b) {
        return a-b;
    }

    public int dividir(int a, int b) {
        return a/b;
    }

    public int multiplicar(int a, int b) {
        return a*b;
    }

    public double calcularAreaQuadrado(double lado){
        return lado * lado;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double areaQuadrado1 = calcularAreaQuadrado(quadrado1.getLado());
        double areaQuadrado2 = calcularAreaQuadrado(quadrado2.getLado());
        if (areaQuadrado1 < areaQuadrado2) {
            return quadrado1;
        } else if (areaQuadrado2 < areaQuadrado1) {
            return quadrado2;
        } else {
            return null;
        }

    }
    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double areaTriangulo1 = calcularAreaTriangulo(triangulo1.getBase(), triangulo1.getAltura());
        double areaTriangulo2 = calcularAreaTriangulo(triangulo2.getBase(), triangulo2.getAltura());
        if(areaTriangulo1 < areaTriangulo2){
            return triangulo1;
        }else if (areaTriangulo2 < areaTriangulo1){
            return triangulo2;
        } else {
            return null;
        }
    }


}


