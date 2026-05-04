package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
	public static void main(String []args)throws IOException{
		   method2();
		   System.out.println("hello");
	   }
	public static void method2() throws FileNotFoundException{
		method1();
	}
	public static void method1()throws FileNotFoundException{
		FileReader fileReader= new FileReader("a.txt");
	}
}
