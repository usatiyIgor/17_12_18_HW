package com.example.den.a17_12_18_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText name;
    private EditText phoneNumber;
    private EditText email;
    private EditText about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.my_btn);
        name = findViewById(R.id.input_name);
        phoneNumber = findViewById(R.id.input_tnumber);
        email = findViewById(R.id.input_email);
        about = findViewById(R.id.input_aboutMe);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.my_btn) {
            String TAG = "myLog";
            String str = "Name: " + String.valueOf(name.getText()) + "\n" +
                    "Phone: " + String.valueOf(phoneNumber.getText()) + "\n" +
                    "Email: " + String.valueOf(email.getText()) + "\n" +
                    "About: " + String.valueOf(about.getText()) + "\n";
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
            Log.d(TAG, str);
        }
    }
}
