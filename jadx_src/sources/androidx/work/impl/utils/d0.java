package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import com.google.common.util.concurrent.p0;

/* JADX INFO: compiled from: WorkForegroundRunnable.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class d0 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f29287h = androidx.work.n.i("WorkForegroundRunnable");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.work.impl.utils.futures.a<Void> f29288b = androidx.work.impl.utils.futures.a.u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f29289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.work.impl.model.u f29290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.work.m f29291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.work.i f29292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final androidx.work.impl.utils.taskexecutor.c f29293g;

    /* JADX INFO: compiled from: WorkForegroundRunnable.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.a f29294b;

        a(androidx.work.impl.utils.futures.a aVar) {
            this.f29294b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (d0.this.f29288b.isCancelled()) {
                return;
            }
            try {
                androidx.work.h hVar = (androidx.work.h) this.f29294b.get();
                if (hVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + d0.this.f29290d.workerClassName + ") but did not provide ForegroundInfo");
                }
                androidx.work.n.e().a(d0.f29287h, "Updating notification for " + d0.this.f29290d.workerClassName);
                d0 d0Var = d0.this;
                d0Var.f29288b.r(d0Var.f29292f.a(d0Var.f29289c, d0Var.f29291e.f(), hVar));
            } catch (Throwable th2) {
                d0.this.f29288b.q(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public d0(@n0 Context context, @n0 androidx.work.impl.model.u uVar, @n0 androidx.work.m mVar, @n0 androidx.work.i iVar, @n0 androidx.work.impl.utils.taskexecutor.c cVar) {
        this.f29289c = context;
        this.f29290d = uVar;
        this.f29291e = mVar;
        this.f29292f = iVar;
        this.f29293g = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(androidx.work.impl.utils.futures.a aVar) {
        if (this.f29288b.isCancelled()) {
            aVar.cancel(true);
        } else {
            aVar.r(this.f29291e.d());
        }
    }

    @n0
    public p0<Void> b() {
        return this.f29288b;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f29290d.expedited || Build.VERSION.SDK_INT >= 31) {
            this.f29288b.p(null);
            return;
        }
        final androidx.work.impl.utils.futures.a aVarU = androidx.work.impl.utils.futures.a.u();
        this.f29293g.b().execute(new Runnable() { // from class: androidx.work.impl.utils.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f29285b.c(aVarU);
            }
        });
        aVarU.V(new a(aVarU), this.f29293g.b());
    }
}
