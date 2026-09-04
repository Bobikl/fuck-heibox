package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.z;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SplineBasedFloatDecayAnimationSpec.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Ls1/e;", "density", "Landroidx/compose/animation/core/x;", ak.aF, "(Ls1/e;)Landroidx/compose/animation/core/x;", "b", "(Landroidx/compose/runtime/p;I)Landroidx/compose/animation/core/x;", "", ak.av, "F", "()F", "platformFlingScrollFriction", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f4621a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f4621a;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final <T> androidx.compose.animation.core.x<T> b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(904445851);
        if (ComposerKt.g0()) {
            ComposerKt.w0(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        Float fValueOf = Float.valueOf(eVar.getF139217b());
        pVar.T(1157296644);
        boolean zS = pVar.s(fValueOf);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = z.e(new v(eVar));
            pVar.N(objU);
        }
        pVar.c0();
        androidx.compose.animation.core.x<T> xVar = (androidx.compose.animation.core.x) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return xVar;
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Moved to common code")
    @xh.h(name = "splineBasedDecay")
    public static final /* synthetic */ androidx.compose.animation.core.x c(s1.e density) {
        f0.p(density, "density");
        return u.c(density);
    }
}
