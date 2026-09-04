package com.tencent.liteav.live;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.s;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav")
public class V2TXLivePremierJni {
    private static final String TAG = "V2TXLivePremierJni";
    private static long mNativeV2TXLivePremierJni;
    private static V2TXLivePremier.V2TXLivePremierObserver sObserver;

    static {
        s.a();
        mNativeV2TXLivePremierJni = 0L;
    }

    public static int callExperimentalAPI(String str) {
        createNativeV2TXLivePremierIfNeed();
        return nativeCallExperimentalAPI(mNativeV2TXLivePremierJni, str);
    }

    private static void createNativeV2TXLivePremierIfNeed() {
        synchronized (V2TXLivePremierJni.class) {
            if (mNativeV2TXLivePremierJni == 0) {
                mNativeV2TXLivePremierJni = nativeCreate();
            }
        }
    }

    public static int enableAudioCaptureObserver(boolean z10, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableAudioCaptureObserver(mNativeV2TXLivePremierJni, z10, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    public static int enableAudioPlayoutObserver(boolean z10, V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableAudioPlayoutObserver(mNativeV2TXLivePremierJni, z10, v2TXLiveAudioFrameObserverFormat.sampleRate, v2TXLiveAudioFrameObserverFormat.channel, v2TXLiveAudioFrameObserverFormat.samplesPerCall, v2TXLiveAudioFrameObserverFormat.mode.ordinal());
    }

    public static int enableVoiceEarMonitorObserver(boolean z10) {
        createNativeV2TXLivePremierIfNeed();
        return nativeEnableVoiceEarMonitorObserver(mNativeV2TXLivePremierJni, z10);
    }

    private static native int nativeCallExperimentalAPI(long j10, String str);

    private static native long nativeCreate();

    private static native int nativeEnableAudioCaptureObserver(long j10, boolean z10, int i10, int i11, int i12, int i13);

    private static native int nativeEnableAudioPlayoutObserver(long j10, boolean z10, int i10, int i11, int i12, int i13);

    private static native int nativeEnableVoiceEarMonitorObserver(long j10, boolean z10);

    public static void onAudioCaptureData(byte[] bArr, long j10, int i10, int i11) {
        V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i10;
        v2TXLiveAudioFrame.channel = i11;
        v2TXLiveAudioFrame.timestamp = j10;
        v2TXLivePremierObserver.onCaptureAudioFrame(v2TXLiveAudioFrame);
    }

    public static void onAudioPlayoutData(byte[] bArr, long j10, int i10, int i11) {
        V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i10;
        v2TXLiveAudioFrame.channel = i11;
        v2TXLiveAudioFrame.timestamp = j10;
        v2TXLivePremierObserver.onPlayoutAudioFrame(v2TXLiveAudioFrame);
    }

    public static void onEarMonitoringData(byte[] bArr, int i10, int i11) {
        V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver = sObserver;
        if (v2TXLivePremierObserver == null) {
            return;
        }
        V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame = new V2TXLiveDef.V2TXLiveAudioFrame();
        v2TXLiveAudioFrame.data = bArr;
        v2TXLiveAudioFrame.sampleRate = i10;
        v2TXLiveAudioFrame.channel = i11;
        v2TXLivePremierObserver.onVoiceEarMonitorAudioFrame(v2TXLiveAudioFrame);
    }

    public static void setObserver(V2TXLivePremier.V2TXLivePremierObserver v2TXLivePremierObserver) {
        sObserver = v2TXLivePremierObserver;
    }
}
