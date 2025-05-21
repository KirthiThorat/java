package Day7;
class NoException extends Exception{
	public NoException(String message) {
		super(message);
	}
}
public class Userexp {
	public static void agecheck(int age) throws NoException{
		if(age>18) {
			throw new NoException("nope");
		}else {
			System.out.println("age below 18");
		}
	    }
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			agecheck(19);
		}catch (NoException e) {
			System.out.println(e.getMessage());

		}finally {
			System.out.println("happy coading");
			
	}

}
}