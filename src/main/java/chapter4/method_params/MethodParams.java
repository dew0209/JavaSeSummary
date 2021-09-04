package chapter4.method_params;

import chapter4.customize_class.d_4_2.Employee;
import org.junit.Test;

public class MethodParams {
    /**
     * 按值调用
     */
    @Test
    public void test01(){
        int a = 1,b = 2;
        swap(a,b);
        System.out.println("a = " + a + ", b = " + b);//1 2
    }
    public void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    /**
     * 按引用调用
     */
    @Test
    public void test02(){
        Employee harry = new Employee("harry", 2000, 1999, 1, 1);
        tripleSalary(harry);
        System.out.println("harry salary = " + harry.getSalary());//6000
    }
    public void tripleSalary(Employee e){
        e.raiseSalary(200);
    }
    /**
     * 证明按引用调用理解的偏差
     * 交换对象参数的结果并没有被保留下来
     */
    @Test
    public void test03(){
        Employee x = new Employee("李四", 1000, 2000, 1, 1);
        Employee y = new Employee("张三", 2000, 2001, 2, 2);
        swap(x,y);
        System.out.println(x);
        System.out.println(y);
    }
    public void swap(Employee a,Employee b){
        Employee x = a;
        a = b;
        b = x;
    }
}