package androidx.room;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: RoomDatabaseExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Landroidx/room/g2;", "Lkotlin/coroutines/CoroutineContext$a;", "Lkotlin/b2;", ak.aF, "j", "Lkotlinx/coroutines/d2;", "b", "Lkotlinx/coroutines/d2;", "transactionThreadControlJob", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/d;", RXScreenCaptureService.KEY_HEIGHT, "()Lkotlin/coroutines/d;", "transactionDispatcher", "Ljava/util/concurrent/atomic/AtomicInteger;", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "<init>", "(Lkotlinx/coroutines/d2;Lkotlin/coroutines/d;)V", "e", ak.av, "room-ktx_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class g2 implements CoroutineContext.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.d2 transactionThreadControlJob;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.coroutines.d transactionDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicInteger referenceCount;

    /* JADX INFO: renamed from: androidx.room.g2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RoomDatabaseExt.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/g2$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/room/g2;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion implements CoroutineContext.b<g2> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public g2(@dl.d kotlinx.coroutines.d2 transactionThreadControlJob, @dl.d kotlin.coroutines.d transactionDispatcher) {
        kotlin.jvm.internal.f0.p(transactionThreadControlJob, "transactionThreadControlJob");
        kotlin.jvm.internal.f0.p(transactionDispatcher, "transactionDispatcher");
        this.transactionThreadControlJob = transactionThreadControlJob;
        this.transactionDispatcher = transactionDispatcher;
        this.referenceCount = new AtomicInteger(0);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return CoroutineContext.a.C1128a.d(this, coroutineContext);
    }

    public final void c() {
        this.referenceCount.incrementAndGet();
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C1128a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C1128a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) CoroutineContext.a.C1128a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    @dl.d
    public CoroutineContext.b<g2> getKey() {
        return INSTANCE;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final kotlin.coroutines.d getTransactionDispatcher() {
        return this.transactionDispatcher;
    }

    public final void j() {
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
        if (iDecrementAndGet == 0) {
            kotlinx.coroutines.d2.a.b(this.transactionThreadControlJob, null, 1, null);
        }
    }
}
