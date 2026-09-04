package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/DiagnosticCoroutineContextException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "getLocalizedMessage", "", "fillInStackTrace", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext context;

    public DiagnosticCoroutineContextException(@dl.d CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    @Override // java.lang.Throwable
    @dl.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @dl.d
    public String getLocalizedMessage() {
        return this.context.toString();
    }
}
