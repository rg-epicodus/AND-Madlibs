package mymadlibs.epicodus.com.mymadlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Guest on 10/10/17.
 */

public class DisplayStoryActivity extends AppCompatActivity {
//    private TextView mNounTextView;
//    private TextView mVerbTextView;
//    private TextView mAdjectiveTextView;
    private TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_story);


//        mNounTextView = (TextView) findViewById(R.id.nounTextView);
//        mVerbTextView = (TextView) findViewById(R.id.verbTextView);
//        mAdjectiveTextView = (TextView) findViewById(R.id.adjectiveTextView);
        mStoryTextView = (TextView) findViewById(R.id.appStoryTextView);

        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        String adjective = intent.getStringExtra("adjective");
        mStoryTextView.setText("blah blah blah" + noun + "blah blah blah" + verb + "blah blah blah" + adjective);
    }
}
