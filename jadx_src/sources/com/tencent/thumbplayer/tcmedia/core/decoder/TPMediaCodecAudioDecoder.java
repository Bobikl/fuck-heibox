package com.tencent.thumbplayer.tcmedia.core.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog;
import com.tencent.thumbplayer.tcmedia.g.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class TPMediaCodecAudioDecoder extends TPBaseMediaCodecDecoder {
    private static final String TAG = "TPMediaCodecAudioDecoder";
    private int mAudioFormat;
    private int mChannelCount;
    private byte[] mCsd0Data;
    private boolean mEnableAudioPassThrough;
    private boolean mIsAdts;
    private ArrayList<String> mMimeCandidates;
    private int mSampleRate;

    public TPMediaCodecAudioDecoder(int i10) {
        super(i10);
        this.mMimeCandidates = new ArrayList<>();
        this.mSampleRate = 0;
        this.mChannelCount = 0;
        this.mAudioFormat = 0;
        this.mCsd0Data = null;
        this.mIsAdts = false;
        this.mEnableAudioPassThrough = false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void configCodec(b bVar, String str) {
        TPNativeLog.printLog(2, TAG, "configCodec: ");
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, this.mSampleRate, this.mChannelCount);
        byte[] bArr = this.mCsd0Data;
        if (bArr != null) {
            mediaFormatCreateAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
        }
        if (this.mIsAdts) {
            TPNativeLog.printLog(2, TAG, "configCodec: set is adts");
            mediaFormatCreateAudioFormat.setInteger("is-adts", 1);
        }
        bVar.a(mediaFormatCreateAudioFormat, null, this.mMediaCrypto, 0);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    String getCodecName(String str, boolean z10) {
        return TPCodecUtils.getDecoderName(str, z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    String getLogTag() {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    public ArrayList<String> getMimeCandidates() {
        return this.mMimeCandidates;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i10, int i11, int i12, int i13) {
        TPNativeLog.printLog(2, TAG, "initDecoder, mimeType:" + str + " sampleRate:" + i10 + " channelCount:" + i11 + " drmType:" + i12 + " audioFormat:" + i13);
        this.mSampleRate = i10;
        this.mChannelCount = i11;
        this.mDrmType = i12;
        this.mAudioFormat = i13;
        this.mMimeCandidates.clear();
        this.mMimeCandidates.add(str);
        return true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i10, int i11, int i12, Surface surface, int i13, int i14, int i15) {
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void processMediaCodecException(Exception exc) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void processOutputBuffer(b bVar, int i10, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        tPFrameInfo.sampleRate = this.mSampleRate;
        tPFrameInfo.channelCount = this.mChannelCount;
        tPFrameInfo.format = this.mAudioFormat;
        ByteBuffer byteBufferA = bVar.a(i10);
        byte[] bArr = null;
        if (byteBufferA != null) {
            int i11 = bufferInfo.size;
            byte[] bArr2 = new byte[i11];
            byteBufferA.get(bArr2, bufferInfo.offset, i11);
            bArr = bArr2;
        }
        tPFrameInfo.data = bArr;
        if (bufferInfo.flags == 4 && bufferInfo.size <= 0) {
            TPNativeLog.printLog(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
            tPFrameInfo.errCode = 2;
        }
        bVar.a(i10, false);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void processOutputConfigData(b bVar, int i10, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        bVar.a(i10, false);
        tPFrameInfo.errCode = 1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder
    void processOutputFormatChanged(MediaFormat mediaFormat) {
        int i10;
        int integer;
        try {
            if (mediaFormat.containsKey("sample-rate")) {
                this.mSampleRate = mediaFormat.getInteger("sample-rate");
            }
            if (mediaFormat.containsKey("channel-count")) {
                this.mChannelCount = mediaFormat.getInteger("channel-count");
            }
            if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                integer = 2;
            } else {
                integer = mediaFormat.getInteger("pcm-encoding");
                try {
                    TPNativeLog.printLog(2, TAG, "processOutputFormatChanged: MediaFormat.KEY_PCM_ENCODING: ".concat(String.valueOf(integer)));
                } catch (Exception e10) {
                    i10 = integer;
                    e = e10;
                    TPNativeLog.printLog(4, TAG, "processOutputFormatChanged got one exception: " + getStackTrace(e));
                    integer = i10;
                }
            }
        } catch (Exception e11) {
            e = e11;
            i10 = 2;
        }
        TPNativeLog.printLog(2, TAG, "processOutputFormatChanged, mEnableAudioPassThrough:" + this.mEnableAudioPassThrough + ", mSampleRate: " + this.mSampleRate + ", mChannelCount: " + this.mChannelCount + " mAudioFormat: " + this.mAudioFormat + " pcmFormat:" + integer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f10) {
        return super.setOperateRate(f10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i10, boolean z10) {
        if (i10 == 2) {
            this.mIsAdts = z10;
            return true;
        }
        if (i10 != 3) {
            return super.setParamBool(i10, z10);
        }
        this.mEnableAudioPassThrough = z10;
        TPNativeLog.printLog(2, getLogTag(), "setParamBool mEnableAudioPassThrough:" + this.mEnableAudioPassThrough);
        return true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i10, byte[] bArr) {
        if (i10 == 200) {
            this.mCsd0Data = bArr;
        }
        return super.setParamBytes(i10, bArr);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.tcmedia.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i10, Object obj) {
        return super.setParamObject(i10, obj);
    }
}
