package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView notice = findViewById(R.id.textView);

        EditText zx = findViewById(R.id.zx);
        EditText ze = findViewById(R.id.ze);


        Button button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String notice3 = "put your name please" ;
                String notice2 = "Kindlyfill the your age";


                if (zx.getText().toString().equals("")) {

                    notice.setText(notice2);

                }else
                if (ze.getText().toString().equals("")){

                    notice.setText(notice3);

                }else{
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    String assad2 = zx.getText().toString();
                    int old = Integer.parseInt(ze.getText().toString());
                    String name = ze.getText().toString();

                    intent.putExtra("item1", assad2);
                    intent.putExtra("Item2", old );
                    startActivity(intent);
                }



            }


        });






    }
}