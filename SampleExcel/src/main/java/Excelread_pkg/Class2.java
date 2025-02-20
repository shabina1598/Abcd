package Excelread_pkg;

import java.io.IOException;

public class Class2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String s =Class1.getStringData(1, 0);
System.out.println(s);
//System.out.println(Class1.getIntigerdata(1,2));
System.out.println(Class1.getStringData(2, 0));
System.out.println(Class1.getStringData(3, 0));
System.out.println(Class1.getIntigerdata(3,2));
	}

}
