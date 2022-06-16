import java.util.ArrayList;
import java.util.List;

public class Movie {
	private Play IPlay;
	private String title;
	private int runTime;
	private ArrayList<String> scenes;

	public Movie(Play IPlay) {
		this.IPlay = IPlay;
	}
	
	public Play getPlay() {
		return IPlay;
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

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	public void printInfo() {
		System.out.println(title);
		System.out.println("Runtime: " + runTime + " minutes");
	}

	public void printScenes() {
		for (String scene : scenes) {
			System.out.println("Scene " + scenes.indexOf(scene) + ": " + scene);
		}
	}
	
	public void play() {
		IPlay.play(scenes);
	}
}
