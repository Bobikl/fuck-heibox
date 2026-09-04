package com.tencent.thumbplayer.tcmedia.core.common;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class TPHeadsetPluginCallbackToNative implements TPHeadsetPluginDetector.HeadsetPluginListener {
    private static final String TAG = "TPHeadsetPluginCallback";
    private long mNativeContext;

    private TPHeadsetPluginCallbackToNative(long j10) {
        this.mNativeContext = j10;
    }

    private native void _onAudioRouteChanged(Set<Integer> set, Set<Integer> set2);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    private void registerCallback() {
        TPHeadsetPluginDetector.addHeadsetPluginListener(this);
    }

    private void unregisterCallback() {
        TPHeadsetPluginDetector.removeHeadsetPluginListener(this);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.common.TPHeadsetPluginDetector.HeadsetPluginListener
    public void onHeadsetPlugin(Set<Integer> set, Set<Integer> set2) {
        TPNativeLog.printLog(2, TAG, "onHeadsetPlugin: oldOutputs: " + set + ", newOutputs: " + set2);
        _onAudioRouteChanged(set, set2);
    }
}
