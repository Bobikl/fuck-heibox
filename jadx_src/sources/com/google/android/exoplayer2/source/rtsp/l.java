package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: RtpUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48830a = "rtp://0.0.0.0";

    private l() {
    }

    public static r a(int i10) {
        return new r(Uri.parse(u0.H("%s:%d", f48830a, Integer.valueOf(i10))));
    }
}
