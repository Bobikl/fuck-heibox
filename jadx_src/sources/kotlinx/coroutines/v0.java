package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/y0;", "b", "", ak.av, "Z", "defaultMainDelayOptIn", "Lkotlinx/coroutines/y0;", "()Lkotlinx/coroutines/y0;", "DefaultDelay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f130501a = kotlinx.coroutines.internal.q0.e("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final y0 f130502b = b();

    @dl.d
    public static final y0 a() {
        return f130502b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final y0 b() {
        if (!f130501a) {
            return u0.f130491i;
        }
        n2 n2VarE = e1.e();
        return (kotlinx.coroutines.internal.d0.d(n2VarE) || !(n2VarE instanceof y0)) ? u0.f130491i : (y0) n2VarE;
    }
}
