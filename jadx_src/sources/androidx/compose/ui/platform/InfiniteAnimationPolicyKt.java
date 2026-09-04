package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"R", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "frameTimeNanos", "onFrame", ak.av, "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class InfiniteAnimationPolicyKt {
    @dl.e
    public static final <R> Object a(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        t0 t0Var = (t0) cVar.getContext().f(t0.INSTANCE);
        return t0Var == null ? MonotonicFrameClockKt.f(lVar, cVar) : t0Var.m0(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null), cVar);
    }
}
