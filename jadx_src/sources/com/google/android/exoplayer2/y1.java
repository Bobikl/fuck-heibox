package com.google.android.exoplayer2;

import java.util.HashSet;

/* JADX INFO: compiled from: ExoPlayerLibraryInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52052a = "ExoPlayerLib";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52053b = "2.16.0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52054c = "ExoPlayerLib/2.16.0";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f52055d = 2016000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f52056e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f52057f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashSet<String> f52058g = new HashSet<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f52059h = "goog.exo.core";

    private y1() {
    }

    public static synchronized void a(String str) {
        if (f52058g.add(str)) {
            String str2 = f52059h;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
            f52059h = sb2.toString();
        }
    }

    public static synchronized String b() {
        return f52059h;
    }
}
