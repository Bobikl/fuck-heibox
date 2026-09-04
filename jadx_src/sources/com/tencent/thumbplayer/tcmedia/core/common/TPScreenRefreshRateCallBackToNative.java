package com.tencent.thumbplayer.tcmedia.core.common;

/* JADX INFO: loaded from: classes4.dex */
public class TPScreenRefreshRateCallBackToNative implements TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener {
    private static final String TAG = "TPScreenRefreshRateCallBack";
    private long mNativeContext;

    private TPScreenRefreshRateCallBackToNative(long j10) {
        this.mNativeContext = j10;
    }

    private native void _onScreenRefreshRateChanged(float f10);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    private void registerCallback() {
        TPScreenRefreshRateDetector.addListener(this);
    }

    private void unregisterCallback() {
        TPScreenRefreshRateDetector.removeListener(this);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.common.TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener
    public void onScreenRefreshRateChanged(float f10) {
        TPNativeLog.printLog(2, TAG, "onScreenRefreshRateChanged refreshRate:".concat(String.valueOf(f10)));
        _onScreenRefreshRateChanged(f10);
    }
}
