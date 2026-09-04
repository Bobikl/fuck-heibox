package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u001a\u0010\n\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\r\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u001a\u0010\u001a\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u0012\u0004\b\u0019\u0010\t*\u001e\b\u0002\u0010\u001d\u001a\u0004\b\u0000\u0010\u001b\"\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\u0012\u0004\u0012\u00028\u00000\u001c¨\u0006\u001e"}, d2 = {"", "timeMillis", "d", "timeNanos", ak.aF, "Lkotlinx/coroutines/internal/o0;", ak.av, "Lkotlinx/coroutines/internal/o0;", "getDISPOSED_TASK$annotations", "()V", "DISPOSED_TASK", "", "b", "I", "SCHEDULE_OK", "SCHEDULE_COMPLETED", "SCHEDULE_DISPOSED", "e", "J", "MS_TO_NS", "f", "MAX_MS", "g", "MAX_DELAY_NS", RXScreenCaptureService.KEY_HEIGHT, "getCLOSED_EMPTY$annotations", "CLOSED_EMPTY", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/internal/z;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f130290b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130291c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130292d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f130293e = 1000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f130294f = 9223372036854L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f130295g = 4611686018427387903L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.internal.o0 f130289a = new kotlinx.coroutines.internal.o0("REMOVED_TASK");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.internal.o0 f130296h = new kotlinx.coroutines.internal.o0("CLOSED_EMPTY");

    public static final long c(long j10) {
        return j10 / 1000000;
    }

    public static final long d(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= f130294f) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }

    private static /* synthetic */ void e() {
    }

    private static /* synthetic */ void f() {
    }
}
