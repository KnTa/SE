
public class letterGrade {

	public static void main(String[] args) {

	}
	
	public static char letterGrade(int score) {
		char grade;
		grade ='F'; 
		if (score <0 || score > 100) grade = 'X';
		if (score>=90 && score <=100) grade = 'A';
		if (score>=80 && score <90) grade = 'B';
		if (score>=70 && score <80) grade = 'C';
		if (score>=60 && score <70) grade = 'D';
		return grade;
		

	}

}
