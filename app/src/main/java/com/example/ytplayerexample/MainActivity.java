package com.example.ytplayerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    public static String API_KEY = "AIzaSyCOooUDGzIJogvFGBXTJNmowwftSmKNXtI";

    YouTubePlayerView playerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        playerView = findViewById(R.id.youtube_view);

        playerView.initialize(API_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                                YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.cueVideo("OCg6BWlAXSw");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        });

        //TextView tv = (TextView) findViewById(R.id.tv);
        //Typeface face = Typeface.createFromAsset(getAssets(),
          //      "assets/myfont.ttf");
        //tv.setTypeface(face);

    }
}
