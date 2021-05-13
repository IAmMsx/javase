package com.CommonlyUsedClasses.StringTest;

import org.junit.Test;

public class StringExam {

    public String exam1F1(String str, int start, int end) {
        //将一个字符串指定位置进行反转 “abcdefg” 反转为 “abfedcg”
        // start为起始反转位置 end为结束位置
        char[] tempchs = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = tempchs[i];
            tempchs[i] = tempchs[j];
            tempchs[j] = temp;
        }
        return String.valueOf(tempchs);
    }

    public String exam1F2(String str, int start, int end) {
        //将一个字符串指定位置进行反转 “abcdefg” 反转为 “abfedcg”
        //通过stringBuffer

        String headStr = str.substring(0, start);
//        String revStr = str.substring(start,end);
        String revStr = new StringBuffer(str.substring(start, end + 1)).reverse().toString();

        String endStr = str.substring(end + 1);

        return headStr + revStr + endStr;

    }

    public int exam2(String oristr, String str) {
        //一个字符串在另一个字符串中出现的次数
        oristr = "$" + oristr + "$";
        String[] line = oristr.split(str);
        return line.length - 1;
    }


    @Test
    public void exam1Test() {
        String str1 = exam1F1("abcdefg", 2, 5);
        System.out.println(str1);

        String str2 = exam1F2("abcdefg", 2, 5);
        System.out.println(str2);


    }

    @Test
    public void exam2Test() {
        String oriStr = "abkkcadkabkebfkabkskab";
        String str = "ab";
        int index = oriStr.indexOf(str);
        System.out.println(index);

        System.out.println(exam2(oriStr,str));

    }

}
