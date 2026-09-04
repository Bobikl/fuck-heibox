package com.tencent.trtc.hardwareearmonitor.vivo;

import android.media.AudioManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorVivo {
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    private long mNativeHardwareEarMonitorHandle;

    public HardwareEarMonitorVivo(long j10) {
        this.mNativeHardwareEarMonitorHandle = j10;
    }

    public static HardwareEarMonitorVivo create(long j10) {
        return new HardwareEarMonitorVivo(j10);
    }

    public String getParameters(String str) {
        try {
            return this.mAudioManager.getParameters(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public boolean setAudioParams(String str) {
        try {
            this.mAudioManager.setParameters(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
