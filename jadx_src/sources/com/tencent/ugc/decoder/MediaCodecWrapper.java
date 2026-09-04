package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public class MediaCodecWrapper {
    public static void configure(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
    }

    public static int dequeueInputBuffer(MediaCodec mediaCodec, long j10) {
        return mediaCodec.dequeueInputBuffer(j10);
    }

    public static int dequeueOutputBuffer(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, long j10) {
        return mediaCodec.dequeueOutputBuffer(bufferInfo, j10);
    }

    public static void queueInputBuffer(MediaCodec mediaCodec, int i10, int i11, int i12, long j10, int i13) {
        mediaCodec.queueInputBuffer(i10, i11, i12, j10, i13);
    }
}
