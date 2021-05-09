package com.objectOriented2.WrapperTest;

import org.junit.Test;

public class wrapperTest {

    /**
     * @Author msx
     * @Description 测试包装类
     * @Date 11:06 2021/5/9
     **/
    @Test
    public void test1() {
        int num1 = 10;
        System.out.println(Integer.toString(num1));

        //基本数据类型/包装类转换为String
        // 方法一
        String str1 = num1 + "";
        //方法二
        String str2 = String.valueOf(num1);
        System.out.println(str1 + str2);


        // String转换为基本数据类型或者是包装类 parseXxx()
        String str3 = "123";
        int i = Integer.parseInt(str3);
        System.out.println(i);


        System.out.println(new Float(12.3f).equals(new Float("12.3")));


    }

    @Test
    public void test2(){
        Object o = true?new Integer(1):new Double(1.0);
        // 1.0 三元运算符前后类型统一
        System.out.println(o);
    }
}
