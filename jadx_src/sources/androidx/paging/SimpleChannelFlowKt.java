package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SimpleChannelFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Landroidx/paging/b1;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", "Lkotlinx/coroutines/flow/e;", ak.av, "(Lyh/p;)Lkotlinx/coroutines/flow/e;", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class SimpleChannelFlowKt {
    @dl.d
    public static final <T> kotlinx.coroutines.flow.e<T> a(@dl.d yh.p<? super b1<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return kotlinx.coroutines.flow.h.d(kotlinx.coroutines.flow.g.I0(new SimpleChannelFlowKt$simpleChannelFlow$1(block, null)), -2, null, 2, null);
    }
}
