package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/t0;", "Lkotlin/coroutines/CoroutineContext$a;", "R", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "block", "m0", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "p0", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface t0 extends CoroutineContext.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f15984b;

    /* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static <R> R a(@dl.d t0 t0Var, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) CoroutineContext.a.C1128a.a(t0Var, r10, operation);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E b(@dl.d t0 t0Var, @dl.d CoroutineContext.b<E> key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return (E) CoroutineContext.a.C1128a.b(t0Var, key);
        }

        @dl.d
        @Deprecated
        public static CoroutineContext.b<?> c(@dl.d t0 t0Var) {
            return s0.a(t0Var);
        }

        @dl.d
        public static CoroutineContext d(@dl.d t0 t0Var, @dl.d CoroutineContext.b<?> key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return CoroutineContext.a.C1128a.c(t0Var, key);
        }

        @dl.d
        public static CoroutineContext e(@dl.d t0 t0Var, @dl.d CoroutineContext context) {
            kotlin.jvm.internal.f0.p(context, "context");
            return CoroutineContext.a.C1128a.d(t0Var, context);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.t0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/t0$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/compose/ui/platform/t0;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion implements CoroutineContext.b<t0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f15984b = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    @dl.d
    CoroutineContext.b<?> getKey();

    @dl.e
    <R> Object m0(@dl.d yh.l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar, @dl.d kotlin.coroutines.c<? super R> cVar);
}
