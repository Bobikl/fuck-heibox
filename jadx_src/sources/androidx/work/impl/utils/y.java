package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: StopWorkRunnable.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class y implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f29403e = androidx.work.n.i("StopWorkRunnable");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.g0 f29404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.v f29405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29406d;

    public y(@n0 androidx.work.impl.g0 g0Var, @n0 androidx.work.impl.v vVar, boolean z10) {
        this.f29404b = g0Var;
        this.f29405c = vVar;
        this.f29406d = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zU = this.f29406d ? this.f29404b.L().u(this.f29405c) : this.f29404b.L().v(this.f29405c);
        androidx.work.n.e().a(f29403e, "StopWorkRunnable for " + this.f29405c.getId().f() + "; Processor.stopWork = " + zU);
    }
}
