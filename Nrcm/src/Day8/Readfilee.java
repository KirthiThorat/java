package Day8;
import java.io.*;
import java.util.Scanner;
public class Readfilee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File Obj=new File("C:\\Users\\insan\\OneDrive\\Desktop\\mee.txt");
			Scanner r=new Scanner(Obj);
			while (r.hasNextLine()) {
				String data=r.nextLine();
				System.out.println(data);
			}
			r.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("an error has occured");
			e.printStackTrace();			
		}

	}

}
