
public class maze {

	public static void main(String[] args) {
		go game = new go();
		System.out.println(game);
		
		if(game.traverse(0, 0)){
			System.out.println("sucsess");
		}else{
			System.out.println("no not");
			
		}
		
		System.out.println(game);

	}

}
