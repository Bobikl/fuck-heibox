package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class MediaPlayerConfig {
    public boolean autoPlay;
    public long callbackOnProgressInterval;
    public int playCount;
    public int startPos;
    public boolean syncProgressToRecordFrame;
    public AudioMixingType type;

    public MediaPlayerConfig() {
        this.type = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        this.playCount = 1;
        this.startPos = 0;
        this.callbackOnProgressInterval = 0L;
        this.syncProgressToRecordFrame = false;
        this.autoPlay = true;
    }

    public MediaPlayerConfig(AudioMixingType audioMixingType, int i10) {
        this(audioMixingType, i10, 0, true, 0L, false);
    }

    public MediaPlayerConfig(AudioMixingType audioMixingType, int i10, int i11, boolean z10, long j10, boolean z11) {
        AudioMixingType audioMixingType2 = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        this.type = audioMixingType;
        this.playCount = i10;
        this.startPos = i11;
        this.autoPlay = z10;
        this.syncProgressToRecordFrame = z11;
        this.callbackOnProgressInterval = j10;
    }

    public String toString() {
        return "MediaPlayerConfig{type='" + this.type + "', playCount='" + this.playCount + "', startPos='" + this.startPos + "', autoPlay='" + this.autoPlay + "', syncProgressToRecordFrame='" + this.syncProgressToRecordFrame + "', callbackOnProgressInterval='" + this.callbackOnProgressInterval + "'}";
    }
}
