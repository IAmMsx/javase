package com.reflection;

import org.junit.Test;

public class ClassTest {
    // 获取Class类实例的方式
    @Test
    public void test3() throws ClassNotFoundException {
        // 方式一 调用运行时类的属性 .class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

        // 方式二：通过运行时类的对象 getClass()
        Person p1 = new Person();
        Class<? extends Person> clazz2 = p1.getClass();
        System.out.println(clazz2);

        // 方式三：调用Class的静态方法，forName(String classPath)
        Class<?> clazz3 = Class.forName("com.reflection.Person");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);//true
        System.out.println(clazz1 == clazz3);//true

        // 方式四：了解。使用类的加载器ClassLoader
        ClassLoader classLoader = ClassTest.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("com.reflection.Person");
        System.out.println(clazz4);

        System.out.println(clazz4 == clazz1);

    }
}
