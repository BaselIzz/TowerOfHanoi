import java.time.*;

public class _ToHTest {
	public static void main 	(String []args ) {
		
		Instant start  = Instant.now();
		TOH(4, 'A','B', 'C');
		Instant end = Instant.now();
		System.out.println("_-_________________________");
		System.out.print("Time elapsed: " + Duration.between(start, end).toMillis() + " milliseconds.");
	}
	
	
	
static void TOH(int numberofDisks,char startPole,char tempPole,char endPole) {
	
	if (numberofDisks==1) {
		System.out.println("- Move the "+(numberofDisks)+" disk on   "+  startPole+ " to	"+endPole);
	
	}
	else {
		
		TOH(numberofDisks-1, startPole, endPole, tempPole);
		
		System.out.println("- Move the "+(numberofDisks)+" disk on   "+  startPole+ " to	"+endPole);
		
		TOH(numberofDisks-1, tempPole, startPole, endPole);	
		
	}
}

}
