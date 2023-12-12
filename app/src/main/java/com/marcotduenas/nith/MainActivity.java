package com.marcotduenas.nith;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       EditText userCode = findViewById(R.id.inputCode);

       NavController answerController = new NavController(this);

       Button answerButton = findViewById(R.id.codeButton);

       answerButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String userCodeValue = userCode.getText().toString();
               answerController.saveUserAnswer(userCodeValue);
               answerController.goToAnotherLevel(answerController.getUserAnswer());
           }
       });


    }

}