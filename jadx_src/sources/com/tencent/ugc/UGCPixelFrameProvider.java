package com.tencent.ugc;

import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface UGCPixelFrameProvider {
    public static final List<PixelFrame> END_OF_STREAM = new LinkedList();

    UGCFrameQueue<List<PixelFrame>> getFrameQueue();

    void initialize();

    void seekTo(long j10, boolean z10);

    void setMaxBufferFrameCount(int i10);

    void setPlayEndPts(long j10);

    void setReverse(boolean z10);

    void start();

    void stop();

    void uninitialize();
}
