package com.tencent.custom.customcapture.extractor;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import androidx.annotation.n0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExtractorAdvancer {
    protected MediaExtractor mMediaExtractor;

    public abstract boolean advance();

    public abstract long getSampleTime();

    public abstract void readSampleData(MediaCodec.BufferInfo bufferInfo, @n0 ByteBuffer byteBuffer, int i10);

    public abstract void seekTo(long j10, boolean z10);

    public void updateExtractor(MediaExtractor mediaExtractor) {
        this.mMediaExtractor = mediaExtractor;
    }
}
