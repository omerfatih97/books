package pt.ipg.message;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "PT.IPG.MESSAGE.MESSAGE";
    public static final String DATE = "PT.IPG.MESSAGE.DATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, ShowMessageActivity.class);

        EditText editTextMessage = (EditText) findViewById(R.id.editTextMessage);

        String message = editTextMessage.getText().toString();
        Date currentDate = new Date();

        intent.putExtra(MESSAGE, message);
        intent.putExtra(DATE, currentDate);

        startActivity(intent);
    }
}
