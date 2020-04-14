
public class MainAppRunner {

	public static void main(String[] args) {
		MainAppRunner m =new MainAppRunner();
		System.out.println("helloWorld");
		int sum=0;
		//creating a player 
		Player p =new Player();
		p.setName("Yash");
		System.out.println("Player is :"+p.getName());
		for(int i=0;i<10;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is :"+sum);
	}

}
