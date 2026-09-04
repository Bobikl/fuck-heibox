package com.tencent.qmsp.oaid2;

import android.text.TextUtils;
import org.android.agoo.xiaomi.MiPushRegistar;

/* JADX INFO: loaded from: classes4.dex */
public enum d {
    UNSUPPORT(-1, "unsupport"),
    HUA_WEI(0, "HUAWEI"),
    XIAOMI(1, "Xiaomi"),
    VIVO(2, "vivo"),
    OPPO(3, "oppo"),
    MOTO(4, "motorola"),
    LENOVO(5, "lenovo"),
    ASUS(6, "asus"),
    SAMSUNG(7, "samsung"),
    MEIZU(8, "meizu"),
    ALPS(9, "alps"),
    NUBIA(10, "nubia"),
    ZTE(11, "ZTE"),
    ONEPLUS(12, "OnePlus"),
    BLACKSHARK(13, MiPushRegistar.BLACKSHARK),
    FREEMEOS(14, "freemeos"),
    SSUIOS(15, "ssui");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f101581a;

    d(int i10, String str) {
        this.f101581a = str;
    }

    public static d a(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNSUPPORT;
        }
        for (d dVar : values()) {
            if (dVar.f101581a.equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return UNSUPPORT;
    }
}
