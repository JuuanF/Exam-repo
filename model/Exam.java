import java.util.ArrayList;
import exceptions.*;

class Exam{
	private String examType;
	private ArrayList<Question> questions;
	private int timeLimit;
	private String title;

	public Examen (String examType, int timeLimit){

		this.examType = examType;
		this.timeLimit = timeLimit;
		this.title = "Exam of " + examType;
		this.questions = new ArrayList<>();
	}

	public boolean isComplete(){
		return questions.size == 5;

	}

	public String getexamType(){
		return examType;
	}

	public int getTimeLimit(){
		return timeLimit;
	}

	public getTitle(){
		return title;
	}

	public int getTotalQuestons(){
		this.title = title;
	}

	public void setTimeLimit(int timeLimit){
		if(timeLimit <0){
		this.timeLimit = timeLimit;
		} else {
			System.out.println("Error: time must be > 0");
		}
	}

}