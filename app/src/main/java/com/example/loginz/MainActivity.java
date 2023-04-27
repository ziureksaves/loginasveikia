package com.example.loginz;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginbutton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginbutton = findViewById(R.id.loginButton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this, "Prisijungimas sekmingas!", Toast.LENGTH_SHORT).show();
                    String username2 = username.getText().toString();
                    String password2 = password.getText().toString();
                    Toast.makeText(MainActivity.this, "Username: " + username2 + "\n" + "Password: " + password2, Toast.LENGTH_SHORT).show();

                    Intent gotoRegisterActivity = new Intent(MainActivity.this, RegisterActivity.class);
                    startActivity(gotoRegisterActivity);
                } else {
                    Toast.makeText(MainActivity.this, "Prisijungimas nesekmingas!", Toast.LENGTH_SHORT).show();
                }
                Button button=findViewById(R.id.button2);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent CregisterActivity = new Intent(MainActivity.this,CregisterActivity.class);
                        startActivity(CregisterActivity);
                    }
                });
            }
        });
    }
}