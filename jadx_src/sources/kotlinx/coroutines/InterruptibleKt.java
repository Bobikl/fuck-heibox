package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "coroutineContext", "d", "(Lkotlin/coroutines/CoroutineContext;Lyh/a;)Ljava/lang/Object;", "", ak.av, "I", "WORKING", "FINISHED", ak.aF, "INTERRUPTING", "INTERRUPTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class InterruptibleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f128689a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f128690b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f128691c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f128692d = 3;

    @dl.e
    public static final <T> Object b(@dl.d CoroutineContext coroutineContext, @dl.d yh.a<? extends T> aVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return i.h(coroutineContext, new InterruptibleKt$runInterruptible$2(aVar, null), cVar);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, yh.a aVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        return b(coroutineContext, aVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(CoroutineContext coroutineContext, yh.a<? extends T> aVar) throws Throwable {
        try {
            l3 l3Var = new l3(g2.B(coroutineContext));
            l3Var.d();
            try {
                return aVar.invoke();
            } finally {
                l3Var.a();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
