package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ResolvingDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f51160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f51161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51162d;

    /* JADX INFO: compiled from: ResolvingDataSource.java */
    public static final class a implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o.a f51163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f51164b;

        public a(o.a aVar, b bVar) {
            this.f51163a = aVar;
            this.f51164b = bVar;
        }

        @Override // com.google.android.exoplayer2.upstream.o.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public m0 a() {
            return new m0(this.f51163a.a(), this.f51164b);
        }
    }

    /* JADX INFO: compiled from: ResolvingDataSource.java */
    public interface b {
        r a(r rVar) throws IOException;

        Uri b(Uri uri);
    }

    public m0(o oVar, b bVar) {
        this.f51160b = oVar;
        this.f51161c = bVar;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        r rVarA = this.f51161c.a(rVar);
        this.f51162d = true;
        return this.f51160b.a(rVarA);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public Map<String, List<String>> b() {
        return this.f51160b.b();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() throws IOException {
        if (this.f51162d) {
            this.f51162d = false;
            this.f51160b.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        this.f51160b.e(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        Uri uri = this.f51160b.getUri();
        if (uri == null) {
            return null;
        }
        return this.f51161c.b(uri);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f51160b.read(bArr, i10, i11);
    }
}
