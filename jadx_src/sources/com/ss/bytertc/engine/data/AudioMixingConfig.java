package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class AudioMixingConfig {
    public long callbackOnProgressInterval;
    public int playCount;
    public int position;
    public boolean syncProgressToRecordFrame;
    public AudioMixingType type;

    public AudioMixingConfig(AudioMixingType audioMixingType, int i10) {
        this(audioMixingType, i10, 0, 0L);
    }

    public AudioMixingConfig(AudioMixingType audioMixingType, int i10, int i11, long j10) {
        this.syncProgressToRecordFrame = false;
        this.type = audioMixingType;
        this.playCount = i10;
        this.position = i11;
        this.callbackOnProgressInterval = j10;
    }

    public String toString() {
        return "AudioMixingConfig{type='" + this.type + "', playCount='" + this.playCount + "', pos='" + this.position + "', callbackOnProgressInterval='" + this.callbackOnProgressInterval + "'}";
    }
}
