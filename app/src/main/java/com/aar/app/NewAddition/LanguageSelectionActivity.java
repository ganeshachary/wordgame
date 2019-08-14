package com.aar.app.NewAddition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.aar.app.wordsearch.R;

public class LanguageSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);
    }

    public void englishClicked(View view) {
        startActivity(new Intent(LanguageSelectionActivity.this,LevelSelectionActiivity.class));
       // Toast.makeText(LanguageSelectionActivity.this,"English Selected",Toast.LENGTH_SHORT).show();
    }

    public void teluguClicked(View view) {
        Toast.makeText(LanguageSelectionActivity.this,"Telugu Selected",Toast.LENGTH_SHORT).show();
    }

    public void settingClicked(View view) {
        Toast.makeText(LanguageSelectionActivity.this,"Setting Selected",Toast.LENGTH_SHORT).show();
    }


}
