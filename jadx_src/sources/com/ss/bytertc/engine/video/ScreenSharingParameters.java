package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public class ScreenSharingParameters {
    public int bitrate;
    public int frameRate;
    public int maxHeight;
    public int maxWidth;
    public int minBitrate;

    public ScreenSharingParameters() {
        this.maxWidth = 0;
        this.maxHeight = 0;
        this.frameRate = 15;
        this.bitrate = -1;
        this.minBitrate = 0;
    }

    public ScreenSharingParameters(int i10, int i11, int i12, int i13, int i14) {
        this.maxHeight = i11;
        this.maxWidth = i10;
        this.frameRate = i12;
        this.bitrate = i13;
        this.minBitrate = i14;
    }
}
