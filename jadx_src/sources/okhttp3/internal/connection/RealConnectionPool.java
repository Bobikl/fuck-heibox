package okhttp3.internal.connection;

import com.alipay.zoloz.android.phone.mrpc.core.f;
import dl.d;
import dl.e;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.a;
import okhttp3.e0;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import okhttp3.j;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001e\u0018\u0000 -2\u00020\u0001:\u0001-B'\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J.\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006."}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Lokhttp3/internal/connection/RealConnection;", f.f39665q, "", "now", "", "pruneAndGetAllocationCount", "idleConnectionCount", "connectionCount", "Lokhttp3/a;", "address", "Lokhttp3/internal/connection/RealCall;", "call", "", "Lokhttp3/e0;", "routes", "", "requireMultiplexed", "callAcquirePooledConnection", "Lkotlin/b2;", "put", "connectionBecameIdle", "evictAll", "cleanup", "keepAliveDurationNs", "J", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "maxIdleConnections", "I", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RealConnectionPool {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* JADX INFO: compiled from: RealConnectionPool.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "Lokhttp3/j;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "get", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        public final RealConnectionPool get(@d j connectionPool) {
            f0.p(connectionPool, "connectionPool");
            return connectionPool.getDelegate();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(@d TaskRunner taskRunner, int i10, long j10, @d TimeUnit timeUnit) {
        f0.p(taskRunner, "taskRunner");
        f0.p(timeUnit, "timeUnit");
        this.maxIdleConnections = i10;
        this.keepAliveDurationNs = timeUnit.toNanos(j10);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = Util.okHttpName + " ConnectionPool";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return this.this$0.cleanup(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int pruneAndGetAllocationCount(RealConnection connection, long now) {
        if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(connection);
            throw new AssertionError(sb2.toString());
        }
        List<Reference<RealCall>> calls = connection.getCalls();
        int i10 = 0;
        while (i10 < calls.size()) {
            Reference<RealCall> reference = calls.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Platform.INSTANCE.get().logCloseableLeak("A connection to " + connection.getRoute().d().w() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i10);
                connection.setNoNewExchanges(true);
                if (calls.isEmpty()) {
                    connection.setIdleAtNs$okhttp(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    public final boolean callAcquirePooledConnection(@d a address, @d RealCall call, @e List<e0> routes, boolean requireMultiplexed) {
        f0.p(address, "address");
        f0.p(call, "call");
        for (RealConnection connection : this.connections) {
            f0.o(connection, "connection");
            synchronized (connection) {
                if (requireMultiplexed) {
                    if (!connection.isMultiplexed$okhttp()) {
                    }
                    b2 b2Var = b2.f124493a;
                }
                if (connection.isEligible$okhttp(address, routes)) {
                    call.acquireConnectionNoEvents(connection);
                    return true;
                }
                b2 b2Var2 = b2.f124493a;
            }
        }
        return false;
    }

    public final long cleanup(long now) {
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i11 = 0;
        for (RealConnection connection : this.connections) {
            f0.o(connection, "connection");
            synchronized (connection) {
                if (pruneAndGetAllocationCount(connection, now) > 0) {
                    i11++;
                } else {
                    i10++;
                    long idleAtNs = now - connection.getIdleAtNs();
                    if (idleAtNs > j10) {
                        b2 b2Var = b2.f124493a;
                        realConnection = connection;
                        j10 = idleAtNs;
                    } else {
                        b2 b2Var2 = b2.f124493a;
                    }
                }
            }
        }
        long j11 = this.keepAliveDurationNs;
        if (j10 < j11 && i10 <= this.maxIdleConnections) {
            if (i10 > 0) {
                return j11 - j10;
            }
            if (i11 > 0) {
                return j11;
            }
            return -1L;
        }
        f0.m(realConnection);
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs() + j10 != now) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(@d RealConnection connection) {
        f0.p(connection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(connection);
            throw new AssertionError(sb2.toString());
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        connection.setNoNewExchanges(true);
        this.connections.remove(connection);
        if (!this.connections.isEmpty()) {
            return true;
        }
        this.cleanupQueue.cancelAll();
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket;
        Iterator<RealConnection> it = this.connections.iterator();
        f0.o(it, "connections.iterator()");
        while (it.hasNext()) {
            RealConnection connection = it.next();
            f0.o(connection, "connection");
            synchronized (connection) {
                if (connection.getCalls().isEmpty()) {
                    it.remove();
                    connection.setNoNewExchanges(true);
                    socket = connection.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Util.closeQuietly(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i10 = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (RealConnection it : concurrentLinkedQueue) {
                f0.o(it, "it");
                synchronized (it) {
                    zIsEmpty = it.getCalls().isEmpty();
                }
                if (zIsEmpty && (i10 = i10 + 1) < 0) {
                    CollectionsKt__CollectionsKt.V();
                }
            }
        }
        return i10;
    }

    public final void put(@d RealConnection connection) {
        f0.p(connection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(connection)) {
            this.connections.add(connection);
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        f0.o(threadCurrentThread, "Thread.currentThread()");
        sb2.append(threadCurrentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(connection);
        throw new AssertionError(sb2.toString());
    }
}
