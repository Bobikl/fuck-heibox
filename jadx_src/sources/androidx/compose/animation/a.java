package androidx.compose.animation;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidActualDefaultDecayAnimationSpec.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/x;", "", ak.av, "(Landroidx/compose/runtime/p;I)Landroidx/compose/animation/core/x;", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    @dl.d
    @kotlin.k(message = "Replace with rememberSplineBasedDecay<Float>")
    @androidx.compose.runtime.h
    public static final androidx.compose.animation.core.x<Float> a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1468328074);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1468328074, i10, -1, "androidx.compose.animation.defaultDecayAnimationSpec (AndroidActualDefaultDecayAnimationSpec.android.kt:23)");
        }
        androidx.compose.animation.core.x<Float> xVarB = w.b(pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return xVarB;
    }
}
