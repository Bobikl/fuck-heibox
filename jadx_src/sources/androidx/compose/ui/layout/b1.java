package androidx.compose.ui.layout;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: OnRemeasuredModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0002\b\u0016ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001f\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00118\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/layout/b1;", "Landroidx/compose/ui/layout/a1;", "Landroidx/compose/ui/platform/y0;", "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "Lkotlin/b2;", "L", "(J)V", "", "other", "", "equals", "", "hashCode", "f", "J", "previousSize", "Lkotlin/Function1;", "onSizeChanged", "Lyh/l;", "()Lyh/l;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Lyh/l;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class b1 extends androidx.compose.ui.platform.y0 implements a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<s1.r, b2> f14990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long previousSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b1(@dl.d yh.l<? super s1.r, b2> onSizeChanged, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(onSizeChanged, "onSizeChanged");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.f14990e = onSizeChanged;
        this.previousSize = s1.s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.ui.layout.a1
    public void L(long size) {
        if (s1.r.h(this.previousSize, size)) {
            return;
        }
        this.f14990e.invoke(s1.r.b(size));
        this.previousSize = size;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof b1) {
            return kotlin.jvm.internal.f0.g(this.f14990e, ((b1) other).f14990e);
        }
        return false;
    }

    @dl.d
    public final yh.l<s1.r, b2> f() {
        return this.f14990e;
    }

    public int hashCode() {
        return this.f14990e.hashCode();
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
