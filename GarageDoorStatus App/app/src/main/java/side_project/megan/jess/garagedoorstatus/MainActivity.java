package side_project.megan.jess.garagedoorstatus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button current_status;
    private Button past_logs;
    private static final String LOG_TAGGER = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAGGER, "Status button clicked!");
        Intent second_intent = new Intent(this, SecondActivity.class);
        startActivity(second_intent);
    }

    public void launchThirdActivity(View view) {
        Log.d(LOG_TAGGER, "Log button clicked!");
        Intent third_intent = new Intent(this, ThirdActivity.class);
        startActivity(third_intent);
    }
}
