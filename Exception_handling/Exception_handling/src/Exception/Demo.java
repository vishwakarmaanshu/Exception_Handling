package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
   public static void main(String []args)throws FileNotFoundException{
	   FileReader fileReader = new FileReader("a.txt");
   }
}
