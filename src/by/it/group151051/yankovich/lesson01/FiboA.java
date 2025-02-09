package by.it.group151051.yankovich.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboA fibo = new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());

        //вычисление чисел фибоначчи медленным методом (рекурсией)
        fibo = new FiboA();
        n = 33;
        System.out.println("Complexity: O(2^n)");
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());
    }


    private int calc(int n) {
        //здесь простейший вариант, в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)
        if (n<=1){
            return n;
        }
        int f1 = 0;
        int f2 = 1;
        int count = 0;
        int res = 0;
        for (int i=2; i<=n; i++){
            res = f1 + f2;
            f1 = f2;
            f2 = res;
            count++;
        }
        System.out.println("Number of iterations: " + count);
        System.out.println("Complexity: O(n)");
        return res;
    }


    BigInteger slowA(Integer n) {
        //рекурсия
        //здесь нужно реализовать вариант без ограничения на размер числа,
        //в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)
        if (n==1 || n==2){
            return BigInteger.ONE;
        }
        return slowA(n-1).add(slowA(n-2));
    }



}

