package androidx.compose.foundation;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.w0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ao\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0001H\u0007ø\u0001\u0000\u001ao\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0000\u001a\u0012\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001\")\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\u00168\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Ls1/e;", "Lb1/f;", "Lkotlin/t;", "sourceCenter", "magnifierCenter", "", "zoom", "Landroidx/compose/foundation/c0;", "style", "Ls1/l;", "Lkotlin/b2;", "onSizeChanged", "d", "Landroidx/compose/foundation/j0;", "platformMagnifierFactory", "e", "", "sdkVersion", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", ak.av, "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "MagnifierPositionInRoot", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class MagnifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey<yh.a<b1.f>> f4963a = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    @dl.d
    public static final SemanticsPropertyKey<yh.a<b1.f>> a() {
        return f4963a;
    }

    @androidx.annotation.k(api = 28)
    public static final boolean b(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean c(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return b(i10);
    }

    @t
    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super s1.e, b1.f> sourceCenter, @dl.d final yh.l<? super s1.e, b1.f> magnifierCenter, final float f10, @dl.d final c0 style, @dl.e yh.l<? super s1.l, b2> lVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(sourceCenter, "sourceCenter");
        kotlin.jvm.internal.f0.p(magnifierCenter, "magnifierCenter");
        kotlin.jvm.internal.f0.p(style, "style");
        yh.l<x0, b2> lVarB = InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(MagnifierKt.c(0, 1, null) ? "magnifier" : "magnifier (not supported)");
                x0Var.getProperties().c("sourceCenter", sourceCenter);
                x0Var.getProperties().c("magnifierCenter", magnifierCenter);
                x0Var.getProperties().c("zoom", Float.valueOf(f10));
                x0Var.getProperties().c("style", style);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b();
        androidx.compose.ui.n nVarE = androidx.compose.ui.n.INSTANCE;
        if (c(0, 1, null)) {
            nVarE = e(nVarE, sourceCenter, magnifierCenter, f10, style, lVar, j0.f5877a.a());
        }
        return InspectableValueKt.d(nVar, lVarB, nVarE);
    }

    @dl.d
    @w0(28)
    @SuppressLint({"ModifierInspectorInfo"})
    public static final androidx.compose.ui.n e(@dl.d androidx.compose.ui.n nVar, @dl.d yh.l<? super s1.e, b1.f> sourceCenter, @dl.d yh.l<? super s1.e, b1.f> magnifierCenter, float f10, @dl.d c0 style, @dl.e yh.l<? super s1.l, b2> lVar, @dl.d j0 platformMagnifierFactory) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(sourceCenter, "sourceCenter");
        kotlin.jvm.internal.f0.p(magnifierCenter, "magnifierCenter");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.l(nVar, null, new MagnifierKt$magnifier$4(sourceCenter, magnifierCenter, f10, lVar, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ androidx.compose.ui.n f(androidx.compose.ui.n nVar, yh.l lVar, yh.l lVar2, float f10, c0 c0Var, yh.l lVar3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar2 = new yh.l<s1.e, b1.f>() { // from class: androidx.compose.foundation.MagnifierKt$magnifier$1
                public final long a(@dl.d s1.e eVar) {
                    kotlin.jvm.internal.f0.p(eVar, "$this$null");
                    return b1.f.f30364b.c();
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b1.f invoke(s1.e eVar) {
                    return b1.f.d(a(eVar));
                }
            };
        }
        yh.l lVar4 = lVar2;
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        float f11 = f10;
        if ((i10 & 8) != 0) {
            c0Var = c0.INSTANCE.a();
        }
        c0 c0Var2 = c0Var;
        if ((i10 & 16) != 0) {
            lVar3 = null;
        }
        return d(nVar, lVar, lVar4, f11, c0Var2, lVar3);
    }
}
