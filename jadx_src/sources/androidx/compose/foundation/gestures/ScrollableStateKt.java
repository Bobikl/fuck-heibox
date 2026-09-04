package androidx.compose.foundation.gestures;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u001a#\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Landroidx/compose/foundation/gestures/p;", ak.av, "b", "(Lyh/l;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/gestures/p;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ScrollableStateKt {
    @dl.d
    public static final p a(@dl.d yh.l<? super Float, Float> consumeScrollDelta) {
        f0.p(consumeScrollDelta, "consumeScrollDelta");
        return new DefaultScrollableState(consumeScrollDelta);
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final p b(@dl.d yh.l<? super Float, Float> consumeScrollDelta, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(consumeScrollDelta, "consumeScrollDelta");
        pVar.T(-180460798);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:115)");
        }
        final m2 m2VarT = e2.t(consumeScrollDelta, pVar, i10 & 14);
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = a(new yh.l<Float, Float>() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @dl.d
                public final Float a(float f10) {
                    return m2VarT.getValue().invoke(Float.valueOf(f10));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                    return a(f10.floatValue());
                }
            });
            pVar.N(objU);
        }
        pVar.c0();
        p pVar2 = (p) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return pVar2;
    }
}
