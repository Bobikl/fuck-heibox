package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: ActualJvm.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/f;", "", "", "b", "value", "Lkotlin/b2;", "d", "amount", ak.av, "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", ak.aF, "()Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "<init>", "(I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicInteger delegate;

    public f(int i10) {
        this.delegate = new AtomicInteger(i10);
    }

    public final int a(int amount) {
        return this.delegate.addAndGet(amount);
    }

    public final int b() {
        return this.delegate.get();
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AtomicInteger getDelegate() {
        return this.delegate;
    }

    public final void d(int i10) {
        this.delegate.set(i10);
    }
}
