package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.x;
import androidx.compose.animation.w;
import androidx.compose.foundation.AndroidOverscrollKt;
import androidx.compose.foundation.f0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/n;", "", "Landroidx/compose/foundation/gestures/g;", ak.av, "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/gestures/g;", "Landroidx/compose/foundation/f0;", "b", "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/f0;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseScrolling", ak.aF, "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final n f5788a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5789b = 0;

    private n() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public final g a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1107739818);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:185)");
        }
        x xVarB = w.b(pVar, 0);
        pVar.T(1157296644);
        boolean zS = pVar.s(xVarB);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new DefaultFlingBehavior(xVarB);
            pVar.N(objU);
        }
        pVar.c0();
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return defaultFlingBehavior;
    }

    @androidx.compose.foundation.t
    @dl.d
    @androidx.compose.runtime.h
    public final f0 b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1809802212);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:198)");
        }
        f0 f0VarD = AndroidOverscrollKt.d(pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f0VarD;
    }

    public final boolean c(@dl.d LayoutDirection layoutDirection, @dl.d Orientation orientation, boolean reverseScrolling) {
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        boolean z10 = !reverseScrolling;
        return (!(layoutDirection == LayoutDirection.Rtl) || orientation == Orientation.Vertical) ? z10 : !z10;
    }
}
