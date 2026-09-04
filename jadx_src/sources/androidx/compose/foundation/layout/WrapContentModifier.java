package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0002\b#ø\u0001\u0001¢\u0006\u0004\b%\u0010&J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/foundation/layout/Direction;", "e", "Landroidx/compose/foundation/layout/Direction;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "f", "Z", "unbounded", RXScreenCaptureService.KEY_HEIGHT, "Ljava/lang/Object;", "align", "Lkotlin/Function2;", "Ls1/r;", "Landroidx/compose/ui/unit/LayoutDirection;", "Ls1/n;", "alignmentCallback", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLyh/p;Ljava/lang/Object;Lyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class WrapContentModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Direction direction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final yh.p<s1.r, LayoutDirection, s1.n> f6278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object align;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentModifier(@dl.d Direction direction, boolean z10, @dl.d yh.p<? super s1.r, ? super LayoutDirection, s1.n> alignmentCallback, @dl.d Object align, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(direction, "direction");
        kotlin.jvm.internal.f0.p(alignmentCallback, "alignmentCallback");
        kotlin.jvm.internal.f0.p(align, "align");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.direction = direction;
        this.unbounded = z10;
        this.f6278g = alignmentCallback;
        this.align = align;
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
        if (!(other instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) other;
        return this.direction == wrapContentModifier.direction && this.unbounded == wrapContentModifier.unbounded && kotlin.jvm.internal.f0.g(this.align, wrapContentModifier.align);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + androidx.compose.foundation.b0.a(this.unbounded)) * 31) + this.align.hashCode();
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
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int iR = direction != direction2 ? 0 : s1.b.r(j10);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(s1.c.a(iR, (this.direction == direction2 || !this.unbounded) ? s1.b.p(j10) : Integer.MAX_VALUE, direction3 == direction4 ? s1.b.q(j10) : 0, (this.direction == direction4 || !this.unbounded) ? s1.b.o(j10) : Integer.MAX_VALUE));
        final int I = fi.u.I(e1VarZ1.getWidth(), s1.b.r(j10), s1.b.p(j10));
        final int I2 = fi.u.I(e1VarZ1.getHeight(), s1.b.q(j10), s1.b.o(j10));
        return androidx.compose.ui.layout.k0.p(measure, I, I2, null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.WrapContentModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1.a.r(layout, e1VarZ1, ((s1.n) this.f6280b.f6278g.invoke(s1.r.b(s1.s.a(I - e1VarZ1.getWidth(), I2 - e1VarZ1.getHeight())), measure.getLayoutDirection())).getF139239a(), 0.0f, 2, null);
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
