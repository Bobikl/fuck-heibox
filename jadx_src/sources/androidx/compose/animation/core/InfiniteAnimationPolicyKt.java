package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a<\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"R", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "frameTimeNanos", "onFrame", ak.aF, "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "frameTimeMillis", ak.av, "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class InfiniteAnimationPolicyKt {
    @dl.e
    public static final <R> Object a(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return c(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar), cVar);
    }

    private static final <R> Object b(yh.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super R> cVar) {
        InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 = new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar);
        kotlin.jvm.internal.c0.e(0);
        Object objC = c(infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2, cVar);
        kotlin.jvm.internal.c0.e(1);
        return objC;
    }

    @dl.e
    public static final <R> Object c(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        androidx.compose.ui.platform.t0 t0Var = (androidx.compose.ui.platform.t0) cVar.getContext().f(androidx.compose.ui.platform.t0.INSTANCE);
        return t0Var == null ? MonotonicFrameClockKt.f(lVar, cVar) : t0Var.m0(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null), cVar);
    }
}
