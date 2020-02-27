package com.github.tiagozampieri.main;

import com.github.tiagozampieri.bhaskara.Bhaskara;

public class Main {
    Bhaskara bhaskara = new Bhaskara(1, 52, 2);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("a equação do segundo grau " + main.possuiRaiz());
    }

    private String possuiRaiz() {
        if (this.bhaskara.getDelta() < 0) {
            return "não possui raíz reai";
        } else if (this.bhaskara.getDelta() == 0) {
            return "possui uma raiz real";
        } else {
            return "possui duas raízes reais.";
        }
    }
}
