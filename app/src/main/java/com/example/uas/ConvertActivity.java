package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConvertActivity extends AppCompatActivity {
    double result,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.convert);
        EditText celciusInput = (EditText) findViewById(R.id.celcius);
        EditText resultFahrenheit = (EditText) findViewById(R.id.resultFahrenheit);
        Button btnConvert = (Button) findViewById(R.id.convertBtn);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(celciusInput.getWindowToken(), 0);
                String celcius = celciusInput.getText().toString();
                if(celcius.isEmpty()) {
                    Toast.makeText(ConvertActivity.this,R.string.app_toast_celcius,Toast.LENGTH_SHORT).show();
                } else {
                    c = Double.parseDouble(celcius);
                    result = (1.8*c) + 32;
                    String r = String.valueOf(result);
                    String Fahrenheit = r.toString();
                    resultFahrenheit.setText(Fahrenheit);
                }
            }
        });
    }

    public void closeThisActivity(View v) {
        finish();
    }
}