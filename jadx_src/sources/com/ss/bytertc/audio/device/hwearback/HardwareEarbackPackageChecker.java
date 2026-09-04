package com.ss.bytertc.audio.device.hwearback;

import com.bytedance.realx.base.ContextUtils;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit;

/* JADX INFO: loaded from: classes10.dex */
public class HardwareEarbackPackageChecker {
    public static boolean isHwEarbackPackageSupported() {
        HwAudioKit hwAudioKit = null;
        try {
            hwAudioKit = new HwAudioKit(ContextUtils.getApplicationContext(), null);
        } catch (NoClassDefFoundError unused) {
        }
        return hwAudioKit != null;
    }
}
