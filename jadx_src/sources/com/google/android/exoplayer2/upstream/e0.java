package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: HttpUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f51101a = "HttpUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f51102b = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f51103c = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private e0() {
    }

    @androidx.annotation.p0
    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    public static long b(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        long j10;
        if (TextUtils.isEmpty(str)) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 28);
                sb2.append("Unexpected Content-Length [");
                sb2.append(str);
                sb2.append("]");
                com.google.android.exoplayer2.util.u.d(f51101a, sb2.toString());
                j10 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f51102b.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            long j11 = (Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(2))) - Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)))) + 1;
            if (j10 < 0) {
                return j11;
            }
            if (j10 == j11) {
                return j10;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
            sb3.append("Inconsistent headers [");
            sb3.append(str);
            sb3.append("] [");
            sb3.append(str2);
            sb3.append("]");
            com.google.android.exoplayer2.util.u.m(f51101a, sb3.toString());
            return Math.max(j10, j11);
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb4.append("Unexpected Content-Range [");
            sb4.append(str2);
            sb4.append("]");
            com.google.android.exoplayer2.util.u.d(f51101a, sb4.toString());
            return j10;
        }
    }

    public static long c(@androidx.annotation.p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f51103c.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
        }
        return -1L;
    }
}
