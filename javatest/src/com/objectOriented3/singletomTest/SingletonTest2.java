package com.objectOriented3.singletomTest;

public class SingletonTest2 {
    public static void main(String[] args) {

    }
}

/**
 * @Author msx
 * @Description 单例模式、懒汉式
 * @Date 18:21 2021/5/9
 * @Param
 **/
class Order {
    //1. 私有化类的构造
    private Order() {

    }

    // 2. 声明当前类对象。无初始化
    private static Order instance = null;

    public static Order getOrderInstance() {
        if (instance == null) {
            instance = new Order();

        }
        return instance;
    }

}