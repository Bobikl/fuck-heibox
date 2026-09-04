package com.ss.bytertc.audio.device.hwearback;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public class SlientPlayer {
    private static final String TAG = "SlientPlayer";
    private PlaybackThread mPlaybackThread;
    private AudioTrack mTrack = null;
    private int mSampleRate = 44100;
    private int mChannelConfig = 12;
    private int mAudioFormat = 2;
    private boolean mRequireDeepBuffer = false;
    private boolean mIsPlaying = false;
    private int mTrackBufSize = AudioTrack.getMinBufferSize(44100, 12, 2);

    public class PlaybackThread extends Thread {
        private boolean isStop = false;

        PlaybackThread() {
        }

        public synchronized void closeThread() {
            try {
                notify();
                this.isStop = true;
                interrupt();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioTrack audioTrack;
            Log.v(SlientPlayer.TAG, "createAudioTrack with: " + SlientPlayer.this.mSampleRate + ", " + SlientPlayer.this.mChannelConfig + ", " + SlientPlayer.this.mAudioFormat + ", " + SlientPlayer.this.mTrackBufSize + ", " + SlientPlayer.this.mRequireDeepBuffer);
            if (!SlientPlayer.this.mRequireDeepBuffer || Build.VERSION.SDK_INT < 26) {
                audioTrack = new AudioTrack(3, SlientPlayer.this.mSampleRate, SlientPlayer.this.mChannelConfig, SlientPlayer.this.mAudioFormat, SlientPlayer.this.mTrackBufSize, 1);
            } else {
                audioTrack = new AudioTrack.Builder().setAudioFormat(new AudioFormat.Builder().setSampleRate(SlientPlayer.this.mSampleRate).setChannelMask(SlientPlayer.this.mChannelConfig).setEncoding(SlientPlayer.this.mAudioFormat).build()).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).build()).setBufferSizeInBytes(SlientPlayer.this.mTrackBufSize).setPerformanceMode(2).build();
            }
            audioTrack.play();
            int i10 = SlientPlayer.this.mTrackBufSize;
            byte[] bArr = new byte[i10];
            while (!this.isStop && !isInterrupted()) {
                try {
                    audioTrack.write(bArr, 0, i10);
                } catch (Exception unused) {
                }
            }
            audioTrack.stop();
            audioTrack.flush();
            audioTrack.release();
        }
    }

    public SlientPlayer() {
        Log.v(TAG, "SlientPlayer: playBufSize = " + this.mTrackBufSize);
    }

    public boolean isPlaying() {
        return this.mIsPlaying;
    }

    public void play() {
        if (this.mIsPlaying) {
            return;
        }
        Log.v(TAG, "play");
        if (this.mPlaybackThread == null) {
            this.mIsPlaying = true;
            PlaybackThread playbackThread = new PlaybackThread();
            this.mPlaybackThread = playbackThread;
            playbackThread.start();
        }
    }

    public void setRequireDeepBuffer(boolean z10) {
        Log.v(TAG, "requireDeepBuffer" + z10);
        this.mRequireDeepBuffer = z10;
    }

    public void setSampleRate(int i10) {
        this.mSampleRate = i10;
    }

    public void stop() {
        Log.v(TAG, "stop");
        PlaybackThread playbackThread = this.mPlaybackThread;
        if (playbackThread != null) {
            this.mIsPlaying = false;
            playbackThread.closeThread();
            this.mPlaybackThread = null;
        }
    }
}
