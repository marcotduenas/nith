package com.marcotduenas.nith;

import android.content.Context;
import android.content.Intent;

import java.util.Arrays;

import io.github.cdimascio.dotenv.Dotenv;

public class NavController{

    /*
      I prefer to maintain variables as private to avoid mistakes in another .class files
     */
    private String userInputedAnswer;

    public void saveUserAnswer(String answer) {
        this.userInputedAnswer = answer;
    }

    public String getUserAnswer() {
        return this.userInputedAnswer;
    }

    /*
    I've created controllerLevel01 because the game will have no save
    system, so, the first level will be like a guide to another levels.
    I couldn't figure a way to make this in a more generic way, so I'll
    create controllerLevel01 to specify how things will work on the first
    level of the game.
     */

}
