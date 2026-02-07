package amlanjy.videoplayer;

import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);
        
        // This creates the Play/Pause buttons automatically
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
    }
}
