package com.tencent.liteav.extensions.codec;

import android.media.MediaFormat;
import com.google.android.exoplayer2.util.y;
import com.tencent.liteav.base.Log;
import java.nio.ByteBuffer;
import org.apache.tools.ant.taskdefs.email.b;

/* JADX INFO: loaded from: classes4.dex */
public class HardwareAacDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AacMediaCodecWrapper f99753a = new AacMediaCodecWrapper(AacMediaCodecWrapper.a.f99751b);

    public ByteBuffer decode(ByteBuffer byteBuffer) {
        return this.f99753a.processFrame(byteBuffer);
    }

    public int getCacheSize() {
        return this.f99753a.f99745b;
    }

    public int getOutputChannelCount() {
        MediaFormat mediaFormat = this.f99753a.f99744a;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("channel-count");
        } catch (Exception e10) {
            Log.e("HardwareAacDecoder", "getOutputChannelCount failed. ".concat(String.valueOf(e10)), new Object[0]);
            return -1;
        }
    }

    public int getOutputSampleRate() {
        MediaFormat mediaFormat = this.f99753a.f99744a;
        if (mediaFormat == null) {
            return -1;
        }
        try {
            return mediaFormat.getInteger("sample-rate");
        } catch (Exception e10) {
            Log.e("HardwareAacDecoder", "getOutputSampleRate failed. ".concat(String.valueOf(e10)), new Object[0]);
            return -1;
        }
    }

    public boolean init(int i10, int i11, ByteBuffer byteBuffer) {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(y.A, i10, i11);
        mediaFormatCreateAudioFormat.setString(b.I, y.A);
        mediaFormatCreateAudioFormat.setByteBuffer("csd-0", byteBuffer);
        return this.f99753a.a(mediaFormatCreateAudioFormat);
    }

    public void unInit() {
        this.f99753a.a();
    }
}
