package cdc2;
interface Earings{
	void studs();
}
interface Necklace{
	void necksize();
}
interface Rings{
	void index();
}
interface Jewellery extends Earings,Necklace,Rings{
	void hand();
}
class Accessories implements Jewellery{
	public void accessorie() {
		System.out.println("ring,chain,belt");
	}
	public void studs() {
		System.out.println("star,circle");
	}
	public void necksize() {
		System.out.println("thin,fat");
	}
	public void index() {
		System.out.println("long");
	}
	public void hand() {
		System.out.println("soft");
	}
}

public class Assis10 {

	public static void main(String[] args) {
		Accessories aa1=new Accessories();
		aa1.accessorie();
		aa1.studs();
		aa1.necksize();
		aa1.index();
		aa1.hand();

	}

}



