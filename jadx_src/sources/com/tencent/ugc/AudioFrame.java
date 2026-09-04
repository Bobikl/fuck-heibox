package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::ugc")
public class AudioFrame {
    private int mChannels;
    private AudioCodecFormat mCodecFormat;
    private ByteBuffer mData;
    private int mSampleRate;
    private long mTimestampMs;

    public enum AudioCodecFormat {
        UNKNOWN(0),
        PCM(99),
        AAC(10);

        private final int mValue;

        AudioCodecFormat(int i10) {
            this.mValue = i10;
        }

        public final int getValue() {
            return this.mValue;
        }
    }

    public int getChannelCount() {
        return this.mChannels;
    }

    public AudioCodecFormat getCodecFormat() {
        return this.mCodecFormat;
    }

    public ByteBuffer getData() {
        return this.mData;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public long getTimestamp() {
        return this.mTimestampMs;
    }

    public boolean isValidFrame() {
        ByteBuffer byteBuffer = this.mData;
        return byteBuffer != null && byteBuffer.remaining() > 0 && this.mCodecFormat != null && this.mSampleRate > 0 && this.mChannels > 0;
    }

    public void setChannelCount(int i10) {
        this.mChannels = i10;
    }

    public void setCodecFormat(AudioCodecFormat audioCodecFormat) {
        this.mCodecFormat = audioCodecFormat;
    }

    public void setData(ByteBuffer byteBuffer) {
        this.mData = byteBuffer;
    }

    public void setSampleRate(int i10) {
        this.mSampleRate = i10;
    }

    public void setTimestamp(long j10) {
        this.mTimestampMs = j10;
    }
}
