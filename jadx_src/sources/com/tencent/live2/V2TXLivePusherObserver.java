package com.tencent.live2;

import android.graphics.Bitmap;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class V2TXLivePusherObserver {
    public void onCaptureFirstAudioFrame() {
    }

    public void onCaptureFirstVideoFrame() {
    }

    public void onError(int i10, String str, Bundle bundle) {
    }

    public void onGLContextCreated() {
    }

    public void onGLContextDestroyed() {
    }

    public void onLocalRecordBegin(int i10, String str) {
    }

    public void onLocalRecordComplete(int i10, String str) {
    }

    public void onLocalRecording(long j10, String str) {
    }

    public void onMicrophoneVolumeUpdate(int i10) {
    }

    public void onProcessAudioFrame(V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
    }

    public int onProcessVideoFrame(V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        return 0;
    }

    public void onPushStatusUpdate(V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus, String str, Bundle bundle) {
    }

    public void onScreenCaptureStarted() {
    }

    public void onScreenCaptureStopped(int i10) {
    }

    public void onSetMixTranscodingConfig(int i10, String str) {
    }

    public void onSnapshotComplete(Bitmap bitmap) {
    }

    public void onStatisticsUpdate(V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics) {
    }

    public void onVoiceActivityDetectionUpdate(boolean z10) {
    }

    public void onWarning(int i10, String str, Bundle bundle) {
    }
}
