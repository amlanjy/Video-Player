package amlanjy.videoplayer;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);

        // 1. Setup the "Remote Control" (Play/Pause/Seek bar)
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // 2. Point to the OFFLINE video file in res/raw
        // Note: We use the filename "video_file" without the .mp4 extension
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video_file;
        
        // 3. Tell the player where the file is and start it
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}
