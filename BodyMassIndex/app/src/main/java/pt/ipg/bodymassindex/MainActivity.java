package pt.ipg.bodymassindex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         }

        public void calculateMass(View view) {

        EditText editHeightText = findViewById(R.id.editHeightText);
        EditText editWeightText = findViewById(R.id.editWeightText);
        EditText editResultText=findViewById(R.id.editResultText);


        editResultText = (editWeightText * editWeightText) / (editHeightText);
        Intent intent = new Intent(this, editResultText);

            startActivity(intent);
        }


}
