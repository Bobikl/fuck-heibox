package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010J<\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Lkotlin/coroutines/CoroutineContext$a;", "R", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "frameTimeNanos", "onFrame", "h0", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "i0", "b", "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface w0 extends CoroutineContext.a {

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f13326b;

    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static <R> R a(@dl.d w0 w0Var, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) CoroutineContext.a.C1128a.a(w0Var, r10, operation);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E b(@dl.d w0 w0Var, @dl.d CoroutineContext.b<E> key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return (E) CoroutineContext.a.C1128a.b(w0Var, key);
        }

        @dl.d
        @Deprecated
        public static CoroutineContext.b<?> c(@dl.d w0 w0Var) {
            return v0.a(w0Var);
        }

        @dl.d
        public static CoroutineContext d(@dl.d w0 w0Var, @dl.d CoroutineContext.b<?> key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return CoroutineContext.a.C1128a.c(w0Var, key);
        }

        @dl.d
        public static CoroutineContext e(@dl.d w0 w0Var, @dl.d CoroutineContext context) {
            kotlin.jvm.internal.f0.p(context, "context");
            return CoroutineContext.a.C1128a.d(w0Var, context);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.w0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/w0$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/compose/runtime/w0;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion implements CoroutineContext.b<w0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f13326b = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    @dl.d
    CoroutineContext.b<?> getKey();

    @dl.e
    <R> Object h0(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar);
}
