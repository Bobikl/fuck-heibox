package kotlinx.coroutines.scheduling;

import fi.u;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.s0;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0017J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/scheduling/b;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lkotlin/b2;", com.tekartik.sqflite.b.f98590i, "", "parallelism", "Lkotlinx/coroutines/CoroutineDispatcher;", "c0", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlinx/coroutines/Runnable;", "block", "O", "R", "close", "", "toString", "f", "Lkotlinx/coroutines/CoroutineDispatcher;", "default", "p0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b extends ExecutorCoroutineDispatcher implements Executor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final b f130356e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final CoroutineDispatcher default = o.f130390d.c0(s0.d(f1.f129189a, u.u(64, q0.a()), 0, 0, 12, null));

    private b() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        default.O(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @z1
    public void R(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        default.R(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    @t1
    public CoroutineDispatcher c0(int parallelism) {
        return o.f130390d.c0(parallelism);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@dl.d Runnable runnable) {
        O(EmptyCoroutineContext.f124694b, runnable);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @dl.d
    /* JADX INFO: renamed from: p0 */
    public Executor getExecutor() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public String toString() {
        return "Dispatchers.IO";
    }
}
