package androidx.work;

import android.content.Context;
import androidx.annotation.k1;
import androidx.annotation.n0;
import com.google.common.util.concurrent.p0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Worker extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.work.impl.utils.futures.a<m.a> f28705f;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f28705f.p(Worker.this.w());
            } catch (Throwable th2) {
                Worker.this.f28705f.q(th2);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.a f28707b;

        b(androidx.work.impl.utils.futures.a aVar) {
            this.f28707b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28707b.p(Worker.this.x());
            } catch (Throwable th2) {
                this.f28707b.q(th2);
            }
        }
    }

    public Worker(@n0 Context context, @n0 WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.m
    @n0
    public p0<h> d() {
        androidx.work.impl.utils.futures.a aVarU = androidx.work.impl.utils.futures.a.u();
        c().execute(new b(aVarU));
        return aVarU;
    }

    @Override // androidx.work.m
    @n0
    public final p0<m.a> u() {
        this.f28705f = androidx.work.impl.utils.futures.a.u();
        c().execute(new a());
        return this.f28705f;
    }

    @k1
    @n0
    public abstract m.a w();

    @k1
    @n0
    public h x() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
