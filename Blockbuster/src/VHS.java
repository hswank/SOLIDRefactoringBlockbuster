import java.util.ArrayList;
import java.util.List;

public class VHS implements Play{
	private String title;
	private int runTime;
	private int currentTime;
	
	public VHS(String title, int runTime) {
		this.title = title;
		this.runTime = runTime;
	}
	
	public int getCurrentTime() {
		return currentTime;
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
		System.out.println("Scene " + currentTime + ": " + Scenes.get(currentTime));
		currentTime++;
		
		if (currentTime >= Scenes.size()) {
			rewind();
		}
	}
	
	public void rewind() {
		currentTime = 0;
	}
}
