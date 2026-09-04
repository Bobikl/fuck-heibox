package kotlinx.coroutines.debug.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: StackTraceFrame.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/i;", "Lkotlin/coroutines/jvm/internal/c;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "b", "Lkotlin/coroutines/jvm/internal/c;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", ak.aF, "Ljava/lang/StackTraceElement;", "stackTraceElement", "<init>", "(Lkotlin/coroutines/jvm/internal/c;Ljava/lang/StackTraceElement;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class i implements kotlin.coroutines.jvm.internal.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final kotlin.coroutines.jvm.internal.c callerFrame;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final StackTraceElement stackTraceElement;

    public i(@dl.e kotlin.coroutines.jvm.internal.c cVar, @dl.d StackTraceElement stackTraceElement) {
        this.callerFrame = cVar;
        this.stackTraceElement = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        return this.callerFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.d
    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }
}
