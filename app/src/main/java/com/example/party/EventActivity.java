package com.example.party;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        TextView name = findViewById(R.id.Ename);
        TextView desc = findViewById(R.id.Desc);
        ImageView back = findViewById(R.id.background);
        Button button = findViewById(R.id.button2);
        ImageView img = findViewById(R.id.imageView9);

        Bundle arguments = getIntent().getExtras();
        name.setText(arguments.getString("name"));
        desc.setMaxLines(4);
        desc.setText(arguments.getString("desc"));
        back.setImageResource(arguments.getInt("img"));

        final Intent intent = new Intent(this, MainActivity.class);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Готово", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}


