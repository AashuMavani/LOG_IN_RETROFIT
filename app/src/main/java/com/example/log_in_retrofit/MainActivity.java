package com.example.log_in_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button button;
    String n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=email.getText().toString();
                n2=password.getText().toString();
                Instance_Class.callAPI().singUpUser("" + n1, "" + n2).enqueue(new Callback<Model_Login_User>() {
                    @Override
                    public void onResponse(Call<Model_Login_User> call, Response<Model_Login_User> response) {

                        Log.d("TTT", "onResponse: " + response.body());
                        if (response.body().connection == 1) {

                            if (response.body().result == 1) {

                                Log.d("TTT", "onResponse:login  ");
                                Toast.makeText(MainActivity.this, "User Login", Toast.LENGTH_LONG).show();
                            }
                            else {
                            Log.d("TTT", "Not Login..");
                            Toast.makeText(MainActivity.this, "User not Login", Toast.LENGTH_LONG).show();
                        }
                    }else {
                            Log.d("TTT", "Something went Wrong..!");
                            Toast.makeText(MainActivity.this, "Something went Wrong..!", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Model_Login_User> call, Throwable t) {
                        Log.e("TTT", "onError: =" + t.getLocalizedMessage());
                        Toast.makeText(MainActivity.this, "Error" , Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


    }
}