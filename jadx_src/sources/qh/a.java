package qh;

import java.util.concurrent.CancellationException;
import kotlin.u0;
import sh.f;

/* JADX INFO: compiled from: CancellationException.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @u0(version = "1.4")
    @f
    private static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @u0(version = "1.4")
    @f
    private static final CancellationException b(Throwable th2) {
        CancellationException cancellationException = new CancellationException(th2 != null ? th2.toString() : null);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @u0(version = "1.4")
    public static /* synthetic */ void c() {
    }
}
