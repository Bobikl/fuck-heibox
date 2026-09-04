package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0003\u001a\u00020\u0002H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/material3/n0;", "Landroidx/compose/material/ripple/k;", "Landroidx/compose/ui/graphics/l0;", ak.av, "(Landroidx/compose/runtime/p;I)J", "Landroidx/compose/material/ripple/e;", "b", "(Landroidx/compose/runtime/p;I)Landroidx/compose/material/ripple/e;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class n0 implements androidx.compose.material.ripple.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final n0 f12032b = new n0();

    private n0() {
    }

    @Override // androidx.compose.material.ripple.k
    @androidx.compose.runtime.h
    public long a(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-2059468846);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2059468846, i10, -1, "androidx.compose.material3.MaterialRippleTheme.defaultColor (MaterialTheme.kt:117)");
        }
        long jM = ((androidx.compose.ui.graphics.l0) pVar.K(ContentColorKt.a())).M();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return jM;
    }

    @Override // androidx.compose.material.ripple.k
    @dl.d
    @androidx.compose.runtime.h
    public RippleAlpha b(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(1285764247);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1285764247, i10, -1, "androidx.compose.material3.MaterialRippleTheme.rippleAlpha (MaterialTheme.kt:120)");
        }
        RippleAlpha rippleAlpha = MaterialThemeKt.f9758a;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return rippleAlpha;
    }
}
