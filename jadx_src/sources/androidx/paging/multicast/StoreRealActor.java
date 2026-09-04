package androidx.paging.multicast;

import com.umeng.analytics.pro.ak;
import dl.e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.channels.m;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: StoreRealActor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 \u0007*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\rB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u001b\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\n\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/paging/multicast/StoreRealActor;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/b2;", "d", "f", "msg", "e", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "g", ak.aF, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/k;", ak.av, "Lkotlinx/coroutines/channels/k;", "inboundChannel", "Lkotlinx/coroutines/y;", "b", "Lkotlinx/coroutines/y;", "closeCompleted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "didClose", "Lkotlinx/coroutines/q0;", "scope", "<init>", "(Lkotlinx/coroutines/q0;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public abstract class StoreRealActor<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k<Object> inboundChannel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y<b2> closeCompleted;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean didClose;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Object f26555d = new Object();

    /* JADX INFO: renamed from: androidx.paging.multicast.StoreRealActor$1, reason: invalid class name */
    /* JADX INFO: compiled from: StoreRealActor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "msg", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.StoreRealActor$1", f = "StoreRealActor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<Object, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26561c;

        AnonymousClass1(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            f0.p(completion, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(completion);
            anonymousClass1.f26560b = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(obj, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f26561c;
            if (i10 == 0) {
                t0.n(obj);
                Object obj2 = this.f26560b;
                if (obj2 == StoreRealActor.INSTANCE.a()) {
                    StoreRealActor.this.d();
                } else {
                    StoreRealActor storeRealActor = StoreRealActor.this;
                    this.f26561c = 1;
                    if (storeRealActor.e(obj2, this) == objH) {
                        return objH;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.multicast.StoreRealActor$2, reason: invalid class name */
    /* JADX INFO: compiled from: StoreRealActor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "", "", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.StoreRealActor$2", f = "StoreRealActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements q<f<? super Object>, Throwable, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26563b;

        AnonymousClass2(kotlin.coroutines.c cVar) {
            super(3, cVar);
        }

        @dl.d
        public final kotlin.coroutines.c<b2> a(@dl.d f<Object> create, @e Throwable th2, @dl.d kotlin.coroutines.c<? super b2> continuation) {
            f0.p(create, "$this$create");
            f0.p(continuation, "continuation");
            return new AnonymousClass2(continuation);
        }

        @Override // yh.q
        public final Object invoke(f<? super Object> fVar, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) a(fVar, th2, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f26563b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            StoreRealActor.this.d();
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.multicast.StoreRealActor$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: StoreRealActor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/paging/multicast/StoreRealActor$a;", "", "CLOSE_TOKEN", "Ljava/lang/Object;", ak.av, "()Ljava/lang/Object;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final Object a() {
            return StoreRealActor.f26555d;
        }
    }

    public StoreRealActor(@dl.d q0 scope) {
        f0.p(scope, "scope");
        k<Object> kVarD = m.d(0, null, null, 6, null);
        this.inboundChannel = kVarD;
        this.closeCompleted = a0.c(null, 1, null);
        this.didClose = new AtomicBoolean(false);
        g.U0(g.d1(g.e1(g.X(kVarD), new AnonymousClass1(null)), new AnonymousClass2(null)), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        if (this.didClose.compareAndSet(false, true)) {
            try {
                f();
            } finally {
                b0.a.a(this.inboundChannel, null, 1, null);
                this.closeCompleted.A(b2.f124493a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @e
    public final Object c(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        StoreRealActor$close$1 storeRealActor$close$1;
        StoreRealActor<T> storeRealActor;
        if (cVar instanceof StoreRealActor$close$1) {
            storeRealActor$close$1 = (StoreRealActor$close$1) cVar;
            int i10 = storeRealActor$close$1.f26566c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                storeRealActor$close$1.f26566c = i10 - Integer.MIN_VALUE;
            } else {
                storeRealActor$close$1 = new StoreRealActor$close$1(this, cVar);
            }
        } else {
            storeRealActor$close$1 = new StoreRealActor$close$1(this, cVar);
        }
        Object obj = storeRealActor$close$1.f26565b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = storeRealActor$close$1.f26566c;
        if (i11 != 0) {
            if (i11 == 1) {
                storeRealActor = (StoreRealActor) storeRealActor$close$1.f26568e;
                t0.n(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        k<Object> kVar = this.inboundChannel;
        Object obj2 = f26555d;
        storeRealActor$close$1.f26568e = this;
        storeRealActor$close$1.f26566c = 1;
        if (kVar.X(obj2, storeRealActor$close$1) == objH) {
            return objH;
        }
        storeRealActor = this;
        y<b2> yVar = storeRealActor.closeCompleted;
        storeRealActor$close$1.f26568e = null;
        storeRealActor$close$1.f26566c = 2;
        if (yVar.p(storeRealActor$close$1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    @e
    public abstract Object e(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar);

    public void f() {
    }

    @e
    public final Object g(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objX = this.inboundChannel.X(t10, cVar);
        return objX == kotlin.coroutines.intrinsics.b.h() ? objX : b2.f124493a;
    }
}
