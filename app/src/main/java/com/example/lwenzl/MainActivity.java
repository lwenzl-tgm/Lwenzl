package com.example.lwenzl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view){
        TextView name_input = findViewById(R.id.name2);
        TextView address_input = findViewById(R.id.adresse_input);
        TextView bday_input = findViewById(R.id.bday_input);

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("name", name_input.getText().toString());
        i.putExtra("address", address_input.getText().toString());
        i.putExtra("bday", bday_input.getText().toString());
        startActivity(i);
    }

    public void cancel(View view){
        EditText name_input = findViewById(R.id.name2);
        EditText address_input = findViewById(R.id.adresse_input);
        EditText bday_input = findViewById(R.id.bday_input);

        name_input.setText("");
        address_input.setText("");
        bday_input.setText("");
    }
}
