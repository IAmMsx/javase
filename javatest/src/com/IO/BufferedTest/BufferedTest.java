package com.IO.BufferedTest;

import org.junit.Test;

import java.io.*;

public class BufferedTest  {
    @Test
    public void bufferedInputStreamTest(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            // new file
            File fi = new File("javatest/src/com/IO/FileInputStreamTest/wallpaper1.png");
            File fo = new File("javatest/src/com/IO/BufferedTest/wallpaper1.png");
            // new stream
            FileInputStream fis = new FileInputStream(fi);
            FileOutputStream fos = new FileOutputStream(fo);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            // option
            int len;
            byte[] byteBuf = new byte[1024];
            while ((len = bis.read(byteBuf))!=-1){
                bos.write(byteBuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void bufferedReaderTest(){
        BufferedReader bfreader = null;
        BufferedWriter bfwriter = null;
        try {
            //
            bfreader = new BufferedReader(new FileReader("javatest/src/com/IO/FileReader/testDataSet.txt"));
            bfwriter = new BufferedWriter(new FileWriter("javatest/src/com/IO/BufferedTest/copy.txt"));

            String line = "";
            while ((line=bfreader.readLine())!=null){
                line = line.concat("\n");
                bfwriter.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bfreader != null) {
                    bfreader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bfwriter != null) {
                    bfwriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
