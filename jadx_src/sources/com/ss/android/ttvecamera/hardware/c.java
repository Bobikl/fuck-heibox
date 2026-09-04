package com.ss.android.ttvecamera.hardware;

import android.os.Build;
import com.ss.android.ttvecamera.q;

/* JADX INFO: compiled from: TECameraHardware2.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97536a = "TECameraHardware2";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f97537b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f97538c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f97539d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f97540e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f97541f = {2, 0, 1, 3};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f97542g = {1, 2, 0, 3, 4};

    public static boolean a() {
        String lowerCase = Build.BRAND.toLowerCase();
        return lowerCase.equals("huawei") || lowerCase.equals("honor");
    }

    public static boolean b() {
        if (!Build.HARDWARE.toLowerCase().matches("mt[0-9]*")) {
            return false;
        }
        q.b(f97536a, "MTK Platform.");
        return true;
    }

    public static boolean c() {
        String lowerCase = Build.HARDWARE.toLowerCase();
        if (!lowerCase.equals("qcom") && !lowerCase.matches("msm[0-9]*")) {
            return false;
        }
        q.b(f97536a, "QCOM Platform.");
        return true;
    }

    public static boolean d() {
        return Build.BRAND.toLowerCase().equals("samsung");
    }
}
