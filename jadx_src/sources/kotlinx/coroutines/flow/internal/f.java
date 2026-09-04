package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import yh.p;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/internal/f;", "Lkotlin/coroutines/CoroutineContext;", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$a;", "operation", "g", "(Ljava/lang/Object;Lyh/p;)Ljava/lang/Object;", androidx.exifinterface.media.a.S4, "Lkotlin/coroutines/CoroutineContext$b;", "key", "f", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$a;", "d", com.umeng.analytics.pro.d.R, "I", "", "b", "Ljava/lang/Throwable;", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class f implements CoroutineContext {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final Throwable e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f130078c;

    public f(@dl.d Throwable th2, @dl.d CoroutineContext coroutineContext) {
        this.e = th2;
        this.f130078c = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext context) {
        return this.f130078c.I(context);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> key) {
        return this.f130078c.d(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> key) {
        return (E) this.f130078c.f(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R g(R initial, @dl.d p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
        return (R) this.f130078c.g(initial, operation);
    }
}
