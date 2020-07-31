import java.util.Scanner;
public class HeadsOrTails {
    final static int NumoRound = 3 , TossingTime = 5;
	

    public static void main(String[] args) {
	int head_counter = 0,tail_counter = 0,head=0,tail=0;
	
	System.out.println("Who are you?");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	System.out.println("Hello,"+name+"!");
	System.out.println("Tossing a coin...");
	for(int i = 1 ; i <= NumoRound; i++) {
	    for(int j = 0 ; j < TossingTime;j++) {
		if(0 == new java.util.Random().nextInt(2)) head_counter++;
		else tail_counter++;
	    }
	    if(head_counter < tail_counter) {
		System.out.println("Round "+i+": Tails");
		tail++;
	    }
	    else if(head_counter > tail_counter){
		System.out.println("Round "+i+": Heads");
		head++;
	    }
	    else System.out.println("Draw...");
	    head_counter = 0;
	    tail_counter = 0;
	}
	System.out.println("Heads:"+head+", Tails:"+tail);
		
    }

}

