package com.apm.lite;

import com.apm.lite.runtime.ConfigManager;
import com.apm.lite.runtime.l;

/* JADX INFO: loaded from: classes6.dex */
public final class Npth {
    private static boolean sInit;

    public static void checkInnerNpth(boolean z10) {
        l.j(z10);
    }

    public static void enableAnrInfo(boolean z10) {
        l.g(z10);
    }

    public static void enableNativeDump(boolean z10) {
        l.m(z10);
    }

    public static ConfigManager getConfigManager() {
        return e.o();
    }

    public static boolean hasCrash() {
        return l.x();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return l.y();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return l.z();
    }

    public static boolean isANREnable() {
        return l.n();
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return l.k();
    }

    public static boolean isNativeCrashEnable() {
        return l.o();
    }

    public static boolean isStopUpload() {
        return l.A();
    }

    public static void openANRMonitor() {
        l.u();
    }

    public static void openJavaCrashMonitor() {
        l.s();
    }

    public static boolean openNativeCrashMonitor() {
        return l.w();
    }

    public static void stopUpload() {
        l.B();
    }
}
