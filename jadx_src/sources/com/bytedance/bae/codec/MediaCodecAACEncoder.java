package com.bytedance.bae.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXLogging;
import com.google.android.exoplayer2.util.y;
import com.google.android.gms.common.m;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class MediaCodecAACEncoder {
    private static final int MAX_WAITING_TIME = 300;
    private static final String TAG = "MediaCodecAACEncoder";
    private MediaCodec.BufferInfo mBufferInfo;

    @p0
    private byte[] mEncodedData;
    private ByteBuffer[] mInputBuffers;
    private ByteBuffer[] mOutputBuffers;
    private String mMimeType = y.A;
    private int mSampleRate = 44100;
    private int mChannels = 1;
    private int mProfile = 2;
    private int mBitrate = 64000;
    private int mFrameSize = 1024;
    private MediaCodec mAACEncoder = null;

    @CalledByNative
    MediaCodecAACEncoder() {
        RXLogging.e(TAG, "MediaCodecAAC Encoder Created");
    }

    @CalledByNative
    public void closeEncoder() {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACEncoder.release();
                this.mAACEncoder = null;
                RXLogging.e(TAG, "close AAC encoder success");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            RXLogging.e(TAG, "close AAC encoder failed");
        }
    }

    @CalledByNative
    public boolean configAndStartEncoder() {
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            mediaFormatCreateAudioFormat.setInteger("bitrate", this.mBitrate);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", this.mProfile);
            mediaFormatCreateAudioFormat.setInteger(m.f52595a, this.mProfile);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", this.mChannels * this.mFrameSize * 100);
            this.mAACEncoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            RXLogging.e(TAG, "config AAC encoder success");
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            RXLogging.e(TAG, "Config and Start Encoder Error");
            return false;
        }
    }

    @CalledByNative
    public boolean encodeProcess(byte[] bArr) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mEncodedData = null;
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(300L);
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mAACEncoder.getInputBuffer(iDequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.mAACEncoder.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, 0L, 0);
            }
            int iDequeueOutputBuffer = this.mAACEncoder.dequeueOutputBuffer(this.mBufferInfo, 0L);
            MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
            int i10 = bufferInfo.size;
            int i11 = bufferInfo.flags & 2;
            if (i10 > 0 && iDequeueOutputBuffer >= 0) {
                if (i11 == 2) {
                    this.mAACEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    return true;
                }
                ByteBuffer outputBuffer = this.mAACEncoder.getOutputBuffer(iDequeueOutputBuffer);
                byte[] bArr2 = new byte[i10];
                this.mEncodedData = bArr2;
                outputBuffer.get(bArr2, this.mBufferInfo.offset, i10);
                outputBuffer.clear();
                this.mAACEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            RXLogging.e(TAG, "AAC Encoder Encode failed");
            return false;
        }
    }

    @CalledByNative
    @p0
    public byte[] getEncodedData() {
        return this.mEncodedData;
    }

    @CalledByNative
    public int getFrameSize() {
        return this.mFrameSize;
    }

    @CalledByNative
    public boolean openEncoder() {
        try {
            this.mAACEncoder = MediaCodec.createEncoderByType(this.mMimeType);
            RXLogging.e(TAG, "open AAC encoder success");
            return this.mAACEncoder != null;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.mAACEncoder = null;
            RXLogging.e(TAG, "Open AAC encoder failed");
            return false;
        }
    }

    @CalledByNative
    public void setBitRateValue(int i10) {
        this.mBitrate = i10;
    }

    @CalledByNative
    public boolean setBitrate(int i10) {
        try {
            MediaCodec mediaCodec = this.mAACEncoder;
            if (mediaCodec == null) {
                return false;
            }
            mediaCodec.stop();
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            mediaFormatCreateAudioFormat.setInteger("bitrate", i10);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", this.mProfile);
            this.mAACEncoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAACEncoder.start();
            this.mBitrate = i10;
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            RXLogging.e(TAG, "Config and Start Encoder Error");
            return false;
        }
    }

    @CalledByNative
    public void setChannelsValue(int i10) {
        this.mChannels = i10;
    }

    @CalledByNative
    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
            this.mFrameSize = 2048;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
            this.mFrameSize = 2048;
        } else {
            this.mProfile = 2;
            this.mFrameSize = 1024;
        }
    }

    @CalledByNative
    public void setSampeRateValue(int i10) {
        this.mSampleRate = i10;
    }
}
