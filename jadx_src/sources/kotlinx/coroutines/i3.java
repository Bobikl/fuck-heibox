package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/i3;", "", "Lkotlinx/coroutines/l1;", ak.av, "()Lkotlinx/coroutines/l1;", "Lkotlin/b2;", ak.aF, "()V", "eventLoop", "d", "(Lkotlinx/coroutines/l1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i3 f130113a = new i3();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final ThreadLocal<l1> ref = new ThreadLocal<>();

    private i3() {
    }

    @dl.e
    public final l1 a() {
        return ref.get();
    }

    @dl.d
    public final l1 b() {
        ThreadLocal<l1> threadLocal = ref;
        l1 l1Var = threadLocal.get();
        if (l1Var != null) {
            return l1Var;
        }
        l1 l1VarA = o1.a();
        threadLocal.set(l1VarA);
        return l1VarA;
    }

    public final void c() {
        ref.set(null);
    }

    public final void d(@dl.d l1 eventLoop) {
        ref.set(eventLoop);
    }
}
