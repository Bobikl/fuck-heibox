package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PriorityDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f51146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityTaskManager f51147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51148d;

    /* JADX INFO: compiled from: PriorityDataSource.java */
    public static final class a implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o.a f51149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final PriorityTaskManager f51150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f51151c;

        public a(o.a aVar, PriorityTaskManager priorityTaskManager, int i10) {
            this.f51149a = aVar;
            this.f51150b = priorityTaskManager;
            this.f51151c = i10;
        }

        @Override // com.google.android.exoplayer2.upstream.o.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public j0 a() {
            return new j0(this.f51149a.a(), this.f51150b, this.f51151c);
        }
    }

    public j0(o oVar, PriorityTaskManager priorityTaskManager, int i10) {
        this.f51146b = (o) com.google.android.exoplayer2.util.a.g(oVar);
        this.f51147c = (PriorityTaskManager) com.google.android.exoplayer2.util.a.g(priorityTaskManager);
        this.f51148d = i10;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        this.f51147c.d(this.f51148d);
        return this.f51146b.a(rVar);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public Map<String, List<String>> b() {
        return this.f51146b.b();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() throws IOException {
        this.f51146b.close();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        this.f51146b.e(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f51146b.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f51147c.d(this.f51148d);
        return this.f51146b.read(bArr, i10, i11);
    }
}
