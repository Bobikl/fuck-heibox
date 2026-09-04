package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.p0;
import java.util.UUID;

/* JADX INFO: compiled from: WorkForegroundUpdater.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class e0 implements androidx.work.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f29299d = androidx.work.n.i("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.utils.taskexecutor.c f29300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.work.impl.foreground.a f29301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final androidx.work.impl.model.v f29302c;

    /* JADX INFO: compiled from: WorkForegroundUpdater.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.a f29303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f29304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.work.h f29305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f29306e;

        a(androidx.work.impl.utils.futures.a aVar, UUID uuid, androidx.work.h hVar, Context context) {
            this.f29303b = aVar;
            this.f29304c = uuid;
            this.f29305d = hVar;
            this.f29306e = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f29303b.isCancelled()) {
                    String string = this.f29304c.toString();
                    androidx.work.impl.model.u uVarZ = e0.this.f29302c.z(string);
                    if (uVarZ == null || uVarZ.state.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    e0.this.f29301b.c(string, this.f29305d);
                    this.f29306e.startService(androidx.work.impl.foreground.b.f(this.f29306e, androidx.work.impl.model.x.a(uVarZ), this.f29305d));
                }
                this.f29303b.p(null);
            } catch (Throwable th2) {
                this.f29303b.q(th2);
            }
        }
    }

    public e0(@n0 WorkDatabase workDatabase, @n0 androidx.work.impl.foreground.a aVar, @n0 androidx.work.impl.utils.taskexecutor.c cVar) {
        this.f29301b = aVar;
        this.f29300a = cVar;
        this.f29302c = workDatabase.X();
    }

    @Override // androidx.work.i
    @n0
    public p0<Void> a(@n0 Context context, @n0 UUID uuid, @n0 androidx.work.h hVar) {
        androidx.work.impl.utils.futures.a aVarU = androidx.work.impl.utils.futures.a.u();
        this.f29300a.a(new a(aVarU, uuid, hVar, context));
        return aVarU;
    }
}
