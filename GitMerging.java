
public class GitMerging {
	
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	
	public static void main(String[] args) {
		GitMerging tm = new GitMerging();
		tm.feedback(80);
		tm.feedback(20);
		tm.feedback(60);
	}
}
