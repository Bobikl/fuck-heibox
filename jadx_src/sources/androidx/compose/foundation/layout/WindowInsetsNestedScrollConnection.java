package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(30)
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010.\u001a\u00020)\u0012\u0006\u00103\u001a\u00020/\u0012\u0006\u00108\u001a\u000204\u0012\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bS\u0010TJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J%\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0016J\u0006\u0010&\u001a\u00020\u0003J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0012\u0010(\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0016R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\b1\u00102R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\u001e\u00105\u001a\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR \u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006U"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/b;", "Landroid/view/WindowInsetsAnimationControlListener;", "Lkotlin/b2;", "v", "Landroid/view/WindowInsetsAnimationController;", "q", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lb1/f;", "available", "", "scrollAmount", RXScreenCaptureService.KEY_WIDTH, "(JF)J", "Ls1/x;", "flingAmount", "", "towardShown", "p", "(JFZLkotlin/coroutines/c;)Ljava/lang/Object;", "inset", "m", "n", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "consumed", ak.aF, "(JJI)J", "d", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "(JJLkotlin/coroutines/c;)Ljava/lang/Object;", "controller", "", "types", "onReady", "o", "onFinished", "onCancelled", "Landroidx/compose/foundation/layout/f;", "b", "Landroidx/compose/foundation/layout/f;", ak.aG, "()Landroidx/compose/foundation/layout/f;", "windowInsets", "Landroid/view/View;", "Landroid/view/View;", "t", "()Landroid/view/View;", sd.b.f139384b, "Landroidx/compose/foundation/layout/a1;", "Landroidx/compose/foundation/layout/a1;", ak.aB, "()Landroidx/compose/foundation/layout/a1;", "sideCalculator", "f", "Landroid/view/WindowInsetsAnimationController;", "animationController", "g", "Z", "isControllerRequested", "Landroid/os/CancellationSignal;", RXScreenCaptureService.KEY_HEIGHT, "Landroid/os/CancellationSignal;", "cancellationSignal", "i", "F", "partialConsumption", "Lkotlinx/coroutines/d2;", "j", "Lkotlinx/coroutines/d2;", "animationJob", "Lkotlinx/coroutines/p;", "k", "Lkotlinx/coroutines/p;", "continuation", "Ls1/e;", "density", "Ls1/e;", "r", "()Ls1/e;", "<init>", "(Landroidx/compose/foundation/layout/f;Landroid/view/View;Landroidx/compose/foundation/layout/a1;Ls1/e;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class WindowInsetsNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.b, WindowInsetsAnimationControlListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f windowInsets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View view;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 sideCalculator;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final s1.e f6201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private WindowInsetsAnimationController animationController;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isControllerRequested;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CancellationSignal cancellationSignal;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float partialConsumption;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private d2 animationJob;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private kotlinx.coroutines.p<? super WindowInsetsAnimationController> continuation;

    public WindowInsetsNestedScrollConnection(@dl.d f windowInsets, @dl.d View view, @dl.d a1 sideCalculator, @dl.d s1.e density) {
        kotlin.jvm.internal.f0.p(windowInsets, "windowInsets");
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(sideCalculator, "sideCalculator");
        kotlin.jvm.internal.f0.p(density, "density");
        this.windowInsets = windowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.f6201e = density;
        this.cancellationSignal = new CancellationSignal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(float f10) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
            kotlin.jvm.internal.f0.o(currentInsets, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.e(currentInsets, di.d.L0(f10)), 1.0f, 0.0f);
        }
    }

    private final void n() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if ((windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady()) && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.g());
        }
        this.animationController = null;
        kotlinx.coroutines.p<? super WindowInsetsAnimationController> pVar = this.continuation;
        if (pVar != null) {
            pVar.I0(null, new yh.l<Throwable, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                }
            });
        }
        this.continuation = null;
        d2 d2Var = this.animationJob;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object p(long j10, float f10, boolean z10, kotlin.coroutines.c<? super s1.x> cVar) throws Throwable {
        WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$1;
        long j11;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2;
        Ref.FloatRef floatRef;
        long j12;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection3;
        long j13;
        float f11 = f10;
        if (cVar instanceof WindowInsetsNestedScrollConnection$fling$1) {
            windowInsetsNestedScrollConnection$fling$1 = (WindowInsetsNestedScrollConnection$fling$1) cVar;
            int i10 = windowInsetsNestedScrollConnection$fling$1.f6216h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                windowInsetsNestedScrollConnection$fling$1.f6216h = i10 - Integer.MIN_VALUE;
            } else {
                windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(this, cVar);
            }
        } else {
            windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(this, cVar);
        }
        Object obj = windowInsetsNestedScrollConnection$fling$1.f6214f;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = windowInsetsNestedScrollConnection$fling$1.f6216h;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            d2 d2Var = this.animationJob;
            if (d2Var != null) {
                d2.a.b(d2Var, null, 1, null);
            }
            this.animationJob = null;
            this.partialConsumption = 0.0f;
            if (((f11 == 0.0f) && !z10) || (this.animationController == null && this.windowInsets.g() == z10)) {
                return s1.x.b(s1.x.f139262b.a());
            }
            windowInsetsNestedScrollConnection$fling$1.f6210b = this;
            windowInsetsNestedScrollConnection$fling$1.f6212d = j10;
            windowInsetsNestedScrollConnection$fling$1.f6213e = f11;
            windowInsetsNestedScrollConnection$fling$1.f6216h = 1;
            Object objQ = q(windowInsetsNestedScrollConnection$fling$1);
            if (objQ == objH) {
                return objH;
            }
            j11 = j10;
            obj = objQ;
            windowInsetsNestedScrollConnection = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    j12 = windowInsetsNestedScrollConnection$fling$1.f6212d;
                    floatRef = (Ref.FloatRef) windowInsetsNestedScrollConnection$fling$1.f6211c;
                    windowInsetsNestedScrollConnection2 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.f6210b;
                    kotlin.t0.n(obj);
                    return s1.x.b(windowInsetsNestedScrollConnection2.sideCalculator.g(j12, floatRef.f124888b));
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j13 = windowInsetsNestedScrollConnection$fling$1.f6212d;
                windowInsetsNestedScrollConnection3 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.f6210b;
                kotlin.t0.n(obj);
                return s1.x.b(windowInsetsNestedScrollConnection3.sideCalculator.g(j13, 0.0f));
            }
            f11 = windowInsetsNestedScrollConnection$fling$1.f6213e;
            j11 = windowInsetsNestedScrollConnection$fling$1.f6212d;
            windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.f6210b;
            kotlin.t0.n(obj);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = (WindowInsetsAnimationController) obj;
        if (windowInsetsAnimationController == null) {
            return s1.x.b(s1.x.f139262b.a());
        }
        a1 a1Var = windowInsetsNestedScrollConnection.sideCalculator;
        Insets hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
        kotlin.jvm.internal.f0.o(hiddenStateInsets, "animationController.hiddenStateInsets");
        int iF = a1Var.f(hiddenStateInsets);
        a1 a1Var2 = windowInsetsNestedScrollConnection.sideCalculator;
        Insets shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
        kotlin.jvm.internal.f0.o(shownStateInsets, "animationController.shownStateInsets");
        int iF2 = a1Var2.f(shownStateInsets);
        Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
        kotlin.jvm.internal.f0.o(currentInsets, "animationController.currentInsets");
        int iF3 = windowInsetsNestedScrollConnection.sideCalculator.f(currentInsets);
        if ((f11 <= 0.0f && iF3 == iF) || (f11 >= 0.0f && iF3 == iF2)) {
            windowInsetsAnimationController.finish(iF3 == iF2);
            windowInsetsNestedScrollConnection.animationController = null;
            return s1.x.b(s1.x.f139262b.a());
        }
        c1 c1Var = new c1(windowInsetsNestedScrollConnection.f6201e);
        float f12 = iF3 + c1Var.f(f11);
        float f13 = iF;
        boolean z11 = (f12 - f13) / ((float) (iF2 - iF)) > 0.5f;
        int i12 = z11 ? iF2 : iF;
        if (f12 <= iF2 && f12 >= f13) {
            WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(windowInsetsNestedScrollConnection, iF3, i12, f11, windowInsetsAnimationController, z11, null);
            windowInsetsNestedScrollConnection$fling$1.f6210b = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection$fling$1.f6212d = j11;
            windowInsetsNestedScrollConnection$fling$1.f6216h = 3;
            if (kotlinx.coroutines.r0.g(windowInsetsNestedScrollConnection$fling$3, windowInsetsNestedScrollConnection$fling$1) == objH) {
                return objH;
            }
            windowInsetsNestedScrollConnection3 = windowInsetsNestedScrollConnection;
            j13 = j11;
            return s1.x.b(windowInsetsNestedScrollConnection3.sideCalculator.g(j13, 0.0f));
        }
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(windowInsetsNestedScrollConnection, iF3, f11, c1Var, iF, iF2, floatRef2, windowInsetsAnimationController, z11, null);
        windowInsetsNestedScrollConnection$fling$1.f6210b = windowInsetsNestedScrollConnection;
        windowInsetsNestedScrollConnection$fling$1.f6211c = floatRef2;
        windowInsetsNestedScrollConnection$fling$1.f6212d = j11;
        windowInsetsNestedScrollConnection$fling$1.f6216h = 2;
        if (kotlinx.coroutines.r0.g(windowInsetsNestedScrollConnection$fling$2, windowInsetsNestedScrollConnection$fling$1) == objH) {
            return objH;
        }
        windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
        floatRef = floatRef2;
        j12 = j11;
        return s1.x.b(windowInsetsNestedScrollConnection2.sideCalculator.g(j12, floatRef.f124888b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(kotlin.coroutines.c<? super WindowInsetsAnimationController> cVar) {
        Object objT = this.animationController;
        if (objT == null) {
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar.F0();
            this.continuation = qVar;
            v();
            objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
        }
        return objT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType(), -1L, null, this.cancellationSignal, this);
        }
    }

    private final long w(long available, float scrollAmount) {
        d2 d2Var = this.animationJob;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (!(scrollAmount == 0.0f)) {
            if (this.windowInsets.g() != (scrollAmount > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    v();
                    return this.sideCalculator.c(available);
                }
                a1 a1Var = this.sideCalculator;
                Insets hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                kotlin.jvm.internal.f0.o(hiddenStateInsets, "animationController.hiddenStateInsets");
                int iF = a1Var.f(hiddenStateInsets);
                a1 a1Var2 = this.sideCalculator;
                Insets shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                kotlin.jvm.internal.f0.o(shownStateInsets, "animationController.shownStateInsets");
                int iF2 = a1Var2.f(shownStateInsets);
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                kotlin.jvm.internal.f0.o(currentInsets, "animationController.currentInsets");
                int iF3 = this.sideCalculator.f(currentInsets);
                if (iF3 == (scrollAmount > 0.0f ? iF2 : iF)) {
                    this.partialConsumption = 0.0f;
                    return b1.f.f30364b.e();
                }
                float f10 = iF3 + scrollAmount + this.partialConsumption;
                int I = fi.u.I(di.d.L0(f10), iF, iF2);
                this.partialConsumption = f10 - di.d.L0(f10);
                if (I != iF3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.e(currentInsets, I), 1.0f, 0.0f);
                }
                return this.sideCalculator.c(available);
            }
        }
        return b1.f.f30364b.e();
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object a(long j10, long j11, @dl.d kotlin.coroutines.c<? super s1.x> cVar) {
        return p(j11, this.sideCalculator.a(s1.x.l(j11), s1.x.n(j11)), true, cVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long c(long consumed, long available, int source) {
        return w(available, this.sideCalculator.a(b1.f.p(available), b1.f.r(available)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object d(long j10, @dl.d kotlin.coroutines.c<? super s1.x> cVar) {
        return p(j10, this.sideCalculator.b(s1.x.l(j10), s1.x.n(j10)), false, cVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.b
    public long e(long available, int source) {
        return w(available, this.sideCalculator.b(b1.f.p(available), b1.f.r(available)));
    }

    public final void o() {
        kotlinx.coroutines.p<? super WindowInsetsAnimationController> pVar = this.continuation;
        if (pVar != null) {
            pVar.I0(null, new yh.l<Throwable, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$dispose$1
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                }
            });
        }
        d2 d2Var = this.animationJob;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!kotlin.jvm.internal.f0.g(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    public void onCancelled(@dl.e WindowInsetsAnimationController windowInsetsAnimationController) {
        n();
    }

    public void onFinished(@dl.d WindowInsetsAnimationController controller) {
        kotlin.jvm.internal.f0.p(controller, "controller");
        n();
    }

    public void onReady(@dl.d WindowInsetsAnimationController controller, int i10) {
        kotlin.jvm.internal.f0.p(controller, "controller");
        this.animationController = controller;
        this.isControllerRequested = false;
        kotlinx.coroutines.p<? super WindowInsetsAnimationController> pVar = this.continuation;
        if (pVar != null) {
            pVar.I0(controller, new yh.l<Throwable, b2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                }
            });
        }
        this.continuation = null;
    }

    @dl.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final s1.e getF6201e() {
        return this.f6201e;
    }

    @dl.d
    /* JADX INFO: renamed from: s, reason: from getter */
    public final a1 getSideCalculator() {
        return this.sideCalculator;
    }

    @dl.d
    /* JADX INFO: renamed from: t, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @dl.d
    /* JADX INFO: renamed from: u, reason: from getter */
    public final f getWindowInsets() {
        return this.windowInsets;
    }
}
