
public class Student {

	/*�л��̸�*/  String stuName;
	/*��*/ 	 	int clNum;
	/*��ȣ*/  	int stuNum;
	/*��������*/  int scoreKor;
	/*��������*/  int scoreEng;
	/*��������*/  int scoreMath;
	
	public Student(String stuName, int clNum, int stuNum, int scoreKor,
			int scoreEng, int scoreMath) {
		super();
		this.stuName = stuName;
		this.clNum = clNum;
		this.stuNum = stuNum;
		this.scoreKor = scoreKor;
		this.scoreEng = scoreEng;
		this.scoreMath = scoreMath;
	}

	int getTotal() {
		return scoreKor + scoreEng + scoreMath;
	}
	
	
	
	
	
	
	
}
