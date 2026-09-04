package com.ss.bytertc.audio.device.router.device;

import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit;
import com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback;
import com.ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes10.dex */
public class HWEarBackDeviceSupport implements IAudioKitCallback {
    private static final String TAG = "HWEarBackDeviceSupport";
    private WebRtcAudioEarBack earBack;
    private HwAudioKaraokeFeatureKit mHwAudioKaraokeFeatureKit;
    private HwAudioKit mHwAudioKit;
    private String mResultType = "";
    private boolean mIsAudiokitBindSuccess = false;
    private boolean mIsAudiokitKaraokeBindSuccess = false;
    private boolean mSupportLowLatencyEarBack = true;

    public HWEarBackDeviceSupport(WebRtcAudioEarBack webRtcAudioEarBack) {
        this.earBack = webRtcAudioEarBack;
    }

    private void initAudioKit() {
        if (this.mIsAudiokitBindSuccess && this.mIsAudiokitKaraokeBindSuccess) {
            onDeviceSupported(HWGetKaraokeSupport());
            return;
        }
        HwAudioKit hwAudioKit = new HwAudioKit(ContextUtils.getApplicationContext(), this);
        this.mHwAudioKit = hwAudioKit;
        hwAudioKit.initialize();
    }

    private void initKaraokeFeature() {
        HwAudioKit hwAudioKit = this.mHwAudioKit;
        if (hwAudioKit != null) {
            this.mHwAudioKaraokeFeatureKit = (HwAudioKaraokeFeatureKit) hwAudioKit.createFeature(HwAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
        }
    }

    private void printLog(String str) {
        RXLogging.i(TAG, "HWEarBackDeviceSupport:" + str);
    }

    public void HWDestroy() {
        if (!this.mIsAudiokitBindSuccess || this.mHwAudioKit == null) {
            return;
        }
        printLog("HWDestroy");
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mHwAudioKaraokeFeatureKit;
        if (hwAudioKaraokeFeatureKit != null) {
            hwAudioKaraokeFeatureKit.destroy();
            this.mIsAudiokitKaraokeBindSuccess = false;
        }
        this.mHwAudioKit.destroy();
        this.mIsAudiokitBindSuccess = false;
    }

    public void HWEarBack_init() {
        printLog("HWEarBack_init");
        initAudioKit();
    }

    public int HWEnableKaraoke(boolean z10) {
        if (this.mHwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        printLog("HWEnableKaraoke enable=" + z10);
        return this.mHwAudioKaraokeFeatureKit.enableKaraokeFeature(z10);
    }

    public boolean HWGetKaraokeSupport() {
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mHwAudioKaraokeFeatureKit;
        if (hwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return false;
        }
        return hwAudioKaraokeFeatureKit.isKaraokeFeatureSupport();
    }

    public int HWSetEffectMode(int i10) {
        if (this.mHwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        printLog("HWSetEffectMode value=" + i10);
        return this.mHwAudioKaraokeFeatureKit.setParameter(HwAudioKaraokeFeatureKit.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i10);
    }

    public int HWSetEqualizerMode(int i10) {
        if (this.mHwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        printLog("HWSetEqualizerMode value=" + i10);
        return this.mHwAudioKaraokeFeatureKit.setParameter(HwAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i10);
    }

    public int getLatency() {
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = this.mHwAudioKaraokeFeatureKit;
        if (hwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        return hwAudioKaraokeFeatureKit.getKaraokeLatency();
    }

    public void onDeviceSupported(boolean z10) {
        WebRtcAudioEarBack webRtcAudioEarBack = this.earBack;
        if (webRtcAudioEarBack != null) {
            webRtcAudioEarBack.onHardwareEarbackSupported(z10);
        }
    }

    @Override // com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback
    public void onResult(int i10) {
        printLog(String.format("onResult result=%d", Integer.valueOf(i10)));
        if (i10 == 0) {
            initKaraokeFeature();
            this.mIsAudiokitBindSuccess = true;
            return;
        }
        if (i10 == 2) {
            this.mIsAudiokitBindSuccess = false;
            this.mIsAudiokitKaraokeBindSuccess = false;
            onDeviceSupported(false);
            return;
        }
        if (i10 == 4 || i10 == 6) {
            this.mIsAudiokitBindSuccess = false;
            return;
        }
        if (i10 != 1003) {
            if (i10 == 1806) {
                onDeviceSupported(false);
                return;
            } else if (i10 == 1000) {
                this.mIsAudiokitKaraokeBindSuccess = true;
                setVolume(90);
                onDeviceSupported(HWGetKaraokeSupport());
                return;
            } else if (i10 != 1001) {
                return;
            }
        }
        this.mIsAudiokitKaraokeBindSuccess = false;
    }

    public int setVolume(int i10) {
        if (this.mHwAudioKaraokeFeatureKit == null || !this.mIsAudiokitKaraokeBindSuccess) {
            return -1;
        }
        printLog("setVolume volome=" + i10);
        return this.mHwAudioKaraokeFeatureKit.setParameter(HwAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i10);
    }
}
