package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.ui.g
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR.\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0004\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/g0;", "Landroidx/compose/ui/input/pointer/p0;", "value", ak.aF, "Landroidx/compose/ui/input/pointer/p0;", "d", "()Landroidx/compose/ui/input/pointer/p0;", "g", "(Landroidx/compose/ui/input/pointer/p0;)V", "requestDisallowInterceptTouchEvent", "", "Z", ak.av, "()Z", "e", "(Z)V", "disallowIntercept", "Landroidx/compose/ui/input/pointer/e0;", "Landroidx/compose/ui/input/pointer/e0;", "z1", "()Landroidx/compose/ui/input/pointer/e0;", "pointerInputFilter", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "onTouchEvent", "Lyh/l;", "()Lyh/l;", "f", "(Lyh/l;)V", "<init>", "()V", "DispatchToViewState", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class PointerInteropFilter implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yh.l<? super MotionEvent, Boolean> f14675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private p0 requestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean disallowIntercept;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e0 pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);

    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "(Ljava/lang/String;I)V", "Unknown", "Dispatching", "NotDispatching", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @dl.d
    public final yh.l<MotionEvent, Boolean> c() {
        yh.l lVar = this.f14675b;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.f0.S("onTouchEvent");
        return null;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final p0 getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void e(boolean z10) {
        this.disallowIntercept = z10;
    }

    public final void f(@dl.d yh.l<? super MotionEvent, Boolean> lVar) {
        kotlin.jvm.internal.f0.p(lVar, "<set-?>");
        this.f14675b = lVar;
    }

    public final void g(@dl.e p0 p0Var) {
        p0 p0Var2 = this.requestDisallowInterceptTouchEvent;
        if (p0Var2 != null) {
            p0Var2.c(null);
        }
        this.requestDisallowInterceptTouchEvent = p0Var;
        if (p0Var == null) {
            return;
        }
        p0Var.c(this);
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

    @Override // androidx.compose.ui.input.pointer.g0
    @dl.d
    /* JADX INFO: renamed from: z1, reason: from getter */
    public e0 getPointerInputFilter() {
        return this.pointerInputFilter;
    }
}
