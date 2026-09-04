package androidx.compose.foundation.gestures;

import androidx.compose.foundation.f0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;
import s1.x;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00103\u001a\u00020'\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020504\u0012\u0006\u0010?\u001a\u00020;\u0012\u0006\u0010C\u001a\u00020@\u0012\b\u0010H\u001a\u0004\u0018\u00010D¢\u0006\u0004\bL\u0010MJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u0002*\u00020\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u0002*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n*\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\n\u0010\u0017\u001a\u00020\n*\u00020\nJ\u0017\u0010\u0018\u001a\u00020\u0002*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ'\u0010\u001b\u001a\u00020\u0002*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u000eJ!\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0011H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b&\u0010$J\u0006\u0010(\u001a\u00020'J\u000e\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020'R\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b-\u0010.R\u0017\u00103\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b1\u00102R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000205048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010?\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010C\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b-\u0010A\u001a\u0004\b6\u0010BR\u0019\u0010H\u001a\u0004\u0018\u00010D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bE\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020'0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010J\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "Lb1/f;", "consumedByChain", "availableForOverscroll", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "Lkotlin/b2;", "j", "(JJI)V", "", ak.aG, "(F)J", "q", "(J)J", "t", "(J)F", "Ls1/x;", ak.aB, "r", "newValue", "v", "(JF)J", "n", "o", "Landroidx/compose/foundation/gestures/m;", "availableDelta", ak.av, "(Landroidx/compose/foundation/gestures/m;JI)J", "scrollDelta", "k", "(JI)J", sd.b.f139393k, "l", "initialVelocity", "i", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", "available", "b", "", "p", "isFlinging", "m", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/Orientation;", "e", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Z", "g", "()Z", "reverseDirection", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", ak.aF, "Landroidx/compose/runtime/m2;", "d", "()Landroidx/compose/runtime/m2;", "nestedScrollDispatcher", "Landroidx/compose/foundation/gestures/p;", "Landroidx/compose/foundation/gestures/p;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/foundation/gestures/p;", "scrollableState", "Landroidx/compose/foundation/gestures/g;", "Landroidx/compose/foundation/gestures/g;", "()Landroidx/compose/foundation/gestures/g;", "flingBehavior", "Landroidx/compose/foundation/f0;", "f", "Landroidx/compose/foundation/f0;", "()Landroidx/compose/foundation/f0;", "overscrollEffect", "Landroidx/compose/runtime/a1;", "Landroidx/compose/runtime/a1;", "isNestedFlinging", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/m2;Landroidx/compose/foundation/gestures/p;Landroidx/compose/foundation/gestures/g;Landroidx/compose/foundation/f0;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class ScrollingLogic {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Orientation orientation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<NestedScrollDispatcher> nestedScrollDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p scrollableState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g flingBehavior;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final f0 overscrollEffect;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<Boolean> isNestedFlinging;

    public ScrollingLogic(@dl.d Orientation orientation, boolean z10, @dl.d m2<NestedScrollDispatcher> nestedScrollDispatcher, @dl.d p scrollableState, @dl.d g flingBehavior, @dl.e f0 f0Var) {
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        kotlin.jvm.internal.f0.p(nestedScrollDispatcher, "nestedScrollDispatcher");
        kotlin.jvm.internal.f0.p(scrollableState, "scrollableState");
        kotlin.jvm.internal.f0.p(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z10;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = f0Var;
        this.isNestedFlinging = h2.g(Boolean.FALSE, null, 2, null);
    }

    private final void j(long consumedByChain, long availableForOverscroll, int source) {
        f0 f0Var = this.overscrollEffect;
        if (f0Var == null || !f0Var.isEnabled()) {
            return;
        }
        this.overscrollEffect.a(consumedByChain, availableForOverscroll, source);
    }

    public final long a(@dl.d m dispatchScroll, long j10, int i10) {
        kotlin.jvm.internal.f0.p(dispatchScroll, "$this$dispatchScroll");
        long jQ = q(j10);
        long jU = b1.f.u(jQ, k(jQ, i10));
        NestedScrollDispatcher value = this.nestedScrollDispatcher.getValue();
        long jU2 = b1.f.u(jU, value.d(jU, i10));
        long jO = o(u(dispatchScroll.a(t(o(jU2)))));
        long jU3 = b1.f.u(jU2, jO);
        long jB = value.b(jO, jU3, i10);
        j(jU2, b1.f.u(jU3, jB), i10);
        return b1.f.u(jU3, jB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object b(long j10, @dl.d kotlin.coroutines.c<? super x> cVar) throws Throwable {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        Ref.LongRef longRef;
        if (cVar instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) cVar;
            int i10 = scrollingLogic$doFlingAnimation$1.f5579e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.f5579e = i10 - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, cVar);
            }
        } else {
            scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, cVar);
        }
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$2 = scrollingLogic$doFlingAnimation$1;
        Object obj = scrollingLogic$doFlingAnimation$2.f5577c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = scrollingLogic$doFlingAnimation$2.f5579e;
        if (i11 == 0) {
            t0.n(obj);
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.f124890b = j10;
            p pVar = this.scrollableState;
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$3 = new ScrollingLogic$doFlingAnimation$2(this, longRef2, j10, null);
            scrollingLogic$doFlingAnimation$2.f5576b = longRef2;
            scrollingLogic$doFlingAnimation$2.f5579e = 1;
            if (o.a(pVar, null, scrollingLogic$doFlingAnimation$3, scrollingLogic$doFlingAnimation$2, 1, null) == objH) {
                return objH;
            }
            longRef = longRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) scrollingLogic$doFlingAnimation$2.f5576b;
            t0.n(obj);
        }
        return x.b(longRef.f124890b);
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getFlingBehavior() {
        return this.flingBehavior;
    }

    @dl.d
    public final m2<NestedScrollDispatcher> d() {
        return this.nestedScrollDispatcher;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final f0 getOverscrollEffect() {
        return this.overscrollEffect;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final p getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object i(long j10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        long jR;
        long jA;
        ScrollingLogic scrollingLogic;
        long jP;
        long jP2;
        ScrollingLogic scrollingLogic2;
        long f139264a;
        ScrollingLogic scrollingLogic3;
        long j11;
        long jP3;
        f0 f0Var;
        f0 f0Var2;
        ScrollingLogic scrollingLogic4;
        if (cVar instanceof ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1) cVar;
            int i10 = scrollingLogic$onDragStopped$1.f5596f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.f5596f = i10 - Integer.MIN_VALUE;
            } else {
                scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, cVar);
            }
        } else {
            scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, cVar);
        }
        Object objF = scrollingLogic$onDragStopped$1.f5594d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = scrollingLogic$onDragStopped$1.f5596f;
        if (i11 == 0) {
            t0.n(objF);
            m(true);
            jR = r(j10);
            f0 f0Var3 = this.overscrollEffect;
            if (f0Var3 == null || !f0Var3.isEnabled()) {
                jA = x.f139262b.a();
                scrollingLogic = this;
            } else {
                f0 f0Var4 = this.overscrollEffect;
                scrollingLogic$onDragStopped$1.f5592b = this;
                scrollingLogic$onDragStopped$1.f5593c = jR;
                scrollingLogic$onDragStopped$1.f5596f = 1;
                objF = f0Var4.f(jR, scrollingLogic$onDragStopped$1);
                if (objF == objH) {
                    return objH;
                }
                scrollingLogic = this;
            }
            jP = x.p(jR, jA);
            NestedScrollDispatcher value = scrollingLogic.nestedScrollDispatcher.getValue();
            scrollingLogic$onDragStopped$1.f5592b = scrollingLogic;
            scrollingLogic$onDragStopped$1.f5593c = jP;
            scrollingLogic$onDragStopped$1.f5596f = 2;
            objF = value.c(jP, scrollingLogic$onDragStopped$1);
            if (objF == objH) {
                return objH;
            }
            jP2 = x.p(jP, ((x) objF).getF139264a());
            scrollingLogic$onDragStopped$1.f5592b = scrollingLogic;
            scrollingLogic$onDragStopped$1.f5593c = jP2;
            scrollingLogic$onDragStopped$1.f5596f = 3;
            objF = scrollingLogic.b(jP2, scrollingLogic$onDragStopped$1);
            if (objF == objH) {
                return objH;
            }
            scrollingLogic2 = scrollingLogic;
            f139264a = ((x) objF).getF139264a();
            NestedScrollDispatcher value2 = scrollingLogic2.nestedScrollDispatcher.getValue();
            long jP4 = x.p(jP2, f139264a);
            scrollingLogic$onDragStopped$1.f5592b = scrollingLogic2;
            scrollingLogic$onDragStopped$1.f5593c = f139264a;
            scrollingLogic$onDragStopped$1.f5596f = 4;
            objF = value2.a(jP4, f139264a, scrollingLogic$onDragStopped$1);
            if (objF == objH) {
                return objH;
            }
            scrollingLogic3 = scrollingLogic2;
            j11 = f139264a;
            jP3 = x.p(j11, ((x) objF).getF139264a());
            f0Var = scrollingLogic3.overscrollEffect;
            if (f0Var != null) {
                f0Var2 = scrollingLogic3.overscrollEffect;
                scrollingLogic$onDragStopped$1.f5592b = scrollingLogic3;
                scrollingLogic$onDragStopped$1.f5596f = 5;
                if (f0Var2.b(jP3, scrollingLogic$onDragStopped$1) == objH) {
                    return objH;
                }
                scrollingLogic4 = scrollingLogic3;
                scrollingLogic3 = scrollingLogic4;
            }
            scrollingLogic3.m(false);
            return b2.f124493a;
        }
        if (i11 == 1) {
            jR = scrollingLogic$onDragStopped$1.f5593c;
            scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.f5592b;
            t0.n(objF);
        } else {
            if (i11 == 2) {
                jP = scrollingLogic$onDragStopped$1.f5593c;
                scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.f5592b;
                t0.n(objF);
                jP2 = x.p(jP, ((x) objF).getF139264a());
                scrollingLogic$onDragStopped$1.f5592b = scrollingLogic;
                scrollingLogic$onDragStopped$1.f5593c = jP2;
                scrollingLogic$onDragStopped$1.f5596f = 3;
                objF = scrollingLogic.b(jP2, scrollingLogic$onDragStopped$1);
                if (objF == objH) {
                    return objH;
                }
                scrollingLogic2 = scrollingLogic;
                f139264a = ((x) objF).getF139264a();
                NestedScrollDispatcher value3 = scrollingLogic2.nestedScrollDispatcher.getValue();
                long jP5 = x.p(jP2, f139264a);
                scrollingLogic$onDragStopped$1.f5592b = scrollingLogic2;
                scrollingLogic$onDragStopped$1.f5593c = f139264a;
                scrollingLogic$onDragStopped$1.f5596f = 4;
                objF = value3.a(jP5, f139264a, scrollingLogic$onDragStopped$1);
                if (objF == objH) {
                    return objH;
                }
                scrollingLogic3 = scrollingLogic2;
                j11 = f139264a;
                jP3 = x.p(j11, ((x) objF).getF139264a());
                f0Var = scrollingLogic3.overscrollEffect;
                if (f0Var != null) {
                    f0Var2 = scrollingLogic3.overscrollEffect;
                    scrollingLogic$onDragStopped$1.f5592b = scrollingLogic3;
                    scrollingLogic$onDragStopped$1.f5596f = 5;
                    if (f0Var2.b(jP3, scrollingLogic$onDragStopped$1) == objH) {
                        return objH;
                    }
                    scrollingLogic4 = scrollingLogic3;
                }
                scrollingLogic3.m(false);
                return b2.f124493a;
            }
            if (i11 == 3) {
                jP2 = scrollingLogic$onDragStopped$1.f5593c;
                scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.f5592b;
                t0.n(objF);
                scrollingLogic2 = scrollingLogic;
                f139264a = ((x) objF).getF139264a();
                NestedScrollDispatcher value4 = scrollingLogic2.nestedScrollDispatcher.getValue();
                long jP6 = x.p(jP2, f139264a);
                scrollingLogic$onDragStopped$1.f5592b = scrollingLogic2;
                scrollingLogic$onDragStopped$1.f5593c = f139264a;
                scrollingLogic$onDragStopped$1.f5596f = 4;
                objF = value4.a(jP6, f139264a, scrollingLogic$onDragStopped$1);
                if (objF == objH) {
                    return objH;
                }
                scrollingLogic3 = scrollingLogic2;
                j11 = f139264a;
                jP3 = x.p(j11, ((x) objF).getF139264a());
                f0Var = scrollingLogic3.overscrollEffect;
                if (f0Var != null) {
                    f0Var2 = scrollingLogic3.overscrollEffect;
                    scrollingLogic$onDragStopped$1.f5592b = scrollingLogic3;
                    scrollingLogic$onDragStopped$1.f5596f = 5;
                    if (f0Var2.b(jP3, scrollingLogic$onDragStopped$1) == objH) {
                        return objH;
                    }
                    scrollingLogic4 = scrollingLogic3;
                }
                scrollingLogic3.m(false);
                return b2.f124493a;
            }
            if (i11 == 4) {
                j11 = scrollingLogic$onDragStopped$1.f5593c;
                scrollingLogic3 = (ScrollingLogic) scrollingLogic$onDragStopped$1.f5592b;
                t0.n(objF);
                jP3 = x.p(j11, ((x) objF).getF139264a());
                f0Var = scrollingLogic3.overscrollEffect;
                if (f0Var != null && f0Var.isEnabled()) {
                    f0Var2 = scrollingLogic3.overscrollEffect;
                    scrollingLogic$onDragStopped$1.f5592b = scrollingLogic3;
                    scrollingLogic$onDragStopped$1.f5596f = 5;
                    if (f0Var2.b(jP3, scrollingLogic$onDragStopped$1) == objH) {
                        return objH;
                    }
                    scrollingLogic4 = scrollingLogic3;
                }
                scrollingLogic3.m(false);
                return b2.f124493a;
            }
            if (i11 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollingLogic4 = (ScrollingLogic) scrollingLogic$onDragStopped$1.f5592b;
            t0.n(objF);
        }
        scrollingLogic3 = scrollingLogic4;
        scrollingLogic3.m(false);
        return b2.f124493a;
        jA = ((x) objF).getF139264a();
        jP = x.p(jR, jA);
        NestedScrollDispatcher value5 = scrollingLogic.nestedScrollDispatcher.getValue();
        scrollingLogic$onDragStopped$1.f5592b = scrollingLogic;
        scrollingLogic$onDragStopped$1.f5593c = jP;
        scrollingLogic$onDragStopped$1.f5596f = 2;
        objF = value5.c(jP, scrollingLogic$onDragStopped$1);
        if (objF == objH) {
            return objH;
        }
        jP2 = x.p(jP, ((x) objF).getF139264a());
        scrollingLogic$onDragStopped$1.f5592b = scrollingLogic;
        scrollingLogic$onDragStopped$1.f5593c = jP2;
        scrollingLogic$onDragStopped$1.f5596f = 3;
        objF = scrollingLogic.b(jP2, scrollingLogic$onDragStopped$1);
        if (objF == objH) {
            return objH;
        }
        scrollingLogic2 = scrollingLogic;
        f139264a = ((x) objF).getF139264a();
        NestedScrollDispatcher value6 = scrollingLogic2.nestedScrollDispatcher.getValue();
        long jP7 = x.p(jP2, f139264a);
        scrollingLogic$onDragStopped$1.f5592b = scrollingLogic2;
        scrollingLogic$onDragStopped$1.f5593c = f139264a;
        scrollingLogic$onDragStopped$1.f5596f = 4;
        objF = value6.a(jP7, f139264a, scrollingLogic$onDragStopped$1);
        if (objF == objH) {
            return objH;
        }
        scrollingLogic3 = scrollingLogic2;
        j11 = f139264a;
        jP3 = x.p(j11, ((x) objF).getF139264a());
        f0Var = scrollingLogic3.overscrollEffect;
        if (f0Var != null) {
            f0Var2 = scrollingLogic3.overscrollEffect;
            scrollingLogic$onDragStopped$1.f5592b = scrollingLogic3;
            scrollingLogic$onDragStopped$1.f5596f = 5;
            if (f0Var2.b(jP3, scrollingLogic$onDragStopped$1) == objH) {
                return objH;
            }
            scrollingLogic4 = scrollingLogic3;
            scrollingLogic3 = scrollingLogic4;
        }
        scrollingLogic3.m(false);
        return b2.f124493a;
    }

    public final long k(long scrollDelta, int source) {
        f0 f0Var = this.overscrollEffect;
        return (f0Var == null || !f0Var.isEnabled()) ? b1.f.f30364b.e() : this.overscrollEffect.e(scrollDelta, source);
    }

    public final long l(long scroll) {
        return this.scrollableState.b() ? b1.f.f30364b.e() : u(n(this.scrollableState.a(n(t(scroll)))));
    }

    public final void m(boolean z10) {
        this.isNestedFlinging.setValue(Boolean.valueOf(z10));
    }

    public final float n(float f10) {
        return this.reverseDirection ? f10 * (-1) : f10;
    }

    public final long o(long j10) {
        return this.reverseDirection ? b1.f.x(j10, -1.0f) : j10;
    }

    public final boolean p() {
        if (!this.scrollableState.b() && !this.isNestedFlinging.getValue().booleanValue()) {
            f0 f0Var = this.overscrollEffect;
            if (!(f0Var != null ? f0Var.c() : false)) {
                return false;
            }
        }
        return true;
    }

    public final long q(long j10) {
        return this.orientation == Orientation.Horizontal ? b1.f.i(j10, 0.0f, 0.0f, 1, null) : b1.f.i(j10, 0.0f, 0.0f, 2, null);
    }

    public final long r(long j10) {
        return this.orientation == Orientation.Horizontal ? x.g(j10, 0.0f, 0.0f, 1, null) : x.g(j10, 0.0f, 0.0f, 2, null);
    }

    public final float s(long j10) {
        return this.orientation == Orientation.Horizontal ? x.l(j10) : x.n(j10);
    }

    public final float t(long j10) {
        return this.orientation == Orientation.Horizontal ? b1.f.p(j10) : b1.f.r(j10);
    }

    public final long u(float f10) {
        if (f10 == 0.0f) {
            return b1.f.f30364b.e();
        }
        return this.orientation == Orientation.Horizontal ? b1.g.a(f10, 0.0f) : b1.g.a(0.0f, f10);
    }

    public final long v(long j10, float f10) {
        return this.orientation == Orientation.Horizontal ? x.g(j10, f10, 0.0f, 2, null) : x.g(j10, 0.0f, f10, 1, null);
    }
}
