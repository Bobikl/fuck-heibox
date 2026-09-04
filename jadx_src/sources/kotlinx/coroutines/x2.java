package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/x2;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/b2;", "run", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/p;", ak.aF, "Lkotlinx/coroutines/p;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class x2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p<kotlin.b2> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public x2(@dl.d CoroutineDispatcher coroutineDispatcher, @dl.d p<? super kotlin.b2> pVar) {
        this.dispatcher = coroutineDispatcher;
        this.continuation = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.s0(this.dispatcher, kotlin.b2.f124493a);
    }
}
