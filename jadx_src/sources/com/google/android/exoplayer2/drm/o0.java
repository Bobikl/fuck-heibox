package com.google.android.exoplayer2.drm;

import android.util.Pair;
import java.util.Map;

/* JADX INFO: compiled from: WidevineUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44744a = "LicenseDurationRemaining";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44745b = "PlaybackDurationRemaining";

    private o0() {
    }

    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return com.google.android.exoplayer2.j.f46377b;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : com.google.android.exoplayer2.j.f46377b;
        } catch (NumberFormatException unused) {
            return com.google.android.exoplayer2.j.f46377b;
        }
    }

    @androidx.annotation.p0
    public static Pair<Long, Long> b(DrmSession drmSession) {
        Map<String, String> mapU = drmSession.u();
        if (mapU == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(mapU, "LicenseDurationRemaining")), Long.valueOf(a(mapU, "PlaybackDurationRemaining")));
    }
}
