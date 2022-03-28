package controller;

import model.Quiz;
import model.QuizDb;

import java.util.HashMap;

public class ReadQuiz {

   public void printQuiz(){
       HashMap<String,Quiz> quizStorage=QuizDb.quizStorage;
//       System.out.println(quizStorage.size());
       for(String key:quizStorage.keySet()){
           Quiz q=quizStorage.get(key);
           System.out.println(q.getID()+".");
           System.out.println(q.getProblemStatememt());
           System.out.println("(a) "+q.getOpt1());
           System.out.println("(b) "+q.getOpt2());
           System.out.println("(c) "+q.getOpt3());
           System.out.println("(d) "+q.getOpt4());
           System.out.println();
       }
   }
}
