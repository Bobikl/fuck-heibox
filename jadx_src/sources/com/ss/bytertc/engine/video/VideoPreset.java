package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public class VideoPreset {
    private int bandwidth;
    private int fps;
    private int height;
    private int width;

    public VideoPreset(int i10, int i11, int i12, int i13) {
        this.width = i10;
        this.height = i11;
        this.fps = i12;
        this.bandwidth = i13;
    }

    public int getBandwidth() {
        return this.bandwidth;
    }

    public int getFps() {
        return this.fps;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
