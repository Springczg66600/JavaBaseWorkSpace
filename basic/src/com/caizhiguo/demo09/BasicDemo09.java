package com.caizhiguo.demo09;

/**
 * @Program: JavaBaseWorkSpace
 * @ClassName: BasicDemo09
 * @Description: 此类用于演示功能
 * @Author: 蔡至国
 * @DateTime: 2022年09月11日 11时08分
 * @Version 1.0
 */
/*
	变量声明初始化的注意事项:
		1.在方法中声明的变量使用前必须给其进行初始化
		2.在同一作用域中不可以声明同名的变量
			作用域:变量所属的大括号
		3.变量的使用不能超出所属的作用域范围
		4.如果声明同一种数据类型多个变量,可以在一行上同时进行声明(在源码中)
			数据类型 变量名1 = 初始化值1 , 变量名2 = 初始化值2;
*/
public class BasicDemo09 {
    public static void main(String[] args) {
        //多个变量分别直接声明初始化(推荐)
        int a1 = 3;
        int b1 = 4;
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
        System.out.println("==============================");

        //多个变量分别先声明后初始化
        int a2;
        int b2;
        a2 = 3;
        b2 = 4;
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);
        System.out.println("==============================");

        //一起直接声明初始化
        int a3 = 3 , b3 = 4;
        System.out.println("a3 = " + a3);
        System.out.println("b3 = " + b3);
        System.out.println("==============================");

        //一起先声明后初始化
        int a4 , b4;
        a4 = 3;
        b4 = 4;
        System.out.println("a4 = " + a4);
        System.out.println("b4 = " + b4);
        System.out.println("==============================");

        //混合声明初始化
        int a5 = 3 , b5;
        b5 = 4;
        System.out.println("a5 = " + a5);
        System.out.println("b5 = " + b5);
    }
}
