package io.pello.android.asynctaskjsonapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
    }

    public void accessData (View view) {
        JsonAsyncTask jsonAsynTask = new JsonAsyncTask(this);
        jsonAsynTask.execute("http://wzw.io/meetup.json");
    }

    public TextView getResultTextView() {
        return resultTextView;
    }
}
