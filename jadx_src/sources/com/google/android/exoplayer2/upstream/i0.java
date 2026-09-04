package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ParsingLoadable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i0<T> implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f51130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r0 f51132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a<? extends T> f51133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile T f51134f;

    /* JADX INFO: compiled from: ParsingLoadable.java */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public i0(o oVar, Uri uri, int i10, a<? extends T> aVar) {
        this(oVar, new r.b().j(uri).c(1).a(), i10, aVar);
    }

    public i0(o oVar, r rVar, int i10, a<? extends T> aVar) {
        this.f51132d = new r0(oVar);
        this.f51130b = rVar;
        this.f51131c = i10;
        this.f51133e = aVar;
        this.f51129a = com.google.android.exoplayer2.source.u.a();
    }

    public static <T> T g(o oVar, a<? extends T> aVar, Uri uri, int i10) throws IOException {
        i0 i0Var = new i0(oVar, uri, i10, aVar);
        i0Var.a();
        return (T) com.google.android.exoplayer2.util.a.g(i0Var.e());
    }

    public static <T> T h(o oVar, a<? extends T> aVar, r rVar, int i10) throws IOException {
        i0 i0Var = new i0(oVar, rVar, i10, aVar);
        i0Var.a();
        return (T) com.google.android.exoplayer2.util.a.g(i0Var.e());
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() throws IOException {
        this.f51132d.y();
        p pVar = new p(this.f51132d, this.f51130b);
        try {
            pVar.c();
            this.f51134f = this.f51133e.a((Uri) com.google.android.exoplayer2.util.a.g(this.f51132d.getUri()), pVar);
        } finally {
            com.google.android.exoplayer2.util.u0.p(pVar);
        }
    }

    public long b() {
        return this.f51132d.p();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.f51132d.x();
    }

    @androidx.annotation.p0
    public final T e() {
        return this.f51134f;
    }

    public Uri f() {
        return this.f51132d.w();
    }
}
