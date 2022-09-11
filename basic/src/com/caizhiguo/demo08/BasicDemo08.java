package com.caizhiguo.demo08;

/**
 * @Program: JavaBaseWorkSpace
 * @ClassName: BasicDemo08
 * @Description: 声明初始化8种基本类型变量和字符串变量并初始化
 * @Author: 蔡至国
 * @DateTime: 2022年09月11日 11时01分
 * @Version 1.0
 */
public class BasicDemo08 {
    public static void main(String[] args) {
        //声明并初始化整数类型变量
        byte var1 = 123;
        System.out.println("var1 = " + var1);

        short var2 = 12345;
        System.out.println("var2 = " + var2);

        int var3 = 1234567890;
        System.out.println("var3 = " + var3);

        long var4 = 12345678900L;
        System.out.println("var4 = " + var4);

        System.out.println("===========================================");

        //声明并初始化浮点类型变量
        float var5 = 12.34F;
        System.out.println("var5 = " + var5);

        double var6 = 67.89;
        System.out.println("var6 = " + var6);

        System.out.println("===========================================");

        //声明并初始化字符类型变量
        char var7 = 'a';
        System.out.println("var7 = " + var7);

        System.out.println("===========================================");

        //声明并初始化布尔类型变量
        boolean var8 = true;
        System.out.println("var8 = " + var8);

        System.out.println("===========================================");

        //声明并初始化字符串类型变量
        String var9 = "HelloWorld";
        System.out.println("var9 = " + var9);
    }
}
