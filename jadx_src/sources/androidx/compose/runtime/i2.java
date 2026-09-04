package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: ActualJvm.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/i2;", androidx.exifinterface.media.a.f23244d5, "", ak.av, "()Ljava/lang/Object;", "value", "Lkotlin/b2;", "b", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/p;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "map", "Ljava/lang/Object;", "writeMutex", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class i2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicReference<androidx.compose.runtime.internal.p> map = new AtomicReference<>(androidx.compose.runtime.internal.q.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object writeMutex = new Object();

    @dl.e
    public final T a() {
        return (T) this.map.get().b(Thread.currentThread().getId());
    }

    public final void b(@dl.e T value) {
        long id2 = Thread.currentThread().getId();
        synchronized (this.writeMutex) {
            androidx.compose.runtime.internal.p pVar = this.map.get();
            if (pVar.d(id2, value)) {
                return;
            }
            this.map.set(pVar.c(id2, value));
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }
}
