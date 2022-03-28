package quiz.entry.main;

import controller.QuizUtil;
import view.Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Quiz Application");
        Login login=new Login();
       boolean isCorrectUser=login.Login();
       if(isCorrectUser){
           while (true) {
               System.out.println("Enter 1 for CREATE QUIZ");
               System.out.println("Enter 2 for READ QUIZ");
               System.out.println("Enter 3 for UPDATE QUIZ");
               System.out.println("Enter 4 for DELETE QUIZ");
               System.out.println("Enter 5 for Exit");
               int input = sc.nextInt();
               if (input == 5)
                   return;
               QuizUtil.Route(input);
           }


       }else{
           System.out.println("Wrong Crediantials Please login again!!");
       }

    }
}
