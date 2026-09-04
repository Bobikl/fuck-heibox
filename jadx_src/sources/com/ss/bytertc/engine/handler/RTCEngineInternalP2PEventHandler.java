package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class RTCEngineInternalP2PEventHandler {
    private static final String TAG = "RTCEngineInternalP2PEventHandler";
    private WeakReference<IRTCEngineInternalP2PEventHandler> mRtcEngineInternalP2PEventHandler;

    @CalledByNative
    public void onP2PConnectionStatusUpdated(int i10) {
        try {
            WeakReference<IRTCEngineInternalP2PEventHandler> weakReference = this.mRtcEngineInternalP2PEventHandler;
            IRTCEngineInternalP2PEventHandler iRTCEngineInternalP2PEventHandler = weakReference == null ? null : weakReference.get();
            if (iRTCEngineInternalP2PEventHandler != null) {
                iRTCEngineInternalP2PEventHandler.onP2PConnectionStatusUpdated(i10);
            }
        } catch (Exception e10) {
            LogUtil.d(TAG, "onP2PConnectionStatusUpdated callback catch exception.\n" + e10.getMessage());
        }
    }

    @CalledByNative
    public void onP2PSignalingStatusUpdated(int i10) {
        try {
            WeakReference<IRTCEngineInternalP2PEventHandler> weakReference = this.mRtcEngineInternalP2PEventHandler;
            IRTCEngineInternalP2PEventHandler iRTCEngineInternalP2PEventHandler = weakReference == null ? null : weakReference.get();
            if (iRTCEngineInternalP2PEventHandler != null) {
                iRTCEngineInternalP2PEventHandler.onP2PSignalingStatusUpdated(i10);
            }
        } catch (Exception e10) {
            LogUtil.d(TAG, "onP2PSignalingStatusUpdated callback catch exception.\n" + e10.getMessage());
        }
    }

    public void setInternalP2PEventHandler(IRTCEngineInternalP2PEventHandler iRTCEngineInternalP2PEventHandler) {
        this.mRtcEngineInternalP2PEventHandler = new WeakReference<>(iRTCEngineInternalP2PEventHandler);
    }
}
