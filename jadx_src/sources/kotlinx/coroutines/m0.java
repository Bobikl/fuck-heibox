package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "exception", "Lkotlin/b2;", ak.av, "", "Lkotlinx/coroutines/l0;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final List<l0> f130271a = SequencesKt___SequencesKt.c3(SequencesKt__SequencesKt.e(ServiceLoader.load(l0.class, l0.class.getClassLoader()).iterator()));

    public static final void a(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
        Iterator<l0> it = f130271a.iterator();
        while (it.hasNext()) {
            try {
                it.next().C(coroutineContext, th2);
            } catch (Throwable th3) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, n0.c(th2, th3));
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            Result.a aVar = Result.f124476c;
            kotlin.o.a(th2, new DiagnosticCoroutineContextException(coroutineContext));
            Result.b(kotlin.b2.f124493a);
        } catch (Throwable th4) {
            Result.a aVar2 = Result.f124476c;
            Result.b(kotlin.t0.a(th4));
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }
}
