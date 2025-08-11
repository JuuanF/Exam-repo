import java..util.ArrayList;
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

	/*
	public void addQuestion (Question question){
		if(questions.size() < 5){}
			questions.add(question);
			System.out.println("Question added. Total " + questions.size() + "/5");
	} else{
		System.out.println("Error: already has 5 questions");
	}
	*/


	public Question getQuestion(int indx){
		if(indx >= 0 && indx < questions.size()){
			return questions.get(indx);
		} else {
			System.out.println("Error: Invalid question index");
			return null;
		}
	}

	public boolean isComplete(){
		return questions.size == 5;

	}

	public int calculateScore(int[] userAnswer){
		int score = 0;

		for(int i =; i< questions.size(); i++){
			if(questions.get(i).isCorrect(userAnswer[i])){
				aciertos++;
			}
		}
	return score;
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


	public void geoQuestions(){
		String[] 
	}


}