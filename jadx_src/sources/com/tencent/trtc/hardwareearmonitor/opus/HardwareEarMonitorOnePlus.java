package com.tencent.trtc.hardwareearmonitor.opus;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.media.AudioManager;
import android.os.Build;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorOnePlus {
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    private Context mContext = ContextUtils.getApplicationContext();
    private long mNativeHardwareEarMonitorHandle;

    public HardwareEarMonitorOnePlus(long j10) {
        this.mNativeHardwareEarMonitorHandle = j10;
    }

    public static HardwareEarMonitorOnePlus create(long j10) {
        return new HardwareEarMonitorOnePlus(j10);
    }

    public String getParameters(String str) {
        try {
            return this.mAudioManager.getParameters(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public int getUidFromPackage() {
        try {
            PackageInfo packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 24) {
                return this.mContext.getPackageManager().getPackageUid(packageInfo.packageName, 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
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

    public boolean systemFeatureSupported(String str) {
        try {
            this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 24) {
                return this.mContext.getPackageManager().hasSystemFeature(str);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
