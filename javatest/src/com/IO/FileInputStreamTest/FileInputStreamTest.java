package com.IO.FileInputStreamTest;

import org.junit.Test;

import java.io.*;

public class FileInputStreamTest {
    @Test
    public void fileInputStreamTest() {
//        实现图片复制
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 1. file
            File fi = new File("javatest/src/com/IO/FileInputStreamTest/wallpaper1.png");
            File fo = new File("javatest/src/com/IO/FileInputStreamTest/wallpaperCopy.png");
            // 2. 定义流
            fis = new FileInputStream(fi);
            fos = new FileOutputStream(fo);
            // 操作
            int len;
            byte[] temp = new byte[5];
            while ((len = fis.read(temp)) != -1) {
                fos.write(temp, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关流
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
