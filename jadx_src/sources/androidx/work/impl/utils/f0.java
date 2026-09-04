package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.p0;
import java.util.UUID;

/* JADX INFO: compiled from: WorkProgressUpdater.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class f0 implements androidx.work.u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f29308c = androidx.work.n.i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WorkDatabase f29309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.work.impl.utils.taskexecutor.c f29310b;

    /* JADX INFO: compiled from: WorkProgressUpdater.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f29311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.e f29312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.a f29313d;

        a(UUID uuid, androidx.work.e eVar, androidx.work.impl.utils.futures.a aVar) {
            this.f29311b = uuid;
            this.f29312c = eVar;
            this.f29313d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = this.f29311b.toString();
            androidx.work.n nVarE = androidx.work.n.e();
            String str = f0.f29308c;
            nVarE.a(str, "Updating progress for " + this.f29311b + " (" + this.f29312c + ")");
            f0.this.f29309a.e();
            try {
                androidx.work.impl.model.u uVarZ = f0.this.f29309a.X().z(string);
                if (uVarZ == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (uVarZ.state == WorkInfo.State.RUNNING) {
                    f0.this.f29309a.W().d(new androidx.work.impl.model.q(string, this.f29312c));
                } else {
                    androidx.work.n.e().l(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                }
                this.f29313d.p(null);
                f0.this.f29309a.O();
            } catch (Throwable th2) {
                try {
                    androidx.work.n.e().d(f0.f29308c, "Error updating Worker progress", th2);
                    this.f29313d.q(th2);
                } finally {
                    f0.this.f29309a.k();
                }
            }
        }
    }

    public f0(@n0 WorkDatabase workDatabase, @n0 androidx.work.impl.utils.taskexecutor.c cVar) {
        this.f29309a = workDatabase;
        this.f29310b = cVar;
    }

    @Override // androidx.work.u
    @n0
    public p0<Void> a(@n0 Context context, @n0 UUID uuid, @n0 androidx.work.e eVar) {
        androidx.work.impl.utils.futures.a aVarU = androidx.work.impl.utils.futures.a.u();
        this.f29310b.a(new a(uuid, eVar, aVarU));
        return aVarU;
    }
}
