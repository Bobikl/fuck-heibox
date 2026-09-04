package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes4.dex */
public interface IRTCAudioDeviceManagerEx {

    public interface IRTCAudioDeviceEventHandler {
        void onRecordingAudioVolumeIndication(int i10);
    }

    void setEnableSpeakerphone(boolean z10);

    int startAudioCaptureDeviceTest(int i10);

    int startAudioPlaybackDeviceTest(String str, int i10);

    int stopAudioCaptureDeviceTest();

    int stopAudioPlaybackDeviceTest();
}
