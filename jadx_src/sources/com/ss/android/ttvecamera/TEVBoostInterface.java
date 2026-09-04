package com.ss.android.ttvecamera;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class TEVBoostInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97208a = "TEVBoostInterface";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f97209b = 50;

    public enum VBoostCapabilityType {
        UNKNOWN,
        CPU_FREQ_MIN,
        CPU_FREQ_MAX,
        CPU_CORE_MIN,
        CPU_CORE_MAX,
        GPU_FREQ_MIN,
        GPU_FREQ_MAX,
        BUS_FREQ_MIN,
        BUS_FREQ_MAX,
        UFS_FREQ_MIN,
        UFS_FREQ_MAX,
        TASK_PRIORITY,
        CPU_AFFINITY,
        IDLE_STATE,
        IO_PRELOAD,
        NETWORK_ENHANCE,
        PRESET_SCENE,
        THUMB_FETCH,
        VIBRATE_ENHANCE
    }

    public static int a(VBoostCapabilityType vBoostCapabilityType) {
        return 0;
    }

    public static Set<VBoostCapabilityType> b() {
        return null;
    }

    public static void c(Context context) {
    }

    public static boolean d(VBoostCapabilityType vBoostCapabilityType) {
        return false;
    }

    public static void e() {
    }

    public static void f() {
    }

    public static void g() {
    }

    public static void h() {
    }

    public static int i(VBoostCapabilityType vBoostCapabilityType, int i10, long j10) {
        return 0;
    }

    public static void j() {
    }

    public static void k() {
    }
}
