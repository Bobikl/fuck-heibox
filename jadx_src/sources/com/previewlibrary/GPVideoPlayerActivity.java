package com.previewlibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes6.dex */
public class GPVideoPlayerActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    VideoView f96285b;

    public class a implements MediaPlayer.OnErrorListener {
        a() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            Toast.makeText(GPVideoPlayerActivity.this, R.string.Playback_failed, 0).show();
            return false;
        }
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GPVideoPlayerActivity.class);
        intent.putExtra("url", str);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_gpvideoplayer);
        VideoView videoView = (VideoView) findViewById(R.id.gpVideo);
        this.f96285b = videoView;
        videoView.setVideoPath(getIntent().getStringExtra("url"));
        this.f96285b.setOnErrorListener(new a());
        this.f96285b.start();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f96285b.stopPlayback();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f96285b.pause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f96285b.isPlaying()) {
            return;
        }
        this.f96285b.start();
    }
}
