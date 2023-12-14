package com.marcotduenas.nith;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Level01 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstancesState){
       super.onCreate(savedInstancesState);
       setContentView(R.layout.level_01);

       NavController navControllerForLevel01 = new NavController(this);
       EditText userInputtedAnswer = findViewById(R.id.inputCode);
       Button enterCodeButton = findViewById(R.id.codeButton);
       final String NEXT_CLASS_LEVEL;

       enterCodeButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String literalUserAnswerValue = userInputtedAnswer.getText().toString();
               navControllerForLevel01.saveUserAnswer(literalUserAnswerValue);
               navControllerForLevel01.answerControllerForLevel01(navControllerForLevel01.getUserAnswer(), MainActivity.class);
           }
       });

    }

}
