package Resources;

public class QuestionServices {
    Question[] question = new Question[4];
    public QuestionServices(){
        question[0] = new Question(1,"Which one is OOP Language","Java","C","English","Assembly level lnguage","Java");
        question[1] = new Question(1,"Which one is OOP Language","Java","C","English","Assembly level lnguage","Java");
        question[2] = new Question(1,"Which one is OOP Language","Java","C","English","Assembly level lnguage","Java");
        question[3] = new Question(1,"Which one is OOP Language","Java","C","English","Assembly level lnguage","Java");
    }
    public void displayQuestions(){
        for(Question q : question){
            System.out.println(q.toString());
        }
    }
}

