package com.example.videoviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;                //비디오를 실행할 수 있게 도와는 뷰
    private MediaController mediaController;    //재생이나 정지와 같은 미디어 제어 대부분을 담당
    private String videoURL = "http: //www.radiantmediaplayer.com/media/bbb-360p.mp4";


    @Override
    protected void onCreate(Bundle savedInstanceState) {    //앱이 첫실행 되었을 때 이곳을 수행합니다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);           // 비디오 아이디 연결
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse(videoURL);
        videoView.setMediaController(mediaController);      //미디어 제어 버튼부 세팅
        videoView.setVideoURI(uri);                         //미디어 뷰의 주소를 설정
        videoView.start();                                  //비디오 뷰 실행

    }
}