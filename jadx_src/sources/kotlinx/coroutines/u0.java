package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\bA\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u000f\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\rR\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001e\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u001bR\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00103\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00105\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00106\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010,R\u0014\u00109\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010>\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u00108¨\u0006B"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/m1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/b2;", "t1", "Ljava/lang/Thread;", "i1", "", "r1", "h1", "task", "W0", "", "now", "Lkotlinx/coroutines/m1$c;", "delayedTask", "I0", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlinx/coroutines/h1;", "r", "run", "j1", "()V", l5.a.f130839h0, com.alipay.sdk.m.x.c.f39529d, "", "j", "Ljava/lang/String;", "THREAD_NAME", "k", "J", "DEFAULT_KEEP_ALIVE_MS", "l", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "m", "I", "FRESH", "n", "ACTIVE", "o", "SHUTDOWN_REQ", "p", "SHUTDOWN_ACK", "q", "SHUTDOWN", "debugStatus", "m1", "()Z", "isShutDown", "n1", "isShutdownRequested", "H0", "()Ljava/lang/Thread;", "thread", "q1", "isThreadPresent", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class u0 extends m1 implements Runnable {

    @dl.e
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final u0 f130491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final long DEFAULT_KEEP_ALIVE_MS = 1000;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final long KEEP_ALIVE_NANOS;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final int FRESH = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final int ACTIVE = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final int SHUTDOWN_REQ = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final int SHUTDOWN_ACK = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final int SHUTDOWN = 4;

    static {
        Long l10;
        u0 u0Var = new u0();
        f130491i = u0Var;
        l1.x0(u0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l10.longValue());
    }

    private u0() {
    }

    private final synchronized void h1() {
        if (n1()) {
            debugStatus = 3;
            Z0();
            notifyAll();
        }
    }

    private final synchronized Thread i1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, THREAD_NAME);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private static /* synthetic */ void l1() {
    }

    private final boolean m1() {
        return debugStatus == 4;
    }

    private final boolean n1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean r1() {
        if (n1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void t1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.n1
    @dl.d
    /* JADX INFO: renamed from: H0 */
    protected Thread getThread() {
        Thread thread = _thread;
        return thread == null ? i1() : thread;
    }

    @Override // kotlinx.coroutines.n1
    protected void I0(long j10, @dl.d m1.c cVar) {
        t1();
    }

    @Override // kotlinx.coroutines.m1
    public void W0(@dl.d Runnable runnable) {
        if (m1()) {
            t1();
        }
        super.W0(runnable);
    }

    public final synchronized void j1() {
        debugStatus = 0;
        i1();
        while (debugStatus == 0) {
            wait();
        }
    }

    public final boolean q1() {
        return _thread != null;
    }

    @Override // kotlinx.coroutines.m1, kotlinx.coroutines.y0
    @dl.d
    public h1 r(long timeMillis, @dl.d Runnable block, @dl.d CoroutineContext context) {
        return d1(timeMillis, block);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zZ0;
        kotlin.b2 b2Var;
        i3.f130113a.d(this);
        b bVarB = c.b();
        if (bVarB != null) {
            bVarB.d();
        }
        try {
            if (!r1()) {
                if (zZ0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jD0 = D0();
                if (jD0 == Long.MAX_VALUE) {
                    b bVarB2 = c.b();
                    long jB = bVarB2 != null ? bVarB2.b() : System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = KEEP_ALIVE_NANOS + jB;
                    }
                    long j11 = j10 - jB;
                    if (j11 <= 0) {
                        if (zZ0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jD0 = fi.u.C(jD0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jD0 > 0) {
                    if (n1()) {
                        if (zZ0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    b bVarB3 = c.b();
                    if (bVarB3 != null) {
                        bVarB3.c(this, jD0);
                        b2Var = kotlin.b2.f124493a;
                    } else {
                        b2Var = null;
                    }
                    if (b2Var == null) {
                        LockSupport.parkNanos(this, jD0);
                    }
                }
            }
        } finally {
            _thread = null;
            h1();
            b bVarB4 = c.b();
            if (bVarB4 != null) {
                bVarB4.h();
            }
            if (!z0()) {
                getThread();
            }
        }
    }

    @Override // kotlinx.coroutines.m1, kotlinx.coroutines.l1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void v1(long j10) {
        kotlin.b2 b2Var;
        long jCurrentTimeMillis = System.currentTimeMillis() + j10;
        if (!n1()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
                b bVarB = c.b();
                if (bVarB != null) {
                    bVarB.g(thread);
                    b2Var = kotlin.b2.f124493a;
                } else {
                    b2Var = null;
                }
                if (b2Var == null) {
                    LockSupport.unpark(thread);
                }
            }
            if (jCurrentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            } else {
                wait(j10);
            }
        }
        debugStatus = 0;
    }
}
