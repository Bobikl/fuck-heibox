package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.IRTCEngineInternalP2PEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class RTCP2P {
    private static final String TAG = "RTCP2P";

    public static int enableP2P(RTCVideo rTCVideo, String str, boolean z10) {
        try {
            return ((Integer) Class.forName("com.ss.bytertc.engine.engineimpl.RTCVideoImpl").getMethod("enableP2PAbility", String.class, Boolean.TYPE).invoke(rTCVideo, str, Boolean.valueOf(z10))).intValue();
        } catch (Exception unused) {
            LogUtil.e(TAG, "fail to find method enableP2PAbility");
            return -1;
        }
    }

    public static void setP2PEventHandler(RTCVideo rTCVideo, IRTCEngineInternalP2PEventHandler iRTCEngineInternalP2PEventHandler) {
        try {
            Class.forName("com.ss.bytertc.engine.engineimpl.RTCVideoImpl").getMethod("setInternalP2PEventHandler", IRTCEngineInternalP2PEventHandler.class).invoke(rTCVideo, iRTCEngineInternalP2PEventHandler);
        } catch (Exception unused) {
            LogUtil.e(TAG, "fail to find method setInternalP2PEventHandler");
        }
    }
}
