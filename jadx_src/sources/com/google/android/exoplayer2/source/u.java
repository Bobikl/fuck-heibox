package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: LoadEventInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f49172h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.r f49174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f49175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f49176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f49177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f49178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f49179g;

    public u(long j10, com.google.android.exoplayer2.upstream.r rVar, long j11) {
        this(j10, rVar, rVar.f51194a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public u(long j10, com.google.android.exoplayer2.upstream.r rVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f49173a = j10;
        this.f49174b = rVar;
        this.f49175c = uri;
        this.f49176d = map;
        this.f49177e = j11;
        this.f49178f = j12;
        this.f49179g = j13;
    }

    public static long a() {
        return f49172h.getAndIncrement();
    }
}
