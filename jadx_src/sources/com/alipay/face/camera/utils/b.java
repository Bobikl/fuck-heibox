package com.alipay.face.camera.utils;

import android.os.Build;
import com.alipay.face.config.DeviceSetting;

/* JADX INFO: compiled from: DeviceSettingUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static DeviceSetting a(DeviceSetting[] deviceSettingArr) {
        DeviceSetting deviceSetting;
        if (deviceSettingArr != null) {
            int i10 = Integer.parseInt(Build.VERSION.SDK);
            int length = deviceSettingArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                deviceSetting = deviceSettingArr[i11];
                if (i10 < deviceSetting.getMinApiLevel() || i10 > deviceSetting.getMaxApiLevel()) {
                }
            }
            deviceSetting = null;
        } else {
            deviceSetting = null;
        }
        return deviceSetting == null ? new DeviceSetting() : deviceSetting;
    }
}
