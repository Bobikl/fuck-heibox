package com.tencent.ugc.videobase.utils;

import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface PixelFrameQueue {
    void evictAll();

    PixelFrame peek();

    PixelFrame poll();

    void push(PixelFrame pixelFrame);

    boolean remove(PixelFrame pixelFrame);

    int size();
}
