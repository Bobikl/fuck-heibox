package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: PausableMonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J<\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/w0;", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "j", "R", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "frameTimeNanos", "onFrame", "h0", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Landroidx/compose/runtime/w0;", "frameClock", "Landroidx/compose/runtime/Latch;", ak.aF, "Landroidx/compose/runtime/Latch;", "latch", "", "()Z", "isPaused", "<init>", "(Landroidx/compose/runtime/w0;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class PausableMonotonicFrameClock implements w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f12409d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final w0 frameClock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Latch latch;

    public PausableMonotonicFrameClock(@dl.d w0 frameClock) {
        kotlin.jvm.internal.f0.p(frameClock, "frameClock");
        this.frameClock = frameClock;
        this.latch = new Latch();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return w0.a.e(this, coroutineContext);
    }

    public final boolean c() {
        return !this.latch.e();
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return w0.a.d(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar) {
        return (E) w0.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) w0.a.a(this, r10, pVar);
    }

    @Override // androidx.compose.runtime.w0, kotlin.coroutines.CoroutineContext.a
    public /* synthetic */ CoroutineContext.b getKey() {
        return v0.a(this);
    }

    public final void h() {
        this.latch.d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.runtime.w0
    @dl.e
    public <R> Object h0(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) throws Throwable {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (cVar instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) cVar;
            int i10 = pausableMonotonicFrameClock$withFrameNanos$1.f12416f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.f12416f = i10 - Integer.MIN_VALUE;
            } else {
                pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, cVar);
            }
        } else {
            pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, cVar);
        }
        Object objH0 = pausableMonotonicFrameClock$withFrameNanos$1.f12414d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = pausableMonotonicFrameClock$withFrameNanos$1.f12416f;
        if (i11 != 0) {
            if (i11 == 1) {
                lVar = (yh.l) pausableMonotonicFrameClock$withFrameNanos$1.f12413c;
                pausableMonotonicFrameClock = (PausableMonotonicFrameClock) pausableMonotonicFrameClock$withFrameNanos$1.f12412b;
                kotlin.t0.n(objH0);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(objH0);
            }
        }
        kotlin.t0.n(objH0);
        Latch latch = this.latch;
        pausableMonotonicFrameClock$withFrameNanos$1.f12412b = this;
        pausableMonotonicFrameClock$withFrameNanos$1.f12413c = lVar;
        pausableMonotonicFrameClock$withFrameNanos$1.f12416f = 1;
        if (latch.c(pausableMonotonicFrameClock$withFrameNanos$1) == objH) {
            return objH;
        }
        pausableMonotonicFrameClock = this;
        w0 w0Var = pausableMonotonicFrameClock.frameClock;
        pausableMonotonicFrameClock$withFrameNanos$1.f12412b = null;
        pausableMonotonicFrameClock$withFrameNanos$1.f12413c = null;
        pausableMonotonicFrameClock$withFrameNanos$1.f12416f = 2;
        objH0 = w0Var.h0(lVar, pausableMonotonicFrameClock$withFrameNanos$1);
        return objH0 == objH ? objH : objH0;
    }

    public final void j() {
        this.latch.f();
    }
}
