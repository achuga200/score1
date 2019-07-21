package com.example.score;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int increaseNumber1 = 0;
    int increaseNumber11 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* IncreasePoint is the onclick name assigned to button +1 point
     * increaseNumber increment number by 1**/

    public void IncreasePointLeft1(View view) {
        increaseNumber1 = increaseNumber1 + 1;
        /*this displays the TextView in the form of integer*/
        displayForIncreaseNumber1L(increaseNumber1);

    }

    private void displayForIncreaseNumber1L(int score1) {
        // reference the text view to change to integer
        TextView scoreView = findViewById(R.id.default_number);
        scoreView.setText("" + score1);
    }

    /*************************************************/

    public void IncreasePointRight1(View view) {
        increaseNumber11 = increaseNumber11 + 1;
        /*this displays the TextView in the form of integer*/
        displayForIncreaseNumber1R(increaseNumber11);
    }

    private void displayForIncreaseNumber1R(int score) {
        // reference the text view to change to integer
        TextView scoreView1L = findViewById(R.id.default_number2);
        scoreView1L.setText("" + score);
    }







    /*SECTION 2*/

    public void IncreasePointLeft2(View view) {
        increaseNumber1 = increaseNumber1 + 2;
        /*this displays the TextView in the form of integer*/
        displayForIncreaseNumber2L(increaseNumber1);
    }

    private void displayForIncreaseNumber2L(int score) {
        // reference the text view to change to integer
        TextView scoreView2L = findViewById(R.id.default_number);
        scoreView2L.setText("" + score);
    }
/*************************************************************/
    public void IncreasePointRight2(View view) {
        increaseNumber11 = increaseNumber11 + 2;
        /*this displays the TextView in the form of integer*/
        displayForIncreaseNumber22R(increaseNumber11);
    }

    private void displayForIncreaseNumber22R(int score) {
        // reference the text view to change to integer
        TextView scoreView2R = findViewById(R.id.default_number2);
        scoreView2R.setText("" + score);

    }





    /* SECTION3*/

    public void IncreasePointLeft3(View view) {
        increaseNumber1 = increaseNumber1 + 3;
        /*this displays the TextView in the form of integer*/
        displayForIncreaseNumber3L(increaseNumber1);
    }

    private void displayForIncreaseNumber3L(int score) {
        // reference the text view to change to integer
        TextView scoreView3L = findViewById(R.id.default_number);
        scoreView3L.setText("" + score);
    }
    /*************************************************************/
    public void IncreasePointRight3(View view) {
        increaseNumber11 = increaseNumber11 + 3;
        /*this displays the TextView in the form of integer*/
        displayForIncreaseNumber33R(increaseNumber11);
    }

    private void displayForIncreaseNumber33R(int score) {
        // reference the text view to change to integer
        TextView scoreView3R = findViewById(R.id.default_number2);
        scoreView3R.setText("" + score);

    }

    /*RESET BUTTON*/

    /*
     * ChangeText Code Started
     * ChangeText is the onClick assigned in the xml
     * */
    public void ResetScore(View view) {
        increaseNumber1 = 0;
       increaseNumber11 = 0;
        displayForIncreaseNumber1L(increaseNumber1);
        displayForIncreaseNumber1R(increaseNumber11);



    }

}

