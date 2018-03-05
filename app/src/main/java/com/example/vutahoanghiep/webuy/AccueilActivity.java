package com.example.vutahoanghiep.webuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by TAHIR on 02/03/2018.
 */

public class AccueilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_accueil);

        ImageButton imgMag = (ImageButton) findViewById(R.id.imageBtnMagasin);
        imgMag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMagasins = new Intent(AccueilActivity.this, MagasinsActivity.class);
                startActivity(intentMagasins);
            }
        });
    }
}
