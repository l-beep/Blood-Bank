package activities;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Bundle;
import android.widget.ImageView;

import com.lovineoduor.bloodbank.R;


public class SplashActivity extends AppCompatActivity {

    protected ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView = findViewById(R.id.load_image);

        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
        animationDrawable.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }

            private void startActivity(Intent intent) {
            }

            private String getApplicationContext() {
                return null;
            }
        }, 2000);
    }

    private ImageView findViewById(int load_image) {
        return null;
    }

    private void setContentView(int activity_splash) {
        
    }
}
