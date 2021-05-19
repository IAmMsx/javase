package com.reflection.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    // 反射之前
    @Test
    public void test1() {
        //1.创建Person类对象
        Person p1 = new Person("Tom", 12);
        //2.通过对象调用内部的属性与方法
        p1.age = 10;
        String name = p1.getName();
        p1.show();
        System.out.println(p1);

        //在外部不可以通过类的内部对象调用其私有结构

    }

    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;
//        通过反射创建Person类对象
        Constructor<Person> cons = clazz.getConstructor(String.class, int.class);

        Person p = cons.newInstance("Tom", 12);
        // 2. 通过反射，调用对象指定的属性和方法
        // 调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p);
        // 调方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);
        // 通过反射可以调用Person类的私有构造器和方法、属性

        // 调用私有的构造器
        Constructor<Person> cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);

        Person p1 = cons1.newInstance("Jerry");
        System.out.println(p1);

        // 调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"HanMeimei");
        System.out.println(p1);

        // 调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        // 调用并返回nation
        String nation = (String) showNation.invoke(p1,"China");// 相当于p1.showNation("China")
        System.out.println(nation);

    }
}