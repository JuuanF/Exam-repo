public class Question{
	
	private String questionText;
	private String[] options;
	private int correctAnswer;

	public Question(String questionText, String[] options, int correctAnswer){

		this.questionText = questionText;
		this.options = options;

		if(correctAnswer >= 0 && correctAnswer <=2){
		this.correctAnswer = correctAnswer;
		} else {
			System.out.println("Error: must be 0, 1 or 2");
		}
	}

	public boolean isCorrect(int userAnswer){

		return userAnswer == correctAnswer;
	}

	public String showQuestion() {
        String result = questionText + "\n";
        result += "A) " + options[0] + "\n";
        result += "B) " + options[1] + "\n";
        result += "C) " + options[2] + "\n";
        return result;
    }	

    public String getQuestionText(){
    return questionText;
    }

    public String[] getOptions(){
    	return correctAnswer;
    }

}