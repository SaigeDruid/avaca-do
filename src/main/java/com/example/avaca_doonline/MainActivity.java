package com.example.avaca_doonline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText Email;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private Switch SaveLogin;

    public static final String SHARED_PREFS = "shared prefs";
    public static final String SAVE_LOGIN = "save login";
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";

    private String email;
    private String password;
    private boolean SwitchOnOff;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.etEmail);
        Password = findViewById(R.id.etPassword);
        Login = findViewById(R.id.btnLogin);
        Info = findViewById(R.id.tvInfo);
        SaveLogin = findViewById(R.id.swSaveLogin);

        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                validate(Email.getText().toString(), Password.getText().toString());
            }
        });

        SaveLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                saveData();
            }
        });

        loadData();
        updateViews();


    }



    private void validate(String userName, String userPassword)
    {
        if(userName.equals("test@avaca-do.com") && userPassword.equals("12345"))
        {
            Intent intent = new Intent(MainActivity.this, UserInfo.class);
            startActivity(intent);
        }
        else
        {
            Info.setText("Invalid Email or Password. Try Again.");
        }
    }

    public void saveData()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(EMAIL, Email.getText().toString());
        editor.putString(PASSWORD, Password.getText().toString());
        editor.putBoolean(SAVE_LOGIN, SaveLogin.isChecked());

        editor.apply();
    }

    public void loadData()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        email = sharedPreferences.getString(EMAIL, "");
        password = sharedPreferences.getString(PASSWORD, "");
        SwitchOnOff = sharedPreferences.getBoolean(SAVE_LOGIN, false);
    }

    public void updateViews()
    {
        Email.setText(email);
        Password.setText(password);
        SaveLogin.setChecked(SwitchOnOff);
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }
}//end class
