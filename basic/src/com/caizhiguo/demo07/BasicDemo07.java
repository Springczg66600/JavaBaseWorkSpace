package com.caizhiguo.demo07;

/**
 * @Program: JavaBaseWorkSpace
 * @ClassName: BasicDemo07
 * @Description: 基本数据类型的初始化
 * @Author: 蔡至国
 * @DateTime: 2022年09月11日 10时37分
 * @Version 1.0
 */
/*
	初始化值:
		在程序中给变量赋的值

	通用的特点和注意事项:
		1.给基本类型变量进行赋值的时候,初始化值必须在其数据类型的取值范围内
		2.现阶段,在给相同类型变量进行初始化赋值的时候,如果赋的值和某变量相同,可以将这个变量名赋值给该变量;
		3.在程序中,所有的变量在使用前都必须给其进行赋值

	整数类型初始化值的注意事项:
		1.在给long类型进行初始化赋值时,需要在初始化值的后面添加字母l或L,推荐L
		2.给整数类型初始化赋值时,有四种初始化值写法,无论哪种写法,最后的结果都是十进制数字
			(1)十进制
			(2)二进制
				初始化值由0和1组成,并在前面加上0b或0B
			(3)八进制
				初始化值由0~7组成,并在前面加上0
			(4)十六进制
				初始化值10~15由a~f组成,并在前面加上0x或0X
	浮点类型初始化值的注意事项
		1.浮点的初始化值由三部分组成:负数,整数,正数
		2.在给float类型进行初始化赋值时,需要在初始化值的后面添加字母F或f
	布尔类型初始化值的注意事项
		布尔的初始化值只有两个:true和false
	字符类型初始化值的注意事项:
		1.字符类型的初始化值由''进行表示,且''中字符的个数有且仅有一个
		2.给字符类型初始化赋值时,有四种初始化值写法,无论哪种写法,最后的结果都是''中的单个字符
			(1)''有且仅有单个字符
			(2)0~65535数字(对应Unicode码表上的字符)
				编码表:将十进制数字和对应的字符进行一一对应的编码表
				ASCII码表:世界上第一张编码表(美国),将0~127数字和26个英文大小写字母,数字,标点符号进行一一对应的码表
					0字符	十进制数字48
					A字符	十进制数字65
					a字符	十进制数字97
				Unicode码表:将0~65535数字和各国常用文字字符进行了一一对应
			(3)十六进制
				由'\占位uXXXX'组成,XXXX就是十六进制,不足四位,需要补0占位
			(4)转义字符
				'\字符'
*/
public class BasicDemo07 {
    public static void main(String[] args) {
        long num = 12345678900L;

        //十进制数字赋值
        int num01 = 10;
        System.out.println("num01 = " + num01);

        //二进制数字赋值
        int num02 = 0b10;
        System.out.println("num02 = " + num02);

        //八进制数字赋值
        int num03 = 010;
        System.out.println("num03 = " + num03);

        //十六进制数字
        int num04 = 0x10;
        System.out.println("num04 = " + num04);

        System.out.println("==============================================");

        float num05 = 12.34F;
        System.out.println("num05 = " + num05);

        System.out.println("===============================================");

        boolean num06 = true;
        System.out.println("num06 = " + num06);
        boolean num07 = false;
        System.out.println("num07 = " + num07);

        System.out.println("================================================");

        char num08 = '!';//单个字符,字母,数字,汉字,标点符号等
        System.out.println("num08 = " + num08);

        System.out.println("=================================================");

        char c1 = 'a';
        System.out.println("c1 = " + c1);

        char c2 = 97;
        System.out.println("c2 = " + c2);

        int i = 0x0061;
        System.out.println("i = " + i);
        int j = '\u0061';
        System.out.println("j = " + j);
        char c3 = '\u0061';
        System.out.println("c3 = " + c3);

        char c4 = ' ';
        System.out.println("c4 = " + c4);
        char c5 = ' ';
        System.out.println("c5 = " + c5);
        //c4和c5表示标点符号并不一致,c4''中是空格,c5''中是制表符

    }
}
