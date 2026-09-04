package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: StartWorkRunnable.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class w implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.impl.g0 f29389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.impl.v f29390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WorkerParameters.a f29391d;

    public w(@n0 androidx.work.impl.g0 g0Var, @n0 androidx.work.impl.v vVar, @p0 WorkerParameters.a aVar) {
        this.f29389b = g0Var;
        this.f29390c = vVar;
        this.f29391d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f29389b.L().r(this.f29390c, this.f29391d);
    }
}
