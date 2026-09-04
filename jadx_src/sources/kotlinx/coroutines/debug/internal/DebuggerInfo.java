package kotlinx.coroutines.debug.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.r0;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;

/* JADX INFO: compiled from: DebuggerInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@r0
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006%"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "Ljava/io/Serializable;", "", "b", "Ljava/lang/Long;", ak.av, "()Ljava/lang/Long;", "coroutineId", "", ak.aF, "Ljava/lang/String;", "()Ljava/lang/String;", "dispatcher", "d", "f", "name", "e", RXScreenCaptureService.KEY_HEIGHT, "state", "lastObservedThreadState", "g", "lastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "Ljava/util/List;", "()Ljava/util/List;", "lastObservedStackTrace", "i", "J", "()J", "sequenceNumber", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class DebuggerInfo implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Long coroutineId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String dispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String lastObservedThreadState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String lastObservedThreadName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<StackTraceElement> lastObservedStackTrace;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long sequenceNumber;

    public DebuggerInfo(@dl.d DebugCoroutineInfo debugCoroutineInfo, @dl.d CoroutineContext coroutineContext) {
        Thread.State state;
        CoroutineId coroutineId = (CoroutineId) coroutineContext.f(CoroutineId.INSTANCE);
        this.coroutineId = coroutineId != null ? Long.valueOf(coroutineId.c0()) : null;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.f(kotlin.coroutines.d.f124698w1);
        this.dispatcher = dVar != null ? dVar.toString() : null;
        CoroutineName coroutineName = (CoroutineName) coroutineContext.f(CoroutineName.INSTANCE);
        this.name = coroutineName != null ? coroutineName.c0() : null;
        this.state = debugCoroutineInfo.get_state();
        Thread thread = debugCoroutineInfo.lastObservedThread;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = debugCoroutineInfo.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = debugCoroutineInfo.h();
        this.sequenceNumber = debugCoroutineInfo.sequenceNumber;
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDispatcher() {
        return this.dispatcher;
    }

    @dl.d
    public final List<StackTraceElement> c() {
        return this.lastObservedStackTrace;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
