package com.objectOriented1.Recursion;

/**
 * @Author msx
 * @Description //TODO
 * @Date 15:39 2021/5/6
 * @Param
 * @return
 **/
public class RecursionTest {
    public static void main(String[] args) {
        // 1. 计算1-100所有自然数的和
        // 法一
//        int sum = 0;
//        for (int i = 0; i <= 100; i++) {
//            sum += i;
//        }

        // 法二：
//n

        // 2. 已知一个数列，f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),n>=0,求f（10）
//        int sum2 = new RecursionTest().f(10);
//        System.out.println(sum2);

        // 3. 计算斐波那契数列的第n个值
        int sum3 = new RecursionTest().Fibonacci(10);
        System.out.println(sum3);


    }

    /**
     * @return int
     * @Author msx
     * @Description //TODO
     * @Date 15:55 2021/5/6
     * @Param [n]
     **/
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }

    }

    public int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
