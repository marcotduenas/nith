package com.marcotduenas.nith;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;


public class MainActivity extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Level01.class);
                startActivity(intent);
                finish();
            }
        }, 2000);


        /*
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

         */


    }

}