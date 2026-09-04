package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class RTCASREngineEventHandler {
    private IRTCASREngineEventHandler asrEventHandler;

    @CalledByNative
    public void onError(int i10, String str) {
        IRTCASREngineEventHandler iRTCASREngineEventHandler = this.asrEventHandler;
        if (iRTCASREngineEventHandler != null) {
            iRTCASREngineEventHandler.onError(i10, str);
        }
    }

    @CalledByNative
    public void onMessage(String str) {
        IRTCASREngineEventHandler iRTCASREngineEventHandler = this.asrEventHandler;
        if (iRTCASREngineEventHandler != null) {
            iRTCASREngineEventHandler.onMessage(str);
        }
    }

    @CalledByNative
    public void onSuccess() {
        IRTCASREngineEventHandler iRTCASREngineEventHandler = this.asrEventHandler;
        if (iRTCASREngineEventHandler != null) {
            iRTCASREngineEventHandler.onSuccess();
        }
    }

    public void setAsrEventHandler(IRTCASREngineEventHandler iRTCASREngineEventHandler) {
        this.asrEventHandler = iRTCASREngineEventHandler;
    }
}
