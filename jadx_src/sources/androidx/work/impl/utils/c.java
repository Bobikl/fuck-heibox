package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.annotation.k1;
import androidx.annotation.n0;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.o f29276b = new androidx.work.impl.o();

    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    public class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.g0 f29277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ UUID f29278d;

        a(androidx.work.impl.g0 g0Var, UUID uuid) {
            this.f29277c = g0Var;
            this.f29278d = uuid;
        }

        @Override // androidx.work.impl.utils.c
        @k1
        void i() {
            WorkDatabase workDatabaseP = this.f29277c.P();
            workDatabaseP.e();
            try {
                a(this.f29277c, this.f29278d.toString());
                workDatabaseP.O();
                workDatabaseP.k();
                h(this.f29277c);
            } catch (Throwable th2) {
                workDatabaseP.k();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    public class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.g0 f29279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29280d;

        b(androidx.work.impl.g0 g0Var, String str) {
            this.f29279c = g0Var;
            this.f29280d = str;
        }

        @Override // androidx.work.impl.utils.c
        @k1
        void i() {
            WorkDatabase workDatabaseP = this.f29279c.P();
            workDatabaseP.e();
            try {
                Iterator<String> it = workDatabaseP.X().i(this.f29280d).iterator();
                while (it.hasNext()) {
                    a(this.f29279c, it.next());
                }
                workDatabaseP.O();
                workDatabaseP.k();
                h(this.f29279c);
            } catch (Throwable th2) {
                workDatabaseP.k();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    public class C0233c extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.g0 f29281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f29283e;

        C0233c(androidx.work.impl.g0 g0Var, String str, boolean z10) {
            this.f29281c = g0Var;
            this.f29282d = str;
            this.f29283e = z10;
        }

        @Override // androidx.work.impl.utils.c
        @k1
        void i() {
            WorkDatabase workDatabaseP = this.f29281c.P();
            workDatabaseP.e();
            try {
                Iterator<String> it = workDatabaseP.X().f(this.f29282d).iterator();
                while (it.hasNext()) {
                    a(this.f29281c, it.next());
                }
                workDatabaseP.O();
                workDatabaseP.k();
                if (this.f29283e) {
                    h(this.f29281c);
                }
            } catch (Throwable th2) {
                workDatabaseP.k();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: CancelWorkRunnable.java */
    public class d extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.g0 f29284c;

        d(androidx.work.impl.g0 g0Var) {
            this.f29284c = g0Var;
        }

        @Override // androidx.work.impl.utils.c
        @k1
        void i() {
            WorkDatabase workDatabaseP = this.f29284c.P();
            workDatabaseP.e();
            try {
                Iterator<String> it = workDatabaseP.X().q().iterator();
                while (it.hasNext()) {
                    a(this.f29284c, it.next());
                }
                new r(this.f29284c.P()).f(System.currentTimeMillis());
                workDatabaseP.O();
            } finally {
                workDatabaseP.k();
            }
        }
    }

    @n0
    public static c b(@n0 androidx.work.impl.g0 g0Var) {
        return new d(g0Var);
    }

    @n0
    public static c c(@n0 UUID uuid, @n0 androidx.work.impl.g0 g0Var) {
        return new a(g0Var, uuid);
    }

    @n0
    public static c d(@n0 String str, @n0 androidx.work.impl.g0 g0Var, boolean z10) {
        return new C0233c(g0Var, str, z10);
    }

    @n0
    public static c e(@n0 String str, @n0 androidx.work.impl.g0 g0Var) {
        return new b(g0Var, str);
    }

    private void g(WorkDatabase workDatabase, String str) {
        androidx.work.impl.model.v vVarX = workDatabase.X();
        androidx.work.impl.model.b bVarR = workDatabase.R();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State stateG = vVarX.g(str2);
            if (stateG != WorkInfo.State.SUCCEEDED && stateG != WorkInfo.State.FAILED) {
                vVarX.m(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(bVarR.b(str2));
        }
    }

    void a(androidx.work.impl.g0 g0Var, String str) {
        g(g0Var.P(), str);
        g0Var.L().s(str);
        Iterator<androidx.work.impl.t> it = g0Var.N().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    @n0
    public androidx.work.q f() {
        return this.f29276b;
    }

    void h(androidx.work.impl.g0 g0Var) {
        androidx.work.impl.u.b(g0Var.o(), g0Var.P(), g0Var.N());
    }

    abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        try {
            i();
            this.f29276b.a(androidx.work.q.f29462a);
        } catch (Throwable th2) {
            this.f29276b.a(new androidx.work.q.b.a(th2));
        }
    }
}
