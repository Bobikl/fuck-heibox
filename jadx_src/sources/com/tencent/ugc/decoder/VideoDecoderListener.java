package com.tencent.ugc.decoder;

import com.tencent.ugc.videobase.frame.PixelFrame;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoDecoderListener {
    public void onAbandonDecodingFramesCompleted() {
    }

    public void onDecodeCompleted() {
    }

    public void onDecodeFailed() {
    }

    public void onDecodeFrame(PixelFrame pixelFrame, long j10) {
    }

    public void onDecodeLatencyChanged(boolean z10) {
    }

    public void onDecodeSEI(ByteBuffer byteBuffer) {
    }

    public void onRequestKeyFrame() {
    }
}
