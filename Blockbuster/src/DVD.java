import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVD implements Play{
	Scanner input = new Scanner(System.in);
	
	private String title;
	private int runTime;
	
	public DVD(String title, int runTime) {
		this.title = title;
		this.runTime = runTime;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getRunTime() {
		return runTime;
	}
	
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	@Override
	public void play(List<String> Scenes) {
		System.out.println("What scene would you like to watch?(0-4)");
		for (String scene : Scenes) {
			System.out.println(scene);
		}
		int userChoice = input.nextInt();
		
		System.out.println("Scene " + userChoice + ": " + Scenes.get(userChoice));		
	}
}
