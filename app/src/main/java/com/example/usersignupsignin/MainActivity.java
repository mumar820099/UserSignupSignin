package com.example.usersignupsignin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void moveToSignUpPage(View view)
    {
        try
        {
            startActivity(new Intent(this,SignupActivity.class));
        }
        catch (Exception e)
        {
            Toast.makeText(this, "moveToSignUpPage:"
                    +e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void moveToSignInPage(View view)
    {
        try
        {
            startActivity(new Intent(this,LoginActivty.class));
        }
        catch (Exception e)
        {
            Toast.makeText(this, "moveToSignUpPage:"
                    +e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
