package classStudy;

public class Main {

	public static void main(String[] args) {
		Node one = new Node(10,20);
		Node two = new Node(30,40);
		Node three = one.getCenter(two);
		
		System.out.println(three.getX() + " " + three.getY());
		

	}

}
