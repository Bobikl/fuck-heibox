package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.f1;
import androidx.compose.animation.core.z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.ComposedModifierKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\t\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00000\u0004H\u0000ø\u0001\u0000\u001a&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function0;", "Lb1/f;", "magnifierCenter", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "animatedCenter", "platformMagnifier", "g", "targetCalculation", "Landroidx/compose/runtime/m2;", RXScreenCaptureService.KEY_HEIGHT, "(Lyh/a;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "Landroidx/compose/animation/core/m;", ak.av, "Landroidx/compose/animation/core/m;", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/f1;", "b", "Landroidx/compose/animation/core/f1;", "UnspecifiedSafeOffsetVectorConverter", ak.aF, "J", "OffsetDisplacementThreshold", "Landroidx/compose/animation/core/z0;", "d", "Landroidx/compose/animation/core/z0;", "MagnifierSpringSpec", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class SelectionMagnifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.m f8197a = new androidx.compose.animation.core.m(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final f1<b1.f, androidx.compose.animation.core.m> f8198b = VectorConvertersKt.a(new yh.l<b1.f, androidx.compose.animation.core.m>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1
        @dl.d
        public final androidx.compose.animation.core.m a(long j10) {
            return b1.g.d(j10) ? new androidx.compose.animation.core.m(b1.f.p(j10), b1.f.r(j10)) : SelectionMagnifierKt.f8197a;
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.m invoke(b1.f fVar) {
            return a(fVar.getF30368a());
        }
    }, new yh.l<androidx.compose.animation.core.m, b1.f>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2
        public final long a(@dl.d androidx.compose.animation.core.m it) {
            f0.p(it, "it");
            return b1.g.a(it.getCom.alipay.sdk.m.x.c.d java.lang.String(), it.getV2());
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b1.f invoke(androidx.compose.animation.core.m mVar) {
            return b1.f.d(a(mVar));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f8199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final z0<b1.f> f8200d;

    static {
        long jA = b1.g.a(0.01f, 0.01f);
        f8199c = jA;
        f8200d = new z0<>(0.0f, 0.0f, b1.f.d(jA), 3, null);
    }

    @dl.d
    public static final androidx.compose.ui.n g(@dl.d androidx.compose.ui.n nVar, @dl.d yh.a<b1.f> magnifierCenter, @dl.d yh.l<? super yh.a<b1.f>, ? extends androidx.compose.ui.n> platformMagnifier) {
        f0.p(nVar, "<this>");
        f0.p(magnifierCenter, "magnifierCenter");
        f0.p(platformMagnifier, "platformMagnifier");
        return ComposedModifierKt.l(nVar, null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(magnifierCenter, platformMagnifier), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.h
    public static final m2<b1.f> h(yh.a<b1.f> aVar, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1589795249);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1589795249, i10, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = e2.d(aVar);
            pVar.N(objU);
        }
        pVar.c0();
        m2 m2Var = (m2) objU;
        pVar.T(-492369756);
        Object objU2 = pVar.U();
        if (objU2 == companion.a()) {
            objU2 = new Animatable(b1.f.d(i(m2Var)), f8198b, b1.f.d(f8199c));
            pVar.N(objU2);
        }
        pVar.c0();
        Animatable animatable = (Animatable) objU2;
        EffectsKt.h(b2.f124493a, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(m2Var, animatable, null), pVar, 64);
        m2<b1.f> m2VarJ = animatable.j();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(m2<b1.f> m2Var) {
        return m2Var.getValue().getF30368a();
    }
}
