package com.aruvansh.catalogue;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Aruvansh on 31/12/17.
 */

public class NewActivity extends AppCompatActivity {

    ImageButton button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontpage);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (ImageButton) findViewById(R.id.front);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);  //name of the class where you want to go
                startActivity(intent);

            }

        });

    }

}


