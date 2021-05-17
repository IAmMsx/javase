package com.reflection;

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
        System.out.println(p1.toString());

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


    }
}
