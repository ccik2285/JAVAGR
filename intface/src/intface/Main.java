package intface;

public class Main extends Player{

	public static void main(String[] args) {
		
		Main main = new Main();
		Dog dog = new Dog();
		main.play("노을");
		main.pause();
		dog.crying();
		main.stop();
	}

	@Override
	void play(String songName) {
		
		System.out.println(songName + " 곡을 재생합니다. ")  ;
		
	}

	@Override
	void pause() {
		
		System.out.println("곡을 일시정지합니다.");
		
	}

	@Override
	void stop() {
		
		System.out.println("곡을 정지합니다.");
		
	}

}
