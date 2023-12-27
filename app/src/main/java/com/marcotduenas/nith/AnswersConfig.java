package com.marcotduenas.nith;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

public class AnswersConfig {

    private Context context;
    private HashMap <String, Class<?>> nextLevelClass;

    public AnswersConfig(Context context){
       this.context = context;
    }

    public void correctAnswersList(String sentAnswer){
        nextLevelClass = new HashMap<>();
        nextLevelClass.put("yes", Level02.class);
        nextLevelClass.put("alkalinebatteries", Level03.class);
        nextLevelClass.put("sertillanges", Level04.class);
        nextLevelClass.put("animal", Level05.class);
        nextLevelClass.put("1984", Level06.class);
        nextLevelClass.put("superman", Level07.class);
        nextLevelClass.put("passau", Level08.class);
        nextLevelClass.put("salvador", Level09.class);
        nextLevelClass.put("chainsaw", Level10.class);
        nextLevelClass.put("orbits", Ending.class);

        Class isThereNextLevel = nextLevelClass.get(sentAnswer);

        if (isThereNextLevel != null){
            Intent intent = new Intent(context, isThereNextLevel);
            context.startActivity(intent);
        }


    }

}
