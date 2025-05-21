package Day7;
class NoException extends Exception{
	public NoException(String message) {
		super(message);
	}
}
public class Eg2 {
	public static void guess(int n) throws NoException{
		if(n%2==0) {
			throw new NoException("even");
		}else {
			System.out.println("odd");
		}
	    }
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			guess(19);
		}catch (NoException e) {
			System.out.println(e.getMessage());

		}finally {
			System.out.println("math gone");
			
	}

}
}
