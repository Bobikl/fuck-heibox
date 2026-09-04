package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/gestures/p;", "", "value", "Landroidx/compose/animation/core/h;", "animationSpec", ak.av, "(Landroidx/compose/foundation/gestures/p;FLandroidx/compose/animation/core/h;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "(Landroidx/compose/foundation/gestures/p;FLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/b2;", "d", "(Landroidx/compose/foundation/gestures/p;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/c;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ScrollExtensionsKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final Object a(@dl.d p pVar, float f10, @dl.d androidx.compose.animation.core.h<Float> hVar, @dl.d kotlin.coroutines.c<? super Float> cVar) throws Throwable {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        Ref.FloatRef floatRef;
        if (cVar instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) cVar;
            int i10 = scrollExtensionsKt$animateScrollBy$1.f5508d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.f5508d = i10 - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(cVar);
            }
        } else {
            scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(cVar);
        }
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$2 = scrollExtensionsKt$animateScrollBy$1;
        Object obj = scrollExtensionsKt$animateScrollBy$2.f5507c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = scrollExtensionsKt$animateScrollBy$2.f5508d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$3 = new ScrollExtensionsKt$animateScrollBy$2(f10, hVar, floatRef2, null);
            scrollExtensionsKt$animateScrollBy$2.f5506b = floatRef2;
            scrollExtensionsKt$animateScrollBy$2.f5508d = 1;
            if (o.a(pVar, null, scrollExtensionsKt$animateScrollBy$3, scrollExtensionsKt$animateScrollBy$2, 1, null) == objH) {
                return objH;
            }
            floatRef = floatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) scrollExtensionsKt$animateScrollBy$2.f5506b;
            t0.n(obj);
        }
        return kotlin.coroutines.jvm.internal.a.e(floatRef.f124888b);
    }

    public static /* synthetic */ Object b(p pVar, float f10, androidx.compose.animation.core.h hVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVar = androidx.compose.animation.core.i.o(0.0f, 0.0f, null, 7, null);
        }
        return a(pVar, f10, hVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final Object c(@dl.d p pVar, float f10, @dl.d kotlin.coroutines.c<? super Float> cVar) throws Throwable {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        Ref.FloatRef floatRef;
        if (cVar instanceof ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1) cVar;
            int i10 = scrollExtensionsKt$scrollBy$1.f5518d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$1.f5518d = i10 - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(cVar);
            }
        } else {
            scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(cVar);
        }
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$2 = scrollExtensionsKt$scrollBy$1;
        Object obj = scrollExtensionsKt$scrollBy$2.f5517c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = scrollExtensionsKt$scrollBy$2.f5518d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$3 = new ScrollExtensionsKt$scrollBy$2(floatRef2, f10, null);
            scrollExtensionsKt$scrollBy$2.f5516b = floatRef2;
            scrollExtensionsKt$scrollBy$2.f5518d = 1;
            if (o.a(pVar, null, scrollExtensionsKt$scrollBy$3, scrollExtensionsKt$scrollBy$2, 1, null) == objH) {
                return objH;
            }
            floatRef = floatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) scrollExtensionsKt$scrollBy$2.f5516b;
            t0.n(obj);
        }
        return kotlin.coroutines.jvm.internal.a.e(floatRef.f124888b);
    }

    @dl.e
    public static final Object d(@dl.d p pVar, @dl.d MutatePriority mutatePriority, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objC = pVar.c(mutatePriority, new ScrollExtensionsKt$stopScroll$2(null), cVar);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }

    public static /* synthetic */ Object e(p pVar, MutatePriority mutatePriority, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return d(pVar, mutatePriority, cVar);
    }
}
