package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.u0, reason: from toString */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/u0;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlinx/coroutines/internal/t0;", "Ljava/lang/ThreadLocal;", ak.av, "threadLocal", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/ThreadLocal;", "<init>", "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final /* data */ class ThreadLocalKey implements CoroutineContext.b<ThreadLocal<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final ThreadLocal<?> threadLocal;

    public ThreadLocalKey(@dl.d ThreadLocal<?> threadLocal) {
        this.threadLocal = threadLocal;
    }

    private final ThreadLocal<?> a() {
        return this.threadLocal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThreadLocalKey c(ThreadLocalKey threadLocalKey, ThreadLocal threadLocal, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            threadLocal = threadLocalKey.threadLocal;
        }
        return threadLocalKey.b(threadLocal);
    }

    @dl.d
    public final ThreadLocalKey b(@dl.d ThreadLocal<?> threadLocal) {
        return new ThreadLocalKey(threadLocal);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThreadLocalKey) && kotlin.jvm.internal.f0.g(this.threadLocal, ((ThreadLocalKey) other).threadLocal);
    }

    public int hashCode() {
        return this.threadLocal.hashCode();
    }

    @dl.d
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.threadLocal + ')';
    }
}
