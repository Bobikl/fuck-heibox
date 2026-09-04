package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/q3;", "Lkotlin/coroutines/a;", "", ak.aF, "Z", "dispatcherWasUnconfined", "<init>", "()V", "d", ak.av, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class q3 extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public boolean dispatcherWasUnconfined;

    /* JADX INFO: renamed from: kotlinx.coroutines.q3$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Unconfined.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/q3$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlinx/coroutines/q3;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements CoroutineContext.b<q3> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public q3() {
        super(INSTANCE);
    }
}
