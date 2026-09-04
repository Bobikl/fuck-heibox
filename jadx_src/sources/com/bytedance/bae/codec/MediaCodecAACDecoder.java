package com.bytedance.bae.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.RXLogging;
import com.google.android.exoplayer2.util.y;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class MediaCodecAACDecoder {
    private static final int MAX_WAITING_TIME = 300;
    private static final String TAG = "MediaCodecAACDecoder";
    private byte[] mAsc;
    private MediaCodec.BufferInfo mBufferInfo;

    @p0
    private byte[] mDecodedData;
    private ByteBuffer[] mInputBuffers;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputFormat;
    private String mMimeType = y.A;
    private int mSampleRate = 44100;
    private int mChannels = 1;
    private int mProfile = 2;
    private int mHasADTS = 0;
    private long input_ts = 0;
    private long output_ts = 0;
    private MediaCodec mAACDecoder = null;

    @CalledByNative
    MediaCodecAACDecoder() {
        RXLogging.e(TAG, "MediaCodecAAC Decoder Created");
    }

    @p0
    private void genAsc() {
        int i10;
        int i11;
        int i12 = this.mProfile;
        int i13 = 4;
        if (i12 == 2) {
            this.mAsc = new byte[2];
        } else {
            this.mAsc = new byte[4];
        }
        int i14 = this.mSampleRate;
        if (48000 == i14) {
            i10 = 6;
            i13 = 3;
        } else if (44100 == i14) {
            i10 = 7;
        } else if (32000 == i14) {
            i13 = 5;
            i10 = 8;
        } else {
            i13 = 0;
            i10 = 0;
        }
        int i15 = this.mChannels;
        if (1 == i15) {
            i11 = 1;
        } else {
            i11 = 2 == i15 ? 2 : 0;
        }
        byte b10 = (byte) i12;
        if (2 == i12) {
            byte[] bArr = this.mAsc;
            bArr[0] = (byte) ((b10 << 3) | (i13 >> 1));
            bArr[1] = (byte) ((i13 << 7) | (i11 << 3));
        } else {
            if (5 == i12) {
                byte[] bArr2 = this.mAsc;
                bArr2[0] = (byte) ((b10 << 3) | (i10 >> 1));
                bArr2[1] = (byte) ((i10 << 7) | (i11 << 3) | (i13 >> 1));
                bArr2[2] = (byte) ((i13 << 7) | 8);
                bArr2[3] = 0;
                return;
            }
            if (29 == i12) {
                byte[] bArr3 = this.mAsc;
                bArr3[0] = (byte) ((b10 << 3) | (i10 >> 1));
                bArr3[1] = (byte) ((i10 << 7) | 8 | (i13 >> 1));
                bArr3[2] = (byte) ((i13 << 7) | 8);
                bArr3[3] = 0;
            }
        }
    }

    @CalledByNative
    public void closeDecoder() {
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACDecoder.release();
                this.mAACDecoder = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            RXLogging.e(TAG, "close AAC decoder failed");
        }
    }

    @CalledByNative
    public boolean configAndStartDecoder() {
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.mMimeType, this.mSampleRate, this.mChannels);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", this.mProfile);
            mediaFormatCreateAudioFormat.setInteger("is-adts", this.mHasADTS);
            mediaFormatCreateAudioFormat.setInteger("aac-max-output-channel_count", this.mChannels);
            genAsc();
            mediaFormatCreateAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(this.mAsc));
            this.mAACDecoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            this.mAACDecoder.start();
            this.mBufferInfo = new MediaCodec.BufferInfo();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            closeDecoder();
            RXLogging.e(TAG, "Config and Start Decoder Error");
            return false;
        }
    }

    @CalledByNative
    public boolean decodeProcess(byte[] bArr) {
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec == null) {
                return false;
            }
            this.mDecodedData = null;
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(300L);
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mAACDecoder.getInputBuffer(iDequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.mAACDecoder.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, (this.input_ts * 1000000) / ((long) this.mSampleRate), 0);
            }
            int iDequeueOutputBuffer = this.mAACDecoder.dequeueOutputBuffer(this.mBufferInfo, 0L);
            MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
            int i10 = bufferInfo.size;
            if (i10 > 0 && iDequeueOutputBuffer >= 0) {
                this.output_ts = (bufferInfo.presentationTimeUs * ((long) this.mSampleRate)) / 1000000;
                ByteBuffer outputBuffer = this.mAACDecoder.getOutputBuffer(iDequeueOutputBuffer);
                byte[] bArr2 = new byte[i10];
                this.mDecodedData = bArr2;
                MediaCodec.BufferInfo bufferInfo2 = this.mBufferInfo;
                outputBuffer.get(bArr2, bufferInfo2.offset, bufferInfo2.size);
                outputBuffer.clear();
                this.mOutputFormat = this.mAACDecoder.getOutputFormat(iDequeueOutputBuffer);
                this.mAACDecoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            RXLogging.e(TAG, "AAC Decoder Decode failed");
            return false;
        }
    }

    @CalledByNative
    @p0
    public byte[] getDecodedData() {
        return this.mDecodedData;
    }

    @CalledByNative
    public int getOutputChannels() {
        return this.mOutputFormat.getInteger("channel-count");
    }

    @CalledByNative
    public int getOutputSampleRate() {
        return this.mOutputFormat.getInteger("sample-rate");
    }

    @CalledByNative
    public long getOutputTs() {
        return this.output_ts;
    }

    @CalledByNative
    public boolean openEncoder() {
        try {
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.mMimeType);
            this.mAACDecoder = mediaCodecCreateDecoderByType;
            return mediaCodecCreateDecoderByType != null;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.mAACDecoder = null;
            RXLogging.e(TAG, "Open AAC Decoder failed");
            return false;
        }
    }

    @CalledByNative
    public void setADTSValue(int i10) {
        this.mHasADTS = i10;
    }

    @CalledByNative
    public void setChannelsValue(int i10) {
        this.mChannels = i10;
    }

    @CalledByNative
    public void setInputTs(long j10) {
        this.input_ts = j10;
    }

    @CalledByNative
    public void setProfileValue(String str) {
        if (str.equals("he_aac")) {
            this.mProfile = 5;
        } else if (str.equals("he_aac_v2")) {
            this.mProfile = 29;
        } else {
            this.mProfile = 2;
        }
    }

    @CalledByNative
    public void setSampeRateValue(int i10) {
        this.mSampleRate = i10;
    }
}
