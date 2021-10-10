package com.kipkoech.score;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class signActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.editTextTextPersonName) EditText userName;
    @BindView(R.id.editTextTextEmailAddress2) EditText userEmail;
    @BindView(R.id.submit) Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        ButterKnife.bind(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = userName.getText().toString();
                Log.d(TAG, username);
                String email = userEmail.getText().toString();
                Log.d(TAG, email);
                if ((username.equals("Aron"))  && (email.equals("aron@gmail.com"))){
                    Intent intent = new Intent(signActivity.this, livescore.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(signActivity.this,"Wrong info",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}