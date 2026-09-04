package com.bytedance.realx.video;

import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;

/* JADX INFO: loaded from: classes6.dex */
public interface VideoSink {
    @CalledByNative
    void onFrame(RXVideoFrameInterface rXVideoFrameInterface);
}
