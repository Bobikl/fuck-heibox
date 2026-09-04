package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.p0;
import com.meituan.robust.Constants;
import java.io.File;

/* JADX INFO: compiled from: CacheSpan.java */
/* JADX INFO: loaded from: classes7.dex */
public class h implements Comparable<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f51003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final File f51005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f51006g;

    public h(String str, long j10, long j11) {
        this(str, j10, j11, com.google.android.exoplayer2.j.f46377b, null);
    }

    public h(String str, long j10, long j11, long j12, @p0 File file) {
        this.f51001b = str;
        this.f51002c = j10;
        this.f51003d = j11;
        this.f51004e = file != null;
        this.f51005f = file;
        this.f51006g = j12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        if (!this.f51001b.equals(hVar.f51001b)) {
            return this.f51001b.compareTo(hVar.f51001b);
        }
        long j10 = this.f51002c - hVar.f51002c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f51004e;
    }

    public boolean c() {
        return this.f51003d == -1;
    }

    public String toString() {
        long j10 = this.f51002c;
        long j11 = this.f51003d;
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append(Constants.ARRAY_TYPE);
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append("]");
        return sb2.toString();
    }
}
