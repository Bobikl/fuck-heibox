package androidx.compose.foundation.layout;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WindowInsetsSize.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e0!¢\u0006\u0002\b#\u0012\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140%¢\u0006\u0002\b#¢\u0006\u0004\b(\u0010)J)\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001b\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/DerivedHeightModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/foundation/layout/h1;", "e", "Landroidx/compose/foundation/layout/h1;", "insets", "<set-?>", "g", "Landroidx/compose/runtime/a1;", "f", "()Landroidx/compose/foundation/layout/h1;", "(Landroidx/compose/foundation/layout/h1;)V", "unconsumedInsets", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "inspectorInfo", "Lkotlin/Function2;", "Ls1/e;", "heightCalc", "<init>", "(Landroidx/compose/foundation/layout/h1;Lyh/l;Lyh/p;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class DerivedHeightModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w, androidx.compose.ui.modifier.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 insets;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final yh.p<h1, s1.e, Integer> f5978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 unconsumedInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DerivedHeightModifier(@dl.d h1 insets, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo, @dl.d yh.p<? super h1, ? super s1.e, Integer> heightCalc) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(insets, "insets");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.f0.p(heightCalc, "heightCalc");
        this.insets = insets;
        this.f5978f = heightCalc;
        this.unconsumedInsets = h2.g(insets, null, 2, null);
    }

    private final h1 f() {
        return (h1) this.unconsumedInsets.getValue();
    }

    private final void g(h1 h1Var) {
        this.unconsumedInsets.setValue(h1Var);
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
        if (this == other) {
            return true;
        }
        if (!(other instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) other;
        return kotlin.jvm.internal.f0.g(this.insets, derivedHeightModifier.insets) && kotlin.jvm.internal.f0.g(this.f5978f, derivedHeightModifier.f5978f);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.f5978f.hashCode();
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
    public androidx.compose.ui.layout.j0 k(@dl.d androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        int iIntValue = this.f5978f.invoke(f(), measure).intValue();
        if (iIntValue == 0) {
            return androidx.compose.ui.layout.k0.p(measure, 0, 0, null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.DerivedHeightModifier$measure$1
                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(s1.b.e(j10, 0, 0, iIntValue, iIntValue, 3, null));
        return androidx.compose.ui.layout.k0.p(measure, e1VarZ1.getWidth(), iIntValue, null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.DerivedHeightModifier$measure$2
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, 0, 0.0f, 4, null);
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

    @Override // androidx.compose.ui.modifier.e
    public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        g(i1.i(this.insets, (h1) scope.a(WindowInsetsPaddingKt.c())));
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
