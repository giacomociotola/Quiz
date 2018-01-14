package com.example.toki.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    // Definition of two arrays for quizzes 8 and 9
    CheckBox[] cb8;
    CheckBox[] cb9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assignment of values to quiz 8 array
        cb8 = new CheckBox[]{
                (CheckBox)findViewById(R.id.check_81),
                (CheckBox)findViewById(R.id.check_82),
                (CheckBox)findViewById(R.id.check_83),
                (CheckBox)findViewById(R.id.check_84),
                (CheckBox)findViewById(R.id.check_85)
        };

        // Assignment of values to quiz 9 array
        cb9 = new CheckBox[]{
                (CheckBox)findViewById(R.id.check_91),
                (CheckBox)findViewById(R.id.check_92),
                (CheckBox)findViewById(R.id.check_93),
                (CheckBox)findViewById(R.id.check_94),
                (CheckBox)findViewById(R.id.check_95)
        };

        // here set onChechedChange for all checkboxes
        for (CheckBox cb:cb8) {
            cb.setOnCheckedChangeListener(cb8Listener);
        }

        // here set onChechedChange for all checkboxes

        for (CheckBox cb:cb9) {
            cb.setOnCheckedChangeListener(cb9Listener);
        }
    }

    // Global variable counting total points of the quiz
    public int points = 0;

    /**
     * Method to check the answer to the question n. 3
     * @param view - the RadioGroup of quiz 3
     */
     public void radioQ3 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_31:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_32:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_33:
                if (checked)
                    points += 10;
                    break;
            case R.id.radio_34:
                if (checked)
                    // failing answer
                    break;
        }

    }

    /**
     * Method to check the answer to the question n. 4
     * @param view - the RadioGroup of quiz 4
     */
    public void radioQ4 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_41:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_42:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_43:
                if (checked)
                    points += 10;
                break;
            case R.id.radio_44:
                if (checked)
                    // failing answer
                    break;
        }

    }

    /**
     * Method to check the answer to the question n. 5
     * @param view - the RadioGroup of quiz 5
     */
    public void radioQ5 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_51:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_52:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_53:
                if (checked)
                    // failing answer
                break;
            case R.id.radio_54:
                if (checked)
                    points += 10;
                    break;
        }
    }

    /**
     * Method to check the answer to the question n. 6
     * @param view - the RadioGroup of quiz 6
     */
    public void radioQ6 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_61:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_62:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_63:
                if (checked)
                    points += 10;
                break;
            case R.id.radio_64:
                if (checked)
                    // failing answer
                    break;
        }
    }

    /**
     * Method to check the answer to the question n. 7
     * @param view - the RadioGroup of quiz 7
     */
    public void radioQ7 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_71:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_72:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_73:
                if (checked)
                    // failing answer
                break;
            case R.id.radio_74:
                if (checked)
                    points += 10;
                    break;
        }
    }

    /**
     * The Listener for CheckBox array 8
     */
    CompoundButton.OnCheckedChangeListener cb8Listener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            checkEnoughAndMakeDisabled(cb8);
        }
    };

    /**
     * The Listener for CheckBox array 9
     */
    CompoundButton.OnCheckedChangeListener cb9Listener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            checkEnoughAndMakeDisabled(cb9);
        }
    };

    /**
     *
     * @param checkBoxes - the CheckBox arrays 8 and 9
     */
    private void checkEnoughAndMakeDisabled(CheckBox checkBoxes[]){
        int countChecked =0;
        for (CheckBox cb:checkBoxes){
            cb.setEnabled(true);
            if (cb.isChecked()) countChecked++;
        }

        // Setting the value for the max number of checked boxes
        int a = 2;
        if (a <= countChecked) {
            for (CheckBox cb:checkBoxes){
                if (!cb.isChecked())cb.setEnabled(false);
            }
        }
    }

    /**
     * Method to check the answer to the question n. 10
     * @param view - the RadioGroup of quiz 10
     */
    public void radioQ10 (View view) {

        // Check if the button is now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_101:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_102:
                if (checked)
                    // failing answer
                    break;
            case R.id.radio_103:
                if (checked)
                    // failing answer
                break;
            case R.id.radio_104:
                if (checked)
                    points += 10;
                    break;
        }
    }

    /**
     * Method to calculate the total score and create the final message
     * @param view - The View Results button
     */
    public void results (View view) {
        EditText answer_1 = (EditText) findViewById(R.id.answer1);
        String ans1 = answer_1.getText().toString();
        if (ans1.equalsIgnoreCase("15")) {
            points += 10;
        }

        EditText answer_2 = (EditText) findViewById(R.id.answer2);
        String ans2 = answer_2.getText().toString();
        if (ans2.equalsIgnoreCase("m")) {
            points = points + 10;
        }

        if (cb8[0].isChecked()){
            points +=5;
        }

        if (cb8[3].isChecked()){
            points +=5;
        }

        if (cb9[0].isChecked()){
            points +=5;
        }

        if (cb9[3].isChecked()){
            points +=5;
        }

        String message = getString(R.string.finish) + "\n";
        message = message + getString(R.string.congrat) + "\n";
        message = message + getString(R.string.score) + points + getString(R.string.fraction);

        printMessage (message);

    }

    /**
     * Method to print the input message
     * @param message - the string passed from caller
     */
    public void printMessage (String message) {
        TextView textView = (TextView) findViewById(R.id.results);
        textView.setText(message);
    }

    /**
     * Method to restart the quiz
     * @param view - The Restart Quiz button
     */
    public void restart (View view) {
        EditText text1 = (EditText) findViewById(R.id.answer1);
        text1.setText("");
        EditText text2 = (EditText) findViewById(R.id.answer2);
        text2.setText("");
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radioGroupQ3);
        radioGroup3.clearCheck();
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radioGroupQ4);
        radioGroup4.clearCheck();
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radioGroupQ5);
        radioGroup5.clearCheck();
        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.radioGroupQ6);
        radioGroup6.clearCheck();
        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.radioGroupQ7);
        radioGroup7.clearCheck();
        CheckBox check81 = (CheckBox) findViewById(R.id.check_81);
        check81.setChecked(false);
        CheckBox check82 = (CheckBox) findViewById(R.id.check_82);
        check82.setChecked(false);
        CheckBox check83 = (CheckBox) findViewById(R.id.check_83);
        check83.setChecked(false);
        CheckBox check84 = (CheckBox) findViewById(R.id.check_84);
        check84.setChecked(false);
        CheckBox check85 = (CheckBox) findViewById(R.id.check_85);
        check85.setChecked(false);
        CheckBox check91 = (CheckBox) findViewById(R.id.check_91);
        check91.setChecked(false);
        CheckBox check92 = (CheckBox) findViewById(R.id.check_92);
        check92.setChecked(false);
        CheckBox check93 = (CheckBox) findViewById(R.id.check_93);
        check93.setChecked(false);
        CheckBox check94 = (CheckBox) findViewById(R.id.check_94);
        check94.setChecked(false);
        CheckBox check95 = (CheckBox) findViewById(R.id.check_95);
        check95.setChecked(false);
        RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.radioGroupQ10);
        radioGroup10.clearCheck();
        TextView textView = (TextView) findViewById(R.id.results);
        textView.setText("");
        text1.requestFocus();
        points = 0;
    }

}
