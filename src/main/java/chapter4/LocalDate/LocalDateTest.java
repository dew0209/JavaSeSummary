package chapter4.LocalDate;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocalDateTest {
    /**
     * 将保存时间与给时间点命名分开。所以标准Java类库分别包含了两个类：一个是用来表示时间点的Date类；另一个是用来表示大家熟悉的日历表示法的LocalDate类
     * JavaSE8还引入了一另外的类来处理日期和时间的不同方面，这部分以后在其他章节会有描述
     */
    @Test
    public void test01(){
        //不要使用构造器来构造LocalDate对象。实际上，应当使用静态工厂方法代表你使用构造器
        LocalDate now = LocalDate.now();
        System.out.println(now);//2021-09-01
        //可以提供年，月，日来构造一个特定日期的对象
        LocalDate newYearEve = LocalDate.of(1999, 12, 21);
        int year = newYearEve.getYear();
        int month = newYearEve.getMonthValue();
        int day = newYearEve.getDayOfMonth();
        System.out.println(year + "年" + month + "月" + day + "日");//1999年12月21日
    }

    /**
     * 更改器方法与访问器方法
     */
    @Test
    public void test02(){
        LocalDate newYearEve = LocalDate.of(1999, 12, 21);
        LocalDate localDate = newYearEve.plusDays(1000);
        System.out.println(newYearEve);//1999-12-21  原来的对象不会被改变，而是产生了一个新的对象，类似String类  访问器，不会更改的
        System.out.println(localDate);//2002-09-16
        GregorianCalendar somDay = new GregorianCalendar(1999, 12, 21);
        somDay.add(Calendar.DAY_OF_MONTH,10000);
        int year = somDay.get(Calendar.YEAR);
        int month = somDay.get(Calendar.MONTH) + 1;
        int day = somDay.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");//2027年6月8日
    }

}
