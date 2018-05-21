package pt.ipg.message;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class ShowMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.MESSAGE);
        Date date = (Date) intent.getSerializableExtra(MainActivity.DATE);

        TextView textViewMessage = (TextView) findViewById(R.id.textViewMessage);
        TextView textViewDate = (TextView) findViewById(R.id.textViewDate);

        textViewMessage.setText(message);
        textViewDate.setText(date.toString());

        //Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
