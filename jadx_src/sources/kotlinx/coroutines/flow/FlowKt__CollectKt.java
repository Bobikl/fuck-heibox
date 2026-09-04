package kotlinx.coroutines.flow;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001am\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002H\b\u0004\u0010\u0011\u001aB\b\u0001\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aV\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000023\b\u0004\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/e;", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/c;)Ljava/lang/Object;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "scope", "Lkotlinx/coroutines/d2;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/Function3;", "", "Lkotlin/m0;", "name", UCropPlusActivity.ARG_INDEX, "value", "Lkotlin/coroutines/c;", "", "action", "d", "(Lkotlinx/coroutines/flow/e;Lyh/q;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "f", "(Lkotlinx/coroutines/flow/e;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/f;", "flow", "g", "(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CollectKt {
    @dl.e
    public static final Object a(@dl.d e<?> eVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = eVar.a(kotlinx.coroutines.flow.internal.k.f130081b, cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object b(e<? extends T> eVar, yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super b2> cVar) {
        Object objA = eVar.a(new FlowKt__CollectKt$collect$3(pVar), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> Object c(e<? extends T> eVar, yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__CollectKt$collect$3 flowKt__CollectKt$collect$3 = new FlowKt__CollectKt$collect$3(pVar);
        c0.e(0);
        eVar.a(flowKt__CollectKt$collect$3, cVar);
        c0.e(1);
        return b2.f124493a;
    }

    @dl.e
    public static final <T> Object d(@dl.d e<? extends T> eVar, @dl.d yh.q<? super Integer, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = eVar.a(new FlowKt__CollectKt$collectIndexed$2(qVar), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    private static final <T> Object e(e<? extends T> eVar, yh.q<? super Integer, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__CollectKt$collectIndexed$2 flowKt__CollectKt$collectIndexed$2 = new FlowKt__CollectKt$collectIndexed$2(qVar);
        c0.e(0);
        eVar.a(flowKt__CollectKt$collectIndexed$2, cVar);
        c0.e(1);
        return b2.f124493a;
    }

    @dl.e
    public static final <T> Object f(@dl.d e<? extends T> eVar, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objX = g.x(h.d(g.W0(eVar, pVar), 0, null, 2, null), cVar);
        return objX == kotlin.coroutines.intrinsics.b.h() ? objX : b2.f124493a;
    }

    @dl.e
    public static final <T> Object g(@dl.d f<? super T> fVar, @dl.d e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        g.o0(fVar);
        Object objA = eVar.a(fVar, cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @dl.d
    public static final <T> d2 h(@dl.d e<? extends T> eVar, @dl.d q0 q0Var) {
        return kotlinx.coroutines.k.f(q0Var, null, null, new FlowKt__CollectKt$launchIn$1(eVar, null), 3, null);
    }
}
