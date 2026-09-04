package androidx.work.impl.background.greedy;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.work.impl.model.u;
import androidx.work.n;
import androidx.work.v;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DelayedWorkTracker.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f28814d = n.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f28815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f28816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Runnable> f28817c = new HashMap();

    /* JADX INFO: renamed from: androidx.work.impl.background.greedy.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DelayedWorkTracker.java */
    public class RunnableC0230a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f28818b;

        RunnableC0230a(u uVar) {
            this.f28818b = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.e().a(a.f28814d, "Scheduling work " + this.f28818b.id);
            a.this.f28815a.c(this.f28818b);
        }
    }

    public a(@n0 b bVar, @n0 v vVar) {
        this.f28815a = bVar;
        this.f28816b = vVar;
    }

    public void a(@n0 u uVar) {
        Runnable runnableRemove = this.f28817c.remove(uVar.id);
        if (runnableRemove != null) {
            this.f28816b.a(runnableRemove);
        }
        RunnableC0230a runnableC0230a = new RunnableC0230a(uVar);
        this.f28817c.put(uVar.id, runnableC0230a);
        this.f28816b.b(uVar.c() - System.currentTimeMillis(), runnableC0230a);
    }

    public void b(@n0 String str) {
        Runnable runnableRemove = this.f28817c.remove(str);
        if (runnableRemove != null) {
            this.f28816b.a(runnableRemove);
        }
    }
}
