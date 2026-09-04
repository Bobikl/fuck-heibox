package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "toString", "", "parallelism", "c0", "s0", "p0", "()Lkotlinx/coroutines/n2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class n2 extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public CoroutineDispatcher c0(int parallelism) {
        kotlinx.coroutines.internal.s.a(parallelism);
        return this;
    }

    @dl.d
    public abstract n2 p0();

    @z1
    @dl.e
    protected final String s0() {
        n2 n2VarP0;
        n2 n2VarE = e1.e();
        if (this == n2VarE) {
            return "Dispatchers.Main";
        }
        try {
            n2VarP0 = n2VarE.p0();
        } catch (UnsupportedOperationException unused) {
            n2VarP0 = null;
        }
        if (this == n2VarP0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public String toString() {
        String strS0 = s0();
        if (strS0 != null) {
            return strS0;
        }
        return t0.a(this) + '@' + t0.b(this);
    }
}
