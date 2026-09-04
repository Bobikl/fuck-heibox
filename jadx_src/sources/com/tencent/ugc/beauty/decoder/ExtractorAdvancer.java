package com.tencent.ugc.beauty.decoder;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExtractorAdvancer {
    protected MediaExtractor mMediaExtractor;

    public abstract boolean advance();

    public abstract long getSampleTime();

    public abstract void readSampleData(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer, int i10);

    public void updateExtractor(MediaExtractor mediaExtractor) {
        this.mMediaExtractor = mediaExtractor;
    }
}
