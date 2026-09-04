package com.tencent.ugc.decoder;

import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface UGCVideoDecodeControllerListener {
    void onAbandonDecodingFramesCompleted();

    void onDecodeCompleted();

    void onDecodeFailed();

    void onFrameDecoded(PixelFrame pixelFrame);

    void onFrameEnqueuedToDecoder();

    void onRequestSeekToLastKeyFrame(long j10);
}
