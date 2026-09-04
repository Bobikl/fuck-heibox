package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aA\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u001aA\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0007\u001a\u001e\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u0019\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u001d\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a=\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/ui/n;", "Ls1/h;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "top", com.google.android.exoplayer2.text.ttml.d.f49800p0, "bottom", "n", "(Landroidx/compose/ui/n;FFFF)Landroidx/compose/ui/n;", "horizontal", "vertical", "l", "(Landroidx/compose/ui/n;FF)Landroidx/compose/ui/n;", "all", "k", "(Landroidx/compose/ui/n;F)Landroidx/compose/ui/n;", "Landroidx/compose/foundation/layout/m0;", "paddingValues", "j", com.google.android.exoplayer2.text.ttml.d.f49793l0, com.google.android.exoplayer2.text.ttml.d.f49796n0, "f", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "i", "(Landroidx/compose/foundation/layout/m0;Landroidx/compose/ui/unit/LayoutDirection;)F", RXScreenCaptureService.KEY_HEIGHT, ak.av, "(F)Landroidx/compose/foundation/layout/m0;", "b", "(FF)Landroidx/compose/foundation/layout/m0;", "d", "(FFFF)Landroidx/compose/foundation/layout/m0;", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class PaddingKt {
    @j2
    @dl.d
    public static final m0 a(float f10) {
        return new PaddingValues(f10, f10, f10, f10, null);
    }

    @j2
    @dl.d
    public static final m0 b(float f10, float f11) {
        return new PaddingValues(f10, f11, f10, f11, null);
    }

    public static /* synthetic */ m0 c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.g(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.g(0);
        }
        return b(f10, f11);
    }

    @j2
    @dl.d
    public static final m0 d(float f10, float f11, float f12, float f13) {
        return new PaddingValues(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ m0 e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.g(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.g(0);
        }
        if ((i10 & 4) != 0) {
            f12 = s1.h.g(0);
        }
        if ((i10 & 8) != 0) {
            f13 = s1.h.g(0);
        }
        return d(f10, f11, f12, f13);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n f(@dl.d androidx.compose.ui.n absolutePadding, final float f10, final float f11, final float f12, final float f13) {
        kotlin.jvm.internal.f0.p(absolutePadding, "$this$absolutePadding");
        return absolutePadding.s0(new PaddingModifier(f10, f11, f12, f13, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("absolutePadding");
                x0Var.getProperties().c(com.google.android.exoplayer2.text.ttml.d.f49793l0, s1.h.d(f10));
                x0Var.getProperties().c("top", s1.h.d(f11));
                x0Var.getProperties().c(com.google.android.exoplayer2.text.ttml.d.f49796n0, s1.h.d(f12));
                x0Var.getProperties().c("bottom", s1.h.d(f13));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n g(androidx.compose.ui.n nVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.g(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.g(0);
        }
        if ((i10 & 4) != 0) {
            f12 = s1.h.g(0);
        }
        if ((i10 & 8) != 0) {
            f13 = s1.h.g(0);
        }
        return f(nVar, f10, f11, f12, f13);
    }

    @j2
    public static final float h(@dl.d m0 m0Var, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(m0Var, "<this>");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? m0Var.c(layoutDirection) : m0Var.b(layoutDirection);
    }

    @j2
    public static final float i(@dl.d m0 m0Var, @dl.d LayoutDirection layoutDirection) {
        kotlin.jvm.internal.f0.p(m0Var, "<this>");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? m0Var.b(layoutDirection) : m0Var.c(layoutDirection);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n j(@dl.d androidx.compose.ui.n nVar, @dl.d final m0 paddingValues) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(paddingValues, "paddingValues");
        return nVar.s0(new PaddingValuesModifier(paddingValues, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("padding");
                x0Var.getProperties().c("paddingValues", paddingValues);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n k(@dl.d androidx.compose.ui.n padding, final float f10) {
        kotlin.jvm.internal.f0.p(padding, "$this$padding");
        return padding.s0(new PaddingModifier(f10, f10, f10, f10, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("padding");
                x0Var.e(s1.h.d(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n l(@dl.d androidx.compose.ui.n padding, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(padding, "$this$padding");
        return padding.s0(new PaddingModifier(f10, f11, f10, f11, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("padding");
                x0Var.getProperties().c("horizontal", s1.h.d(f10));
                x0Var.getProperties().c("vertical", s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n m(androidx.compose.ui.n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.g(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.g(0);
        }
        return l(nVar, f10, f11);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n n(@dl.d androidx.compose.ui.n padding, final float f10, final float f11, final float f12, final float f13) {
        kotlin.jvm.internal.f0.p(padding, "$this$padding");
        return padding.s0(new PaddingModifier(f10, f11, f12, f13, true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("padding");
                x0Var.getProperties().c(com.google.android.exoplayer2.text.ttml.d.f49798o0, s1.h.d(f10));
                x0Var.getProperties().c("top", s1.h.d(f11));
                x0Var.getProperties().c(com.google.android.exoplayer2.text.ttml.d.f49800p0, s1.h.d(f12));
                x0Var.getProperties().c("bottom", s1.h.d(f13));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n o(androidx.compose.ui.n nVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.g(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.g(0);
        }
        if ((i10 & 4) != 0) {
            f12 = s1.h.g(0);
        }
        if ((i10 & 8) != 0) {
            f13 = s1.h.g(0);
        }
        return n(nVar, f10, f11, f12, f13);
    }
}
