package pt.ipg.messagev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editTextMessage = (EditText) findViewById(R.id.editTextMessage);

        AppData.message = editTextMessage.getText().toString();
        AppData.date = new Date();

        if (AppData.message.trim().isEmpty()) {
            editTextMessage.setError("Please enter a message");
            return;
        }

        Intent intent = new Intent(this, ShowMessageActivity.class);

        startActivity(intent);
    }
}
