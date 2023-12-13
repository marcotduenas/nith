package com.marcotduenas.nith;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import io.github.cdimascio.dotenv.Dotenv;

public class NavController{

    Dotenv listOfAnswers = Dotenv.configure().directory("./").filename("env").load();

    private Context context;
    private String userInputedAnswer;


    public NavController(Context context){
        this.context = context;
    }

    public void saveUserAnswer(String answer) {
        this.userInputedAnswer = answer;
    }

    public String getUserAnswer() {
        return this.userInputedAnswer;
    }

    public void goToAnotherLevel(Class nextLevelClassName) {
        Intent intent = new Intent(context, nextLevelClassName);
        context.startActivity(intent);
    }



    /*
    I've create controllerLevel01 because the game will have no save
    system, so, the first level will be like a guide to another levels.
    I couldn't figure a way to make this in a more generic way, so I'll
    create controllerLevel01 to specify how things will work on the first
    level of the game.
     */


    public void controllerLevel01(String valueOfUserAnswer){
        if (valueOfUserAnswer.equals(listOfAnswers.get("ANSWER_LEVEL_01"))) {
            Intent intent = new Intent(context, MainActivity.class);
            context.startActivity(intent);
            System.out.println("FUNCAO CHAMADA");
        }
    }
}
