package kotlinx.coroutines.scheduling;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import fi.u;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.s0;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0014\u0010\u001b\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0019\u0010!\u001a\u00020\u001f*\u00020\u001e8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010 ¨\u0006\""}, d2 = {"", ak.av, "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "b", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", ak.aF, "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Lkotlinx/coroutines/scheduling/i;", "f", "Lkotlinx/coroutines/scheduling/i;", "schedulerTimeSource", "g", "TASK_NON_BLOCKING", RXScreenCaptureService.KEY_HEIGHT, "TASK_PROBABLY_BLOCKING", "Lkotlinx/coroutines/scheduling/k;", "i", "Lkotlinx/coroutines/scheduling/k;", "NonBlockingContext", "j", "BlockingContext", "Lkotlinx/coroutines/scheduling/j;", "", "(Lkotlinx/coroutines/scheduling/j;)Z", "isBlocking", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f130380a = "DefaultDispatcher";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f130386g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f130387h = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @xh.e
    public static final long f130381b = s0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @xh.e
    public static final int f130382c = s0.d("kotlinx.coroutines.scheduler.core.pool.size", u.u(q0.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xh.e
    public static final int f130383d = s0.d("kotlinx.coroutines.scheduler.max.pool.size", CoroutineScheduler.f130336w, 0, CoroutineScheduler.f130336w, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xh.e
    public static final long f130384e = TimeUnit.SECONDS.toNanos(s0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @xh.e
    public static i f130385f = g.f130370a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final k f130388i = new l(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final k f130389j = new l(1);

    public static final boolean a(@dl.d j jVar) {
        return jVar.taskContext.getTaskMode() == 1;
    }
}
