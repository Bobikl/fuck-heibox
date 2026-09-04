package androidx.compose.foundation.layout;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lzy.okgo.model.Progress;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019¢\u0006\u0002\b\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/FillModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/foundation/layout/Direction;", "e", "Landroidx/compose/foundation/layout/Direction;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "f", "F", Progress.G, "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/Direction;FLyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class FillModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Direction direction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float fraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FillModifier(@dl.d Direction direction, float f10, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(direction, "direction");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.direction = direction;
        this.fraction = f10;
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
        if (other instanceof FillModifier) {
            FillModifier fillModifier = (FillModifier) other;
            if (this.direction == fillModifier.direction) {
                if (this.fraction == fillModifier.fraction) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.floatToIntBits(this.fraction);
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
        int iR;
        int iP;
        int iO;
        int I;
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        if (!s1.b.j(j10) || this.direction == Direction.Vertical) {
            iR = s1.b.r(j10);
            iP = s1.b.p(j10);
        } else {
            iR = fi.u.I(di.d.L0(s1.b.p(j10) * this.fraction), s1.b.r(j10), s1.b.p(j10));
            iP = iR;
        }
        if (!s1.b.i(j10) || this.direction == Direction.Horizontal) {
            int iQ = s1.b.q(j10);
            iO = s1.b.o(j10);
            I = iQ;
        } else {
            I = fi.u.I(di.d.L0(s1.b.o(j10) * this.fraction), s1.b.q(j10), s1.b.o(j10));
            iO = I;
        }
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(s1.c.a(iR, iP, I, iO));
        return androidx.compose.ui.layout.k0.p(measure, e1VarZ1.getWidth(), e1VarZ1.getHeight(), null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.FillModifier$measure$1
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

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
