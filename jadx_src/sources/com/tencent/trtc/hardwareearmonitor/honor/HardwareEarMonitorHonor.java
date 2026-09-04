package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.Context;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorHonor implements IHonorAudioServiceCallback {
    private HonorAudioClient mHnAudioClient;
    private HonorEarReturnClient mHnEarReturnClient;
    private long mNativeHardwareEarMonitorHandle;
    private Object mLock = new Object();
    private Context mContext = ContextUtils.getApplicationContext();

    public HardwareEarMonitorHonor(long j10) {
        this.mNativeHardwareEarMonitorHandle = j10;
        HonorAudioClient honorAudioClient = new HonorAudioClient(this.mContext, this);
        this.mHnAudioClient = honorAudioClient;
        honorAudioClient.initialize();
    }

    public static HardwareEarMonitorHonor create(long j10) {
        return new HardwareEarMonitorHonor(j10);
    }

    public static boolean isAudioKitSupport() {
        return HonorAudioClient.isDeviceSupported(ContextUtils.getApplicationContext());
    }

    private static native void nativeHandleResult(long j10, int i10);

    public void createKaraokeService() {
        this.mHnEarReturnClient = (HonorEarReturnClient) this.mHnAudioClient.createService(HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        HonorAudioClient honorAudioClient = this.mHnAudioClient;
        if (honorAudioClient != null) {
            honorAudioClient.destroy();
            this.mHnAudioClient = null;
        }
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient != null) {
            honorEarReturnClient.destroy();
            this.mHnEarReturnClient = null;
        }
    }

    public boolean enableKaraoke(boolean z10) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        return honorEarReturnClient != null && honorEarReturnClient.enableEarReturn(z10) == 0;
    }

    public boolean isHardwareEarMonitorSupported() {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return false;
        }
        return honorEarReturnClient.isServiceSupported();
    }

    public boolean isKaraokeServiceSupport() {
        return this.mHnAudioClient.getSupportedServices().contains(HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioServiceCallback
    public void onResult(int i10) {
        synchronized (this.mLock) {
            nativeHandleResult(this.mNativeHardwareEarMonitorHandle, i10);
        }
    }

    public boolean setEqualizer(int i10) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        return honorEarReturnClient != null && honorEarReturnClient.setParameter(HonorEarReturnClient.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i10) == 0;
    }

    public boolean setReverberation(int i10) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        return honorEarReturnClient != null && honorEarReturnClient.setParameter(HonorEarReturnClient.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i10) == 0;
    }

    public boolean setVolume(int i10) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        return honorEarReturnClient != null && honorEarReturnClient.setParameter(HonorEarReturnClient.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i10) == 0;
    }
}
