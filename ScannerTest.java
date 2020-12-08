package org.example.test;

import org.junit.Test;
import java.util.Scanner;

public class ScannerTest {
    /**
     * 给定输入格式：
     * 第一行输入整数n
     * 第二行输入n个数字，空格间隔
     * 示例输入：
     * 3
     * 24 21 20
     *满足多个用例 要写循环while遍历
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int next = sc.nextInt();
            System.out.println(next);
        }
    }
}
