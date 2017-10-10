package mymadlibs.epicodus.com.mymadlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class UserInputActivity extends AppCompatActivity {
    private RadioGroup mChooseStoryButton;
    private EditText mNounEditText;
    private EditText mVerbEditText;
    private EditText mAdjectiveEditText;
    private String[] stories = new String[] {"Haunted House", "Enchanted Forest",
            "Galactic Adventure"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_input);
        final RadioGroup surveyRadioGroup = (RadioGroup) findViewById(R.id.storyRadioGroup);

        mNounEditText = (EditText) findViewById(R.id.nounEditText);
        mVerbEditText = (EditText) findViewById(R.id.verbEditText);
        mAdjectiveEditText = (EditText) findViewById(R.id.adjectiveEditText);
        mChooseStoryButton = (RadioGroup) findViewById(R.id.storyRadioGroup);

        mChooseStoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noun = mNounEditText.getText().toString();
                String verb = mVerbEditText.getText().toString();
                String adjective = mAdjectiveEditText.getText().toString();

                int selectedId = surveyRadioGroup.getCheckedRadioButtonId();
                final RadioButton selectedRadioButton = (RadioButton) findViewById(selectedId);


                Intent intent = new Intent(UserInputActivity.this, DisplayStoryActivity.class);
                intent.putExtra("noun", noun);
                intent.putExtra("verb", verb);
                intent.putExtra("adjective", adjective);
                startActivity(intent);
            }
        });
    }
}
