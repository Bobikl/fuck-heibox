package okhttp3;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: compiled from: ConnectionPool.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\f\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lokhttp3/j;", "", "", "d", ak.av, "Lkotlin/b2;", "b", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/internal/connection/RealConnectionPool;", ak.aF, "()Lokhttp3/internal/connection/RealConnectionPool;", "delegate", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;)V", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RealConnectionPool delegate;

    public j() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(int i10, long j10, @dl.d TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.INSTANCE, i10, j10, timeUnit));
        kotlin.jvm.internal.f0.p(timeUnit, "timeUnit");
    }

    public j(@dl.d RealConnectionPool delegate) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    public final int a() {
        return this.delegate.connectionCount();
    }

    public final void b() {
        this.delegate.evictAll();
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RealConnectionPool getDelegate() {
        return this.delegate;
    }

    public final int d() {
        return this.delegate.idleConnectionCount();
    }
}
