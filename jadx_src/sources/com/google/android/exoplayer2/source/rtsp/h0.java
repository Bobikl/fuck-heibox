package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.u0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RtspSessionTiming.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f48770c = new h0(0, com.google.android.exoplayer2.j.f46377b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f48771d = Pattern.compile("npt=([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48772e = "npt=%.3f-";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f48773f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48775b;

    private h0(long j10, long j11) {
        this.f48774a = j10;
        this.f48775b = j11;
    }

    public static String b(long j10) {
        return u0.H(f48772e, Double.valueOf(j10 / 1000.0d));
    }

    public static h0 d(String str) throws ParserException {
        long j10;
        Matcher matcher = f48771d.matcher(str);
        com.google.android.exoplayer2.util.a.a(matcher.matches());
        String str2 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(1));
        long j11 = str2.equals("now") ? 0L : (long) (Float.parseFloat(str2) * 1000.0f);
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j10 = (long) (Float.parseFloat(strGroup) * 1000.0f);
                com.google.android.exoplayer2.util.a.a(j10 > j11);
            } catch (NumberFormatException e10) {
                throw ParserException.c(strGroup, e10);
            }
        } else {
            j10 = com.google.android.exoplayer2.j.f46377b;
        }
        return new h0(j11, j10);
    }

    public long a() {
        return this.f48775b - this.f48774a;
    }

    public boolean c() {
        return this.f48775b == com.google.android.exoplayer2.j.f46377b;
    }
}
