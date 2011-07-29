package uGame;
import java.util.ArrayList;


public class MushroomMan {
	
	private ArrayList<Student> students = new ArrayList<Student>();
	private Statistic stats;
	
	public MushroomMan() {
		initStudents();
		this.stats = new Statistic(this.students);
		displayStats();
	}

	private void initStudents() {
		boolean done = false;
		while (!done) {
			Output.println("Add a Student:");
			String name = Input.nextString();
			this.students.add(new Student(name));
			done = askIfDone();
		}
	}
	
	private void displayStats() {
		Output.println(this.stats.toString());
	}
	
	private boolean askIfDone() {
		Output.println("Done?");
		String answer = Input.nextString();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			return false;
		} else {
			return true;
		}
	}
	
	public ArrayList<Student> getStudents() {
		return this.students;
	}

	public String askSomethingAboutMath() {
		return "WTF Bro";
	}
	
	public static void main(String[] args) {
		MushroomMan mushroomMan = new MushroomMan();
		Output.println(mushroomMan.askSomethingAboutMath());
	}

}
