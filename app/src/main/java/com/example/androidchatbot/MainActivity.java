package com.example.androidchatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView responseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        editText = findViewById(R.id.message_input);
        button = findViewById(R.id.message_send);
        responseText = findViewById(R.id.response_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUserMessage();
            }
        });

    }

//    private void sendUserMessage(){
//        //Obtain an instance of Retrofit by calling the static method.
//        Retrofit retrofit = NetworkClient.getRetrofitClient();
//
//    }


}
