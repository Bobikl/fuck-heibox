package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Row.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0014\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017J\u0014\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017J\f\u0010\u000e\u001a\u00020\u0002*\u00020\u0002H\u0017J \u0010\u0013\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/x0;", "Landroidx/compose/ui/n;", "", "weight", "", "fill", "b", "Landroidx/compose/ui/c$c;", "alignment", "d", "Landroidx/compose/ui/layout/k;", "alignmentLine", ak.aF, "e", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/n0;", "", "alignmentLineBlock", ak.av, "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class RowScopeInstance implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final RowScopeInstance f6091a = new RowScopeInstance();

    private RowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.x0
    @dl.d
    public androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super androidx.compose.ui.layout.n0, Integer> alignmentLineBlock) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(alignmentLineBlock, "alignmentLineBlock");
        return nVar.s0(new y0.WithAlignmentLineBlock(alignmentLineBlock, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$alignBy$$inlined$debugInspectorInfo$2
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("alignBy");
                x0Var.e(alignmentLineBlock);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @Override // androidx.compose.foundation.layout.x0
    @j2
    @dl.d
    public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, final float f10, final boolean z10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        if (((double) f10) > 0.0d) {
            return nVar.s0(new LayoutWeightImpl(f10, z10, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$weight$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                    kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                    x0Var.d("weight");
                    x0Var.e(Float.valueOf(f10));
                    x0Var.getProperties().c("weight", Float.valueOf(f10));
                    x0Var.getProperties().c("fill", Boolean.valueOf(z10));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                    a(x0Var);
                    return b2.f124493a;
                }
            } : InspectableValueKt.b()));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // androidx.compose.foundation.layout.x0
    @j2
    @dl.d
    public androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d final androidx.compose.ui.layout.k alignmentLine) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
        return nVar.s0(new y0.WithAlignmentLine(alignmentLine, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$alignBy$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("alignBy");
                x0Var.e(alignmentLine);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @Override // androidx.compose.foundation.layout.x0
    @j2
    @dl.d
    public androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d final androidx.compose.ui.c.InterfaceC0079c alignment) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        return nVar.s0(new VerticalAlignModifier(alignment, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$align$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("align");
                x0Var.e(alignment);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @Override // androidx.compose.foundation.layout.x0
    @j2
    @dl.d
    public androidx.compose.ui.n e(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return c(nVar, androidx.compose.ui.layout.AlignmentLineKt.a());
    }
}
