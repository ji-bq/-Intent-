package com.example.lsx.impintentactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mDailButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDailButton = (Button) findViewById(R.id.impinten_button);
        mDailButton.setOnClickListener(new View.OnClickListener(){
         @Override
          public void onClick(View v) {

           /*  Uri number = Uri.parse("tel:1558888888");
             Intent callIntent = new Intent(Intent.ACTION_DIAL,number);
           */
             Uri Webpage = Uri.parse("http://www.baidu.com");
             Intent WebIntent = new Intent(Intent.ACTION_VIEW,Webpage);
             startActivity(WebIntent);

            }
                                       }
        );
        }
    }
