package com.elvishew.xlog;

/* JADX INFO: compiled from: LogLevel.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f42857a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42858b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42859c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42860d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42861e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f42862f = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f42863g = Integer.MAX_VALUE;

    public static String a(int i10) {
        if (i10 == 2) {
            return "VERBOSE";
        }
        if (i10 == 3) {
            return "DEBUG";
        }
        if (i10 == 4) {
            return "INFO";
        }
        if (i10 == 5) {
            return "WARN";
        }
        if (i10 == 6) {
            return "ERROR";
        }
        if (i10 < 2) {
            return "VERBOSE-" + (2 - i10);
        }
        return "ERROR+" + (i10 - 6);
    }

    public static String b(int i10) {
        if (i10 == 2) {
            return androidx.exifinterface.media.a.X4;
        }
        if (i10 == 3) {
            return "D";
        }
        if (i10 == 4) {
            return "I";
        }
        if (i10 == 5) {
            return androidx.exifinterface.media.a.T4;
        }
        if (i10 == 6) {
            return androidx.exifinterface.media.a.S4;
        }
        if (i10 < 2) {
            return "V-" + (2 - i10);
        }
        return "E+" + (i10 - 6);
    }
}
