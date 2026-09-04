package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016JD\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0002\b\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollDraggableState;", "Landroidx/compose/foundation/gestures/f;", "Landroidx/compose/foundation/gestures/d;", "", "pixels", "Lkotlin/b2;", ak.aF, "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "b", "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "delta", ak.av, "Landroidx/compose/runtime/m2;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/runtime/m2;", "e", "()Landroidx/compose/runtime/m2;", "scrollLogic", "Landroidx/compose/foundation/gestures/m;", "Landroidx/compose/foundation/gestures/m;", "d", "()Landroidx/compose/foundation/gestures/m;", "f", "(Landroidx/compose/foundation/gestures/m;)V", "latestScrollScope", "<init>", "(Landroidx/compose/runtime/m2;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class ScrollDraggableState implements f, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<ScrollingLogic> scrollLogic;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private m latestScrollScope;

    public ScrollDraggableState(@dl.d m2<ScrollingLogic> scrollLogic) {
        f0.p(scrollLogic, "scrollLogic");
        this.scrollLogic = scrollLogic;
        this.latestScrollScope = ScrollableKt.f5524a;
    }

    @Override // androidx.compose.foundation.gestures.f
    public void a(float f10) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.l(value.u(f10));
    }

    @Override // androidx.compose.foundation.gestures.f
    @dl.e
    public Object b(@dl.d MutatePriority mutatePriority, @dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objC = this.scrollLogic.getValue().getScrollableState().c(mutatePriority, new ScrollDraggableState$drag$2(this, pVar, null), cVar);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }

    @Override // androidx.compose.foundation.gestures.d
    public void c(float f10) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.a(this.latestScrollScope, value.u(f10), androidx.compose.ui.input.nestedscroll.c.INSTANCE.a());
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final m getLatestScrollScope() {
        return this.latestScrollScope;
    }

    @dl.d
    public final m2<ScrollingLogic> e() {
        return this.scrollLogic;
    }

    public final void f(@dl.d m mVar) {
        f0.p(mVar, "<set-?>");
        this.latestScrollScope = mVar;
    }
}
