package Resources;

import java.util.Scanner;

public class QuestionServices {
    Question[] question = new Question[4];
    String selection[] = new String[5];
    public QuestionServices(){
        question[0] = new Question(1,"Which of the following is not a Java features?","Dynamic","Architecture Neutral","Use of pointers",
                "Object-oriented","3");
        question[1] = new Question(2,"_____ is used to find and fix bugs in the Java programs.","JVM","JRE","JDK",
                "JDB","4");
        question[2] = new Question(3," What is the return type of the hashCode() method in the Object class?","Object",
                "int","Long","void","2");
        question[3] = new Question(4,"Which method of the Class.class is used to determine the name of a class " +
                "represented by the class object as a String?","getClass()","intern()","getName()","toString()",
                "Java");
    }
    public void playQuiz(){
        int i=0;
        for(Question q : question){
            System.out.println("Question No."+q.getId());
            System.out.println("Question: "+q.getQuestion());
            System.out.println("Option 1: "+q.getOpt1());
            System.out.println("Option 2: "+q.getOpt2());
            System.out.println("Option 3: "+q.getOpt3());
            System.out.println("Option 4: "+q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.println("Give your answer");
            selection[i++]=sc.nextLine();
        }
    }
    public void calculateScore(){
        int score=0;
        for (int i = 0; i < question.length; i++) {
            String actualAnswer = question[i].getAnswer();
            String userAnswer = selection[i];
            if(actualAnswer.equalsIgnoreCase(userAnswer)){
                score++;
            }
        }
        System.out.println("Your Score : "+score);
    }
}

