package com.google.android.exoplayer2.util;

import android.net.Uri;
import androidx.annotation.j1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FileTypes.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n {
    private static final String A = ".webm";
    private static final String B = ".og";
    private static final String C = ".opus";
    private static final String D = ".mp3";
    private static final String E = ".mp4";
    private static final String F = ".m4";
    private static final String G = ".mp4";
    private static final String H = ".cmf";
    private static final String I = ".ps";
    private static final String J = ".mpeg";
    private static final String K = ".mpg";
    private static final String L = ".m2p";
    private static final String M = ".ts";
    private static final String N = ".ts";
    private static final String O = ".wav";
    private static final String P = ".wave";
    private static final String Q = ".vtt";
    private static final String R = ".webvtt";
    private static final String S = ".jpg";
    private static final String T = ".jpeg";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51467a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f51468b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f51469c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51470d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51471e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f51472f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f51473g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f51474h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f51475i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f51476j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f51477k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f51478l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f51479m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f51480n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f51481o = 13;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f51482p = 14;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @j1
    static final String f51483q = "Content-Type";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f51484r = ".ac3";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f51485s = ".ec3";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f51486t = ".ac4";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f51487u = ".adts";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f51488v = ".aac";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f51489w = ".amr";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f51490x = ".flac";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f51491y = ".flv";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f51492z = ".mk";

    /* JADX INFO: compiled from: FileTypes.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private n() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(@androidx.annotation.p0 String str) {
        byte b10;
        if (str == null) {
            return -1;
        }
        String strU = y.u(str);
        strU.hashCode();
        switch (strU.hashCode()) {
            case -2123537834:
                b10 = !strU.equals(y.N) ? (byte) -1 : (byte) 0;
                break;
            case -1662384011:
                b10 = !strU.equals(y.f51594r) ? (byte) -1 : (byte) 1;
                break;
            case -1662384007:
                b10 = !strU.equals(y.f51588o) ? (byte) -1 : (byte) 2;
                break;
            case -1662095187:
                b10 = !strU.equals(y.f51574h) ? (byte) -1 : (byte) 3;
                break;
            case -1606874997:
                b10 = !strU.equals(y.Y) ? (byte) -1 : (byte) 4;
                break;
            case -1487394660:
                b10 = !strU.equals("image/jpeg") ? (byte) -1 : (byte) 5;
                break;
            case -1248337486:
                b10 = !strU.equals(y.f51579j0) ? (byte) -1 : (byte) 6;
                break;
            case -1004728940:
                b10 = !strU.equals("text/vtt") ? (byte) -1 : (byte) 7;
                break;
            case -387023398:
                b10 = !strU.equals(y.B) ? (byte) -1 : (byte) 8;
                break;
            case -43467528:
                b10 = !strU.equals(y.f51581k0) ? (byte) -1 : (byte) 9;
                break;
            case 13915911:
                b10 = !strU.equals(y.f51602v) ? (byte) -1 : (byte) 10;
                break;
            case 187078296:
                b10 = !strU.equals(y.L) ? (byte) -1 : (byte) 11;
                break;
            case 187078297:
                b10 = !strU.equals(y.O) ? (byte) -1 : (byte) 12;
                break;
            case 187078669:
                b10 = !strU.equals("audio/amr") ? (byte) -1 : (byte) 13;
                break;
            case 187090232:
                b10 = !strU.equals(y.f51610z) ? (byte) -1 : (byte) 14;
                break;
            case 187091926:
                b10 = !strU.equals(y.f51565c0) ? (byte) -1 : (byte) 15;
                break;
            case 187099443:
                b10 = !strU.equals(y.f51567d0) ? (byte) -1 : (byte) 16;
                break;
            case 1331848029:
                b10 = !strU.equals("video/mp4") ? (byte) -1 : (byte) 17;
                break;
            case 1503095341:
                b10 = !strU.equals(y.X) ? (byte) -1 : com.google.common.base.a.f56668u;
                break;
            case 1504578661:
                b10 = !strU.equals(y.M) ? (byte) -1 : (byte) 19;
                break;
            case 1504619009:
                b10 = !strU.equals(y.Z) ? (byte) -1 : com.google.common.base.a.f56671x;
                break;
            case 1504831518:
                b10 = !strU.equals("audio/mpeg") ? (byte) -1 : com.google.common.base.a.f56672y;
                break;
            case 1505118770:
                b10 = !strU.equals(y.C) ? (byte) -1 : com.google.common.base.a.f56673z;
                break;
            case 2039520277:
                b10 = !strU.equals(y.f51572g) ? (byte) -1 : com.google.common.base.a.A;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 11:
            case 19:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 8:
            case 9:
            case 22:
            case 23:
                return 6;
            case 4:
            case 13:
            case 18:
                return 3;
            case 5:
                return 14;
            case 6:
            case 14:
            case 17:
                return 8;
            case 7:
                return 13;
            case 10:
                return 5;
            case 12:
                return 1;
            case 15:
                return 9;
            case 16:
                return 12;
            case 20:
                return 4;
            case 21:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(f51484r) || lastPathSegment.endsWith(f51485s)) {
            return 0;
        }
        if (lastPathSegment.endsWith(f51486t)) {
            return 1;
        }
        if (lastPathSegment.endsWith(f51487u) || lastPathSegment.endsWith(f51488v)) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(f51490x)) {
            return 4;
        }
        if (lastPathSegment.endsWith(f51491y)) {
            return 5;
        }
        if (lastPathSegment.startsWith(f51492z, lastPathSegment.length() - 4) || lastPathSegment.endsWith(A)) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(F, lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(H, lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(B, lastPathSegment.length() - 4) || lastPathSegment.endsWith(C)) {
            return 9;
        }
        if (lastPathSegment.endsWith(I) || lastPathSegment.endsWith(J) || lastPathSegment.endsWith(K) || lastPathSegment.endsWith(L)) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(P)) {
            return 12;
        }
        if (lastPathSegment.endsWith(Q) || lastPathSegment.endsWith(R)) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }
}
