package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DecodeJob<R> implements com.bumptech.glide.load.engine.e.a, Runnable, Comparable<DecodeJob<?>>, com.bumptech.glide.util.pool.a.f {
    private static final String H = "DecodeJob";
    private Object A;
    private DataSource B;
    private com.bumptech.glide.load.data.d<?> C;
    private volatile com.bumptech.glide.load.engine.e D;
    private volatile boolean E;
    private volatile boolean F;
    private boolean G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f40905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.core.util.n.a<DecodeJob<?>> f40906f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.d f40909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.load.c f40910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Priority f40911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f40912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f40913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f40914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private h f40915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.bumptech.glide.load.f f40916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b<R> f40917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f40918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Stage f40919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private RunReason f40920t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f40921u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f40922v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f40923w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Thread f40924x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.bumptech.glide.load.c f40925y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.bumptech.glide.load.c f40926z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.f<R> f40902b = new com.bumptech.glide.load.engine.f<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Throwable> f40903c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f40904d = com.bumptech.glide.util.pool.c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d<?> f40907g = new d<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f40908h = new f();

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f40928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f40929c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f40929c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40929c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f40928b = iArr2;
            try {
                iArr2[Stage.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40928b[Stage.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40928b[Stage.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40928b[Stage.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40928b[Stage.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f40927a = iArr3;
            try {
                iArr3[RunReason.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40927a[RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40927a[RunReason.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface b<R> {
        void b(GlideException glideException);

        void c(s<R> sVar, DataSource dataSource, boolean z10);

        void d(DecodeJob<?> decodeJob);
    }

    public final class c<Z> implements g.a<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DataSource f40930a;

        c(DataSource dataSource) {
            this.f40930a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.g.a
        @n0
        public s<Z> a(@n0 s<Z> sVar) {
            return DecodeJob.this.x(this.f40930a, sVar);
        }
    }

    public static class d<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.bumptech.glide.load.c f40932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bumptech.glide.load.h<Z> f40933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private r<Z> f40934c;

        d() {
        }

        void a() {
            this.f40932a = null;
            this.f40933b = null;
            this.f40934c = null;
        }

        void b(e eVar, com.bumptech.glide.load.f fVar) {
            com.bumptech.glide.util.pool.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f40932a, new com.bumptech.glide.load.engine.d(this.f40933b, this.f40934c, fVar));
            } finally {
                this.f40934c.g();
                com.bumptech.glide.util.pool.b.f();
            }
        }

        boolean c() {
            return this.f40934c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(com.bumptech.glide.load.c cVar, com.bumptech.glide.load.h<X> hVar, r<X> rVar) {
            this.f40932a = cVar;
            this.f40933b = hVar;
            this.f40934c = rVar;
        }
    }

    public interface e {
        com.bumptech.glide.load.engine.cache.a a();
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f40935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f40936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f40937c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f40937c || z10 || this.f40936b) && this.f40935a;
        }

        synchronized boolean b() {
            this.f40936b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f40937c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f40935a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f40936b = false;
            this.f40935a = false;
            this.f40937c = false;
        }
    }

    DecodeJob(e eVar, androidx.core.util.n.a<DecodeJob<?>> aVar) {
        this.f40905e = eVar;
        this.f40906f = aVar;
    }

    private void A(RunReason runReason) {
        this.f40920t = runReason;
        this.f40917q.d(this);
    }

    private void C() {
        this.f40924x = Thread.currentThread();
        this.f40921u = com.bumptech.glide.util.i.b();
        boolean zA = false;
        while (!this.F && this.D != null && !(zA = this.D.a())) {
            this.f40919s = k(this.f40919s);
            this.D = j();
            if (this.f40919s == Stage.SOURCE) {
                A(RunReason.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f40919s == Stage.FINISHED || this.F) && !zA) {
            s();
        }
    }

    private <Data, ResourceType> s<R> I(Data data, DataSource dataSource, q<Data, ResourceType, R> qVar) throws GlideException {
        com.bumptech.glide.load.f fVarL = l(dataSource);
        com.bumptech.glide.load.data.e<Data> eVarL = this.f40909i.i().l(data);
        try {
            return qVar.b(eVarL, fVarL, this.f40913m, this.f40914n, new c(dataSource));
        } finally {
            eVarL.b();
        }
    }

    private void J() {
        int i10 = a.f40927a[this.f40920t.ordinal()];
        if (i10 == 1) {
            this.f40919s = k(Stage.INITIALIZE);
            this.D = j();
            C();
        } else if (i10 == 2) {
            C();
        } else {
            if (i10 == 3) {
                i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f40920t);
        }
    }

    private void K() {
        Throwable th2;
        this.f40904d.c();
        if (!this.E) {
            this.E = true;
            return;
        }
        if (this.f40903c.isEmpty()) {
            th2 = null;
        } else {
            List<Throwable> list = this.f40903c;
            th2 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private <Data> s<R> g(com.bumptech.glide.load.data.d<?> dVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = com.bumptech.glide.util.i.b();
            s<R> sVarH = h(data, dataSource);
            if (Log.isLoggable(H, 2)) {
                o("Decoded result " + sVarH, jB);
            }
            return sVarH;
        } finally {
            dVar.b();
        }
    }

    private <Data> s<R> h(Data data, DataSource dataSource) throws GlideException {
        return I(data, dataSource, this.f40902b.h(data.getClass()));
    }

    private void i() {
        if (Log.isLoggable(H, 2)) {
            p("Retrieved data", this.f40921u, "data: " + this.A + ", cache key: " + this.f40925y + ", fetcher: " + this.C);
        }
        s<R> sVarG = null;
        try {
            sVarG = g(this.C, this.A, this.B);
        } catch (GlideException e10) {
            e10.j(this.f40926z, this.B);
            this.f40903c.add(e10);
        }
        if (sVarG != null) {
            r(sVarG, this.B, this.G);
        } else {
            C();
        }
    }

    private com.bumptech.glide.load.engine.e j() {
        int i10 = a.f40928b[this.f40919s.ordinal()];
        if (i10 == 1) {
            return new t(this.f40902b, this);
        }
        if (i10 == 2) {
            return new com.bumptech.glide.load.engine.b(this.f40902b, this);
        }
        if (i10 == 3) {
            return new w(this.f40902b, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f40919s);
    }

    private Stage k(Stage stage) {
        int i10 = a.f40928b[stage.ordinal()];
        if (i10 == 1) {
            return this.f40915o.a() ? Stage.DATA_CACHE : k(Stage.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f40922v ? Stage.FINISHED : Stage.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return Stage.FINISHED;
        }
        if (i10 == 5) {
            return this.f40915o.b() ? Stage.RESOURCE_CACHE : k(Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    @n0
    private com.bumptech.glide.load.f l(DataSource dataSource) {
        com.bumptech.glide.load.f fVar = this.f40916p;
        if (Build.VERSION.SDK_INT < 26) {
            return fVar;
        }
        boolean z10 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f40902b.x();
        com.bumptech.glide.load.e<Boolean> eVar = com.bumptech.glide.load.resource.bitmap.o.f41576k;
        Boolean bool = (Boolean) fVar.c(eVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return fVar;
        }
        com.bumptech.glide.load.f fVar2 = new com.bumptech.glide.load.f();
        fVar2.d(this.f40916p);
        fVar2.f(eVar, Boolean.valueOf(z10));
        return fVar2;
    }

    private int m() {
        return this.f40911k.ordinal();
    }

    private void o(String str, long j10) {
        p(str, j10, null);
    }

    private void p(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(com.bumptech.glide.util.i.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f40912l);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v(H, sb2.toString());
    }

    private void q(s<R> sVar, DataSource dataSource, boolean z10) {
        K();
        this.f40917q.c(sVar, dataSource, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r(s<R> sVar, DataSource dataSource, boolean z10) {
        com.bumptech.glide.util.pool.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (sVar instanceof o) {
                ((o) sVar).initialize();
            }
            r rVar = 0;
            if (this.f40907g.c()) {
                sVar = r.d(sVar);
                rVar = sVar;
            }
            q(sVar, dataSource, z10);
            this.f40919s = Stage.ENCODE;
            try {
                if (this.f40907g.c()) {
                    this.f40907g.b(this.f40905e, this.f40916p);
                }
                if (rVar != 0) {
                    rVar.g();
                }
                t();
                com.bumptech.glide.util.pool.b.f();
            } catch (Throwable th2) {
                if (rVar != 0) {
                    rVar.g();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            com.bumptech.glide.util.pool.b.f();
            throw th3;
        }
    }

    private void s() {
        K();
        this.f40917q.b(new GlideException("Failed to load resource", new ArrayList(this.f40903c)));
        w();
    }

    private void t() {
        if (this.f40908h.b()) {
            z();
        }
    }

    private void w() {
        if (this.f40908h.c()) {
            z();
        }
    }

    private void z() {
        this.f40908h.e();
        this.f40907g.a();
        this.f40902b.a();
        this.E = false;
        this.f40909i = null;
        this.f40910j = null;
        this.f40916p = null;
        this.f40911k = null;
        this.f40912l = null;
        this.f40917q = null;
        this.f40919s = null;
        this.D = null;
        this.f40924x = null;
        this.f40925y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.f40921u = 0L;
        this.F = false;
        this.f40923w = null;
        this.f40903c.clear();
        this.f40906f.b(this);
    }

    boolean L() {
        Stage stageK = k(Stage.INITIALIZE);
        return stageK == Stage.RESOURCE_CACHE || stageK == Stage.DATA_CACHE;
    }

    public void a() {
        this.F = true;
        com.bumptech.glide.load.engine.e eVar = this.D;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void b(com.bumptech.glide.load.c cVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.k(cVar, dataSource, dVar.a());
        this.f40903c.add(glideException);
        if (Thread.currentThread() != this.f40924x) {
            A(RunReason.SWITCH_TO_SOURCE_SERVICE);
        } else {
            C();
        }
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void c() {
        A(RunReason.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // com.bumptech.glide.load.engine.e.a
    public void d(com.bumptech.glide.load.c cVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, com.bumptech.glide.load.c cVar2) {
        this.f40925y = cVar;
        this.A = obj;
        this.C = dVar;
        this.B = dataSource;
        this.f40926z = cVar2;
        this.G = cVar != this.f40902b.c().get(0);
        if (Thread.currentThread() != this.f40924x) {
            A(RunReason.DECODE_DATA);
            return;
        }
        com.bumptech.glide.util.pool.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            i();
        } finally {
            com.bumptech.glide.util.pool.b.f();
        }
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @n0
    public com.bumptech.glide.util.pool.c e() {
        return this.f40904d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(@n0 DecodeJob<?> decodeJob) {
        int iM = m() - decodeJob.m();
        return iM == 0 ? this.f40918r - decodeJob.f40918r : iM;
    }

    DecodeJob<R> n(com.bumptech.glide.d dVar, Object obj, l lVar, com.bumptech.glide.load.c cVar, int i10, int i11, Class<?> cls, Class<R> cls2, Priority priority, h hVar, Map<Class<?>, com.bumptech.glide.load.i<?>> map, boolean z10, boolean z11, boolean z12, com.bumptech.glide.load.f fVar, b<R> bVar, int i12) {
        this.f40902b.v(dVar, obj, cVar, i10, i11, hVar, cls, cls2, priority, fVar, map, z10, z11, this.f40905e);
        this.f40909i = dVar;
        this.f40910j = cVar;
        this.f40911k = priority;
        this.f40912l = lVar;
        this.f40913m = i10;
        this.f40914n = i11;
        this.f40915o = hVar;
        this.f40922v = z12;
        this.f40916p = fVar;
        this.f40917q = bVar;
        this.f40918r = i12;
        this.f40920t = RunReason.INITIALIZE;
        this.f40923w = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.util.pool.b.d("DecodeJob#run(reason=%s, model=%s)", this.f40920t, this.f40923w);
        com.bumptech.glide.load.data.d<?> dVar = this.C;
        try {
            try {
                try {
                    if (this.F) {
                        s();
                        if (dVar != null) {
                            dVar.b();
                        }
                        com.bumptech.glide.util.pool.b.f();
                        return;
                    }
                    J();
                    if (dVar != null) {
                        dVar.b();
                    }
                    com.bumptech.glide.util.pool.b.f();
                } catch (CallbackException e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                if (Log.isLoggable(H, 3)) {
                    Log.d(H, "DecodeJob threw unexpectedly, isCancelled: " + this.F + ", stage: " + this.f40919s, th2);
                }
                if (this.f40919s != Stage.ENCODE) {
                    this.f40903c.add(th2);
                    s();
                }
                if (!this.F) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.b();
            }
            com.bumptech.glide.util.pool.b.f();
            throw th3;
        }
    }

    @n0
    <Z> s<Z> x(DataSource dataSource, @n0 s<Z> sVar) {
        s<Z> sVarA;
        com.bumptech.glide.load.i<Z> iVar;
        EncodeStrategy encodeStrategyB;
        com.bumptech.glide.load.c cVar;
        Class<?> cls = sVar.get().getClass();
        com.bumptech.glide.load.h<Z> hVarN = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.i<Z> iVarS = this.f40902b.s(cls);
            iVar = iVarS;
            sVarA = iVarS.a(this.f40909i, sVar, this.f40913m, this.f40914n);
        } else {
            sVarA = sVar;
            iVar = null;
        }
        if (!sVar.equals(sVarA)) {
            sVar.recycle();
        }
        if (this.f40902b.w(sVarA)) {
            hVarN = this.f40902b.n(sVarA);
            encodeStrategyB = hVarN.b(this.f40916p);
        } else {
            encodeStrategyB = EncodeStrategy.NONE;
        }
        com.bumptech.glide.load.h hVar = hVarN;
        if (!this.f40915o.d(!this.f40902b.y(this.f40925y), dataSource, encodeStrategyB)) {
            return sVarA;
        }
        if (hVar == null) {
            throw new Registry.NoResultEncoderAvailableException(sVarA.get().getClass());
        }
        int i10 = a.f40929c[encodeStrategyB.ordinal()];
        if (i10 == 1) {
            cVar = new com.bumptech.glide.load.engine.c(this.f40925y, this.f40910j);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyB);
            }
            cVar = new u(this.f40902b.b(), this.f40925y, this.f40910j, this.f40913m, this.f40914n, iVar, cls, this.f40916p);
        }
        r rVarD = r.d(sVarA);
        this.f40907g.d(cVar, hVar, rVarD);
        return rVarD;
    }

    void y(boolean z10) {
        if (this.f40908h.d(z10)) {
            z();
        }
    }
}
