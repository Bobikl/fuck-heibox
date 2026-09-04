package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Ls1/h;", com.google.android.exoplayer2.text.ttml.d.f49784c0, com.google.android.exoplayer2.text.ttml.d.f49785d0, "e", "(Landroidx/compose/ui/n;Landroidx/compose/ui/layout/a;FF)Landroidx/compose/ui/n;", "Ls1/u;", "g", "(Landroidx/compose/ui/n;Landroidx/compose/ui/layout/a;JJ)Landroidx/compose/ui/n;", "top", "bottom", "i", "(Landroidx/compose/ui/n;FF)Landroidx/compose/ui/n;", "k", "(Landroidx/compose/ui/n;JJ)Landroidx/compose/ui/n;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", ak.aF, "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/a;FFLandroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "d", "(Landroidx/compose/ui/layout/a;)Z", "horizontal", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.j0 c(androidx.compose.ui.layout.l0 l0Var, final androidx.compose.ui.layout.a aVar, final float f10, float f11, androidx.compose.ui.layout.g0 g0Var, long j10) {
        final androidx.compose.ui.layout.e1 e1VarZ1 = g0Var.z1(d(aVar) ? s1.b.e(j10, 0, 0, 0, 0, 11, null) : s1.b.e(j10, 0, 0, 0, 0, 14, null));
        int iV = e1VarZ1.v(aVar);
        if (iV == Integer.MIN_VALUE) {
            iV = 0;
        }
        int height = d(aVar) ? e1VarZ1.getHeight() : e1VarZ1.getWidth();
        int iO = d(aVar) ? s1.b.o(j10) : s1.b.p(j10);
        s1.h.a aVar2 = s1.h.f139219c;
        int i10 = iO - height;
        final int I = fi.u.I((!s1.h.l(f10, aVar2.e()) ? l0Var.e1(f10) : 0) - iV, 0, i10);
        final int I2 = fi.u.I(((!s1.h.l(f11, aVar2.e()) ? l0Var.e1(f11) : 0) - height) + iV, 0, i10 - I);
        final int width = d(aVar) ? e1VarZ1.getWidth() : Math.max(e1VarZ1.getWidth() + I + I2, s1.b.r(j10));
        final int iMax = d(aVar) ? Math.max(e1VarZ1.getHeight() + I + I2, s1.b.q(j10)) : e1VarZ1.getHeight();
        return androidx.compose.ui.layout.k0.p(l0Var, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                int width2;
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                int height2 = 0;
                if (AlignmentLineKt.d(aVar)) {
                    width2 = 0;
                } else {
                    width2 = !s1.h.l(f10, s1.h.f139219c.e()) ? I : (width - I2) - e1VarZ1.getWidth();
                }
                if (AlignmentLineKt.d(aVar)) {
                    height2 = !s1.h.l(f10, s1.h.f139219c.e()) ? I : (iMax - I2) - e1VarZ1.getHeight();
                }
                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, width2, height2, 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar3) {
                a(aVar3);
                return b2.f124493a;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(androidx.compose.ui.layout.a aVar) {
        return aVar instanceof androidx.compose.ui.layout.k;
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n e(@dl.d androidx.compose.ui.n paddingFrom, @dl.d final androidx.compose.ui.layout.a alignmentLine, final float f10, final float f11) {
        kotlin.jvm.internal.f0.p(paddingFrom, "$this$paddingFrom");
        kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
        return paddingFrom.s0(new AlignmentLineOffset(alignmentLine, f10, f11, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("paddingFrom");
                x0Var.getProperties().c("alignmentLine", alignmentLine);
                x0Var.getProperties().c(com.google.android.exoplayer2.text.ttml.d.f49784c0, s1.h.d(f10));
                x0Var.getProperties().c(com.google.android.exoplayer2.text.ttml.d.f49785d0, s1.h.d(f11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n f(androidx.compose.ui.n nVar, androidx.compose.ui.layout.a aVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i10 & 4) != 0) {
            f11 = s1.h.f139219c.e();
        }
        return e(nVar, aVar, f10, f11);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n g(@dl.d androidx.compose.ui.n paddingFrom, @dl.d final androidx.compose.ui.layout.a alignmentLine, final long j10, final long j11) {
        kotlin.jvm.internal.f0.p(paddingFrom, "$this$paddingFrom");
        kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
        return paddingFrom.s0(new AlignmentLineOffset(alignmentLine, j10, j11, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("paddingFrom");
                x0Var.getProperties().c("alignmentLine", alignmentLine);
                x0Var.getProperties().c(com.google.android.exoplayer2.text.ttml.d.f49784c0, s1.u.c(j10));
                x0Var.getProperties().c(com.google.android.exoplayer2.text.ttml.d.f49785d0, s1.u.c(j11));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.n h(androidx.compose.ui.n nVar, androidx.compose.ui.layout.a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = s1.u.f139249b.b();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = s1.u.f139249b.b();
        }
        return g(nVar, aVar, j12, j11);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n i(@dl.d androidx.compose.ui.n paddingFromBaseline, float f10, float f11) {
        kotlin.jvm.internal.f0.p(paddingFromBaseline, "$this$paddingFromBaseline");
        s1.h.a aVar = s1.h.f139219c;
        return paddingFromBaseline.s0(!s1.h.l(f11, aVar.e()) ? f(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.b(), 0.0f, f11, 2, null) : androidx.compose.ui.n.INSTANCE).s0(!s1.h.l(f10, aVar.e()) ? f(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.a(), f10, 0.0f, 4, null) : androidx.compose.ui.n.INSTANCE);
    }

    public static /* synthetic */ androidx.compose.ui.n j(androidx.compose.ui.n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s1.h.f139219c.e();
        }
        if ((i10 & 2) != 0) {
            f11 = s1.h.f139219c.e();
        }
        return i(nVar, f10, f11);
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n k(@dl.d androidx.compose.ui.n paddingFromBaseline, long j10, long j11) {
        kotlin.jvm.internal.f0.p(paddingFromBaseline, "$this$paddingFromBaseline");
        return paddingFromBaseline.s0(!s1.v.s(j11) ? h(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.b(), 0L, j11, 2, null) : androidx.compose.ui.n.INSTANCE).s0(!s1.v.s(j10) ? h(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.a(), j10, 0L, 4, null) : androidx.compose.ui.n.INSTANCE);
    }

    public static /* synthetic */ androidx.compose.ui.n l(androidx.compose.ui.n nVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = s1.u.f139249b.b();
        }
        if ((i10 & 2) != 0) {
            j11 = s1.u.f139249b.b();
        }
        return k(nVar, j10, j11);
    }
}
