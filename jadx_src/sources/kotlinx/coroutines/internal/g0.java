package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/internal/g0;", "", "affected", ak.aF, "", "toString", "that", "", "b", "Lkotlinx/coroutines/internal/d;", ak.av, "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class g0 {
    @dl.e
    public abstract d<?> a();

    public final boolean b(@dl.d g0 that) {
        d<?> dVarA;
        d<?> dVarA2 = a();
        return (dVarA2 == null || (dVarA = that.a()) == null || dVarA2.g() >= dVarA.g()) ? false : true;
    }

    @dl.e
    public abstract Object c(@dl.e Object affected);

    @dl.d
    public String toString() {
        return kotlinx.coroutines.t0.a(this) + '@' + kotlinx.coroutines.t0.b(this);
    }
}
