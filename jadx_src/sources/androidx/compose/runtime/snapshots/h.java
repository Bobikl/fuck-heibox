package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.h0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: SnapshotContextElement.kt */
/* JADX INFO: loaded from: classes.dex */
@h0
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/h;", "Lkotlin/coroutines/CoroutineContext$a;", "j0", "b", "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface h extends CoroutineContext.a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f13262b;

    /* JADX INFO: compiled from: SnapshotContextElement.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static <R> R a(@dl.d h hVar, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
            kotlin.jvm.internal.f0.p(operation, "operation");
            return (R) CoroutineContext.a.C1128a.a(hVar, r10, operation);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E b(@dl.d h hVar, @dl.d CoroutineContext.b<E> key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return (E) CoroutineContext.a.C1128a.b(hVar, key);
        }

        @dl.d
        public static CoroutineContext c(@dl.d h hVar, @dl.d CoroutineContext.b<?> key) {
            kotlin.jvm.internal.f0.p(key, "key");
            return CoroutineContext.a.C1128a.c(hVar, key);
        }

        @dl.d
        public static CoroutineContext d(@dl.d h hVar, @dl.d CoroutineContext context) {
            kotlin.jvm.internal.f0.p(context, "context");
            return CoroutineContext.a.C1128a.d(hVar, context);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.h$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SnapshotContextElement.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/h$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/compose/runtime/snapshots/h;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion implements CoroutineContext.b<h> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f13262b = new Companion();

        private Companion() {
        }
    }
}
