package com.tencent.trtc.hardwareearmonitor.daisy;

import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorDaisy implements IDaisyAudioKitCallback {
    private DaisyAudioKit mDaisyAudioKit;
    private DaisyAudioKaraokeFeatureKit mDaisyKaraokeKit;
    private Object mLock = new Object();
    private long mNativeHardwareEarMonitorHandle;

    public HardwareEarMonitorDaisy(long j10) {
        this.mNativeHardwareEarMonitorHandle = j10;
        DaisyAudioKit daisyAudioKit = new DaisyAudioKit(ContextUtils.getApplicationContext(), this);
        this.mDaisyAudioKit = daisyAudioKit;
        daisyAudioKit.initialize();
    }

    public static HardwareEarMonitorDaisy create(long j10) {
        return new HardwareEarMonitorDaisy(j10);
    }

    public static boolean isAudioKitSupport() {
        return DaisyFeatureKitManager.isAudioKitSupport(ContextUtils.getApplicationContext());
    }

    private static native void nativeHandleResult(long j10, int i10);

    private boolean setEqualizer(int i10) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        return daisyAudioKaraokeFeatureKit != null && daisyAudioKaraokeFeatureKit.setParameter(DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i10) == 0;
    }

    private boolean setVolume(int i10) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        return daisyAudioKaraokeFeatureKit != null && daisyAudioKaraokeFeatureKit.setParameter(DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i10) == 0;
    }

    public void createKaraokeService() {
        this.mDaisyKaraokeKit = (DaisyAudioKaraokeFeatureKit) this.mDaisyAudioKit.createFeature(DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        DaisyAudioKit daisyAudioKit = this.mDaisyAudioKit;
        if (daisyAudioKit != null) {
            daisyAudioKit.destroy();
            this.mDaisyAudioKit = null;
        }
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit != null) {
            daisyAudioKaraokeFeatureKit.destroy();
            this.mDaisyKaraokeKit = null;
        }
    }

    public boolean enableKaraoke(boolean z10) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        return daisyAudioKaraokeFeatureKit != null && daisyAudioKaraokeFeatureKit.enableKaraokeFeature(z10) == 0;
    }

    public boolean isHardwareEarMonitorSupported() {
        DaisyAudioKit daisyAudioKit = this.mDaisyAudioKit;
        if (daisyAudioKit == null) {
            return false;
        }
        return daisyAudioKit.isFeatureSupported(DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    public boolean isKaraokeServiceSupport() {
        return this.mDaisyAudioKit.isFeatureSupported(DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKitCallback
    public void onResult(int i10) {
        synchronized (this.mLock) {
            nativeHandleResult(this.mNativeHardwareEarMonitorHandle, i10);
        }
    }

    public boolean setReverberation(int i10) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        return daisyAudioKaraokeFeatureKit != null && daisyAudioKaraokeFeatureKit.setParameter(DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i10) == 0;
    }
}
