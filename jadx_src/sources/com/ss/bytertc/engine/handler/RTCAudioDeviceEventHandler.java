package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.IRTCAudioDeviceManagerEx;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;

/* JADX INFO: loaded from: classes4.dex */
public class RTCAudioDeviceEventHandler {
    private static final String TAG = "RtcAudioDeviceEventHandler";

    @CalledByNative
    void OnLoopbackAudioVolumeIndication(int i10) {
    }

    @CalledByNative
    void onRecordingAudioVolumeIndication(int i10) {
        IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler audioDeviceManagerEvent = RTCVideoImpl.getAudioDeviceManagerEvent();
        if (audioDeviceManagerEvent != null) {
            audioDeviceManagerEvent.onRecordingAudioVolumeIndication(i10);
        }
    }
}
