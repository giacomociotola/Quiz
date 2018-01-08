package com.example.toki.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Global variable counting total points of the quiz
     */
    public int points = 0;

    /**
     *
     * @param view
     */
    public void sendAnswer1 (View view) {
        Button send1 = (Button) findViewById(R.id.send1);
        EditText answer_1 = (EditText) findViewById(R.id.answer1);
        String ans1 = answer_1.getText().toString();
        if (ans1.equalsIgnoreCase("15")) {
            points += 10;
        }
        send1.setEnabled(false);  // disable button
    }

    /**
     *
     * @param view
     */
    public void sendAnswer2 (View view) {
        Button send2 = (Button) findViewById(R.id.send2);
        EditText answer_2 = (EditText) findViewById(R.id.answer2);
        String ans2 = answer_2.getText().toString();
        if (ans2.equalsIgnoreCase("m")) {
            points = points + 10;
        }
        send2.setEnabled(false);  // disable button
    }



    /**
     * Method to check the answer to the question n. 3
     * @param view
     */
     public void radioQ3 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_31:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_32:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_33:
                if (checked)
                    points += 10;
                    break;
            case R.id.radio_34:
                if (checked)
                    // risposta errata
                    break;
        }

    }

    /**
     * Method to check the answer to the question n. 4
     * @param view
     */
    public void radioQ4 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_41:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_42:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_43:
                if (checked)
                    points += 10;
                break;
            case R.id.radio_44:
                if (checked)
                    // risposta errata
                    break;
        }

    }

    /**
     * Method to check the answer to the question n. 5
     * @param view
     */
    public void radioQ5 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_51:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_52:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_53:
                if (checked)
                    // risposta errata
                break;
            case R.id.radio_54:
                if (checked)
                    points += 10;
                    break;
        }
    }

    /**
     * Method to check the answer to the question n. 6
     * @param view
     */
    public void radioQ6 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_61:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_62:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_63:
                if (checked)
                    points += 10;
                break;
            case R.id.radio_64:
                if (checked)
                    // risposta errata
                    break;
        }
    }

    /**
     * Method to check the answer to the question n. 7
     * @param view
     */
    public void radioQ7 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_71:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_72:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_73:
                if (checked)
                    // risposta errata
                break;
            case R.id.radio_74:
                if (checked)
                    points += 10;
                    break;
        }
    }

    /**
     * Method to check the answer to the question n. 8
     * @param view
     */
    public void onCheckBox8_clicked (View view) {
        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.check_81:
                if (checked)
                    points += 5;
                    break;
            case R.id.check_82:
                if (checked)
                    // risposta errata
                    break;
            case R.id.check_83:
                if (checked)
                    // risposta errata
                    break;
            case R.id.check_84:
                if (checked)
                    points += 5;
                break;
            case R.id.check_85:
                if (checked)
                    // risposta errata
                break;
        }
    }

    /**
     * Method to check the answer to the question n. 9
     * @param view
     */
    public void onCheckBox9_clicked (View view) {
        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.check_91:
                if (checked)
                    points += 5;
                break;
            case R.id.check_92:
                if (checked)
                    // risposta errata
                    break;
            case R.id.check_93:
                if (checked)
                    // risposta errata
                    break;
            case R.id.check_94:
                if (checked)
                    points += 5;
                break;
            case R.id.check_95:
                if (checked)
                    // risposta errata
                    break;
        }
    }

    /**
     * Method to check the answer to the question n. 10
     * @param view
     */
    public void radioQ10 (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_101:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_102:
                if (checked)
                    // risposta errata
                    break;
            case R.id.radio_103:
                if (checked)
                    // risposta errata
                break;
            case R.id.radio_104:
                if (checked)
                    points += 10;
                    break;
        }
    }

    /**
     * Method to calculate the total score and create the final message
     * param view
     */
    public void results (View view) {
        String message = "You've finished the QI test.";
        message = message + "\nCongratulations!";
        message = message + "\nYour score is " + points + "/100";

        printMessage (message);

    }

    /**
     * Method to print the input message
     * @param message
     */
    public void printMessage (String message) {
        TextView textView = (TextView) findViewById(R.id.results);
        textView.setText(message);
    }

    /**
     * Method to restart the quiz
     * @param view
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
    }

}
