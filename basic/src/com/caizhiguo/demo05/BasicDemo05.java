package com.caizhiguo.demo05;

/**
 * @Program: JavaBaseWorkSpace
 * @ClassName: BasicDemo05
 * @Description: 基本数据类型的介绍
 * @Author: 蔡至国
 * @DateTime: 2022年09月11日 10时32分
 * @Version 1.0
 */
/*
	数据类型:

	分类:
		基本类型
			整数类型
				byte,short,int(默认),long
			浮点类型
				float,double(默认)
			字符类型
				char
			布尔类型
				boolean
		引用类型(暂不涉及)
			数组
			类
			接口

	整数类型:
		含义:
			用于声明整数数据的数据类型
		特点:
			在程序中每声明一个byte类型变量,占用1字节内存
			在程序中每声明一个short类型变量,占用2字节内存
			在程序中每声明一个int类型变量,占用4字节内存
			在程序中每声明一个long类型变量,占用8字节内存
	浮点类型:
		含义:
			用于声明浮点数据的数据类型(浮点可以理解小数,底层并不是十进制的小数)
		特点:
			在程序中每声明一个float类型变量,占用4字节内存
			在程序中每声明一个double类型变量,占用8字节内存
		注意:
			float和double现阶段可以将其当成小数类型进行使用,但是在实际开发中涉及具体数值不可以使用double和float,需要使用精确的小数类型(后面讲解)

	字符类型:
		含义:
			用于声明单个字母,数字,汉字等符号的数据类型
		特点:
			在程序中char类型变量存储占用字节数有两套规则:内码和外码
			内码规则:
				由底层源码创建的char类型变量,每个字符占用2个字节
			外码规则:
				由程序员自定义的char类型变量,每个字节占用字节数遵循编码规则
					GBK编码(window简体中文默认码表)
						字母,数字,中文每个字符占用2个字节
					UTF-8编码
						字母,数字每个字符占用1个字节
						中文每个字符占用3个字节

	布尔类型:
		含义:
			用于声明真假值的数据类型
		特点:
			单独声明boolean类型变量,每个变量占用4字节内存
			声明boolean类型数组时,数组中的每个boolean元素占用1个字节内存
*/
public class BasicDemo05 {
}
