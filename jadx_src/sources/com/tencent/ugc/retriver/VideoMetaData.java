package com.tencent.ugc.retriver;

import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class VideoMetaData {
    private long mAudioBitrate;
    private long mAudioDuration;
    private int mChannels;
    private float mFps;
    private int mHeight;
    private int mRotation;
    private int mSampleRate;
    private long mVideoBitrate;
    private long mVideoDuration;
    private String mVideoMimeType;
    private int mWidth;

    public long getAudioBitrate() {
        return this.mAudioBitrate;
    }

    public long getAudioDuration() {
        return this.mAudioDuration;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public float getFps() {
        return this.mFps;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public long getVideoBitrate() {
        return this.mVideoBitrate;
    }

    public long getVideoDuration() {
        return this.mVideoDuration;
    }

    public String getVideoMimeType() {
        return this.mVideoMimeType;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setAudioBitrate(long j10) {
        this.mAudioBitrate = j10;
    }

    public void setAudioDuration(long j10) {
        this.mAudioDuration = j10;
    }

    public void setChannels(int i10) {
        this.mChannels = i10;
    }

    public void setFps(float f10) {
        this.mFps = f10;
    }

    public void setHeight(int i10) {
        this.mHeight = i10;
    }

    public void setRotation(int i10) {
        this.mRotation = i10;
    }

    public void setSampleRate(int i10) {
        this.mSampleRate = i10;
    }

    public void setVideoBitrate(long j10) {
        this.mVideoBitrate = j10;
    }

    public void setVideoDuration(long j10) {
        this.mVideoDuration = j10;
    }

    public void setVideoMimeType(String str) {
        this.mVideoMimeType = str;
    }

    public void setWidth(int i10) {
        this.mWidth = i10;
    }

    public String toString() {
        return "FFMediaInfo{rotation=" + this.mRotation + ", width=" + this.mWidth + ", height=" + this.mHeight + ", fps=" + this.mFps + ", videoBitrate=" + this.mVideoBitrate + ", videoDuration=" + this.mVideoDuration + ", sampleRate=" + this.mSampleRate + ", channels=" + this.mChannels + ", audioBitrate=" + this.mAudioBitrate + ", audioDuration=" + this.mAudioDuration + '}';
    }
}
