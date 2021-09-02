package chapter4.LocalDate.d_4_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 这个程序将显示当前月的日历
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();//构造一个表示当前日期的对象
        int month = date.getMonthValue();//得到月
        int today = date.getDayOfMonth();//得到日
        date = date.minusDays(today - 1);//生成当前日期之后或者之前n天的日期,第一天
        DayOfWeek weekday = date.getDayOfWeek();//得到当前日期是星期几
        int value = weekday.getValue();//具体星期几[1,7]
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i < value;i++){
            System.out.print("    ");//月的开头有一些空格
        }
        while(date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today){
                System.out.print("*");
            }else System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
