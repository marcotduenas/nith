package com.marcotduenas.nith;

import android.content.Context;
import android.content.Intent;

public class NavController {
    private String userAnswer;
    private Context context;

    public NavController(Context context){
        this.context = context;
    }

    public void saveUserAnswer(String answer) {
        this.userAnswer = answer;
    }

    public String getUserAnswer(){
        return this.userAnswer;
    }

    public void goToAnotherLevel(String answer) {
        if("teste".equals(answer)){
        Intent intent = new Intent(context, SecondLevel.class);
        context.startActivity(intent);
        }else {
            ;
        }
    }
}
