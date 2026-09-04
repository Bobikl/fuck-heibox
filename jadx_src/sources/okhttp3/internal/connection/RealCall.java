package okhttp3.internal.connection;

import androidx.exifinterface.media.a;
import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.max.hbwallet.bean.MallCouponObj;
import com.tekartik.sqflite.b;
import dl.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.o;
import okhttp3.CertificatePinner;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okhttp3.n;
import okhttp3.p;
import okhttp3.t;
import okhttp3.z;
import okio.AsyncTimeout;

/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001J\u0018\u00002\u00020\u0001:\u0002tuB\u001f\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010k\u001a\u00020\u0014\u0012\u0006\u0010o\u001a\u00020\u0017¢\u0006\u0004\br\u0010sJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u000f\u0010!\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010#\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0017J\u0017\u0010)\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*J;\u00102\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00028\u0000H\u0000¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b3\u0010\bJ\u0011\u00108\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b6\u00107J\u0006\u00109\u001a\u00020\u0002J\u0017\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0017H\u0000¢\u0006\u0004\b;\u0010<J\u0006\u0010>\u001a\u00020\u0017J\u000f\u0010A\u001a\u00020\u000fH\u0000¢\u0006\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010\u0012\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR(\u0010+\u001a\u0004\u0018\u00010*2\b\u0010U\u001a\u0004\u0018\u00010*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010V\u001a\u0004\bW\u0010XR\u0016\u00109\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010YR(\u0010Z\u001a\u0004\u0018\u00010&2\b\u0010U\u001a\u0004\u0018\u00010&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010YR\u0016\u0010_\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010YR\u0016\u0010`\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010YR\u0016\u0010a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010YR\u0018\u0010-\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010[R$\u0010b\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010V\u001a\u0004\bc\u0010X\"\u0004\bd\u0010eR\u0017\u0010g\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010k\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010o\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bo\u0010Y\u001a\u0004\bp\u0010q¨\u0006v"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/e;", "Lkotlin/b2;", "callStart", "Ljava/io/IOException;", a.S4, "e", "callDone", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "timeoutExit", "Lokhttp3/t;", "url", "Lokhttp3/a;", "createAddress", "", "toLoggableString", "Lokio/AsyncTimeout;", l5.a.f130839h0, "clone", "Lokhttp3/a0;", "request", "cancel", "", "isCanceled", "Lokhttp3/c0;", b.f98590i, "Lokhttp3/f;", "responseCallback", "enqueue", "isExecuted", "getResponseWithInterceptorChain$okhttp", "()Lokhttp3/c0;", "getResponseWithInterceptorChain", "newExchangeFinder", "enterNetworkInterceptorExchange", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "Lokhttp3/internal/connection/RealConnection;", f.f39665q, "acquireConnectionNoEvents", MallCouponObj.TYPE_EXCHANGE, "requestDone", "responseDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "noMoreExchanges", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "timeoutEarlyExit", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "retryAfterFailure", "redactedUrl$okhttp", "()Ljava/lang/String;", "redactedUrl", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/p;", "eventListener", "Lokhttp3/p;", "getEventListener$okhttp", "()Lokhttp3/p;", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "callStackTrace", "Ljava/lang/Object;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "<set-?>", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Z", "interceptorScopedExchange", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", qb.a.f138642e, "connectionToCancel", "getConnectionToCancel", "setConnectionToCancel", "(Lokhttp3/internal/connection/RealConnection;)V", "Lokhttp3/z;", "client", "Lokhttp3/z;", "getClient", "()Lokhttp3/z;", "originalRequest", "Lokhttp3/a0;", "getOriginalRequest", "()Lokhttp3/a0;", "forWebSocket", "getForWebSocket", "()Z", "<init>", "(Lokhttp3/z;Lokhttp3/a0;Z)V", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RealCall implements e {
    private Object callStackTrace;
    private volatile boolean canceled;

    @d
    private final z client;

    @dl.e
    private RealConnection connection;
    private final RealConnectionPool connectionPool;

    @dl.e
    private volatile RealConnection connectionToCancel;

    @d
    private final p eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;

    @dl.e
    private Exchange interceptorScopedExchange;

    @d
    private final a0 originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final AnonymousClass1 timeout;
    private boolean timeoutEarlyExit;

    /* JADX INFO: compiled from: RealCall.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R$\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/internal/connection/RealCall;", "other", "Lkotlin/b2;", "reuseCallsPerHostFrom", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "run", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "Lokhttp3/f;", "responseCallback", "Lokhttp3/f;", "", "getHost", "()Ljava/lang/String;", "host", "Lokhttp3/a0;", "getRequest", "()Lokhttp3/a0;", "request", "getCall", "()Lokhttp3/internal/connection/RealCall;", "call", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/f;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class AsyncCall implements Runnable {

        @d
        private volatile AtomicInteger callsPerHost;
        private final okhttp3.f responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(@d RealCall realCall, okhttp3.f responseCallback) {
            f0.p(responseCallback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void executeOn(@d ExecutorService executorService) {
            f0.p(executorService, "executorService");
            n dispatcher = this.this$0.getClient().getDispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                f0.o(threadCurrentThread, "Thread.currentThread()");
                sb2.append(threadCurrentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(dispatcher);
                throw new AssertionError(sb2.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().getDispatcher().h(this);
                }
            } catch (Throwable th2) {
                this.this$0.getClient().getDispatcher().h(this);
                throw th2;
            }
        }

        @d
        /* JADX INFO: renamed from: getCall, reason: from getter */
        public final RealCall getThis$0() {
            return this.this$0;
        }

        @d
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @d
        public final String getHost() {
            return this.this$0.getOriginalRequest().q().getHost();
        }

        @d
        public final a0 getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(@d AsyncCall other) {
            f0.p(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            n dispatcher;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            Thread currentThread = Thread.currentThread();
            f0.o(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                try {
                    enter();
                    try {
                        z10 = true;
                        try {
                            this.responseCallback.onResponse(this.this$0, this.this$0.getResponseWithInterceptorChain$okhttp());
                            dispatcher = this.this$0.getClient().getDispatcher();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                Platform.INSTANCE.get().log("Callback failure for " + this.this$0.toLoggableString(), 4, e10);
                            } else {
                                this.responseCallback.onFailure(this.this$0, e10);
                            }
                            dispatcher = this.this$0.getClient().getDispatcher();
                        } catch (Throwable th3) {
                            th2 = th3;
                            this.this$0.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th2);
                                o.a(iOException, th2);
                                this.responseCallback.onFailure(this.this$0, iOException);
                            }
                            throw th2;
                        }
                    } catch (IOException e12) {
                        z10 = false;
                        e10 = e12;
                    } catch (Throwable th4) {
                        z10 = false;
                        th2 = th4;
                    }
                    dispatcher.h(this);
                    currentThread.setName(name);
                } catch (Throwable th5) {
                    this.this$0.getClient().getDispatcher().h(this);
                    throw th5;
                }
            } catch (Throwable th6) {
                currentThread.setName(name);
                throw th6;
            }
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "callStackTrace", "", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class CallReference extends WeakReference<RealCall> {

        @dl.e
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(@d RealCall referent, @dl.e Object obj) {
            super(referent);
            f0.p(referent, "referent");
            this.callStackTrace = obj;
        }

        @dl.e
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [okhttp3.internal.connection.RealCall$timeout$1, okio.Timeout] */
    public RealCall(@d z client, @d a0 originalRequest, boolean z10) {
        f0.p(client, "client");
        f0.p(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z10;
        this.connectionPool = client.getConnectionPool().getDelegate();
        this.eventListener = client.getEventListenerFactory().create(this);
        ?? r10 = new AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall.timeout.1
            @Override // okio.AsyncTimeout
            protected void timedOut() {
                RealCall.this.cancel();
            }
        };
        r10.timeout(client.getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        b2 b2Var = b2.f124493a;
        this.timeout = r10;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final <E extends IOException> E callDone(E e10) {
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z10 = Util.assertionsEnabled;
        if (z10 && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z10 && Thread.holdsLock(realConnection)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Thread ");
                Thread threadCurrentThread2 = Thread.currentThread();
                f0.o(threadCurrentThread2, "Thread.currentThread()");
                sb3.append(threadCurrentThread2.getName());
                sb3.append(" MUST NOT hold lock on ");
                sb3.append(realConnection);
                throw new AssertionError(sb3.toString());
            }
            synchronized (realConnection) {
                socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
            } else {
                if (!(socketReleaseConnectionNoEvents$okhttp == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e11 = (E) timeoutExit(e10);
        if (e10 != null) {
            p pVar = this.eventListener;
            f0.m(e11);
            pVar.callFailed(this, e11);
        } else {
            this.eventListener.callEnd(this);
        }
        return e11;
    }

    private final void callStart() {
        this.callStackTrace = Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final okhttp3.a createAddress(t url) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (url.getIsHttps()) {
            SSLSocketFactory sSLSocketFactoryN0 = this.client.n0();
            hostnameVerifier = this.client.getHostnameVerifier();
            sSLSocketFactory = sSLSocketFactoryN0;
            certificatePinner = this.client.getCertificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new okhttp3.a(url.getHost(), url.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String(), this.client.getCom.taobao.accs.utl.BaseMonitor.COUNT_POINT_DNS java.lang.String(), this.client.getSocketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.getProxyAuthenticator(), this.client.getCom.max.xiaoheihe.module.webview.WebviewFragment.A4 java.lang.String(), this.client.g0(), this.client.Q(), this.client.getProxySelector());
    }

    private final <E extends IOException> E timeoutExit(E cause) {
        if (this.timeoutEarlyExit || !exit()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(l5.a.f130839h0);
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getCanceled() ? "canceled " : "");
        sb2.append(this.forWebSocket ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(redactedUrl$okhttp());
        return sb2.toString();
    }

    public final void acquireConnectionNoEvents(@d RealConnection connection) {
        f0.p(connection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(connection)) {
            if (!(this.connection == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.connection = connection;
            connection.getCalls().add(new CallReference(this, this.callStackTrace));
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

    @Override // okhttp3.e
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.e
    @d
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.e
    public void enqueue(@d okhttp3.f responseCallback) {
        f0.p(responseCallback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        callStart();
        this.client.getDispatcher().c(new AsyncCall(this, responseCallback));
    }

    public final void enterNetworkInterceptorExchange(@d a0 request, boolean z10) {
        f0.p(request, "request");
        if (!(this.interceptorScopedExchange == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.responseBodyOpen)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.requestBodyOpen)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            b2 b2Var = b2.f124493a;
        }
        if (z10) {
            this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.q()), this, this.eventListener);
        }
    }

    @Override // okhttp3.e
    @d
    public c0 execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        enter();
        callStart();
        try {
            this.client.getDispatcher().d(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.getDispatcher().i(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean closeExchange) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released".toString());
            }
            b2 b2Var = b2.f124493a;
        }
        if (closeExchange && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    @d
    public final z getClient() {
        return this.client;
    }

    @dl.e
    public final RealConnection getConnection() {
        return this.connection;
    }

    @dl.e
    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    @d
    /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
    public final p getEventListener() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @dl.e
    /* JADX INFO: renamed from: getInterceptorScopedExchange$okhttp, reason: from getter */
    public final Exchange getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    @d
    public final a0 getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    @d
    public final c0 getResponseWithInterceptorChain$okhttp() throws Throwable {
        ArrayList arrayList = new ArrayList();
        x.n0(arrayList, this.client.b0());
        arrayList.add(new RetryAndFollowUpInterceptor(this.client));
        arrayList.add(new BridgeInterceptor(this.client.getCookieJar()));
        arrayList.add(new CacheInterceptor(this.client.getCache()));
        arrayList.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            x.n0(arrayList, this.client.d0());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        boolean z10 = false;
        try {
            c0 c0VarProceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.getConnectTimeoutMillis(), this.client.getReadTimeoutMillis(), this.client.p0()).proceed(this.originalRequest);
            if (getCanceled()) {
                Util.closeQuietly(c0VarProceed);
                throw new IOException("Canceled");
            }
            noMoreExchanges$okhttp(null);
            return c0VarProceed;
        } catch (IOException e10) {
            try {
                IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e10);
                if (iOExceptionNoMoreExchanges$okhttp == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionNoMoreExchanges$okhttp;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    noMoreExchanges$okhttp(null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (!z10) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
    }

    @d
    public final Exchange initExchange$okhttp(@d RealInterceptorChain chain) throws IOException {
        f0.p(chain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.responseBodyOpen)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.requestBodyOpen)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            b2 b2Var = b2.f124493a;
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        f0.m(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    @Override // okhttp3.e
    /* JADX INFO: renamed from: isCanceled, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.e
    public boolean isExecuted() {
        return this.executed.get();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0033  */
    /* JADX WARN: Code duplicated, block: B:32:0x003f  */
    public final <E extends IOException> E messageDone$okhttp(@d Exchange exchange, boolean requestDone, boolean responseDone, E e10) {
        boolean z10;
        boolean z11;
        boolean z12;
        f0.p(exchange, "exchange");
        boolean z13 = true;
        if (!f0.g(exchange, this.exchange)) {
            return e10;
        }
        synchronized (this) {
            z10 = false;
            if (requestDone) {
                try {
                    if (this.requestBodyOpen) {
                        if (requestDone) {
                            this.requestBodyOpen = false;
                        }
                        if (responseDone) {
                            this.responseBodyOpen = false;
                        }
                        z11 = this.requestBodyOpen;
                        if (z11) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        z10 = z12;
                    } else if (responseDone || !this.responseBodyOpen) {
                        z13 = false;
                    } else {
                        if (requestDone) {
                            this.requestBodyOpen = false;
                        }
                        if (responseDone) {
                            this.responseBodyOpen = false;
                        }
                        z11 = this.requestBodyOpen;
                        if (z11 || this.responseBodyOpen) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z11 || this.responseBodyOpen || this.expectMoreExchanges) {
                            z13 = false;
                        }
                        z10 = z12;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                if (responseDone) {
                }
                z13 = false;
            }
            b2 b2Var = b2.f124493a;
        }
        if (z10) {
            this.exchange = null;
            RealConnection realConnection = this.connection;
            if (realConnection != null) {
                realConnection.incrementSuccessCount$okhttp();
            }
        }
        return z13 ? (E) callDone(e10) : e10;
    }

    @dl.e
    public final IOException noMoreExchanges$okhttp(@dl.e IOException e10) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen) {
                    z10 = true;
                }
            }
            b2 b2Var = b2.f124493a;
        }
        return z10 ? callDone(e10) : e10;
    }

    @d
    public final String redactedUrl$okhttp() {
        return this.originalRequest.q().V();
    }

    @dl.e
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        f0.m(realConnection);
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(realConnection);
            throw new AssertionError(sb2.toString());
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (f0.g(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (!(i10 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        calls.remove(i10);
        this.connection = null;
        if (calls.isEmpty()) {
            realConnection.setIdleAtNs$okhttp(System.nanoTime());
            if (this.connectionPool.connectionBecameIdle(realConnection)) {
                return realConnection.socket();
            }
        }
        return null;
    }

    @Override // okhttp3.e
    @d
    public a0 request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        f0.m(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    public final void setConnectionToCancel(@dl.e RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    @Override // okhttp3.e
    @d
    public AsyncTimeout timeout() {
        return this.timeout;
    }

    public final void timeoutEarlyExit() {
        if (!(!this.timeoutEarlyExit)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.timeoutEarlyExit = true;
        exit();
    }
}
