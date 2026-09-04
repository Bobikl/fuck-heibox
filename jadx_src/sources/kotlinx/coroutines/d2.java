package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 ,2\u00020\u0001:\u0001\fJ\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\b\u0010\n\u001a\u00020\bH\u0017J\u0014\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000bH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'J\u0013\u0010\u0011\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\u00182'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H&JE\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H'J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0097\u0002R\u0014\u0010\u001f\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lkotlinx/coroutines/d2;", "Lkotlin/coroutines/CoroutineContext$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Z", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, "cause", "Lkotlin/b2;", "e", "cancel", "", "b", "Lkotlinx/coroutines/x;", "child", "Lkotlinx/coroutines/v;", "P", "g0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/h1;", "K", "onCancelling", "invokeImmediately", "i0", "other", ak.aB, "isActive", "()Z", "x", "isCompleted", "isCancelled", "Lkotlin/sequences/m;", androidx.exifinterface.media.a.R4, "()Lkotlin/sequences/m;", "children", "Lkotlinx/coroutines/selects/c;", "M", "()Lkotlinx/coroutines/selects/c;", "onJoin", "B1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface d2 extends CoroutineContext.a {

    /* JADX INFO: renamed from: B1, reason: from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f129091b;

    /* JADX INFO: compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void b(d2 d2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            d2Var.e(cancellationException);
        }

        public static /* synthetic */ boolean c(d2 d2Var, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return d2Var.b(th2);
        }

        public static <R> R d(@dl.d d2 d2Var, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            return (R) CoroutineContext.a.C1128a.a(d2Var, r10, pVar);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E e(@dl.d d2 d2Var, @dl.d CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.a.C1128a.b(d2Var, bVar);
        }

        public static /* synthetic */ h1 f(d2 d2Var, boolean z10, boolean z11, yh.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return d2Var.i0(z10, z11, lVar);
        }

        @dl.d
        public static CoroutineContext g(@dl.d d2 d2Var, @dl.d CoroutineContext.b<?> bVar) {
            return CoroutineContext.a.C1128a.c(d2Var, bVar);
        }

        @dl.d
        public static CoroutineContext h(@dl.d d2 d2Var, @dl.d CoroutineContext coroutineContext) {
            return CoroutineContext.a.C1128a.d(d2Var, coroutineContext);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static d2 i(@dl.d d2 d2Var, @dl.d d2 d2Var2) {
            return d2Var2;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.d2$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Job.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/d2$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlinx/coroutines/d2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements CoroutineContext.b<d2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f129091b = new Companion();

        private Companion() {
        }
    }

    @dl.d
    h1 K(@dl.d yh.l<? super Throwable, kotlin.b2> lVar);

    @dl.d
    kotlinx.coroutines.selects.c M();

    @dl.d
    @z1
    v P(@dl.d x child);

    @dl.d
    kotlin.sequences.m<d2> S();

    @dl.d
    @z1
    CancellationException Z();

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean b(Throwable cause);

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void e(@dl.e CancellationException cancellationException);

    @dl.e
    Object g0(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar);

    @dl.d
    @z1
    h1 i0(boolean z10, boolean z11, @dl.d yh.l<? super Throwable, kotlin.b2> lVar);

    boolean isActive();

    boolean isCancelled();

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    d2 s(@dl.d d2 other);

    boolean start();

    boolean x();
}
