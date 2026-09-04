package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class VideoRateInfo {
    public int bitrateKbps;
    public int fps;

    public VideoRateInfo(int i10, int i11) {
        this.fps = i10;
        this.bitrateKbps = i11;
    }

    public String toString() {
        return "VideoRateInfo{fps='" + this.fps + "', bitrateKbps='" + this.bitrateKbps + "'}";
    }
}
