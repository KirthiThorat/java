package Day7;

import java.io.*;
import java.util.Scanner;

public class Checkedexp {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		File Obj=new File("C:\\Users\\insan\\OneDrive\\Desktop\\hii.txt");
		Scanner Reader = new Scanner(Obj);
		     while (Reader.hasNextLine()) {
		String data=Reader.nextLine();
		    System.out.println(data);
			   //throw new FileNotFoundException("File not present");
		   }
		   Reader.close();
	}

	}


