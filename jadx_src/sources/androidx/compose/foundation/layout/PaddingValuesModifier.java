package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/foundation/layout/m0;", "e", "Landroidx/compose/foundation/layout/m0;", "f", "()Landroidx/compose/foundation/layout/m0;", "paddingValues", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/m0;Lyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class PaddingValuesModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m0 paddingValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(@dl.d m0 paddingValues, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(paddingValues, "paddingValues");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.d(this, nVar, mVar, i10);
    }

    public boolean equals(@dl.e Object other) {
        PaddingValuesModifier paddingValuesModifier = other instanceof PaddingValuesModifier ? (PaddingValuesModifier) other : null;
        if (paddingValuesModifier == null) {
            return false;
        }
        return kotlin.jvm.internal.f0.g(this.paddingValues, paddingValuesModifier.paddingValues);
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final m0 getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int i(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.a(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int j(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.c(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public androidx.compose.ui.layout.j0 k(@dl.d final androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        boolean z10 = false;
        float f10 = 0;
        if (s1.h.f(this.paddingValues.b(measure.getLayoutDirection()), s1.h.g(f10)) >= 0 && s1.h.f(this.paddingValues.getTop(), s1.h.g(f10)) >= 0 && s1.h.f(this.paddingValues.c(measure.getLayoutDirection()), s1.h.g(f10)) >= 0 && s1.h.f(this.paddingValues.getBottom(), s1.h.g(f10)) >= 0) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iE1 = measure.e1(this.paddingValues.b(measure.getLayoutDirection())) + measure.e1(this.paddingValues.c(measure.getLayoutDirection()));
        int iE2 = measure.e1(this.paddingValues.getTop()) + measure.e1(this.paddingValues.getBottom());
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(s1.c.i(j10, -iE1, -iE2));
        return androidx.compose.ui.layout.k0.p(measure, s1.c.g(j10, e1VarZ1.getWidth() + iE1), s1.c.f(j10, e1VarZ1.getHeight() + iE2), null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1.a.p(layout, e1VarZ1, measure.e1(this.getPaddingValues().b(measure.getLayoutDirection())), measure.e1(this.getPaddingValues().getTop()), 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
