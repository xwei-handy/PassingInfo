package xizz.passinginfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Address address = new Address();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display = (TextView) findViewById(R.id.mainActivityText);
        display.setText(address.toString());
    }

    public void launch(View view) {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
}
