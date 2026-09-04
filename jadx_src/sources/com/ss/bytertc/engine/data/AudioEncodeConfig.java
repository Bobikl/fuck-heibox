package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class AudioEncodeConfig {
    public int channelNum;
    public int codecType;
    public int encBitrate;
    public int encMode;
    public int packetSize;
    public int sampleRate;
    public int useDtx;
    public int useInbandfec;

    public AudioEncodeConfig() {
        this.codecType = -1;
        this.encMode = -1;
        this.channelNum = -1;
        this.encBitrate = -1;
        this.useDtx = -1;
        this.useInbandfec = -1;
        this.sampleRate = -1;
        this.packetSize = -1;
    }

    public AudioEncodeConfig(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.codecType = i10;
        this.encMode = i11;
        this.channelNum = i12;
        this.encBitrate = i13;
        this.useDtx = i14;
        this.useInbandfec = i15;
        this.sampleRate = i16;
        this.packetSize = i17;
    }

    public String toString() {
        return "AudioEncodeConfig{codecType='" + this.codecType + "'encMode='" + this.encMode + "', channelNum='" + this.channelNum + "', encBitrate='" + this.encBitrate + "', useDtx='" + this.useDtx + "', useInbandfec='" + this.useInbandfec + "', sampleRate='" + this.sampleRate + "', packetSize='" + this.packetSize + "'}";
    }
}
