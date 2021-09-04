package chapter4.customize_class;

import chapter4.customize_class.d_4_2.Employee;
import org.junit.Test;

import java.text.NumberFormat;

public class TestCustomize {
    /**
     * 程序清单4_2
     */
    @Test
    public void test01(){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1990,3,15);
        for (Employee e : staff){
            e.raiseSalary(5);
        }
        for(Employee e : staff){
            System.out.println("name = " + e.getName() + ",salary = " + e.getSalary() + ",hireDay = " + e.getHireDay());
        }
    }
    /**
     * 构造器
     */
    @Test
    public void test02(){
        Employee james = new Employee("James Bond", 100000, 1950, 1, 1);
        //james.Employee("James Bond", 250000, 1950, 1, 1);//ERROR,构造器总是伴随着new操作符的执行被调用，而不能对一个已经存在的对象调用构造器来达到重新设置实例域的目的
    }
    /**
     * 隐式参数与显式参数
     */
    @Test
    public void test03(){
        Employee number007 = new Employee("number007", 10000, 2010, 10, 1);
        /**
         * 调用将执行下列指令
         * double raise = number007.salary * byPercent / 100;
         * number007.salary += raise;
         */
        number007.raiseSalary(5);
    }
    /**
     * 封装的优点
     */
    @Test
    public void test04(){
        //如果将实例域修改为public的，破坏这个域值的捣乱者有可能会出没在任何地方
    }
    /**
     * final实例域
     */
    @Test
    public void test05(){
        //final关键字只是表示存储在evaluations变量中对象的引用不会再指示其它StringBuilder对象，但是这个对象可以更改
        Employee tom = new Employee("tom", 2000, 2021, 1, 1);
        tom.giveGoldStar();
        System.out.println(tom.getEvaluations());
    }
    /**
     * static
     */
    @Test
    public void test06(){
        Employee john = new Employee("john", 100, 2020, 1, 20);
        john.setId();
        System.out.println(john.getId());//2
        Employee harry = new Employee("john", 100, 2020, 1, 20);
        harry.setId();
        System.out.println(harry.getId());//2
    }

    /**
     * 静态常量
     */
    public static final double PI = 3.1415926;
    @Test
    public void test07(){
        //PI = 1.1;//不可再被重新赋值，编译报错
    }
    /**
     * 工厂方法
     * 为什么NumberFormat类不利用构造器完成这些操作呢？
     *  无法命名构造器。构造器的名字必须和类名相同。但是，这里希望将的到的货币实例和百分比实例采用不同的名字
     *  当使用构造器时，无法改变所构造的对象类型。
     */
    public void test08(){
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
    }
}
