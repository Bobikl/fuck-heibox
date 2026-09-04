package com.tencent.liteav.extensions.codec;

import android.media.MediaFormat;
import com.google.android.exoplayer2.util.y;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class HardwareAacEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AacMediaCodecWrapper f99754a = new AacMediaCodecWrapper(AacMediaCodecWrapper.a.f99750a);

    public ByteBuffer encode(ByteBuffer byteBuffer) {
        return this.f99754a.processFrame(byteBuffer);
    }

    public boolean init(int i10, int i11, int i12) {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(y.A, i10, i11);
        mediaFormatCreateAudioFormat.setInteger("bitrate", i12);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        return this.f99754a.a(mediaFormatCreateAudioFormat);
    }

    public void unInit() {
        this.f99754a.a();
    }
}
