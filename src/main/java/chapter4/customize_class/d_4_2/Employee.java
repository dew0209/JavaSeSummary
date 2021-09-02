package chapter4.customize_class.d_4_2;

import org.junit.Test;

import java.time.LocalDate;

/**
 * 程序清单4_2
 * Employee类
 */
public class Employee {
    private static int nextId = 1;
    //实例域
    /**
     * 有两个实例域本身就是对象：name域是String类的对象，hireDay域是LocalDate类对象。这种情况十分常见：类通常包括类型属于某个类类型的实例域
     */
    private int id;
    private String name;
    private double salary;
    private LocalDate hireDay;//聘请日期
    private final StringBuilder evaluations;//评价
    //实例方法
    public Employee(String n,double s,int year,int month,int day){
        evaluations = new StringBuilder();
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }
    public String getName() {
        return name;
    }

    public void setId() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    //基于类的访问权限
    public boolean equals(Employee other){
        return name.equals(other.name);
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
    public void giveGoldStar(){
        evaluations.append(LocalDate.now() + ": Gold star! \n");
    }
    public String getEvaluations(){
        return evaluations.toString();
    }
}