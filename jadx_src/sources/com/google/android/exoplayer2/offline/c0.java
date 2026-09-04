package com.google.android.exoplayer2.offline;

import androidx.annotation.p0;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ProgressiveDownloader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f47186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.r f47187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.cache.a f47188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.cache.i f47189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final PriorityTaskManager f47190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private x.a f47191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile h0<Void, IOException> f47192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f47193h;

    /* JADX INFO: compiled from: ProgressiveDownloader.java */
    public class a extends h0<Void, IOException> {
        a() {
        }

        @Override // com.google.android.exoplayer2.util.h0
        protected void c() {
            c0.this.f47189d.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.util.h0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void d() throws IOException {
            c0.this.f47189d.a();
            return null;
        }
    }

    public c0(i2 i2Var, com.google.android.exoplayer2.upstream.cache.a.d dVar) {
        this(i2Var, dVar, new androidx.profileinstaller.f());
    }

    public c0(i2 i2Var, com.google.android.exoplayer2.upstream.cache.a.d dVar, Executor executor) {
        this.f47186a = (Executor) com.google.android.exoplayer2.util.a.g(executor);
        com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
        com.google.android.exoplayer2.upstream.r rVarA = new com.google.android.exoplayer2.upstream.r.b().j(i2Var.f46269c.f46345a).g(i2Var.f46269c.f46350f).c(4).a();
        this.f47187b = rVarA;
        com.google.android.exoplayer2.upstream.cache.a aVarD = dVar.d();
        this.f47188c = aVarD;
        this.f47189d = new com.google.android.exoplayer2.upstream.cache.i(aVarD, rVarA, null, new com.google.android.exoplayer2.upstream.cache.i.a() { // from class: com.google.android.exoplayer2.offline.b0
            @Override // com.google.android.exoplayer2.upstream.cache.i.a
            public final void a(long j10, long j11, long j12) {
                this.f47158a.d(j10, j11, j12);
            }
        });
        this.f47190e = dVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j10, long j11, long j12) {
        x.a aVar = this.f47191f;
        if (aVar == null) {
            return;
        }
        aVar.a(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    @Override // com.google.android.exoplayer2.offline.x
    public void a(@p0 x.a aVar) throws InterruptedException, IOException {
        this.f47191f = aVar;
        this.f47192g = new a();
        PriorityTaskManager priorityTaskManager = this.f47190e;
        if (priorityTaskManager != null) {
            priorityTaskManager.a(-1000);
        }
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.f47193h) {
                    break;
                }
                PriorityTaskManager priorityTaskManager2 = this.f47190e;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.b(-1000);
                }
                this.f47186a.execute(this.f47192g);
                try {
                    this.f47192g.get();
                    z10 = true;
                } catch (ExecutionException e10) {
                    Throwable th2 = (Throwable) com.google.android.exoplayer2.util.a.g(e10.getCause());
                    if (!(th2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        u0.n1(th2);
                    }
                }
            } catch (Throwable th3) {
                this.f47192g.a();
                PriorityTaskManager priorityTaskManager3 = this.f47190e;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.e(-1000);
                }
                throw th3;
            }
        }
        this.f47192g.a();
        PriorityTaskManager priorityTaskManager4 = this.f47190e;
        if (priorityTaskManager4 != null) {
            priorityTaskManager4.e(-1000);
        }
    }

    @Override // com.google.android.exoplayer2.offline.x
    public void cancel() {
        this.f47193h = true;
        h0<Void, IOException> h0Var = this.f47192g;
        if (h0Var != null) {
            h0Var.cancel(true);
        }
    }

    @Override // com.google.android.exoplayer2.offline.x
    public void remove() {
        this.f47188c.w().r(this.f47188c.x().a(this.f47187b));
    }
}
