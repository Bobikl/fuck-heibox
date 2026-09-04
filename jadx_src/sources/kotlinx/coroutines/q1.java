package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0080\b*\n\u0010\n\"\u00020\u00042\u00020\u0004¨\u0006\u000b"}, d2 = {"", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", ak.av, "other", "Lkotlin/b2;", "b", "CancellationException", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class q1 {
    @dl.d
    public static final CancellationException a(@dl.e String str, @dl.e Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    public static final void b(@dl.d Throwable th2, @dl.d Throwable th3) throws IllegalAccessException, InvocationTargetException {
        kotlin.o.a(th2, th3);
    }
}
