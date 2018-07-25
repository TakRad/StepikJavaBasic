package com.company;

import java.math.BigInteger;

/**
 * 2.4.8
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 *
 * Факториал N
 * вычисляется как 1⋅2⋅...⋅N
 *
 * .
 *
 * Поскольку это очень быстро растущая функция, то даже для небольших N
 *
 * вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(3).toString());
    }

    public static BigInteger factorial(int value) {
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= value; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result; // your implementation here
    }
}
