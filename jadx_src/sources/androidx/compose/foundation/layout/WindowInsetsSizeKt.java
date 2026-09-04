package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WindowInsetsSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/layout/h1;", "insets", ak.aF, "b", "d", ak.av, "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class WindowInsetsSizeKt {
    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final h1 insets) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(insets, "insets");
        return nVar.s0(new DerivedHeightModifier(insets, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("insetsBottomHeight");
                x0Var.getProperties().c("insets", insets);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.p<h1, s1.e, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$2
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d h1 $receiver, @dl.d s1.e it) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                kotlin.jvm.internal.f0.p(it, "it");
                return Integer.valueOf($receiver.c(it));
            }
        }));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final h1 insets) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(insets, "insets");
        return nVar.s0(new DerivedWidthModifier(insets, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("insetsEndWidth");
                x0Var.getProperties().c("insets", insets);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<h1, LayoutDirection, s1.e, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$2
            @Override // yh.q
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d h1 $receiver, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.f0.p(density, "density");
                return Integer.valueOf(layoutDirection == LayoutDirection.Rtl ? $receiver.b(density, layoutDirection) : $receiver.d(density, layoutDirection));
            }
        }));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d final h1 insets) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(insets, "insets");
        return nVar.s0(new DerivedWidthModifier(insets, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("insetsStartWidth");
                x0Var.getProperties().c("insets", insets);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<h1, LayoutDirection, s1.e, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$2
            @Override // yh.q
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d h1 $receiver, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.f0.p(density, "density");
                return Integer.valueOf(layoutDirection == LayoutDirection.Ltr ? $receiver.b(density, layoutDirection) : $receiver.d(density, layoutDirection));
            }
        }));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d final h1 insets) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(insets, "insets");
        return nVar.s0(new DerivedHeightModifier(insets, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("insetsTopHeight");
                x0Var.getProperties().c("insets", insets);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.p<h1, s1.e, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$2
            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d h1 $receiver, @dl.d s1.e it) {
                kotlin.jvm.internal.f0.p($receiver, "$this$$receiver");
                kotlin.jvm.internal.f0.p(it, "it");
                return Integer.valueOf($receiver.a(it));
            }
        }));
    }
}
