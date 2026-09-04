package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0019\u0010\u0007\u001a\u00020\u00052\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\b¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/l1;", ak.av, "", ak.aF, "Lkotlin/Function0;", "Lkotlin/b2;", "block", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class o1 {
    @dl.d
    public static final l1 a() {
        return new h(Thread.currentThread());
    }

    public static final void b(@dl.d yh.a<kotlin.b2> aVar) {
        aVar.invoke();
    }

    @z1
    public static final long c() {
        l1 l1VarA = i3.f130113a.a();
        if (l1VarA != null) {
            return l1VarA.D0();
        }
        return Long.MAX_VALUE;
    }
}
