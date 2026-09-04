package com.google.android.exoplayer2.source.chunk;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.r0;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Chunk.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47647a = u.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.r f47648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f47650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final Object f47652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f47653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f47654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final r0 f47655i;

    public f(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.r rVar, int i10, a2 a2Var, int i11, @p0 Object obj, long j10, long j11) {
        this.f47655i = new r0(oVar);
        this.f47648b = (com.google.android.exoplayer2.upstream.r) com.google.android.exoplayer2.util.a.g(rVar);
        this.f47649c = i10;
        this.f47650d = a2Var;
        this.f47651e = i11;
        this.f47652f = obj;
        this.f47653g = j10;
        this.f47654h = j11;
    }

    public final long b() {
        return this.f47655i.p();
    }

    public final long d() {
        return this.f47654h - this.f47653g;
    }

    public final Map<String, List<String>> e() {
        return this.f47655i.x();
    }

    public final Uri f() {
        return this.f47655i.w();
    }
}
