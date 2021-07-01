package APIFunctionalInterface;

public class Student {

	private String name;
	private int englishscore;
	private int mathScore;
	
	
	public Student(String name, int englishscore, int mathScore) {
		super();
		this.name = name;
		this.englishscore = englishscore;
		this.mathScore = mathScore;
	}


	public String getName() { return name; }

	public int getEnglishscore() { return englishscore; }

	public int getMathScore() { return mathScore; }
	
	
	
}
