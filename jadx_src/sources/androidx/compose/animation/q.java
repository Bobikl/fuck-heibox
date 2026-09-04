package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.f1;
import androidx.compose.animation.core.z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.l0;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SingleValueAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/l0;", "targetValue", "Landroidx/compose/animation/core/h;", "animationSpec", "", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Lkotlin/Function1;", "Lkotlin/b2;", "finishedListener", "Landroidx/compose/runtime/m2;", ak.aF, "(JLandroidx/compose/animation/core/h;Ljava/lang/String;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "b", "(JLandroidx/compose/animation/core/h;Lyh/l;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "initialValue", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/o;", ak.av, "(J)Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/z0;", "Landroidx/compose/animation/core/z0;", "colorDefaultSpring", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final z0<l0> f4609a = androidx.compose.animation.core.i.o(0.0f, 0.0f, null, 7, null);

    @dl.d
    public static final Animatable<l0, androidx.compose.animation.core.o> a(long j10) {
        return new Animatable<>(l0.n(j10), ColorVectorConverterKt.d(l0.INSTANCE).invoke(l0.E(j10)), null, null, 12, null);
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ m2 b(long j10, androidx.compose.animation.core.h hVar, yh.l lVar, androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-1942442407);
        if ((i11 & 2) != 0) {
            hVar = f4609a;
        }
        androidx.compose.animation.core.h hVar2 = hVar;
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        yh.l lVar2 = lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1942442407, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:75)");
        }
        m2<l0> m2VarC = c(j10, hVar2, null, lVar2, pVar, (i10 & 14) | 64 | ((i10 << 3) & bb.c.g.f32954lc), 4);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarC;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final m2<l0> c(long j10, @dl.e androidx.compose.animation.core.h<l0> hVar, @dl.e String str, @dl.e yh.l<? super l0, b2> lVar, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        pVar.T(-451899108);
        androidx.compose.animation.core.h<l0> hVar2 = (i11 & 2) != 0 ? f4609a : hVar;
        String str2 = (i11 & 4) != 0 ? "ColorAnimation" : str;
        yh.l<? super l0, b2> lVar2 = (i11 & 8) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:56)");
        }
        androidx.compose.ui.graphics.colorspace.c cVarE = l0.E(j10);
        pVar.T(1157296644);
        boolean zS = pVar.s(cVarE);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = (f1) ColorVectorConverterKt.d(l0.INSTANCE).invoke(l0.E(j10));
            pVar.N(objU);
        }
        pVar.c0();
        int i12 = i10 << 6;
        m2<l0> m2VarS = AnimateAsStateKt.s(l0.n(j10), (f1) objU, hVar2, null, str2, lVar2, pVar, (i10 & 14) | bb.c.b.f30606e8 | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarS;
    }
}
