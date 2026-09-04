package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.internal.s0;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\"\u001a\u0010\u0012\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0011\"\u001a\u0010\u001a\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u0012\u0004\b\u0019\u0010\u0011\"\u001a\u0010\u001d\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u0012\u0004\b\u001c\u0010\u0011\"\u001a\u0010 \u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u0012\u0004\b\u001f\u0010\u0011\"\u001a\u0010#\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u000f\u0012\u0004\b\"\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"", "permits", "acquiredPermits", "Lkotlinx/coroutines/sync/d;", ak.av, androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "action", "q", "(Lkotlinx/coroutines/sync/d;Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "id", "Lkotlinx/coroutines/sync/e;", "prev", "j", "I", "getMAX_SPIN_CYCLES$annotations", "()V", "MAX_SPIN_CYCLES", "Lkotlinx/coroutines/internal/o0;", "b", "Lkotlinx/coroutines/internal/o0;", "getPERMIT$annotations", "PERMIT", ak.aF, "getTAKEN$annotations", "TAKEN", "d", "getBROKEN$annotations", "BROKEN", "e", "getCANCELLED$annotations", "CANCELLED", "f", "getSEGMENT_SIZE$annotations", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class SemaphoreKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130475a = s0.d("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final o0 f130476b = new o0("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final o0 f130477c = new o0("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final o0 f130478d = new o0("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final o0 f130479e = new o0("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130480f = s0.d("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    @dl.d
    public static final d a(int i10, int i11) {
        return new SemaphoreImpl(i10, i11);
    }

    public static /* synthetic */ d b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e j(long j10, e eVar) {
        return new e(j10, eVar, 0);
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    private static /* synthetic */ void o() {
    }

    private static /* synthetic */ void p() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object q(@dl.d d dVar, @dl.d yh.a<? extends T> aVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        SemaphoreKt$withPermit$1 semaphoreKt$withPermit$1;
        if (cVar instanceof SemaphoreKt$withPermit$1) {
            semaphoreKt$withPermit$1 = (SemaphoreKt$withPermit$1) cVar;
            int i10 = semaphoreKt$withPermit$1.f130484e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                semaphoreKt$withPermit$1.f130484e = i10 - Integer.MIN_VALUE;
            } else {
                semaphoreKt$withPermit$1 = new SemaphoreKt$withPermit$1(cVar);
            }
        } else {
            semaphoreKt$withPermit$1 = new SemaphoreKt$withPermit$1(cVar);
        }
        Object obj = semaphoreKt$withPermit$1.f130483d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = semaphoreKt$withPermit$1.f130484e;
        if (i11 == 0) {
            t0.n(obj);
            semaphoreKt$withPermit$1.f130481b = dVar;
            semaphoreKt$withPermit$1.f130482c = aVar;
            semaphoreKt$withPermit$1.f130484e = 1;
            if (dVar.c(semaphoreKt$withPermit$1) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (yh.a) semaphoreKt$withPermit$1.f130482c;
            dVar = (d) semaphoreKt$withPermit$1.f130481b;
            t0.n(obj);
        }
        try {
            return aVar.invoke();
        } finally {
            c0.d(1);
            dVar.release();
            c0.c(1);
        }
    }

    private static final <T> Object r(d dVar, yh.a<? extends T> aVar, kotlin.coroutines.c<? super T> cVar) {
        c0.e(0);
        dVar.c(cVar);
        c0.e(1);
        try {
            return aVar.invoke();
        } finally {
            c0.d(1);
            dVar.release();
            c0.c(1);
        }
    }
}
