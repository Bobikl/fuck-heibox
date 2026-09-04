package kotlinx.coroutines.scheduling;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.random.Random;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.t0;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0003\u0006\u0013\\B+\u0012\u0006\u0010G\u001a\u00020\f\u0012\u0006\u0010H\u001a\u00020\f\u0012\b\b\u0002\u0010J\u001a\u00020\u000f\u0012\b\b\u0002\u0010L\u001a\u00020B¢\u0006\u0004\bZ\u0010[J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0015J+\u0010'\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010\nJ)\u0010,\u001a\u00020\u00192\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b0\u0010\u0012J\u001b\u00104\u001a\u00020\u00192\n\u00103\u001a\u000601j\u0002`2H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J-\u0010=\u001a\u00020\u00192\n\u0010:\u001a\u000601j\u0002`22\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00032\n\u0010:\u001a\u000601j\u0002`22\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0019¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00108R\u0014\u0010H\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108R\u0014\u0010J\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010IR\u0014\u0010L\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010KR\u0014\u0010O\u001a\u00020M8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u0014\u0010P\u001a\u00020M8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010NR\u001e\u0010T\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000Q8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0015\u0010V\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0015R\u0015\u0010X\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0015R\u0011\u0010Y\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bY\u0010\u001d¨\u0006]"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/j;", "task", "", ak.av, "(Lkotlinx/coroutines/scheduling/j;)Z", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "t", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "worker", "", ak.aB, "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;)I", "", "state", "f", "(J)I", ak.aF, "r", "()I", "k", "q", "()J", "Lkotlin/b2;", "i", "()V", "N", "()Z", androidx.exifinterface.media.a.W4, "skipUnpark", "K", "(Z)V", "O", "(J)Z", "Q", "d", "tailDispatch", "M", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;Lkotlinx/coroutines/scheduling/j;Z)Lkotlinx/coroutines/scheduling/j;", "g", "oldIndex", "newIndex", ak.aD, "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;II)V", "x", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;)Z", "b", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", com.tekartik.sqflite.b.f98590i, "(Ljava/lang/Runnable;)V", "close", l5.a.f130839h0, "I", "(J)V", "block", "Lkotlinx/coroutines/scheduling/k;", "taskContext", "m", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/k;Z)V", "e", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/k;)Lkotlinx/coroutines/scheduling/j;", "L", "", "toString", "()Ljava/lang/String;", "C", "(Lkotlinx/coroutines/scheduling/j;)V", "corePoolSize", "maxPoolSize", "J", "idleWorkerKeepAliveNs", "Ljava/lang/String;", "schedulerName", "Lkotlinx/coroutines/scheduling/e;", "Lkotlinx/coroutines/scheduling/e;", "globalCpuQueue", "globalBlockingQueue", "Lkotlinx/coroutines/internal/j0;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/internal/j0;", "workers", "p", "createdWorkers", "o", "availableCpuPermits", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f130327n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f130328o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f130329p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f130330q = 21;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f130331r = 2097151;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f130332s = 4398044413952L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f130333t = 42;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f130334u = 9223367638808264704L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f130335v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f130336w = 2097150;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f130337x = 2097151;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f130338y = -2097152;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f130339z = 2097152;

    @dl.d
    private volatile /* synthetic */ int _isTerminated;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int corePoolSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int maxPoolSize;

    @dl.d
    volatile /* synthetic */ long controlState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final long idleWorkerKeepAliveNs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final String schedulerName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final e globalCpuQueue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final e globalBlockingQueue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final j0<c> workers;

    @dl.d
    private volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f130326m = new o0("NOT_IN_STACK");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f130323j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f130324k = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f130325l = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130347a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            iArr[WorkerState.PARKING.ordinal()] = 1;
            iArr[WorkerState.BLOCKING.ordinal()] = 2;
            iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            iArr[WorkerState.DORMANT.ordinal()] = 4;
            iArr[WorkerState.TERMINATED.ordinal()] = 5;
            f130347a = iArr;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\bD\u0010FJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0019R*\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0011R\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u0016\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00103R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u0016\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010>R\u0012\u0010C\u001a\u00020@8Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "Ljava/lang/Thread;", "", "r", "()Z", "Lkotlin/b2;", "o", "()V", ak.aB, "k", "Lkotlinx/coroutines/scheduling/j;", "task", "d", "(Lkotlinx/coroutines/scheduling/j;)V", "", "taskMode", ak.aF, "(I)V", "b", "m", "v", "mode", "j", "scanLocalQueue", "e", "(Z)Lkotlinx/coroutines/scheduling/j;", "n", "()Lkotlinx/coroutines/scheduling/j;", "blockingOnly", ak.aG, "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "t", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "run", "upperBound", "l", "(I)I", "f", UCropPlusActivity.ARG_INDEX, "indexInArray", "I", "g", "()I", "p", "Lkotlinx/coroutines/scheduling/p;", "Lkotlinx/coroutines/scheduling/p;", "localQueue", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/Object;", "q", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "i", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f130348i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public final p localQueue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        @xh.e
        public WorkerState state;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long terminationDeadline;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long minDelayUntilStealableTaskNs;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int rngState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @xh.e
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;

        @dl.e
        private volatile Object nextParkedWorker;

        @dl.d
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.localQueue = new p();
            this.state = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f130326m;
            this.rngState = Random.f125033b.l();
        }

        public c(CoroutineScheduler coroutineScheduler, int i10) {
            this();
            p(i10);
        }

        private final void b(int taskMode) {
            if (taskMode == 0) {
                return;
            }
            CoroutineScheduler.f130324k.addAndGet(CoroutineScheduler.this, CoroutineScheduler.f130338y);
            if (this.state != WorkerState.TERMINATED) {
                this.state = WorkerState.DORMANT;
            }
        }

        private final void c(int taskMode) {
            if (taskMode != 0 && t(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.L();
            }
        }

        private final void d(j task) {
            int taskMode = task.taskContext.getTaskMode();
            j(taskMode);
            c(taskMode);
            CoroutineScheduler.this.C(task);
            b(taskMode);
        }

        private final j e(boolean scanLocalQueue) {
            j jVarN;
            j jVarN2;
            if (scanLocalQueue) {
                boolean z10 = l(CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z10 && (jVarN2 = n()) != null) {
                    return jVarN2;
                }
                j jVarH = this.localQueue.h();
                if (jVarH != null) {
                    return jVarH;
                }
                if (!z10 && (jVarN = n()) != null) {
                    return jVarN;
                }
            } else {
                j jVarN3 = n();
                if (jVarN3 != null) {
                    return jVarN3;
                }
            }
            return u(false);
        }

        private final void j(int mode) {
            this.terminationDeadline = 0L;
            if (this.state == WorkerState.PARKING) {
                this.state = WorkerState.BLOCKING;
            }
        }

        private final boolean k() {
            return this.nextParkedWorker != CoroutineScheduler.f130326m;
        }

        private final void m() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                v();
            }
        }

        private final j n() {
            if (l(2) == 0) {
                j jVarG = CoroutineScheduler.this.globalCpuQueue.g();
                return jVarG != null ? jVarG : CoroutineScheduler.this.globalBlockingQueue.g();
            }
            j jVarG2 = CoroutineScheduler.this.globalBlockingQueue.g();
            return jVarG2 != null ? jVarG2 : CoroutineScheduler.this.globalCpuQueue.g();
        }

        private final void o() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (CoroutineScheduler.this.isTerminated() || this.state == WorkerState.TERMINATED) {
                        break loop0;
                    }
                    j jVarF = f(this.mayHaveLocalTasks);
                    if (jVarF != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        d(jVarF);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if (this.minDelayUntilStealableTaskNs == 0) {
                        s();
                    } else {
                        if (z10) {
                            t(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z10 = true;
                    }
                }
            }
            t(WorkerState.TERMINATED);
        }

        private final boolean r() {
            boolean z10;
            if (this.state != WorkerState.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                while (true) {
                    long j10 = coroutineScheduler.controlState;
                    if (((int) ((CoroutineScheduler.f130334u & j10) >> 42)) == 0) {
                        z10 = false;
                        break;
                    }
                    if (CoroutineScheduler.f130324k.compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.state = WorkerState.CPU_ACQUIRED;
            }
            return true;
        }

        private final void s() {
            if (!k()) {
                CoroutineScheduler.this.x(this);
                return;
            }
            this.workerCtl = -1;
            while (k() && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                t(WorkerState.PARKING);
                Thread.interrupted();
                m();
            }
        }

        private final j u(boolean blockingOnly) {
            int i10 = (int) (CoroutineScheduler.this.controlState & org.apache.tools.tar.c.f137285g);
            if (i10 < 2) {
                return null;
            }
            int iL = l(i10);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                iL++;
                if (iL > i10) {
                    iL = 1;
                }
                c cVarB = coroutineScheduler.workers.b(iL);
                if (cVarB != null && cVarB != this) {
                    long jK = blockingOnly ? this.localQueue.k(cVarB.localQueue) : this.localQueue.l(cVarB.localQueue);
                    if (jK == -1) {
                        return this.localQueue.h();
                    }
                    if (jK > 0) {
                        jMin = Math.min(jMin, jK);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        private final void v() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.workers) {
                if (coroutineScheduler.isTerminated()) {
                    return;
                }
                if (((int) (coroutineScheduler.controlState & org.apache.tools.tar.c.f137285g)) <= coroutineScheduler.corePoolSize) {
                    return;
                }
                if (f130348i.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    p(0);
                    coroutineScheduler.z(this, i10, 0);
                    int andDecrement = (int) (CoroutineScheduler.f130324k.getAndDecrement(coroutineScheduler) & org.apache.tools.tar.c.f137285g);
                    if (andDecrement != i10) {
                        c cVarB = coroutineScheduler.workers.b(andDecrement);
                        f0.m(cVarB);
                        c cVar = cVarB;
                        coroutineScheduler.workers.c(i10, cVar);
                        cVar.p(i10);
                        coroutineScheduler.z(cVar, andDecrement, i10);
                    }
                    coroutineScheduler.workers.c(andDecrement, null);
                    b2 b2Var = b2.f124493a;
                    this.state = WorkerState.TERMINATED;
                }
            }
        }

        @dl.e
        public final j f(boolean scanLocalQueue) {
            j jVarG;
            if (r()) {
                return e(scanLocalQueue);
            }
            if (!scanLocalQueue || (jVarG = this.localQueue.h()) == null) {
                jVarG = CoroutineScheduler.this.globalBlockingQueue.g();
            }
            return jVarG == null ? u(true) : jVarG;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @dl.e
        /* JADX INFO: renamed from: h, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        @dl.d
        public final CoroutineScheduler i() {
            return CoroutineScheduler.this;
        }

        public final int l(int upperBound) {
            int i10 = this.rngState;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.rngState = i13;
            int i14 = upperBound - 1;
            return (i14 & upperBound) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % upperBound;
        }

        public final void p(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.schedulerName);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void q(@dl.e Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o();
        }

        public final boolean t(@dl.d WorkerState newState) {
            WorkerState workerState = this.state;
            boolean z10 = workerState == WorkerState.CPU_ACQUIRED;
            if (z10) {
                CoroutineScheduler.f130324k.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState != newState) {
                this.state = newState;
            }
            return z10;
        }
    }

    public CoroutineScheduler(int i10, int i11, long j10, @dl.d String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.globalCpuQueue = new e();
        this.globalBlockingQueue = new e();
        this.parkedWorkersStack = 0L;
        this.workers = new j0<>(i10 + 1);
        this.controlState = ((long) i10) << 42;
        this._isTerminated = 0;
    }

    public /* synthetic */ CoroutineScheduler(int i10, int i11, long j10, String str, int i12, u uVar) {
        this(i10, i11, (i12 & 4) != 0 ? n.f130384e : j10, (i12 & 8) != 0 ? n.f130380a : str);
    }

    private final long A() {
        return f130324k.addAndGet(this, 4398046511104L);
    }

    private final void K(boolean skipUnpark) {
        long jAddAndGet = f130324k.addAndGet(this, 2097152L);
        if (skipUnpark || Q() || O(jAddAndGet)) {
            return;
        }
        Q();
    }

    private final j M(c cVar, j jVar, boolean z10) {
        if (cVar == null || cVar.state == WorkerState.TERMINATED) {
            return jVar;
        }
        if (jVar.taskContext.getTaskMode() == 0 && cVar.state == WorkerState.BLOCKING) {
            return jVar;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.a(jVar, z10);
    }

    private final boolean N() {
        long j10;
        do {
            j10 = this.controlState;
            if (((int) ((f130334u & j10) >> 42)) == 0) {
                return false;
            }
        } while (!f130324k.compareAndSet(this, j10, j10 - 4398046511104L));
        return true;
    }

    private final boolean O(long state) {
        if (fi.u.u(((int) (org.apache.tools.tar.c.f137285g & state)) - ((int) ((state & f130332s) >> 21)), 0) < this.corePoolSize) {
            int iD = d();
            if (iD == 1 && this.corePoolSize > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean P(CoroutineScheduler coroutineScheduler, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = coroutineScheduler.controlState;
        }
        return coroutineScheduler.O(j10);
    }

    private final boolean Q() {
        c cVarT;
        do {
            cVarT = t();
            if (cVarT == null) {
                return false;
            }
        } while (!c.f130348i.compareAndSet(cVarT, -1, 0));
        LockSupport.unpark(cVarT);
        return true;
    }

    private final boolean a(j task) {
        return task.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.a(task) : this.globalCpuQueue.a(task);
    }

    private final int c(long state) {
        return (int) ((state & f130332s) >> 21);
    }

    private final int d() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            long j10 = this.controlState;
            int i10 = (int) (j10 & org.apache.tools.tar.c.f137285g);
            int iU = fi.u.u(i10 - ((int) ((j10 & f130332s) >> 21)), 0);
            if (iU >= this.corePoolSize) {
                return 0;
            }
            if (i10 >= this.maxPoolSize) {
                return 0;
            }
            int i11 = ((int) (this.controlState & org.apache.tools.tar.c.f137285g)) + 1;
            if (!(i11 > 0 && this.workers.b(i11) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(this, i11);
            this.workers.c(i11, cVar);
            if (!(i11 == ((int) (org.apache.tools.tar.c.f137285g & f130324k.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            cVar.start();
            return iU + 1;
        }
    }

    private final int f(long state) {
        return (int) (state & org.apache.tools.tar.c.f137285g);
    }

    private final c g() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !f0.g(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    private final void i() {
        f130324k.addAndGet(this, f130338y);
    }

    private final int k() {
        return (int) (f130324k.getAndDecrement(this) & org.apache.tools.tar.c.f137285g);
    }

    public static /* synthetic */ void n(CoroutineScheduler coroutineScheduler, Runnable runnable, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kVar = n.f130388i;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        coroutineScheduler.m(runnable, kVar, z10);
    }

    private final int o() {
        return (int) ((this.controlState & f130334u) >> 42);
    }

    private final int p() {
        return (int) (this.controlState & org.apache.tools.tar.c.f137285g);
    }

    private final long q() {
        return f130324k.addAndGet(this, 2097152L);
    }

    private final int r() {
        return (int) (f130324k.incrementAndGet(this) & org.apache.tools.tar.c.f137285g);
    }

    private final int s(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f130326m) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar = (c) nextParkedWorker;
            int indexInArray = cVar.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar.getNextParkedWorker();
        }
        return -1;
    }

    private final c t() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            c cVarB = this.workers.b((int) (org.apache.tools.tar.c.f137285g & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & f130338y;
            int iS = s(cVarB);
            if (iS >= 0 && f130323j.compareAndSet(this, j10, ((long) iS) | j11)) {
                cVarB.q(f130326m);
                return cVarB;
            }
        }
    }

    public final void C(@dl.d j task) {
        kotlinx.coroutines.b bVarB;
        try {
            task.run();
            bVarB = kotlinx.coroutines.c.b();
            if (bVarB == null) {
                return;
            }
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                bVarB = kotlinx.coroutines.c.b();
                if (bVarB == null) {
                    return;
                }
            } catch (Throwable th3) {
                kotlinx.coroutines.b bVarB2 = kotlinx.coroutines.c.b();
                if (bVarB2 != null) {
                    bVarB2.f();
                }
                throw th3;
            }
        }
        bVarB.f();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    public final void I(long timeout) throws InterruptedException {
        int i10;
        j jVarG;
        if (f130325l.compareAndSet(this, 0, 1)) {
            c cVarG = g();
            synchronized (this.workers) {
                i10 = (int) (this.controlState & org.apache.tools.tar.c.f137285g);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c cVarB = this.workers.b(i11);
                    f0.m(cVarB);
                    c cVar = cVarB;
                    if (cVar != cVarG) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(timeout);
                        }
                        cVar.localQueue.g(this.globalBlockingQueue);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.globalBlockingQueue.b();
            this.globalCpuQueue.b();
            while (true) {
                if (cVarG == null) {
                    jVarG = this.globalCpuQueue.g();
                    if (jVarG == null && (jVarG = this.globalBlockingQueue.g()) == null) {
                        break;
                    }
                } else {
                    jVarG = cVarG.f(true);
                    if (jVarG == null) {
                        jVarG = this.globalCpuQueue.g();
                        if (jVarG == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                C(jVarG);
            }
            if (cVarG != null) {
                cVarG.t(WorkerState.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void L() {
        if (Q() || P(this, 0L, 1, null)) {
            return;
        }
        Q();
    }

    public final int b(long state) {
        return (int) ((state & f130334u) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        I(10000L);
    }

    @dl.d
    public final j e(@dl.d Runnable block, @dl.d k taskContext) {
        long jA = n.f130385f.a();
        if (!(block instanceof j)) {
            return new m(block, jA, taskContext);
        }
        j jVar = (j) block;
        jVar.submissionTime = jA;
        jVar.taskContext = taskContext;
        return jVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@dl.d Runnable command) {
        n(this, command, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void m(@dl.d Runnable block, @dl.d k taskContext, boolean tailDispatch) {
        kotlinx.coroutines.b bVarB = kotlinx.coroutines.c.b();
        if (bVarB != null) {
            bVarB.e();
        }
        j jVarE = e(block, taskContext);
        c cVarG = g();
        j jVarM = M(cVarG, jVarE, tailDispatch);
        if (jVarM != null && !a(jVarM)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        boolean z10 = tailDispatch && cVarG != null;
        if (jVarE.taskContext.getTaskMode() != 0) {
            K(z10);
        } else {
            if (z10) {
                return;
            }
            L();
        }
    }

    @dl.d
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.workers.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.workers.b(i15);
            if (cVarB != null) {
                int iF = cVarB.localQueue.f();
                int i16 = b.f130347a[cVarB.state.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iF);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iF);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (iF > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iF);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = this.controlState;
        return this.schedulerName + '@' + t0.b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.c() + ", global blocking queue size = " + this.globalBlockingQueue.c() + ", Control State {created workers= " + ((int) (org.apache.tools.tar.c.f137285g & j10)) + ", blocking tasks = " + ((int) ((f130332s & j10) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((f130334u & j10) >> 42))) + "}]";
    }

    public final boolean x(@dl.d c worker) {
        long j10;
        long j11;
        int indexInArray;
        if (worker.getNextParkedWorker() != f130326m) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            int i10 = (int) (org.apache.tools.tar.c.f137285g & j10);
            j11 = (2097152 + j10) & f130338y;
            indexInArray = worker.getIndexInArray();
            worker.q(this.workers.b(i10));
        } while (!f130323j.compareAndSet(this, j10, j11 | ((long) indexInArray)));
        return true;
    }

    public final void z(@dl.d c worker, int oldIndex, int newIndex) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int iS = (int) (org.apache.tools.tar.c.f137285g & j10);
            long j11 = (2097152 + j10) & f130338y;
            if (iS == oldIndex) {
                iS = newIndex == 0 ? s(worker) : newIndex;
            }
            if (iS >= 0 && f130323j.compareAndSet(this, j10, j11 | ((long) iS))) {
                return;
            }
        }
    }
}
