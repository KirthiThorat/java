package Day8;
import java.io.*;
public class Files1prgm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("C:\\Users\\insan\\OneDrive\\Desktop\\mee.txt");
		if(f1.createNewFile()) {
			System.out.println("file created successfully");
		} else {
			System.out.println("not created");
		}

	}

}
