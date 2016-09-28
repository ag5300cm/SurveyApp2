package com.example.ag5300cm.surveyapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class SurveyAppActivation extends AppCompatActivity {

    private Button mYes_Button;
    private Button mNo_Button;
    private TextView mshow_entered_question;

    //private configure

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_fragment_setquestion);

        //Setting of components
        final EditText newEnteredSurveyQuestion = (EditText) findViewById(R.id.new_question_editText);
        final EditText newEnteredButtonOne = (EditText) findViewById(R.id.enter_ButtonEditTextOne);
        final EditText newEnteredButtonTwo = (EditText) findViewById(R.id.enter_ButtonEditTextTwo);
        Button newSetQuestionDone_Button = (Button) findViewById(R.id.setquestionDone_button);

        int onetally;
        int twotally;

        onetally = 0;
        twotally = 0;


        //final TextView show_entered_question = (TextView) findViewById(R.id.new_question_editText);
        //String show_entered_question.findViewById(R.id.new_question_editText);
        //final TextView show_entered_question;
        //final TextView show_entered_question;

        newSetQuestionDone_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO send info to survey display
                setContentView(R.layout.display_survey_question);

                TextView entered_question = (TextView) findViewById(R.id.new_question_editText);
                mshow_entered_question.setText(entered_question.getText());

                //mshow_entered_question.setText(findViewById(R.id.new_question_editText));
                //show_entered_question = (TextView)
                //final TextView show_entered_question = (TextView) findViewById(R.id.new_question_editText);

                //String newQuestion = newEnteredSurveyQuestion.getText().toString();
                //show_entered_question.setText("" + show_entered_question);



                //show_entered_question.add(newQuestion);
                //show_entered_question.getText().show();

            }
        });

        /*
        mYes_Button = (Button) findViewById(R.id.yes_button);
        mYes_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO add info to results
            }
        });
        mNo_Button = (Button) findViewById(R.id.no_button);
        mNo_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO add info to results

            }
        });
        */
    }
}
