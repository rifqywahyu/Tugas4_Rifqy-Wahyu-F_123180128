package com.example.tugas_4_rifqy_wahyu_123180128;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText etUsername, etPassword;
    private Button btnLogin;

    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "my_pref";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        String sUsername = sharedPreferences.getString(KEY_USERNAME, null);

        if (sUsername != null) {
            Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
            startActivity(intent);
            finish();
        }
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                if (TextUtils.isEmpty(etUsername.getText())){
                    etUsername.setError( "Username is required!" );
                }

                if (TextUtils.isEmpty(etPassword.getText())){
                    etPassword.setError( "Password is required!" );
                }

                if(!TextUtils.isEmpty(etUsername.getText()) && !TextUtils.isEmpty(etPassword.getText())){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(KEY_USERNAME,etUsername.getText().toString());
                    editor.apply();

                    Toast.makeText(getApplicationContext(),"Login Berhasil!",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                    startActivity(intent);
                    finish();
                }
        }
    }
}