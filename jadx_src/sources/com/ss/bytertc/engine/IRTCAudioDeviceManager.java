package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes4.dex */
public interface IRTCAudioDeviceManager {
    int startAudioDeviceRecordTest(int i10);

    int startAudioPlaybackDeviceTest(String str, int i10);

    int stopAudioDevicePlayTest();

    int stopAudioDeviceRecordAndPlayTest();

    int stopAudioPlaybackDeviceTest();
}
