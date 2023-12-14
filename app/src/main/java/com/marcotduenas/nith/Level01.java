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

       NavController navControllerForLevel01 = new NavController();
       AnswersConfig levelChecker = new AnswersConfig(this);
       EditText userInputtedAnswer = findViewById(R.id.inputCode);
       Button enterCodeButton = findViewById(R.id.codeButton);

       enterCodeButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String literalUserAnswerValue = userInputtedAnswer.getText().toString();
              /*
               literalUserAnswerValue was created to get the value of the string written in
               the EditText field
               */
               navControllerForLevel01.saveUserAnswer(literalUserAnswerValue);
               levelChecker.correctAnswersList(navControllerForLevel01.getUserAnswer());
           }
       });

    }

}
