
public class Main implements Dog,Cat{

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.one();
		main.two();
	
	}

	@Override
	public void crying() {
		
		System.out.println("그르르릉");
		
	}

	@Override
	public void two() {
		System.out.println("two");
		
	}

	@Override
	public void one() {
		System.out.println("one");
		
	}

	

}
