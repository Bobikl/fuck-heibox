package androidx.compose.foundation.layout;

import androidx.compose.runtime.h2;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B*\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0019\b\u0002\u0010.\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00100+¢\u0006\u0002\b-¢\u0006\u0004\b/\u00100J)\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R+\u0010\"\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010$\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingModifier;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/foundation/layout/h1;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/b2;", "w1", "", "other", "", "equals", "", "hashCode", "e", "Landroidx/compose/foundation/layout/h1;", "insets", "<set-?>", "f", "Landroidx/compose/runtime/a1;", "g", "()Landroidx/compose/foundation/layout/h1;", "o", "(Landroidx/compose/foundation/layout/h1;)V", "unconsumedInsets", "n", "consumedInsets", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "m", "value", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/h1;Lyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class InsetsPaddingModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w, androidx.compose.ui.modifier.e, androidx.compose.ui.modifier.m<h1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h1 insets;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 unconsumedInsets;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 consumedInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier(@dl.d h1 insets, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(insets, "insets");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.insets = insets;
        this.unconsumedInsets = h2.g(insets, null, 2, null);
        this.consumedInsets = h2.g(insets, null, 2, null);
    }

    public /* synthetic */ InsetsPaddingModifier(final h1 h1Var, yh.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(h1Var, (i10 & 2) != 0 ? InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.InsetsPaddingModifier$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("InsetsPaddingModifier");
                x0Var.getProperties().c("insets", h1Var);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b() : lVar);
    }

    private final h1 f() {
        return (h1) this.consumedInsets.getValue();
    }

    private final h1 g() {
        return (h1) this.unconsumedInsets.getValue();
    }

    private final void n(h1 h1Var) {
        this.consumedInsets.setValue(h1Var);
    }

    private final void o(h1 h1Var) {
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
        if (other instanceof InsetsPaddingModifier) {
            return kotlin.jvm.internal.f0.g(((InsetsPaddingModifier) other).insets, this.insets);
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    public androidx.compose.ui.modifier.p<h1> getKey() {
        return WindowInsetsPaddingKt.c();
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return this.insets.hashCode();
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
        final int iB = g().b(measure, measure.getLayoutDirection());
        final int iA = g().a(measure);
        int iD = g().d(measure, measure.getLayoutDirection()) + iB;
        int iC = g().c(measure) + iA;
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(s1.c.i(j10, -iD, -iC));
        return androidx.compose.ui.layout.k0.p(measure, s1.c.g(j10, e1VarZ1.getWidth() + iD), s1.c.f(j10, e1VarZ1.getHeight() + iC), null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.InsetsPaddingModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1.a.p(layout, e1VarZ1, iB, iA, 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.modifier.m
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public h1 getValue() {
        return f();
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
        h1 h1Var = (h1) scope.a(WindowInsetsPaddingKt.c());
        o(i1.i(this.insets, h1Var));
        n(i1.k(h1Var, this.insets));
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
