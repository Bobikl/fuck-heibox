package androidx.lifecycle;

import kotlin.b2;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class BlockRunner<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final CoroutineLiveData<T> f23952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<f0<T>, kotlin.coroutines.c<? super b2>, Object> f23953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.q0 f23955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.a<b2> f23956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private d2 f23957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private d2 f23958g;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockRunner(@dl.d CoroutineLiveData<T> liveData, @dl.d yh.p<? super f0<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block, long j10, @dl.d kotlinx.coroutines.q0 scope, @dl.d yh.a<b2> onDone) {
        kotlin.jvm.internal.f0.p(liveData, "liveData");
        kotlin.jvm.internal.f0.p(block, "block");
        kotlin.jvm.internal.f0.p(scope, "scope");
        kotlin.jvm.internal.f0.p(onDone, "onDone");
        this.f23952a = liveData;
        this.f23953b = block;
        this.f23954c = j10;
        this.f23955d = scope;
        this.f23956e = onDone;
    }

    @androidx.annotation.k0
    public final void g() {
        if (this.f23958g != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
        }
        this.f23958g = kotlinx.coroutines.k.f(this.f23955d, e1.e().t0(), null, new BlockRunner$cancel$1(this, null), 2, null);
    }

    @androidx.annotation.k0
    public final void h() {
        d2 d2Var = this.f23958g;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
        this.f23958g = null;
        if (this.f23957f != null) {
            return;
        }
        this.f23957f = kotlinx.coroutines.k.f(this.f23955d, null, null, new BlockRunner$maybeRun$1(this, null), 3, null);
    }
}
