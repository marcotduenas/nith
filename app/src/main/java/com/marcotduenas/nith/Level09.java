package com.marcotduenas.nith;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Level09 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_09);


        AnswersConfig levelChecker = new AnswersConfig(this);
        EditText userInputtedAnswer = findViewById(R.id.inputCode);
        Button enterCodeButton = findViewById(R.id.codeButton);

        enterCodeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String literalUserAnswerValue = userInputtedAnswer.getText().toString();
                levelChecker.correctAnswersList(literalUserAnswerValue);
            }

        });
    }
}
