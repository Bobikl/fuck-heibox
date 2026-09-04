package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public class AudioEncodeParams {
    private int mBitrate;
    private int mBitsPerChannel;
    private int mChannels;
    private int mSampleRate;

    public AudioEncodeParams() {
    }

    public AudioEncodeParams(AudioEncodeParams audioEncodeParams) {
        if (audioEncodeParams == null) {
            return;
        }
        this.mChannels = audioEncodeParams.mChannels;
        this.mSampleRate = audioEncodeParams.mSampleRate;
        this.mBitsPerChannel = audioEncodeParams.mBitsPerChannel;
        this.mBitrate = audioEncodeParams.mBitrate;
    }

    public int getBitrate() {
        return this.mBitrate;
    }

    public int getBitsPerChannel() {
        return this.mBitsPerChannel;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public void setBitrate(int i10) {
        this.mBitrate = i10;
    }

    public void setBitsPerChannel(int i10) {
        this.mBitsPerChannel = i10;
    }

    public void setChannels(int i10) {
        this.mChannels = i10;
    }

    public void setSampleRate(int i10) {
        this.mSampleRate = i10;
    }
}
