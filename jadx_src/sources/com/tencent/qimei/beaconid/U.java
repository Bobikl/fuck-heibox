package com.tencent.qimei.beaconid;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f101208a = false;

    static {
        try {
            System.loadLibrary("beaconid");
            f101208a = true;
        } catch (UnsatisfiedLinkError e10) {
            e10.printStackTrace();
        }
    }

    public static byte a(String str, long j10) {
        if (!f101208a) {
            return (byte) -1;
        }
        try {
            return e(str, j10);
        } catch (NoSuchMethodError e10) {
            e10.printStackTrace();
            return (byte) -1;
        }
    }

    public static String a() {
        if (!f101208a) {
            return "";
        }
        try {
            return p();
        } catch (NoSuchMethodError e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static boolean a(Context context, String str) {
        if (f101208a) {
            try {
                n(context, str);
                return true;
            } catch (NoSuchMethodError e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static native byte[] a(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static byte[] a(long j10) {
        if (!f101208a) {
            return null;
        }
        try {
            return d(j10);
        } catch (NoSuchMethodError e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String[] a(int i10) {
        if (!f101208a) {
            return null;
        }
        try {
            return c(i10);
        } catch (NoSuchMethodError e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String b() {
        if (!f101208a) {
            return "";
        }
        try {
            return s();
        } catch (NoSuchMethodError e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static byte[] b(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!f101208a) {
            return null;
        }
        try {
            return a(i10, bArr, bArr2, bArr3);
        } catch (NoSuchMethodError e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static native String[] c(int i10);

    public static native byte[] d(long j10);

    public static native byte e(String str, long j10);

    public static native void n(Context context, String str);

    public static native String p();

    public static native String r();

    public static native String s();
}
