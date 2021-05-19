package com.reflection.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
// 通过反射创建对应的运行时类对象

public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;
//        Person obj = clazz.newInstance();
        Person person = clazz.getDeclaredConstructor(String.class,int.class).newInstance("Tom",15);

//        private构造器
        Constructor<Person> cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);

        Person person1 = cons1.newInstance("Tom");
        System.out.println(person);
        System.out.println(person1);

    }

    @Test
    public void test2(){
        int num = new Random().nextInt(3);//0,1,2
        String classpath="";
        switch (num) {
            case 0 :
                classpath = "java.lang.InternalError";
                break;
            case 1:
                classpath = "java.lang.Object";
                break;
            case 2:
                classpath = "com.reflection.java.Person";
                break;
        }

        try {
            Object obj = getInstance(classpath);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 创建一个指定类的对象 classPath 指定类的全类名
    public Object getInstance(String classPath) throws Exception {
        Class<?> clazz = Class.forName(classPath);
        return clazz.newInstance();

    }
}
