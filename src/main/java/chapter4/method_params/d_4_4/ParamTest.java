package chapter4.method_params.d_4_4;

import chapter4.customize_class.d_4_2.Employee;

public class ParamTest {
    public static void main(String[] args) {
        System.out.println("提高两倍");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);

        System.out.println();

        Employee lisi = new Employee("李四", 20000, 2012, 12, 12);
        System.out.println("Before : salary = " + lisi.getSalary());
        tripleSalary(lisi);
        System.out.println("Before : salary = " + lisi.getSalary());

        System.out.println();

        Employee e1 = new Employee("e1", 2000, 1, 1, 1);
        Employee e2 = new Employee("e2", 2001, 2, 2, 2);
        System.out.println("Before: e1 = " + e1.getName());
        System.out.println("Before: e2 = " + e2.getName());
        swap(e1,e2);
        System.out.println("After: e1 = " + e1.getName());
        System.out.println("After: e2 = " + e2.getName());
    }

    private static void swap(Employee x, Employee y) {
        Employee e = x;
        x = y;
        y = e;
        System.out.println("End of method: x = " + x.getName());
        System.out.println("End of method: y = " + y.getName());
    }

    private static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method : x = " + x.getSalary());
    }

    private static void tripleValue(double x) {
        x = x * 3;
        System.out.println("x = " + x);
    }
}