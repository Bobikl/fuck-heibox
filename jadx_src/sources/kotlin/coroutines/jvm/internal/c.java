package kotlin.coroutines.jvm.internal;

import kotlin.u0;

/* JADX INFO: compiled from: CoroutineStackFrame.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public interface c {
    @dl.e
    c getCallerFrame();

    @dl.e
    StackTraceElement getStackTraceElement();
}
