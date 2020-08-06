package sg.edu.rp.c347.id18016094.p12_mydatabook;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AboutPage extends AppCompatActivity {
    ActionBar ab;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        img = findViewById(R.id.imgView);
        String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        Picasso.with(getApplicationContext()).load(imageUrl).into(img);
    }
}
