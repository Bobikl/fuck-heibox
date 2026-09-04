package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: CancelableChannelFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/d2;", "controller", "Lkotlin/Function2;", "Landroidx/paging/b1;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", "Lkotlinx/coroutines/flow/e;", ak.av, "(Lkotlinx/coroutines/d2;Lyh/p;)Lkotlinx/coroutines/flow/e;", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class CancelableChannelFlowKt {
    @dl.d
    public static final <T> kotlinx.coroutines.flow.e<T> a(@dl.d d2 controller, @dl.d yh.p<? super b1<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(controller, "controller");
        kotlin.jvm.internal.f0.p(block, "block");
        return SimpleChannelFlowKt.a(new CancelableChannelFlowKt$cancelableChannelFlow$1(controller, block, null));
    }
}
