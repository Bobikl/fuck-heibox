package androidx.compose.ui;

import androidx.compose.runtime.j2;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MotionDurationScale.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/coroutines/CoroutineContext$a;", "", "a0", "()F", "scaleFactor", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "l0", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface q extends CoroutineContext.a {

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f16006b;

    /* JADX INFO: compiled from: MotionDurationScale.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static <R> R a(@dl.d q qVar, R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
            f0.p(operation, "operation");
            return (R) CoroutineContext.a.C1128a.a(qVar, r10, operation);
        }

        @dl.e
        public static <E extends CoroutineContext.a> E b(@dl.d q qVar, @dl.d CoroutineContext.b<E> key) {
            f0.p(key, "key");
            return (E) CoroutineContext.a.C1128a.b(qVar, key);
        }

        @dl.d
        public static CoroutineContext c(@dl.d q qVar, @dl.d CoroutineContext.b<?> key) {
            f0.p(key, "key");
            return CoroutineContext.a.C1128a.c(qVar, key);
        }

        @dl.d
        public static CoroutineContext d(@dl.d q qVar, @dl.d CoroutineContext context) {
            f0.p(context, "context");
            return CoroutineContext.a.C1128a.d(qVar, context);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.q$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MotionDurationScale.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/q$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/compose/ui/q;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion implements CoroutineContext.b<q> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f16006b = new Companion();

        private Companion() {
        }
    }

    float a0();

    @Override // kotlin.coroutines.CoroutineContext.a
    @dl.d
    CoroutineContext.b<?> getKey();
}
