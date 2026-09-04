package androidx.compose.foundation.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/layout/t0;", "Landroidx/compose/foundation/layout/c0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "A1", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)J", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "", "width", "i", "", ak.aF, "Z", "K1", "()Z", "enforceIncoming", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class t0 implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final t0 f6388b = new t0();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean enforceIncoming = false;

    private t0() {
    }

    @Override // androidx.compose.foundation.layout.c0
    public long A1(@dl.d androidx.compose.ui.layout.l0 calculateContentConstraints, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(calculateContentConstraints, "$this$calculateContentConstraints");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return s1.b.f139198b.d(measurable.L0(s1.b.p(j10)));
    }

    @Override // androidx.compose.foundation.layout.c0
    public boolean K1() {
        return enforceIncoming;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.foundation.layout.c0, androidx.compose.ui.layout.w
    public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return IntrinsicSizeModifier$CC.f(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.foundation.layout.c0, androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return IntrinsicSizeModifier$CC.c(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.foundation.layout.c0, androidx.compose.ui.layout.w
    public int i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return measurable.L0(i10);
    }

    @Override // androidx.compose.foundation.layout.c0, androidx.compose.ui.layout.w
    public /* synthetic */ int j(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return IntrinsicSizeModifier$CC.e(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.foundation.layout.c0, androidx.compose.ui.layout.w
    public /* synthetic */ androidx.compose.ui.layout.j0 k(androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.layout.g0 g0Var, long j10) {
        return IntrinsicSizeModifier$CC.d(this, l0Var, g0Var, j10);
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
