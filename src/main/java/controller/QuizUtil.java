package controller;

public class QuizUtil {

    public static void Route(int input){
        if(input==1){
           CreateQuiz createQuiz=new CreateQuiz();
           createQuiz.createQuiz();
        }else if(input==2){
            ReadQuiz readQuiz=new ReadQuiz();
            readQuiz.printQuiz();
        }else if(input==3){
             UpdateQuiz updateQuiz=new UpdateQuiz();
             updateQuiz.updateQuiz();
        }else if(input==4){
             DeleteQuiz deleteQuiz=new DeleteQuiz();
             deleteQuiz.delete();
        }else{
            System.out.println("Wrong input");
            return;
        }
    }
}
