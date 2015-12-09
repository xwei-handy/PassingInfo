package xizz.passinginfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Person person = intent.getParcelableExtra("person");
        TextView display = (TextView) findViewById(R.id.textView);
        display.setText(person.toString());
    }
}
