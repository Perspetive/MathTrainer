package com.example.mathtrainer;

public class Problem {
    private double result;

    public int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public double getResult() {
        return result;
    }

    public String getProblem() {
        int a = getRandom(-10, 20);
        int b = getRandom(0, 20);
        String sign = getRandomSign();

        switch (sign) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = (double) a / (double) b;
                break;
        }
        return a + sign + b;
    }

    public double getNoiseResult() {
        int temp = getRandom(-4, 4);
        while (temp == 0) {
            temp = getRandom(-4, 4);
        }
        return result + temp;
    }

    private String getRandomSign() {
        switch (getRandom(1, 5)) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "/";
        }
        return "*";
    }
}
