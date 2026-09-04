package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.g3;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.t0, reason: from toString */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0016\u001a\u00028\u0000\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016J*\u0010\u0010\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u000f*\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/t0;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/g3;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "o0", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "Lkotlin/b2;", ak.aD, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext$b;", "key", "d", "Lkotlin/coroutines/CoroutineContext$a;", androidx.exifinterface.media.a.S4, "f", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$a;", "", "toString", "b", "Ljava/lang/Object;", "value", "Ljava/lang/ThreadLocal;", ak.aF, "Ljava/lang/ThreadLocal;", "threadLocal", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ThreadLocal<T> implements g3<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final T value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final java.lang.ThreadLocal<T> threadLocal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext.b<?> key;

    public ThreadLocal(T t10, @dl.d java.lang.ThreadLocal<T> threadLocal) {
        this.value = t10;
        this.threadLocal = threadLocal;
        this.key = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return g3.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> key) {
        return kotlin.jvm.internal.f0.g(getKey(), key) ? EmptyCoroutineContext.f124694b : this;
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> key) {
        if (kotlin.jvm.internal.f0.g(getKey(), key)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) g3.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    @dl.d
    public CoroutineContext.b<?> getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.g3
    public T o0(@dl.d CoroutineContext context) {
        T t10 = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t10;
    }

    @dl.d
    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }

    @Override // kotlinx.coroutines.g3
    public void z(@dl.d CoroutineContext context, T oldState) {
        this.threadLocal.set(oldState);
    }
}
