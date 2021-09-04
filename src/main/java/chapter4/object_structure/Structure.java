package chapter4.object_structure;

import chapter4.customize_class.d_4_2.Employee;
import org.junit.Test;
import static java.lang.System.*;
import java.time.LocalDate;

public class Structure {
    /**
     * 重载
     */
    @Test
    public void test01(){
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer("to do:");
    }
    /**
     * 默认初始化域
     */
    @Test
    public void test02(){

    }
    /**
     * 无参数构造器
     */
    @Test
    public void test03(){
        // Employee e = new Employee();//不合法的操作，没有提供无参数构造器
        Employee tom = new Employee("tom", 15000, 1999, 2, 9);//合法的
    }
    /**
     * 显式域初始化
     */
    @Test
    public void test04(){
        //通过方法显式域初始化
        chapter4.object_structure.Employee e = new chapter4.object_structure.Employee();
        System.out.println(e.getId());
        System.out.println(chapter4.object_structure.Employee.getNextId());
    }
    /**
     * 调用另一个构造器
     */
    @Test
    public void test05(){
        /**
         * 无参构造器
         * 有参构造器
         * 22
         */
        chapter4.object_structure.Employee employee = new chapter4.object_structure.Employee(22);
        System.out.println(employee.getId());

    }
    /**
     * 初始化块
     */
    @Test
    public void test06(){
        chapter4.object_structure.Employee e = new chapter4.object_structure.Employee();
        System.out.println(e.getId());//0
    }
    /**
     * 对象析构与finalize方法
     */
    @Test
    public void test07() throws Throwable {
        /**
         * 无参构造器
         * 执行析构
         */
        chapter4.object_structure.Employee e = new chapter4.object_structure.Employee();
        e.finalize();
    }
    /**
     * 静态导入
     */
    @Test
    public void test08(){
        out.println(111);
    }
}
