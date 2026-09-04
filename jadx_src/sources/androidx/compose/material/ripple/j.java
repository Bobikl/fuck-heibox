package androidx.compose.material.ripple;

import androidx.compose.animation.core.d0;
import androidx.compose.animation.core.e1;
import androidx.compose.foundation.x;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.p;
import androidx.compose.ui.graphics.l0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"", "bounded", "Ls1/h;", "radius", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/foundation/x;", "e", "(ZFJLandroidx/compose/runtime/p;II)Landroidx/compose/foundation/x;", "Landroidx/compose/foundation/interaction/d;", "interaction", "Landroidx/compose/animation/core/h;", "", ak.aF, "d", "Landroidx/compose/animation/core/e1;", ak.av, "Landroidx/compose/animation/core/e1;", "DefaultTweenSpec", "material-ripple_release"}, k = 2, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final e1<Float> f8520a = new e1<>(15, 0, d0.c(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.h<Float> c(androidx.compose.foundation.interaction.d dVar) {
        if (dVar instanceof androidx.compose.foundation.interaction.c.a) {
            return f8520a;
        }
        if (!(dVar instanceof androidx.compose.foundation.interaction.b.a) && !(dVar instanceof androidx.compose.foundation.interaction.a.b)) {
            return f8520a;
        }
        return new e1(45, 0, d0.c(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.h<Float> d(androidx.compose.foundation.interaction.d dVar) {
        if (!(dVar instanceof androidx.compose.foundation.interaction.c.a) && !(dVar instanceof androidx.compose.foundation.interaction.b.a) && (dVar instanceof androidx.compose.foundation.interaction.a.b)) {
            return new e1(150, 0, d0.c(), 2, null);
        }
        return f8520a;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final x e(boolean z10, float f10, long j10, @dl.e p pVar, int i10, int i11) {
        pVar.T(1635163520);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i11 & 4) != 0) {
            j10 = l0.INSTANCE.u();
        }
        m2 m2VarT = e2.t(l0.n(j10), pVar, (i10 >> 6) & 14);
        Boolean boolValueOf = Boolean.valueOf(z10);
        s1.h hVarD = s1.h.d(f10);
        pVar.T(-3686552);
        boolean zS = pVar.s(boolValueOf) | pVar.s(hVarD);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            objU = new c(z10, f10, m2VarT, null);
            pVar.N(objU);
        }
        pVar.c0();
        c cVar = (c) objU;
        pVar.c0();
        return cVar;
    }
}
