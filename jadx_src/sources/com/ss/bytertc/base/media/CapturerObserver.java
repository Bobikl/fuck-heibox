package com.ss.bytertc.base.media;

import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: classes10.dex */
public interface CapturerObserver {
    void onCapturerError(String str);

    void onCapturerFormatSelected(int i10, int i11, int i12, int i13, int i14);

    void onCapturerStarted(boolean z10);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
