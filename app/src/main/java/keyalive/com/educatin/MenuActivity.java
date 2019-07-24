package keyalive.com.educatin;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import keyalive.com.educatin.R;

public class MenuActivity extends AppCompatActivity {
    MediaPlayer audioBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Memanggil file my_sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.backsound);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1, 1);
        //Memulai audio
        audioBackground.start();
    }
}
