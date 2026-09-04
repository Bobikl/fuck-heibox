package androidx.compose.ui.platform;

import android.view.View;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NestedScrollInteropConnection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/e1;", "Landroidx/compose/ui/input/nestedscroll/b;", "Lkotlin/b2;", "b", "Lb1/f;", "available", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "consumed", ak.aF, "(JJI)J", "Ls1/x;", "d", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "(JJLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroid/view/View;", "Landroid/view/View;", sd.b.f139384b, "Landroidx/core/view/u0;", "Landroidx/core/view/u0;", "nestedScrollChildHelper", "", "[I", "consumedScrollCache", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e1 implements androidx.compose.ui.input.nestedscroll.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.core.view.u0 nestedScrollChildHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] consumedScrollCache;

    public e1(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        this.view = view;
        androidx.core.view.u0 u0Var = new androidx.core.view.u0(view);
        u0Var.p(true);
        this.nestedScrollChildHelper = u0Var;
        this.consumedScrollCache = new int[2];
        androidx.core.view.j1.Y1(view, true);
    }

    private final void b() {
        if (this.nestedScrollChildHelper.l(0)) {
            this.nestedScrollChildHelper.u(0);
        }
        if (this.nestedScrollChildHelper.l(1)) {
            this.nestedScrollChildHelper.u(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object a(long j10, long j11, @dl.d kotlin.coroutines.c<? super s1.x> cVar) {
        if (!this.nestedScrollChildHelper.a(f1.l(s1.x.l(j11)), f1.l(s1.x.n(j11)), true)) {
            j11 = s1.x.f139262b.a();
        }
        b();
        return s1.x.b(j11);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long c(long consumed, long available, int source) {
        if (!this.nestedScrollChildHelper.s(f1.g(available), f1.k(source))) {
            return b1.f.f30364b.e();
        }
        kotlin.collections.m.u2(this.consumedScrollCache, 0, 0, 0, 6, null);
        this.nestedScrollChildHelper.e(f1.f(b1.f.p(consumed)), f1.f(b1.f.r(consumed)), f1.f(b1.f.p(available)), f1.f(b1.f.r(available)), null, f1.k(source), this.consumedScrollCache);
        return f1.j(this.consumedScrollCache, available);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object d(long j10, @dl.d kotlin.coroutines.c<? super s1.x> cVar) {
        if (!this.nestedScrollChildHelper.b(f1.l(s1.x.l(j10)), f1.l(s1.x.n(j10)))) {
            j10 = s1.x.f139262b.a();
        }
        b();
        return s1.x.b(j10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long e(long available, int source) {
        if (!this.nestedScrollChildHelper.s(f1.g(available), f1.k(source))) {
            return b1.f.f30364b.e();
        }
        kotlin.collections.m.u2(this.consumedScrollCache, 0, 0, 0, 6, null);
        this.nestedScrollChildHelper.d(f1.f(b1.f.p(available)), f1.f(b1.f.r(available)), this.consumedScrollCache, null, f1.k(source));
        return f1.j(this.consumedScrollCache, available);
    }
}
