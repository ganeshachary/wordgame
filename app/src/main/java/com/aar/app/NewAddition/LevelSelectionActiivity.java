package com.aar.app.NewAddition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aar.app.wordsearch.R;
import com.aar.app.wordsearch.features.gameplay.GamePlayActivity;
import com.aar.app.wordsearch.features.mainmenu.MainMenuActivity;

import butterknife.BindArray;
import butterknife.ButterKnife;

public class LevelSelectionActiivity extends AppCompatActivity {


    @BindArray(R.array.game_round_dimension_values)
    int[] mGameRoundDimVals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection_actiivity);
        ButterKnife.bind(this);
    }


    public void openMainScreen(int level)
    {
        int dim = mGameRoundDimVals[ level ];
        Intent intent = new Intent(LevelSelectionActiivity.this, GamePlayActivity.class);
        intent.putExtra(GamePlayActivity.EXTRA_ROW_COUNT, dim);
        intent.putExtra(GamePlayActivity.EXTRA_COL_COUNT, dim);
        startActivity(intent);
        finish();
    }

    public void hardClicked(View view) {
        openMainScreen(2);


    }

    public void mediumClicked(View view) {
        openMainScreen(1);
    }

    public void easyClicked(View view) {
        openMainScreen(0);
    }
}
