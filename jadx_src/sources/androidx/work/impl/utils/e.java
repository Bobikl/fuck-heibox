package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: EnqueueRunnable.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f29296d = androidx.work.n.i("EnqueueRunnable");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.x f29297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.o f29298c;

    public e(@n0 androidx.work.impl.x xVar) {
        this(xVar, new androidx.work.impl.o());
    }

    public e(@n0 androidx.work.impl.x xVar, @n0 androidx.work.impl.o oVar) {
        this.f29297b = xVar;
        this.f29298c = oVar;
    }

    private static boolean b(@n0 androidx.work.impl.x xVar) {
        boolean zC = c(xVar.n(), xVar.m(), (String[]) androidx.work.impl.x.s(xVar).toArray(new String[0]), xVar.k(), xVar.i());
        xVar.r();
        return zC;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0152  */
    private static boolean c(androidx.work.impl.g0 g0Var, @n0 List<? extends androidx.work.y> list, String[] strArr, String str, ExistingWorkPolicy existingWorkPolicy) {
        boolean z10;
        boolean z11;
        boolean z12;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabaseP = g0Var.P();
        boolean z13 = true;
        boolean z14 = strArr2 != null && strArr2.length > 0;
        if (z14) {
            z10 = true;
            z11 = false;
            z12 = false;
            for (String str2 : strArr2) {
                androidx.work.impl.model.u uVarZ = workDatabaseP.X().z(str2);
                if (uVarZ == null) {
                    androidx.work.n.e().c(f29296d, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                WorkInfo.State state = uVarZ.state;
                z10 &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z12 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z11 = true;
                }
            }
        } else {
            z10 = true;
            z11 = false;
            z12 = false;
        }
        boolean z15 = !TextUtils.isEmpty(str);
        if (z15 && !z14) {
            List<androidx.work.impl.model.u.IdAndState> listD = workDatabaseP.X().D(str);
            if (!listD.isEmpty()) {
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    androidx.work.impl.model.b bVarR = workDatabaseP.R();
                    List arrayList = new ArrayList();
                    for (androidx.work.impl.model.u.IdAndState idAndState : listD) {
                        if (!bVarR.e(idAndState.id)) {
                            WorkInfo.State state2 = idAndState.state;
                            boolean z16 = (state2 == WorkInfo.State.SUCCEEDED) & z10;
                            if (state2 == WorkInfo.State.FAILED) {
                                z12 = true;
                            } else if (state2 == WorkInfo.State.CANCELLED) {
                                z11 = true;
                            }
                            arrayList.add(idAndState.id);
                            z10 = z16;
                        }
                        bVarR = bVarR;
                    }
                    if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z11 || z12)) {
                        androidx.work.impl.model.v vVarX = workDatabaseP.X();
                        Iterator<androidx.work.impl.model.u.IdAndState> it = vVarX.D(str).iterator();
                        while (it.hasNext()) {
                            vVarX.a(it.next().id);
                        }
                        arrayList = Collections.emptyList();
                        z11 = false;
                        z12 = false;
                    }
                    strArr2 = (String[]) arrayList.toArray(strArr2);
                    z14 = strArr2.length > 0;
                } else {
                    if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                        Iterator<androidx.work.impl.model.u.IdAndState> it2 = listD.iterator();
                        while (it2.hasNext()) {
                            WorkInfo.State state3 = it2.next().state;
                            if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                                return false;
                            }
                        }
                    }
                    c.d(str, g0Var, false).run();
                    androidx.work.impl.model.v vVarX2 = workDatabaseP.X();
                    Iterator<androidx.work.impl.model.u.IdAndState> it3 = listD.iterator();
                    while (it3.hasNext()) {
                        vVarX2.a(it3.next().id);
                    }
                }
            }
            z13 = false;
        } else {
            z13 = false;
        }
        Iterator<? extends androidx.work.y> it4 = list.iterator();
        while (it4.hasNext()) {
            androidx.work.y next = it4.next();
            androidx.work.impl.model.u workSpec = next.getWorkSpec();
            if (!z14 || z10) {
                workSpec.lastEnqueueTime = jCurrentTimeMillis;
            } else if (z12) {
                workSpec.state = WorkInfo.State.FAILED;
            } else if (z11) {
                workSpec.state = WorkInfo.State.CANCELLED;
            } else {
                workSpec.state = WorkInfo.State.BLOCKED;
            }
            Iterator<? extends androidx.work.y> it5 = it4;
            if (workSpec.state == WorkInfo.State.ENQUEUED) {
                z13 = true;
            }
            workDatabaseP.X().e(f.c(g0Var.N(), workSpec));
            if (z14) {
                int length = strArr2.length;
                int i10 = 0;
                while (i10 < length) {
                    workDatabaseP.R().a(new androidx.work.impl.model.a(next.b(), strArr2[i10]));
                    i10++;
                    length = length;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            workDatabaseP.Y().b(next.b(), next.c());
            if (z15) {
                workDatabaseP.V().a(new androidx.work.impl.model.n(str, next.b()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z13;
    }

    private static boolean e(@n0 androidx.work.impl.x xVar) {
        List<androidx.work.impl.x> listL = xVar.l();
        boolean zE = false;
        if (listL != null) {
            for (androidx.work.impl.x xVar2 : listL) {
                if (xVar2.q()) {
                    androidx.work.n.e().l(f29296d, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.j()) + ")");
                } else {
                    zE |= e(xVar2);
                }
            }
        }
        return b(xVar) | zE;
    }

    @j1
    public boolean a() {
        WorkDatabase workDatabaseP = this.f29297b.n().P();
        workDatabaseP.e();
        try {
            boolean zE = e(this.f29297b);
            workDatabaseP.O();
            return zE;
        } finally {
            workDatabaseP.k();
        }
    }

    @n0
    public androidx.work.q d() {
        return this.f29298c;
    }

    @j1
    public void f() {
        androidx.work.impl.g0 g0VarN = this.f29297b.n();
        androidx.work.impl.u.b(g0VarN.o(), g0VarN.P(), g0VarN.N());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f29297b.o()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f29297b + ")");
            }
            if (a()) {
                q.c(this.f29297b.n().H(), RescheduleReceiver.class, true);
                f();
            }
            this.f29298c.a(androidx.work.q.f29462a);
        } catch (Throwable th2) {
            this.f29298c.a(new androidx.work.q.b.a(th2));
        }
    }
}
