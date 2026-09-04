package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.g3;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "b", "countOrElement", ak.aF, "oldState", "Lkotlin/b2;", ak.av, "Lkotlinx/coroutines/internal/o0;", "Lkotlinx/coroutines/internal/o0;", "NO_THREAD_ELEMENTS", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class ThreadContextKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f130141a = new o0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final yh.p<Object, CoroutineContext.a, Object> f130142b = new yh.p<Object, CoroutineContext.a, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.e Object obj, @dl.d CoroutineContext.a aVar) {
            if (!(aVar instanceof g3)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? aVar : Integer.valueOf(iIntValue + 1);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final yh.p<g3<?>, CoroutineContext.a, g3<?>> f130143c = new yh.p<g3<?>, CoroutineContext.a, g3<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g3<?> invoke(@dl.e g3<?> g3Var, @dl.d CoroutineContext.a aVar) {
            if (g3Var != null) {
                return g3Var;
            }
            if (aVar instanceof g3) {
                return (g3) aVar;
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final yh.p<y0, CoroutineContext.a, y0> f130144d = new yh.p<y0, CoroutineContext.a, y0>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // yh.p
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y0 invoke(@dl.d y0 y0Var, @dl.d CoroutineContext.a aVar) {
            if (aVar instanceof g3) {
                g3<?> g3Var = (g3) aVar;
                y0Var.a(g3Var, g3Var.o0(y0Var.context));
            }
            return y0Var;
        }
    };

    public static final void a(@dl.d CoroutineContext coroutineContext, @dl.e Object obj) {
        if (obj == f130141a) {
            return;
        }
        if (obj instanceof y0) {
            ((y0) obj).b(coroutineContext);
            return;
        }
        Object objG = coroutineContext.g(null, f130143c);
        if (objG == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((g3) objG).z(coroutineContext, obj);
    }

    @dl.d
    public static final Object b(@dl.d CoroutineContext coroutineContext) {
        Object objG = coroutineContext.g(0, f130142b);
        kotlin.jvm.internal.f0.m(objG);
        return objG;
    }

    @dl.e
    public static final Object c(@dl.d CoroutineContext coroutineContext, @dl.e Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f130141a;
        }
        return obj instanceof Integer ? coroutineContext.g(new y0(coroutineContext, ((Number) obj).intValue()), f130144d) : ((g3) obj).o0(coroutineContext);
    }
}
