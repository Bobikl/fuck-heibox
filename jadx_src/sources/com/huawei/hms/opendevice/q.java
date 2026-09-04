package com.huawei.hms.opendevice;

import android.text.TextUtils;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class q {
    public static boolean a(String... strArr) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }
}
