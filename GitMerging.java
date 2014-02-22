
public class GitMerging {
	
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else if (score > 40)
			System.out.println("Are you proud?");
		else
			System.out.println("Well, what can I say?");
	}
	
	public static void main(String[] args) {
		GitMerging tm2 = new GitMerging();
		tm2.feedback(80);
	}
}
