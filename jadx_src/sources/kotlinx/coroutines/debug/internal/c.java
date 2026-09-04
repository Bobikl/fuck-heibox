package kotlinx.coroutines.debug.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.r0;

/* JADX INFO: compiled from: DebugCoroutineInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@r0
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0014\u0010\nR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Lkotlinx/coroutines/debug/internal/c;", "", "Lkotlin/coroutines/CoroutineContext;", ak.av, "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlin/coroutines/jvm/internal/c;", "b", "Lkotlin/coroutines/jvm/internal/c;", "()Lkotlin/coroutines/jvm/internal/c;", "creationStackBottom", "", ak.aF, "J", "f", "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", "d", "Ljava/util/List;", "()Ljava/util/List;", "creationStackTrace", "", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "state", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "()Ljava/lang/Thread;", "lastObservedThread", "lastObservedFrame", RXScreenCaptureService.KEY_HEIGHT, "lastObservedStackTrace", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final kotlin.coroutines.jvm.internal.c creationStackBottom;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long sequenceNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<StackTraceElement> creationStackTrace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Thread lastObservedThread;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final kotlin.coroutines.jvm.internal.c lastObservedFrame;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<StackTraceElement> lastObservedStackTrace;

    public c(@dl.d DebugCoroutineInfo debugCoroutineInfo, @dl.d CoroutineContext coroutineContext) {
        this.context = coroutineContext;
        this.creationStackBottom = debugCoroutineInfo.getCreationStackBottom();
        this.sequenceNumber = debugCoroutineInfo.sequenceNumber;
        this.creationStackTrace = debugCoroutineInfo.e();
        this.state = debugCoroutineInfo.get_state();
        this.lastObservedThread = debugCoroutineInfo.lastObservedThread;
        this.lastObservedFrame = debugCoroutineInfo.f();
        this.lastObservedStackTrace = debugCoroutineInfo.h();
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CoroutineContext getContext() {
        return this.context;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final kotlin.coroutines.jvm.internal.c getCreationStackBottom() {
        return this.creationStackBottom;
    }

    @dl.d
    public final List<StackTraceElement> c() {
        return this.creationStackTrace;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final kotlin.coroutines.jvm.internal.c getLastObservedFrame() {
        return this.lastObservedFrame;
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Thread getLastObservedThread() {
        return this.lastObservedThread;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @dl.d
    @xh.h(name = "lastObservedStackTrace")
    public final List<StackTraceElement> h() {
        return this.lastObservedStackTrace;
    }
}
