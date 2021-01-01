package org.aplas.animaltour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InvertActivity extends AppCompatActivity {
    private ImageView insectPic;
    private ImageView arachnidPic;
    private ImageView molluscPic;
    private ImageView crustaceanPic;
    private ImageView mediaButton;
    private ImageView finishBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invert);

        insectPic = (ImageView) findViewById(R.id.insectPic);
        arachnidPic = (ImageView) findViewById(R.id.arachnidPic);
        crustaceanPic = (ImageView) findViewById(R.id.crustaceanPic);
        molluscPic = (ImageView) findViewById(R.id.molluscPic);
        mediaButton = (ImageView) findViewById(R.id.mediaButton);
        finishBtn = (ImageView) findViewById(R.id.finishButton);

        insectPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubInvertActivity.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                InvertActivity.this, insectPic, ViewCompat.getTransitionName(insectPic));
                startActivity(intent, options.toBundle());
            }
        });
        arachnidPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubInvertActivity.class);
                intent.putExtra("TITLE_ANIMAL", "Arachnids");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                InvertActivity.this, arachnidPic, ViewCompat.getTransitionName(arachnidPic));
                startActivity(intent, options.toBundle());
            }
        });
        molluscPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubInvertActivity.class);
                intent.putExtra("TITLE_ANIMAL", "Molluscs");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                InvertActivity.this, molluscPic, ViewCompat.getTransitionName(molluscPic));
                startActivity(intent, options.toBundle());
            }
        });
        crustaceanPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubInvertActivity.class);
                intent.putExtra("TITLE_ANIMAL", "Crustaceans");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                InvertActivity.this, crustaceanPic, ViewCompat.getTransitionName(crustaceanPic));
                startActivity(intent, options.toBundle());
            }
        });
        mediaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MediaActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }
        });
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }
        });
    }
}