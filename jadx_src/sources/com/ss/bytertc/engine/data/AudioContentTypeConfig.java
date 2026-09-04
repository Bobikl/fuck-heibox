package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class AudioContentTypeConfig {
    public boolean hasMediaPlayer;
    public boolean hasMic;
    public boolean hasScreenAudio;

    public AudioContentTypeConfig() {
        this.hasMic = false;
        this.hasScreenAudio = false;
        this.hasMediaPlayer = false;
    }

    public AudioContentTypeConfig(boolean z10, boolean z11, boolean z12) {
        this.hasMic = z10;
        this.hasScreenAudio = z11;
        this.hasMediaPlayer = z12;
    }

    public String toString() {
        return "AudioContentTypeConfig{hasMic='" + this.hasMic + "', hasScreenAudio='" + this.hasScreenAudio + "', hasMediaPlayer='" + this.hasMediaPlayer + "'}";
    }
}
