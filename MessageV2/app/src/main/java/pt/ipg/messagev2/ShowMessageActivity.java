package pt.ipg.messagev2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        TextView textViewMessage = (TextView) findViewById(R.id.textViewMessage);
        TextView textViewDate = (TextView) findViewById(R.id.textViewDate);

        textViewMessage.setText(AppData.message);
        textViewDate.setText(AppData.date.toString());
    }
}
