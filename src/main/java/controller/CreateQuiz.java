package controller;

import model.Quiz;
import model.QuizDb;

import java.util.Scanner;

public class CreateQuiz {
    Scanner sc=new Scanner(System.in);
    public void createQuiz(){
        String problemStatement;
        String opt1,opt2,opt3,opt4;
        String ans;

        System.out.println("Enter Quiz Problem Statement");
        problemStatement=sc.nextLine();
        System.out.println("Enter Quiz Problem Option 1");
        opt1= sc.nextLine();
        System.out.println("Enter Quiz Problem Option 2");
        opt2= sc.nextLine();
        System.out.println("Enter Quiz Problem Option 3");
        opt3= sc.nextLine();
        System.out.println("Enter Quiz Problem Option 4");
        opt4= sc.nextLine();
        System.out.println("Enter Quiz answer");
        ans= sc.nextLine();

        Quiz q1=new Quiz(problemStatement,opt1,opt2,opt3,opt4,ans);

//        QuizDb quizDb=new QuizDb();
        String  id=Integer.toString(QuizDb.quizStorage.size()+1);
        q1.setID(id);
        QuizDb.quizStorage.put(id,q1);

        System.out.println("Quiz Creation Successful");



    }

}
