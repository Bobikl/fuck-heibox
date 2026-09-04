package androidx.compose.foundation.gestures;

import androidx.compose.runtime.j2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.sync.MutexKt;
import s1.DpRect;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00103\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u0003*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u0003*\u00020\fH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u0003*\u00020\u0004H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\f*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\f*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001J\u001a\u0010\u001a\u001a\u00020\u0011*\u00020\u0012H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u0007*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u0007*\u00020\fH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u0007*\u00020\u0004H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\u0006\u0010#\u001a\u00020 J\u0013\u0010$\u001a\u00020 H\u0096@ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020&H\u0096@ø\u0001\u0001¢\u0006\u0004\b'\u0010%R\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u00102\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/k;", "Ls1/e;", "Ls1/h;", "", "e1", "(F)I", "Ls1/u;", "J1", "(J)I", "q", "(J)F", "", "F", "(F)F", androidx.exifinterface.media.a.S4, "(I)F", "Lb1/m;", "Ls1/l;", "n", "(J)J", "E1", "k1", "Ls1/k;", "Lb1/i;", "h0", "J", "M", "(F)J", ak.aB, "r", "(I)J", "Lkotlin/b2;", "b", "g", RXScreenCaptureService.KEY_HEIGHT, "x1", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "h1", ak.aF, "Z", "isReleased", "d", "isCanceled", "Lkotlinx/coroutines/sync/c;", "e", "Lkotlinx/coroutines/sync/c;", "mutex", "getDensity", "()F", "density", "C1", "fontScale", "<init>", "(Ls1/e;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class PressGestureScopeImpl implements k, s1.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ s1.e f5489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isCanceled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.sync.c mutex;

    public PressGestureScopeImpl(@dl.d s1.e density) {
        f0.p(density, "density");
        this.f5489b = density;
        this.mutex = MutexKt.a(false);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1 */
    public float getF139218c() {
        return this.f5489b.getF139218c();
    }

    @Override // s1.e
    @j2
    public float E(int i10) {
        return this.f5489b.E(i10);
    }

    @Override // s1.e
    @j2
    public float E1(float f10) {
        return this.f5489b.E1(f10);
    }

    @Override // s1.e
    @j2
    public float F(float f10) {
        return this.f5489b.F(f10);
    }

    @Override // s1.e
    @j2
    public long J(long j10) {
        return this.f5489b.J(j10);
    }

    @Override // s1.e
    @j2
    public int J1(long j10) {
        return this.f5489b.J1(j10);
    }

    @Override // s1.e
    @j2
    public long M(float f10) {
        return this.f5489b.M(f10);
    }

    public final void b() {
        this.isCanceled = true;
        kotlinx.coroutines.sync.c.a.d(this.mutex, null, 1, null);
    }

    @Override // s1.e
    @j2
    public int e1(float f10) {
        return this.f5489b.e1(f10);
    }

    public final void g() {
        this.isReleased = true;
        kotlinx.coroutines.sync.c.a.d(this.mutex, null, 1, null);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity */
    public float getF139217b() {
        return this.f5489b.getF139217b();
    }

    public final void h() {
        kotlinx.coroutines.sync.c.a.c(this.mutex, null, 1, null);
        this.isReleased = false;
        this.isCanceled = false;
    }

    @Override // s1.e
    @j2
    @dl.d
    public b1.i h0(@dl.d DpRect dpRect) {
        f0.p(dpRect, "<this>");
        return this.f5489b.h0(dpRect);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.k
    @dl.e
    public Object h1(@dl.d kotlin.coroutines.c<? super Boolean> cVar) throws Throwable {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (cVar instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) cVar;
            int i10 = pressGestureScopeImpl$tryAwaitRelease$1.f5499e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.f5499e = i10 - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, cVar);
            }
        } else {
            pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, cVar);
        }
        Object obj = pressGestureScopeImpl$tryAwaitRelease$1.f5497c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = pressGestureScopeImpl$tryAwaitRelease$1.f5499e;
        if (i11 == 0) {
            t0.n(obj);
            if (!this.isReleased && !this.isCanceled) {
                kotlinx.coroutines.sync.c cVar2 = this.mutex;
                pressGestureScopeImpl$tryAwaitRelease$1.f5496b = this;
                pressGestureScopeImpl$tryAwaitRelease$1.f5499e = 1;
                if (kotlinx.coroutines.sync.c.a.b(cVar2, null, pressGestureScopeImpl$tryAwaitRelease$1, 1, null) == objH) {
                    return objH;
                }
            }
            pressGestureScopeImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = (PressGestureScopeImpl) pressGestureScopeImpl$tryAwaitRelease$1.f5496b;
            t0.n(obj);
        }
        return kotlin.coroutines.jvm.internal.a.a(pressGestureScopeImpl.isReleased);
    }

    @Override // s1.e
    @j2
    public float k1(long j10) {
        return this.f5489b.k1(j10);
    }

    @Override // s1.e
    @j2
    public long n(long j10) {
        return this.f5489b.n(j10);
    }

    @Override // s1.e
    @j2
    public float q(long j10) {
        return this.f5489b.q(j10);
    }

    @Override // s1.e
    @j2
    public long r(int i10) {
        return this.f5489b.r(i10);
    }

    @Override // s1.e
    @j2
    public long s(float f10) {
        return this.f5489b.s(f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.k
    @dl.e
    public Object x1(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PressGestureScopeImpl$awaitRelease$1 pressGestureScopeImpl$awaitRelease$1;
        if (cVar instanceof PressGestureScopeImpl$awaitRelease$1) {
            pressGestureScopeImpl$awaitRelease$1 = (PressGestureScopeImpl$awaitRelease$1) cVar;
            int i10 = pressGestureScopeImpl$awaitRelease$1.f5495d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$awaitRelease$1.f5495d = i10 - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(this, cVar);
            }
        } else {
            pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(this, cVar);
        }
        Object objH1 = pressGestureScopeImpl$awaitRelease$1.f5493b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = pressGestureScopeImpl$awaitRelease$1.f5495d;
        if (i11 == 0) {
            t0.n(objH1);
            pressGestureScopeImpl$awaitRelease$1.f5495d = 1;
            objH1 = h1(pressGestureScopeImpl$awaitRelease$1);
            if (objH1 == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(objH1);
        }
        if (((Boolean) objH1).booleanValue()) {
            return b2.f124493a;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }
}
