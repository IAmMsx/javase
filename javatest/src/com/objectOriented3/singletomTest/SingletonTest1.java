package com.objectOriented3.singletomTest;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.returnInstance();
        Bank bank2 = Bank.returnInstance();

        System.out.println(bank1 == bank2);

    }
}

/**
 * @Author msx
 * @Description 单例设计模式测试，饿汉式
 * @Date 17:23 2021/5/9
 * @Param
 **/
class Bank {
    // 1. 私有化的构造器
    private Bank() {

    }

    // 2. 内部类创建对象
    // 4. 要求此对象也声明为静态的
    private static Bank bank = new Bank();

    // 3. 提供公共方法 返回创建的对象
    public static Bank returnInstance() {
        return bank;
    }
}
