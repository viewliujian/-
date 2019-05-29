import java.util.*;
import java.time.*;

public class tset_math {
	public static void main(String[] arg) {
		LocalDate date = LocalDate.now();	//当前日期
		int year = date.getYear();;	//年份
		int month;	//月份
		int value;	//星期几
		
		while(date.getYear() == year) {	//循环打印当年的月份日期
			System.out.println(date.toString().substring(0,7));
			System.out.println("=========================== ");
			System.out.println("Mon Tue Wnd Thu Fri Sat Sun ");

			value = date.getDayOfWeek().getValue();  //当前时星期几
			for(int i = 1; i < value; i++)	//打印空格将日期与星期几对齐
				System.out.print("    ");
			
			month = date.getMonthValue();
			while(date.getMonthValue() == month) {	//循环打印当月的日期
				System.out.printf("%3d",date.getDayOfMonth());
				System.out.print(" ");
				date = date.plusDays(1);
				if(date.getDayOfWeek().getValue() == 1)	//星期一则换行
					System.out.println();
			}
			System.out.println("\n=========================== \n");			
		}	
	}
}


