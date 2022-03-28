package controller;

import model.QuizDb;

import java.util.Scanner;

public class UpdateQuiz {

    public  void  updateQuiz(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Quiz ID");
        String id=sc.nextLine();
        System.out.println("What do you want to update ?");
        System.out.println("Press 1 for Problem Statement");
        System.out.println("Press 2 for option 1");
        System.out.println("Press 3 for option 2");
        System.out.println("Press 4 for option 3");
        System.out.println("Press 5 for option 4");
        System.out.println("Press 6 for ans");
        int input=sc.nextInt();
        sc.nextLine();
        System.out.println("Please Provide Input");
        String updatedInfo=sc.nextLine();
        if(input==1){
            QuizDb.quizStorage.get(id).setProblemStatememt(updatedInfo);
        }else if(input==2){
            QuizDb.quizStorage.get(id).setOpt1(updatedInfo);
        }else if(input==3){
            QuizDb.quizStorage.get(id).setOpt2(updatedInfo);
        }else if(input==4){
            QuizDb.quizStorage.get(id).setOpt3(updatedInfo);
        }else if(input==5){
            QuizDb.quizStorage.get(id).setOpt4(updatedInfo);
        }else if(input==6){
            QuizDb.quizStorage.get(id).setAns(updatedInfo);
        }else{
            System.out.println("wrong input");
            return;
        }

    }
}
