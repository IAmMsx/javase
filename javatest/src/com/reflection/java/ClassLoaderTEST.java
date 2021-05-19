package com.reflection.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTEST {
    @Test
    public void test1() {

        ClassLoader classLoader = ClassLoaderTEST.class.getClassLoader();
        System.out.println(classLoader);// 自定义类使用系统类加载器 System Classloader
//      getparent（） 获取扩展类加载器
        ClassLoader classLoaderParent = classLoader.getParent();
        System.out.println(classLoaderParent);// 扩展类加载器 Extension Classloader
//      调用扩展类加载器getParent（）无法获取引导类加载器
        ClassLoader parent = classLoaderParent.getParent();
        System.out.println(parent);// null

        ClassLoader stringLoader = String.class.getClassLoader();
        System.out.println(stringLoader);
    }


    @Test
    public void readProperties() throws Exception {
        Properties pros = new Properties();

        // 此时文件默认在module下
        FileInputStream fis = new FileInputStream("jdbc.properties");
        pros.load(fis);
        // 方式二 配置文件默认为当前module的src下
        ClassLoader classLoader = ClassLoaderTEST.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");

        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println(user+"\n"+password);



    }
}
