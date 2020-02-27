package com.github.tiagozampieri.main;

public class Bhaskara {
    private Integer valorA;
    private Integer valorB;
    private Integer valorC;

    private Integer delta;
    private Double x1;
    private Double x2;

    public Bhaskara(
            Integer valorA,
            Integer valorB,
            Integer valorC
    ) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;

        this.delta = calcDelta(valorA, valorB, valorC);
        this.x1 = calcX("+");
        this.x2 = calcX("-");
    }

    public static void main(String[] args) {

    }

    private Integer calcDelta(Integer a, Integer b, Integer c) {
        Integer bQuadrado = b^2;
        return bQuadrado - (4*a*c);
    }

    private Double calcX(String operator) {
        if (operator == "+") {
            return (-(valorB) + Math.sqrt(delta))/2;
        } else {
            return (-(valorB) - Math.sqrt(delta))/2;
        }
    }

    public Integer getDelta() {
        return delta;
    }

    public Double getX1() {
        return x1;
    }

    public Double getX2() {
        return x2;
    }
}
