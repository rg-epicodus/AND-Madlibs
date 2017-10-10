package mymadlibs.epicodus.com.mymadlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Guest on 10/10/17.
 */

public class DisplayStoryActivity3 extends AppCompatActivity {
    private TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_story);

        mStoryTextView = (TextView) findViewById(R.id.appStoryTextView);

        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        String adjective = intent.getStringExtra("adjective");
        mStoryTextView.setText("This is another test"  + noun + ". A real final test"  + verb + "! + Be anxious " +  adjective + "!!");
    }
}


