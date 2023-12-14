package com.marcotduenas.nith;

import android.content.Context;
import android.content.Intent;

import java.util.Arrays;

import io.github.cdimascio.dotenv.Dotenv;

public class NavController extends AnswersConfig{

    private Context context;
    private String userInputedAnswer;
    AnswersConfig finalAnswers = new AnswersConfig();

    public NavController(Context context){
        this.context = context;
    }

    public void saveUserAnswer(String answer) {
        this.userInputedAnswer = answer;
    }

    public String getUserAnswer() {
        return this.userInputedAnswer;
    }

    /*
    I've create controllerLevel01 because the game will have no save
    system, so, the first level will be like a guide to another levels.
    I couldn't figure a way to make this in a more generic way, so I'll
    create controllerLevel01 to specify how things will work on the first
    level of the game.
     */

    public void answerControllerForLevel01(String userAnswer, Class nextLevel) {
        /*
        for (int i = 0; i < correctAnswers.length; i++) {
                if (userAnswer.equals(correctAnswers[i])) {
                    Intent intent = new Intent(context, nextLevel);
                    context.startActivity(intent);
                    break;
                }
            }
        }
         */
        if (Arrays.asList(correctAnswers).contains(userAnswer)) {
            Intent intent = new Intent(context, nextLevel);
            context.startActivity(intent);
        }
    }
}
