package ph.edu.iicsust.cordova.andreicharls.lab1_highernumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonCompare);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumText = (EditText) findViewById(R.id.firstNumText);
                EditText secondNumText = (EditText) findViewById(R.id.secondNumText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumText.getText().toString());
                int num2 = Integer.parseInt(secondNumText.getText().toString());

                if(num1 > num2) {
                    resultTextView.setText(num1 + " is higher than " + num2);
                } else if(num2 > num1) {
                    resultTextView.setText(num2 + " is higher than " + num1);
                } else {
                    resultTextView.setText("Both #s are equal");
                }
            }
        });
    }
}
