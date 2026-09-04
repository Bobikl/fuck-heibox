package retrofit2;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* JADX INFO: compiled from: OkHttpCall.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l<T> implements retrofit2.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f138979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f138980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final okhttp3.e.a f138981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f<d0, T> f138982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f138983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    private okhttp3.e f138984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    private Throwable f138985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f138986i;

    /* JADX INFO: compiled from: OkHttpCall.java */
    public class a implements okhttp3.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f138987b;

        a(d dVar) {
            this.f138987b = dVar;
        }

        private void a(Throwable th2) {
            try {
                this.f138987b.a(l.this, th2);
            } catch (Throwable th3) {
                x.s(th3);
                th3.printStackTrace();
            }
        }

        @Override // okhttp3.f
        public void onFailure(okhttp3.e eVar, IOException iOException) {
            a(iOException);
        }

        @Override // okhttp3.f
        public void onResponse(okhttp3.e eVar, c0 c0Var) {
            try {
                try {
                    this.f138987b.b(l.this, l.this.d(c0Var));
                } catch (Throwable th2) {
                    x.s(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                x.s(th3);
                a(th3);
            }
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class b extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d0 f138989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final BufferedSource f138990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        IOException f138991e;

        /* JADX INFO: compiled from: OkHttpCall.java */
        public class a extends ForwardingSource {
            a(Source source) {
                super(source);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j10) throws IOException {
                try {
                    return super.read(buffer, j10);
                } catch (IOException e10) {
                    b.this.f138991e = e10;
                    throw e10;
                }
            }
        }

        b(d0 d0Var) {
            this.f138989c = d0Var;
            this.f138990d = Okio.buffer(new a(d0Var.getBodySource()));
        }

        void a() throws IOException {
            IOException iOException = this.f138991e;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f138989c.close();
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f138989c.getContentLength();
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: contentType */
        public okhttp3.v getF132480d() {
            return this.f138989c.getF132480d();
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: source */
        public BufferedSource getBodySource() {
            return this.f138990d;
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.java */
    public static final class c extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final okhttp3.v f138993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f138994d;

        c(@Nullable okhttp3.v vVar, long j10) {
            this.f138993c = vVar;
            this.f138994d = j10;
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.f138994d;
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: contentType */
        public okhttp3.v getF132480d() {
            return this.f138993c;
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: source */
        public BufferedSource getBodySource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    l(r rVar, Object[] objArr, okhttp3.e.a aVar, f<d0, T> fVar) {
        this.f138979b = rVar;
        this.f138980c = objArr;
        this.f138981d = aVar;
        this.f138982e = fVar;
    }

    private okhttp3.e b() throws IOException {
        okhttp3.e eVarA = this.f138981d.a(this.f138979b.a(this.f138980c));
        if (eVarA != null) {
            return eVarA;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @GuardedBy("this")
    private okhttp3.e c() throws IOException {
        okhttp3.e eVar = this.f138984g;
        if (eVar != null) {
            return eVar;
        }
        Throwable th2 = this.f138985h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            okhttp3.e eVarB = b();
            this.f138984g = eVarB;
            return eVarB;
        } catch (IOException | Error | RuntimeException e10) {
            x.s(e10);
            this.f138985h = e10;
            throw e10;
        }
    }

    @Override // retrofit2.b
    public void N(d<T> dVar) {
        okhttp3.e eVar;
        Throwable th2;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            if (this.f138986i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f138986i = true;
            eVar = this.f138984g;
            th2 = this.f138985h;
            if (eVar == null && th2 == null) {
                try {
                    okhttp3.e eVarB = b();
                    this.f138984g = eVarB;
                    eVar = eVarB;
                } catch (Throwable th3) {
                    th2 = th3;
                    x.s(th2);
                    this.f138985h = th2;
                }
            }
        }
        if (th2 != null) {
            dVar.a(this, th2);
            return;
        }
        if (this.f138983f) {
            eVar.cancel();
        }
        eVar.enqueue(new a(dVar));
    }

    @Override // retrofit2.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public l<T> clone() {
        return new l<>(this.f138979b, this.f138980c, this.f138981d, this.f138982e);
    }

    @Override // retrofit2.b
    public void cancel() {
        okhttp3.e eVar;
        this.f138983f = true;
        synchronized (this) {
            eVar = this.f138984g;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    s<T> d(c0 c0Var) throws IOException {
        d0 d0VarQ = c0Var.q();
        c0 c0VarC = c0Var.P().b(new c(d0VarQ.getF132480d(), d0VarQ.getContentLength())).c();
        int iX = c0VarC.x();
        if (iX < 200 || iX >= 300) {
            try {
                return s.d(x.a(d0VarQ), c0VarC);
            } finally {
                d0VarQ.close();
            }
        }
        if (iX == 204 || iX == 205) {
            d0VarQ.close();
            return s.m(null, c0VarC);
        }
        b bVar = new b(d0VarQ);
        try {
            return s.m(this.f138982e.convert(bVar), c0VarC);
        } catch (RuntimeException e10) {
            bVar.a();
            throw e10;
        }
    }

    @Override // retrofit2.b
    public s<T> execute() throws IOException {
        okhttp3.e eVarC;
        synchronized (this) {
            if (this.f138986i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f138986i = true;
            eVarC = c();
        }
        if (this.f138983f) {
            eVarC.cancel();
        }
        return d(eVarC.execute());
    }

    @Override // retrofit2.b
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f138983f) {
            return true;
        }
        synchronized (this) {
            okhttp3.e eVar = this.f138984g;
            if (eVar == null || !eVar.getCanceled()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // retrofit2.b
    public synchronized boolean isExecuted() {
        return this.f138986i;
    }

    @Override // retrofit2.b
    public synchronized a0 request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return c().request();
    }

    @Override // retrofit2.b
    public synchronized Timeout timeout() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create call.", e10);
        }
        return c().timeout();
    }
}
