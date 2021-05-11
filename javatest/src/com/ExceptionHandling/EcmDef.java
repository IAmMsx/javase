package com.ExceptionHandling;

public class EcmDef {

    public static int Ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0) {
            throw new EcDef("负数");
        }
        return i / j;
    }

    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);

            int result = Ecm(i,j);
            System.out.println(result);
        } catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e){
            System.out.println("chu 0");
        } catch (EcDef ecDef) {
            ecDef.printStackTrace();
        }


    }
}
