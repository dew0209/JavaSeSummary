package chapter3.arryay;

import org.junit.Test;

import java.util.Arrays;

public class Summary {
    /**
     * 数组的基本概念和使用
     */
    @Test
    public void test01(){
        int a[];
        int[] b;
        int[] c = new int[100];
        System.out.println("数组的长度为：" + c.length);//100
        System.out.println("数组的下标范围为：0 ~ " + (c.length - 1));//0 ~ 99
        System.out.println("数字数组的元素的初始化值为：" + c[0]);//0
        boolean[] d = new boolean[50];
        System.out.println("boolean数组的元素的初始化值为：" + d[0]);//false
        Object[] e = new Object[20];
        System.out.println("对象数组的元素初始化值为：" + e[0]);//null
    }

    /**
     * for each循环
     */
    @Test
    public void test02(){
        int[] a = new int[100];
        //使用传统的for循环遍历数组
        for(int i = 0;i < a.length;i++){
            a[i] = i + 1;
        }
        for(int item : a){
            System.out.println("使用foreach遍历每个元素：" + item);//将会打印1~100
        }
    }
    /**
     * 数组初始化及匿名数组
     */
    public void test03(){
        int[] a = new int[]{2,3,5,7,11,13};
        int len = new int[]{17,19,23,31,37}.length;
        /*
        //这种方式是错误的写法
        int[] a1;
        a1 = {1,2,3};
        */
    }
    /**
     * 数组拷贝
     */
    @Test
    public void test04(){
        int[] a = new int[]{999,888,777,666};
        int[] b = a;
        a[0] = -100;
        System.out.println("在改变a的同时，b也会被改变，两者将引用同一个数组: " + b[0]);//-100
        int[] newa = Arrays.copyOf(a, a.length);//-100 888 777 666
        a[0] = 90;
        System.out.println("newa不会被改变: " + newa[0]);//-100
        newa = Arrays.copyOf(newa, newa.length * 2);//用来数组扩容.
        for (int item : newa) {
            System.out.println(item);
        }
    }
    /**
     * 多维数组
     */
    @Test
    public void test05(){
        int[][] balances;
        balances = new int[3][4];
        int[][] ac1 = new int[3][4];
        int[][] ac2 = {{1,2,3},{1,2,3}};
        /*
        //同一维数组，这样错误
        balances = {
                {1,2,3},
                {1,2,3}
        };*/
        //遍历
        /*
            1 2 3
            1 2 3
         */
        for(int[] item : ac2){
            for(int it : item){
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
    /**
     * 不规则数组
     */
    @Test
    public void test06(){
        int[][] odds = new int[11][];
        for(int n = 0;n < 11;n++){
            odds[n] = new int[n + 1];
        }
    }

}
