package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: BroadcastFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u0019\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J-\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0011\u001a\u00020\u00042\f\b\u0002\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR \u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/w0;", "", "cause", "Lkotlin/b2;", ak.aG, "", "timeNanos", RXScreenCaptureService.KEY_WIDTH, "R", "Lkotlin/Function1;", "onFrame", "h0", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellationException", "e", "", ak.aF, "Ljava/lang/Object;", "lock", "d", "Ljava/lang/Throwable;", "failureCause", "", "Landroidx/compose/runtime/BroadcastFrameClock$a;", "Ljava/util/List;", "awaiters", "f", "spareList", "", "v", "()Z", "hasAwaiters", "Lkotlin/Function0;", "onNewAwaiters", "<init>", "(Lyh/a;)V", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class BroadcastFrameClock implements w0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12198g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final yh.a<kotlin.b2> f12199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object lock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Throwable failureCause;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<a<?>> awaiters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<a<?>> spareList;

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\b\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$a;", "R", "", "", "timeNanos", "Lkotlin/b2;", ak.aF, "Lkotlin/coroutines/c;", "b", "Lkotlin/coroutines/c;", ak.av, "()Lkotlin/coroutines/c;", "continuation", "Lkotlin/Function1;", "onFrame", "Lyh/l;", "()Lyh/l;", "<init>", "(Lyh/l;Lkotlin/coroutines/c;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final yh.l<Long, R> f12204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final kotlin.coroutines.c<R> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d yh.l<? super Long, ? extends R> onFrame, @dl.d kotlin.coroutines.c<? super R> continuation) {
            kotlin.jvm.internal.f0.p(onFrame, "onFrame");
            kotlin.jvm.internal.f0.p(continuation, "continuation");
            this.f12204a = onFrame;
            this.continuation = continuation;
        }

        @dl.d
        public final kotlin.coroutines.c<R> a() {
            return this.continuation;
        }

        @dl.d
        public final yh.l<Long, R> b() {
            return this.f12204a;
        }

        public final void c(long j10) {
            Object objB;
            kotlin.coroutines.c<R> cVar = this.continuation;
            try {
                Result.a aVar = Result.f124476c;
                objB = Result.b(this.f12204a.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(kotlin.t0.a(th2));
            }
            cVar.resumeWith(objB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BroadcastFrameClock(@dl.e yh.a<kotlin.b2> aVar) {
        this.f12199b = aVar;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public /* synthetic */ BroadcastFrameClock(yh.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : aVar);
    }

    public static /* synthetic */ void r(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.e(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Throwable th2) {
        synchronized (this.lock) {
            if (this.failureCause != null) {
                return;
            }
            this.failureCause = th2;
            List<a<?>> list = this.awaiters;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                kotlin.coroutines.c<?> cVarA = list.get(i10).a();
                Result.a aVar = Result.f124476c;
                cVarA.resumeWith(Result.b(kotlin.t0.a(th2)));
            }
            this.awaiters.clear();
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return w0.a.e(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return w0.a.d(this, bVar);
    }

    public final void e(@dl.d CancellationException cancellationException) {
        kotlin.jvm.internal.f0.p(cancellationException, "cancellationException");
        u(cancellationException);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.compose.runtime.BroadcastFrameClock$a] */
    @Override // androidx.compose.runtime.w0
    @dl.e
    public <R> Object h0(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        a aVar;
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.lock) {
            Throwable th2 = this.failureCause;
            if (th2 != null) {
                Result.a aVar2 = Result.f124476c;
                qVar.resumeWith(Result.b(kotlin.t0.a(th2)));
            } else {
                objectRef.f124891b = new a(lVar, qVar);
                boolean z10 = !this.awaiters.isEmpty();
                List list = this.awaiters;
                T t10 = objectRef.f124891b;
                if (t10 == 0) {
                    kotlin.jvm.internal.f0.S("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) t10;
                }
                list.add(aVar);
                boolean z11 = !z10;
                qVar.L(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th3) {
                        invoke2(th3);
                        return kotlin.b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e Throwable th3) {
                        BroadcastFrameClock.a aVar3;
                        Object obj = this.f12206b.lock;
                        BroadcastFrameClock broadcastFrameClock = this.f12206b;
                        Ref.ObjectRef<BroadcastFrameClock.a<R>> objectRef2 = objectRef;
                        synchronized (obj) {
                            List list2 = broadcastFrameClock.awaiters;
                            Object obj2 = objectRef2.f124891b;
                            if (obj2 == null) {
                                kotlin.jvm.internal.f0.S("awaiter");
                                aVar3 = null;
                            } else {
                                aVar3 = (BroadcastFrameClock.a) obj2;
                            }
                            list2.remove(aVar3);
                            kotlin.b2 b2Var = kotlin.b2.f124493a;
                        }
                    }
                });
                if (z11 && this.f12199b != null) {
                    try {
                        this.f12199b.invoke();
                    } catch (Throwable th3) {
                        u(th3);
                    }
                }
            }
        }
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    public final boolean v() {
        boolean z10;
        synchronized (this.lock) {
            z10 = !this.awaiters.isEmpty();
        }
        return z10;
    }

    public final void w(long j10) {
        synchronized (this.lock) {
            List<a<?>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).c(j10);
            }
            list.clear();
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }
}
