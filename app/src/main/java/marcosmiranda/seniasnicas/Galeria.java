package marcosmiranda.seniasnicas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Galeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        final String EXTRA_TITLE = getString(R.string.extra_title);
        final String EXTRA_IMAGE = getString(R.string.extra_image);
        final String EXTRA_VIDEO = getString(R.string.extra_video);

        Intent intent = getIntent();
        int title = intent.getIntExtra(EXTRA_TITLE, 0);
        Uri uriImage = intent.getParcelableExtra(EXTRA_IMAGE);
        Uri uriVideo = intent.getParcelableExtra(EXTRA_VIDEO);

        final TextView txtView = findViewById(R.id.txtViewWord);
        txtView.setText(title);

        final ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageURI(uriImage);

        final VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoURI(uriVideo);
        videoView.setMediaController(new MediaController(this, false));
        videoView.start();
    }
}