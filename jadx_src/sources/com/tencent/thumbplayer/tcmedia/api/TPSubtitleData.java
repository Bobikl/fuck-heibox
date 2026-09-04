package com.tencent.thumbplayer.tcmedia.api;

/* JADX INFO: loaded from: classes4.dex */
public class TPSubtitleData {
    public long durationMs;
    public long startPositionMs;
    public String subtitleData;
    public long trackIndex;

    public long getDurationMs() {
        return this.durationMs;
    }

    public long getStartPositionMs() {
        return this.startPositionMs;
    }

    public String getSubtitleData() {
        return this.subtitleData;
    }

    public long getTrackIndex() {
        return this.trackIndex;
    }
}
