package chapter4.oop_concept;

import org.junit.Test;

import java.util.Date;

public class Oop {
    /**
     * 使用预定义类
     */
    @Test
    public void test01(){
        Date birthday = new Date();
        Date deadline;
        //String s = deadline.toString();//需要初始化，变量deadline并不是一个对象，它可以引用Date类型的对象
        deadline = new Date();//可以用新构造的对象初始化这个变量
        deadline = birthday;//也可以引用一个已经存在的变量
        Date d1 = null;//局部变量不会自动地初始化为null，而必须通过调用new或将它们设置为null进行初始化
        String s = d1.toString();//会产生运行时错误
    }

}
