package com.ss.bytertc.base.media.screen;

/* JADX INFO: loaded from: classes10.dex */
public interface ScreenAudioCaptureObserver {
    void onAudioFrameCapture(byte[] bArr, int i10, int i11, int i12);

    void onCapturerStarted();

    void onCapturerStopped();
}
