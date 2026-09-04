package com.igexin.push.core.d;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static c a(String str) {
        str.hashCode();
        switch (str) {
            case "LENOVO":
            case "ZUI":
                return new s();
            case "SAMSUNG":
                return new p();
            case "XIAOMI":
            case "BLACKSHARK":
            case "REDMI":
                return new r();
            case "ONEPLUS":
            case "OPPO":
                return new o();
            case "ASUS":
                return new j();
            case "IQOO":
            case "VIVO":
                return new q();
            case "HONOR":
            case "HUA_WEI":
            case "HUAWEI":
                return new l();
            case "MEIZU":
                return new m();
            case "NUBIA":
                return new n();
            case "COOLPAD":
                return new k();
            default:
                return null;
        }
    }
}
