package controller;

import model.QuizDb;

import java.util.Scanner;

public class DeleteQuiz {

    public void delete(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id of the quiz you want to delete?");
        String id=sc.nextLine();
        QuizDb.quizStorage.remove(id);
        System.out.println("Deletion Successful");
    }
}
