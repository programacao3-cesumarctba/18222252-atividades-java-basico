package com.github.tiagozampieri.atividadesjavabasico;

import java.util.Scanner;

public class ValorInteiro {
    public Integer num;

    public static void main(String[] args) {

        ValorInteiro vi = new ValorInteiro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        vi.num = scanner.nextInt();

        System.out.println("O número que você digitou é " + vi.numType(vi.num));

        System.out.println("O número que você digitou é classificado como" + (vi.isStrange(vi.num) ? " estranho" : " não estranho"));

        System.out.println("O fatorial de " + vi.num + " é " + vi.numFactorial(vi.num));

        vi.timeTable(vi.num);

    }

    public String numType(Integer number) {
        Integer mod = (number % 2);
        return ((mod == 0) ? "par" : "impar");
    }

    public boolean isStrange(Integer number) {
        String type = numType(number);
        if (type == "par" && number < 10) {
            return false;
        } else if (type == "par" && (number > 10 && number < 20)) {
            return true;
        } else if (type == "par" && number > 20) {
            return false;
        } else if (type == "impar") {
            return true;
        }
        return false;
    }

    private Integer numFactorial(Integer number) {
        Integer result = number;
        if (number > 0) {

            for (int i = number-1; i > 0; i--) {
                result *= i;
            }
        } else {
            result = 1;
        }

        return result;
    }

    private void timeTable(Integer number) {
        for(Integer i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}
