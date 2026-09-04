package com.tencent.thumbplayer.tcmedia.core.common;

/* JADX INFO: loaded from: classes4.dex */
public class TPAudioPassThroughPluginCallbackToNative implements TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener {
    private static final String TAG = "TPAudioPassThroughPluginCallback";
    private long mNativeContext;

    private TPAudioPassThroughPluginCallbackToNative(long j10) {
        this.mNativeContext = j10;
    }

    private native void _onAudioPassThroughStateChanged(boolean z10);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    private void registerCallback() {
        TPAudioPassThroughPluginDetector.addListener(this);
    }

    private void unregisterCallback() {
        TPAudioPassThroughPluginDetector.removeListener(this);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.common.TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener
    public void onAudioPassThroughPlugin(boolean z10) {
        TPNativeLog.printLog(2, TAG, "onAudioPassThroughPlugin bPlugin:".concat(String.valueOf(z10)));
        _onAudioPassThroughStateChanged(z10);
    }
}
