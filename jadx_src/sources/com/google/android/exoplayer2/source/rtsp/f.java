package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: RtpDataLoadable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f48702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f48703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.m f48704d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d.a f48706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f48707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f48708h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile long f48710j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f48705e = u0.y();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile long f48709i = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: compiled from: RtpDataLoadable.java */
    public interface a {
        void a(String str, d dVar);
    }

    public f(int i10, x xVar, a aVar, com.google.android.exoplayer2.extractor.m mVar, d.a aVar2) {
        this.f48701a = i10;
        this.f48702b = xVar;
        this.f48703c = aVar;
        this.f48704d = mVar;
        this.f48706f = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str, d dVar) {
        this.f48703c.a(str, dVar);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() throws IOException {
        final d dVarB = null;
        try {
            dVarB = this.f48706f.b(this.f48701a);
            final String strD = dVarB.d();
            this.f48705e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48695b.d(strD, dVarB);
                }
            });
            com.google.android.exoplayer2.extractor.g gVar = new com.google.android.exoplayer2.extractor.g((com.google.android.exoplayer2.upstream.k) com.google.android.exoplayer2.util.a.g(dVarB), 0L, -1L);
            g gVar2 = new g(this.f48702b.f48975a, this.f48701a);
            this.f48707g = gVar2;
            gVar2.b(this.f48704d);
            while (!this.f48708h) {
                if (this.f48709i != com.google.android.exoplayer2.j.f46377b) {
                    this.f48707g.a(this.f48710j, this.f48709i);
                    this.f48709i = com.google.android.exoplayer2.j.f46377b;
                }
                if (this.f48707g.g(gVar, new com.google.android.exoplayer2.extractor.z()) == -1) {
                    break;
                }
            }
        } finally {
            com.google.android.exoplayer2.upstream.q.a(dVarB);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void c() {
        this.f48708h = true;
    }

    public void e() {
        ((g) com.google.android.exoplayer2.util.a.g(this.f48707g)).e();
    }

    public void f(long j10, long j11) {
        this.f48709i = j10;
        this.f48710j = j11;
    }

    public void g(int i10) {
        if (((g) com.google.android.exoplayer2.util.a.g(this.f48707g)).d()) {
            return;
        }
        this.f48707g.h(i10);
    }

    public void h(long j10) {
        if (j10 == com.google.android.exoplayer2.j.f46377b || ((g) com.google.android.exoplayer2.util.a.g(this.f48707g)).d()) {
            return;
        }
        this.f48707g.i(j10);
    }
}
