package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\b\u0010\u0004\u001a\u00020\u0000H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/k0;", "b", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/d2;", "coroutine", "", "message", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/d2;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class TimeoutCancellationException extends CancellationException implements k0<TimeoutCancellationException> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    @xh.e
    public final transient d2 coroutine;

    public TimeoutCancellationException(@dl.d String str) {
        this(str, null);
    }

    public TimeoutCancellationException(@dl.d String str, @dl.e d2 d2Var) {
        super(str);
        this.coroutine = d2Var;
    }

    @Override // kotlinx.coroutines.k0
    @dl.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TimeoutCancellationException a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
