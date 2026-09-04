package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.p0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Period.java */
/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final String f47907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f47909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<f> f47910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final e f47911e;

    public g(@p0 String str, long j10, List<a> list) {
        this(str, j10, list, Collections.emptyList(), null);
    }

    public g(@p0 String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public g(@p0 String str, long j10, List<a> list, List<f> list2, @p0 e eVar) {
        this.f47907a = str;
        this.f47908b = j10;
        this.f47909c = Collections.unmodifiableList(list);
        this.f47910d = Collections.unmodifiableList(list2);
        this.f47911e = eVar;
    }

    public int a(int i10) {
        int size = this.f47909c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f47909c.get(i11).f47862b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
