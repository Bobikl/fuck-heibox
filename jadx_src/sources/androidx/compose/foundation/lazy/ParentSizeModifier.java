package androidx.compose.foundation.lazy;

import androidx.compose.runtime.m2;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.lzy.okgo.model.Progress;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BL\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0002\b!\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0004\b#\u0010$J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "other", "", "equals", "", "hashCode", "", "e", "F", "f", "()F", Progress.G, "Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/m2;", "m", "()Landroidx/compose/runtime/m2;", "widthState", "g", "heightState", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(FLyh/l;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class ParentSizeModifier extends y0 implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float fraction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final m2<Integer> widthState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final m2<Integer> heightState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParentSizeModifier(float f10, @dl.d yh.l<? super x0, b2> inspectorInfo, @dl.e m2<Integer> m2Var, @dl.e m2<Integer> m2Var2) {
        super(inspectorInfo);
        f0.p(inspectorInfo, "inspectorInfo");
        this.fraction = f10;
        this.widthState = m2Var;
        this.heightState = m2Var2;
    }

    public /* synthetic */ ParentSizeModifier(float f10, yh.l lVar, m2 m2Var, m2 m2Var2, int i10, kotlin.jvm.internal.u uVar) {
        this(f10, lVar, (i10 & 4) != 0 ? null : m2Var, (i10 & 8) != 0 ? null : m2Var2);
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
        if (!(other instanceof ParentSizeModifier)) {
            return false;
        }
        ParentSizeModifier parentSizeModifier = (ParentSizeModifier) other;
        if (f0.g(this.widthState, parentSizeModifier.widthState) && f0.g(this.heightState, parentSizeModifier.heightState)) {
            if (this.fraction == parentSizeModifier.fraction) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getFraction() {
        return this.fraction;
    }

    @dl.e
    public final m2<Integer> g() {
        return this.heightState;
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        m2<Integer> m2Var = this.widthState;
        int iHashCode = (m2Var != null ? m2Var.hashCode() : 0) * 31;
        m2<Integer> m2Var2 = this.heightState;
        return ((iHashCode + (m2Var2 != null ? m2Var2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.fraction);
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
    public j0 k(@dl.d l0 measure, @dl.d g0 measurable, long j10) {
        f0.p(measure, "$this$measure");
        f0.p(measurable, "measurable");
        m2<Integer> m2Var = this.widthState;
        int iL0 = (m2Var == null || m2Var.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : di.d.L0(this.widthState.getValue().floatValue() * this.fraction);
        m2<Integer> m2Var2 = this.heightState;
        int iL1 = (m2Var2 == null || m2Var2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : di.d.L0(this.heightState.getValue().floatValue() * this.fraction);
        int iR = iL0 != Integer.MAX_VALUE ? iL0 : s1.b.r(j10);
        int iQ = iL1 != Integer.MAX_VALUE ? iL1 : s1.b.q(j10);
        if (iL0 == Integer.MAX_VALUE) {
            iL0 = s1.b.p(j10);
        }
        if (iL1 == Integer.MAX_VALUE) {
            iL1 = s1.b.o(j10);
        }
        final e1 e1VarZ1 = measurable.z1(s1.c.a(iR, iL0, iQ, iL1));
        return k0.p(measure, e1VarZ1.getWidth(), e1VarZ1.getHeight(), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.lazy.ParentSizeModifier$measure$1
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                f0.p(layout, "$this$layout");
                e1.a.p(layout, e1VarZ1, 0, 0, 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    @dl.e
    public final m2<Integer> m() {
        return this.widthState;
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
