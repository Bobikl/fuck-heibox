package okhttp3;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.s0;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u00020\u001e¢\u0006\u0004\b;\u0010=J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 R*\u0010!\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010'\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R.\u00101\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00102R\u001e\u00107\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00108\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0005048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0011\u0010:\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b5\u0010 ¨\u0006>"}, d2 = {"Lokhttp3/n;", "", "", "host", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "f", "", "m", androidx.exifinterface.media.a.f23244d5, "Ljava/util/Deque;", "calls", "call", "Lkotlin/b2;", "g", "(Ljava/util/Deque;Ljava/lang/Object;)V", ak.aF, "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "b", "d", "(Lokhttp3/internal/connection/RealCall;)V", RXScreenCaptureService.KEY_HEIGHT, "i", "", "Lokhttp3/e;", "n", "p", "", "o", "q", "Ljava/util/concurrent/ExecutorService;", ak.av, "()Ljava/util/concurrent/ExecutorService;", "maxRequests", "I", "k", "()I", ak.aB, "(I)V", "maxRequestsPerHost", "l", "t", "Ljava/lang/Runnable;", "<set-?>", "Ljava/lang/Runnable;", "j", "()Ljava/lang/Runnable;", "r", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "e", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "executorService", "<init>", "()V", "(Ljava/util/concurrent/ExecutorService;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxRequests;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxRequestsPerHost;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Runnable idleCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ExecutorService executorServiceOrNull;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<RealCall> runningSyncCalls;

    public n() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@dl.d ExecutorService executorService) {
        this();
        kotlin.jvm.internal.f0.p(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }

    private final RealCall.AsyncCall f(String host) {
        for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
            if (kotlin.jvm.internal.f0.g(asyncCall.getHost(), host)) {
                return asyncCall;
            }
        }
        for (RealCall.AsyncCall asyncCall2 : this.readyAsyncCalls) {
            if (kotlin.jvm.internal.f0.g(asyncCall2.getHost(), host)) {
                return asyncCall2;
            }
        }
        return null;
    }

    private final <T> void g(Deque<T> calls, T call) {
        Runnable runnable;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            b2 b2Var = b2.f124493a;
        }
        if (m() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean m() {
        int i10;
        boolean z10;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            kotlin.jvm.internal.f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            kotlin.jvm.internal.f0.o(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.AsyncCall asyncCall = it.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                }
                if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    it.remove();
                    asyncCall.getCallsPerHost().incrementAndGet();
                    kotlin.jvm.internal.f0.o(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.runningAsyncCalls.add(asyncCall);
                }
            }
            z10 = q() > 0;
            b2 b2Var = b2.f124493a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((RealCall.AsyncCall) arrayList.get(i10)).executeOn(e());
        }
        return z10;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "executorService", imports = {}))
    @xh.h(name = "-deprecated_executorService")
    public final ExecutorService a() {
        return e();
    }

    public final synchronized void b() {
        Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getThis$0().cancel();
        }
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getThis$0().cancel();
        }
        Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void c(@dl.d RealCall.AsyncCall call) {
        RealCall.AsyncCall asyncCallF;
        kotlin.jvm.internal.f0.p(call, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(call);
            if (!call.getThis$0().getForWebSocket() && (asyncCallF = f(call.getHost())) != null) {
                call.reuseCallsPerHostFrom(asyncCallF);
            }
            b2 b2Var = b2.f124493a;
        }
        m();
    }

    public final synchronized void d(@dl.d RealCall call) {
        kotlin.jvm.internal.f0.p(call, "call");
        this.runningSyncCalls.add(call);
    }

    @dl.d
    @xh.h(name = "executorService")
    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(Util.okHttpName + " Dispatcher", false));
        }
        executorService = this.executorServiceOrNull;
        kotlin.jvm.internal.f0.m(executorService);
        return executorService;
    }

    public final void h(@dl.d RealCall.AsyncCall call) {
        kotlin.jvm.internal.f0.p(call, "call");
        call.getCallsPerHost().decrementAndGet();
        g(this.runningAsyncCalls, call);
    }

    public final void i(@dl.d RealCall call) {
        kotlin.jvm.internal.f0.p(call, "call");
        g(this.runningSyncCalls, call);
    }

    @dl.e
    public final synchronized Runnable j() {
        return this.idleCallback;
    }

    public final synchronized int k() {
        return this.maxRequests;
    }

    public final synchronized int l() {
        return this.maxRequestsPerHost;
    }

    @dl.d
    public final synchronized List<e> n() {
        List<e> listUnmodifiableList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(arrayDeque, 10));
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.f0.o(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int o() {
        return this.readyAsyncCalls.size();
    }

    @dl.d
    public final synchronized List<e> p() {
        List<e> listUnmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(arrayDeque2, 10));
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getThis$0());
        }
        listUnmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.y4(arrayDeque, arrayList));
        kotlin.jvm.internal.f0.o(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int q() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void r(@dl.e Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void s(int i10) {
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.maxRequests = i10;
            b2 b2Var = b2.f124493a;
        }
        m();
    }

    public final void t(int i10) {
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i10;
            b2 b2Var = b2.f124493a;
        }
        m();
    }
}
