package com.CommonlyUsedClasses.StringTest;

import org.junit.Test;

public class StringTest {
    private String strTest = " msx  ";

    @Test
    public void test1() {
//        int length()->return value.length
        int i = strTest.length();
//        char charAt(int Index) -> return value[index]
        char c = strTest.charAt(0);
//        boolen isEmpty()->return value.length==0
        boolean tag = strTest.isEmpty();
//        String toLowerCase()->转换为小写
        String test = strTest.toLowerCase();
//        String toUpperCase()->转换为大写
        String test2 = strTest.toUpperCase();
//      返回字符串副本 忽略前导空白与尾部空白
        String test3 = strTest.trim();
//      等价于+，连接两个字符串
        String concat = strTest.concat(test);
//        compareTo(String anotherString) 比较两字符串的大小
        int i1 = strTest.compareTo(test2);
//        substring(int beginIndex,int endIndex)，返回一个新字符串，此字符串从
//        [beginIndex，endIndex)的子字符串
        String substring = strTest.substring(0, 1);
//        boolean endsWith(String suffix) 判断是否以指定后缀结束
//        boolean startsWith(String prefix) 判断是否以指定后缀开始
//        boolean startsWith(String prefix,int toffset) 测试此字符串从指定索引开始的子字符串
//          是否以指定前缀开始

//        boolean contains(CharSequence s) 当且仅当此字符串包含指定的char值序列时返回true
//        int indexOf(String str) 返回子字符串第一次出现处的索引
//        int indexOf(String str,int fromIndex) 返回子字符串第一次出现处的索引，从指定索引开始
        System.out.println(concat);
    }

    @Test
    public void StringBufferTest(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');


    }
}
