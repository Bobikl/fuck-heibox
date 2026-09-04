package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/l0;", "", "<init>", "()V", ak.av, "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.compose.runtime.l0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Composition.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/l0$a;", "", com.umeng.analytics.pro.d.R, "e", "token", "Lkotlin/b2;", "d", "f", "(Ljava/lang/Object;)V", "", "key", ak.aF, "(I)V", "", "Landroidx/compose/runtime/p1;", "b", "()Ljava/util/List;", ak.av, "()V", "<init>", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final void d(Object obj) {
            Recomposer.INSTANCE.h(obj);
        }

        private final Object e(Object context) {
            return Recomposer.INSTANCE.j();
        }

        public final void a() {
            Recomposer.INSTANCE.d();
        }

        @dl.d
        public final List<p1> b() {
            return Recomposer.INSTANCE.e();
        }

        public final void c(int key) {
            Recomposer.INSTANCE.g(key);
        }

        public final void f(@dl.d Object context) {
            kotlin.jvm.internal.f0.p(context, "context");
            d(e(context));
        }
    }
}
