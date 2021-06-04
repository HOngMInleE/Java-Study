
public class Student {

	/*학생이름*/  String stuName;
	/*반*/ 	 	int clNum;
	/*번호*/  	int stuNum;
	/*국어점수*/  int scoreKor;
	/*영어점수*/  int scoreEng;
	/*수학점수*/  int scoreMath;
	
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
