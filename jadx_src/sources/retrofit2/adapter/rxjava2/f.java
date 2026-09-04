package retrofit2.adapter.rxjava2;

import io.reactivex.BackpressureStrategy;
import io.reactivex.h0;
import io.reactivex.z;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RxJava2CallAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f<R> implements retrofit2.c<R, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f138930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final h0 f138931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f138932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f138933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f138934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f138935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f138936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f138937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f138938i;

    f(Type type, @Nullable h0 h0Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f138930a = type;
        this.f138931b = h0Var;
        this.f138932c = z10;
        this.f138933d = z11;
        this.f138934e = z12;
        this.f138935f = z13;
        this.f138936g = z14;
        this.f138937h = z15;
        this.f138938i = z16;
    }

    @Override // retrofit2.c
    public Type a() {
        return this.f138930a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    @Override // retrofit2.c
    public Object b(retrofit2.b<R> bVar) {
        z aVar;
        h0 h0Var;
        z bVar2 = this.f138932c ? new b(bVar) : new c(bVar);
        if (!this.f138933d) {
            if (this.f138934e) {
                aVar = new a(bVar2);
            }
            h0Var = this.f138931b;
            if (h0Var != null) {
                bVar2 = bVar2.I5(h0Var);
            }
            if (this.f138935f) {
                return bVar2.V6(BackpressureStrategy.LATEST);
            }
            if (this.f138936g) {
                return bVar2.k5();
            }
            if (this.f138937h) {
                return bVar2.j5();
            }
            return this.f138938i ? bVar2.c3() : io.reactivex.plugins.a.R(bVar2);
        }
        aVar = new e(bVar2);
        bVar2 = aVar;
        h0Var = this.f138931b;
        if (h0Var != null) {
            bVar2 = bVar2.I5(h0Var);
        }
        if (this.f138935f) {
            return bVar2.V6(BackpressureStrategy.LATEST);
        }
        if (this.f138936g) {
            return bVar2.k5();
        }
        if (this.f138937h) {
            return bVar2.j5();
        }
        if (this.f138938i) {
        }
    }
}
