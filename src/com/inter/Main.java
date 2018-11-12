package com.inter;

import java.util.Scanner;

/**
 * abcde字符串全排列，18/11/11 头条面试
 * 2018/11/11
 * 思路：递归，数组中抽一个，剩下的全排列，抽5次
 * https://www.cnblogs.com/liang1101/p/6376210.html
 */
public class Main {

    //以chars数组的n号位置作为交换点，向后交换
    public static void paiLie(int n,char[] chars){
        //递归出口：只剩一个字符，即无法交换
        if (n==chars.length-1){
            System.out.println(String.valueOf(chars));
        }
        else
        {
            char exchange;
            for (int i = n;i<chars.length;i++){
                //依次交换n与它后边的每一个字符
                exchange = chars[i];
                chars[i] = chars[n];
                chars[n] = exchange;
                //对后边的字符递归调用
                paiLie(n+1,chars);
                // 交换后要换回来
                exchange = chars[i];
                chars[i] = chars[n];
                chars[n] = exchange;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String string = in.nextLine();
            char[] chars = string.toCharArray();
            paiLie(0,chars);
        }
    }

}
