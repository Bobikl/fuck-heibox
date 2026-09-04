package androidx.compose.material3;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TouchTarget.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0010ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R \u0010\u0015\u001a\u00020\u00108\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/MinimumTouchTargetModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "other", "", "equals", "", "hashCode", "Ls1/l;", "b", "J", ak.av, "()J", UiKitSpanObj.TYPE_SIZE, "<init>", "(JLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class MinimumTouchTargetModifier implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long size;

    private MinimumTouchTargetModifier(long j10) {
        this.size = j10;
    }

    public /* synthetic */ MinimumTouchTargetModifier(long j10, kotlin.jvm.internal.u uVar) {
        this(j10);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getSize() {
        return this.size;
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
        MinimumTouchTargetModifier minimumTouchTargetModifier = other instanceof MinimumTouchTargetModifier ? (MinimumTouchTargetModifier) other : null;
        if (minimumTouchTargetModifier == null) {
            return false;
        }
        return s1.l.l(this.size, minimumTouchTargetModifier.size);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return s1.l.r(this.size);
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
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(j10);
        final int iMax = Math.max(e1VarZ1.getWidth(), measure.e1(s1.l.p(this.size)));
        final int iMax2 = Math.max(e1VarZ1.getHeight(), measure.e1(s1.l.m(this.size)));
        return androidx.compose.ui.layout.k0.p(measure, iMax, iMax2, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.MinimumTouchTargetModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1.a.p(layout, e1VarZ1, di.d.L0((iMax - e1VarZ1.getWidth()) / 2.0f), di.d.L0((iMax2 - e1VarZ1.getHeight()) / 2.0f), 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return kotlin.b2.f124493a;
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
