package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o3;
import com.google.android.exoplayer2.q3;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.upstream.u0;
import com.google.android.exoplayer2.z3;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class DownloadHelper {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.exoplayer2.trackselection.f.d f47061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.exoplayer2.trackselection.f.d f47062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.exoplayer2.trackselection.f.d f47063q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2.h f47064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final com.google.android.exoplayer2.source.f0 f47065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.trackselection.f f47066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3[] f47067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseIntArray f47068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f47069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z3.d f47070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f47071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f47072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f47073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p1[] f47074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.android.exoplayer2.trackselection.l.a[] f47075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<com.google.android.exoplayer2.trackselection.j>[][] f47076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<com.google.android.exoplayer2.trackselection.j>[][] f47077n;

    public static class LiveContentUnsupportedException extends IOException {
    }

    public class a implements com.google.android.exoplayer2.video.y {
        a() {
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void I(int i10, long j10) {
            com.google.android.exoplayer2.video.n.a(this, i10, j10);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void P(long j10, int i10) {
            com.google.android.exoplayer2.video.n.h(this, j10, i10);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void S(String str, long j10, long j11) {
            com.google.android.exoplayer2.video.n.d(this, str, j10, j11);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void Z(a2 a2Var) {
            com.google.android.exoplayer2.video.n.i(this, a2Var);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void a0(a2 a2Var, com.google.android.exoplayer2.decoder.i iVar) {
            com.google.android.exoplayer2.video.n.j(this, a2Var, iVar);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void c0(Exception exc) {
            com.google.android.exoplayer2.video.n.c(this, exc);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void e0(com.google.android.exoplayer2.decoder.g gVar) {
            com.google.android.exoplayer2.video.n.f(this, gVar);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void g(com.google.android.exoplayer2.video.a0 a0Var) {
            com.google.android.exoplayer2.video.n.k(this, a0Var);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void m0(Object obj, long j10) {
            com.google.android.exoplayer2.video.n.b(this, obj, j10);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void n0(com.google.android.exoplayer2.decoder.g gVar) {
            com.google.android.exoplayer2.video.n.g(this, gVar);
        }

        @Override // com.google.android.exoplayer2.video.y
        public /* synthetic */ void z(String str) {
            com.google.android.exoplayer2.video.n.e(this, str);
        }
    }

    public class b implements com.google.android.exoplayer2.audio.t {
        b() {
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void D(String str) {
            com.google.android.exoplayer2.audio.i.c(this, str);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void E(String str, long j10, long j11) {
            com.google.android.exoplayer2.audio.i.b(this, str, j10, j11);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void J(a2 a2Var, com.google.android.exoplayer2.decoder.i iVar) {
            com.google.android.exoplayer2.audio.i.g(this, a2Var, iVar);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void M(Exception exc) {
            com.google.android.exoplayer2.audio.i.a(this, exc);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void R(com.google.android.exoplayer2.decoder.g gVar) {
            com.google.android.exoplayer2.audio.i.e(this, gVar);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void a(boolean z10) {
            com.google.android.exoplayer2.audio.i.k(this, z10);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void b0(long j10) {
            com.google.android.exoplayer2.audio.i.h(this, j10);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void i0(com.google.android.exoplayer2.decoder.g gVar) {
            com.google.android.exoplayer2.audio.i.d(this, gVar);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void o0(a2 a2Var) {
            com.google.android.exoplayer2.audio.i.f(this, a2Var);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void s(Exception exc) {
            com.google.android.exoplayer2.audio.i.i(this, exc);
        }

        @Override // com.google.android.exoplayer2.audio.t
        public /* synthetic */ void s0(int i10, long j10, long j11) {
            com.google.android.exoplayer2.audio.i.j(this, i10, j10, j11);
        }
    }

    public interface c {
        void a(DownloadHelper downloadHelper);

        void b(DownloadHelper downloadHelper, IOException iOException);
    }

    public static final class d extends com.google.android.exoplayer2.trackselection.c {

        public static final class a implements com.google.android.exoplayer2.trackselection.j.b {
            private a() {
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            @Override // com.google.android.exoplayer2.trackselection.j.b
            public com.google.android.exoplayer2.trackselection.j[] a(com.google.android.exoplayer2.trackselection.j.a[] aVarArr, com.google.android.exoplayer2.upstream.e eVar, com.google.android.exoplayer2.source.f0.a aVar, z3 z3Var) {
                com.google.android.exoplayer2.trackselection.j[] jVarArr = new com.google.android.exoplayer2.trackselection.j[aVarArr.length];
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    com.google.android.exoplayer2.trackselection.j.a aVar2 = aVarArr[i10];
                    jVarArr[i10] = aVar2 == null ? null : new d(aVar2.f50102a, aVar2.f50103b);
                }
                return jVarArr;
            }
        }

        public d(n1 n1Var, int[] iArr) {
            super(n1Var, iArr);
        }

        @Override // com.google.android.exoplayer2.trackselection.j
        public int a() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.j
        public void k(long j10, long j11, long j12, List<? extends com.google.android.exoplayer2.source.chunk.n> list, com.google.android.exoplayer2.source.chunk.o[] oVarArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.j
        @p0
        public Object r() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.j
        public int u() {
            return 0;
        }
    }

    public static final class e implements com.google.android.exoplayer2.upstream.e {
        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.upstream.e
        public /* synthetic */ long a() {
            return com.google.android.exoplayer2.upstream.c.a(this);
        }

        @Override // com.google.android.exoplayer2.upstream.e
        public long c() {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.upstream.e
        public void e(Handler handler, com.google.android.exoplayer2.upstream.e.a aVar) {
        }

        @Override // com.google.android.exoplayer2.upstream.e
        @p0
        public u0 g() {
            return null;
        }

        @Override // com.google.android.exoplayer2.upstream.e
        public void h(com.google.android.exoplayer2.upstream.e.a aVar) {
        }
    }

    public static final class f implements com.google.android.exoplayer2.source.f0.b, com.google.android.exoplayer2.source.c0.a, Handler.Callback {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f47078l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f47079m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f47080n = 2;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f47081o = 3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f47082p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f47083q = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.f0 f47084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final DownloadHelper f47085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.google.android.exoplayer2.upstream.b f47086d = new com.google.android.exoplayer2.upstream.s(true, 65536);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ArrayList<com.google.android.exoplayer2.source.c0> f47087e = new ArrayList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Handler f47088f = com.google.android.exoplayer2.util.u0.B(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.n
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f47248b.b(message);
            }
        });

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final HandlerThread f47089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Handler f47090h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public z3 f47091i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public com.google.android.exoplayer2.source.c0[] f47092j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f47093k;

        public f(com.google.android.exoplayer2.source.f0 f0Var, DownloadHelper downloadHelper) {
            this.f47084b = f0Var;
            this.f47085c = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.f47089g = handlerThread;
            handlerThread.start();
            Handler handlerX = com.google.android.exoplayer2.util.u0.x(handlerThread.getLooper(), this);
            this.f47090h = handlerX;
            handlerX.sendEmptyMessage(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(Message message) {
            if (this.f47093k) {
                return false;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.f47085c.V();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            f();
            this.f47085c.U((IOException) com.google.android.exoplayer2.util.u0.k(message.obj));
            return true;
        }

        @Override // com.google.android.exoplayer2.source.e1.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void n(com.google.android.exoplayer2.source.c0 c0Var) {
            if (this.f47087e.contains(c0Var)) {
                this.f47090h.obtainMessage(2, c0Var).sendToTarget();
            }
        }

        @Override // com.google.android.exoplayer2.source.f0.b
        public void e(com.google.android.exoplayer2.source.f0 f0Var, z3 z3Var) {
            com.google.android.exoplayer2.source.c0[] c0VarArr;
            if (this.f47091i != null) {
                return;
            }
            if (z3Var.u(0, new z3.d()).l()) {
                this.f47088f.obtainMessage(1, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.f47091i = z3Var;
            this.f47092j = new com.google.android.exoplayer2.source.c0[z3Var.n()];
            int i10 = 0;
            while (true) {
                c0VarArr = this.f47092j;
                if (i10 >= c0VarArr.length) {
                    break;
                }
                com.google.android.exoplayer2.source.c0 c0VarH = this.f47084b.h(new com.google.android.exoplayer2.source.f0.a(z3Var.t(i10)), this.f47086d, 0L);
                this.f47092j[i10] = c0VarH;
                this.f47087e.add(c0VarH);
                i10++;
            }
            for (com.google.android.exoplayer2.source.c0 c0Var : c0VarArr) {
                c0Var.r(this, 0L);
            }
        }

        public void f() {
            if (this.f47093k) {
                return;
            }
            this.f47093k = true;
            this.f47090h.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f47084b.d(this, null);
                this.f47090h.sendEmptyMessage(1);
                return true;
            }
            int i11 = 0;
            if (i10 == 1) {
                try {
                    if (this.f47092j == null) {
                        this.f47084b.f();
                    } else {
                        while (i11 < this.f47087e.size()) {
                            this.f47087e.get(i11).u();
                            i11++;
                        }
                    }
                    this.f47090h.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e10) {
                    this.f47088f.obtainMessage(1, e10).sendToTarget();
                }
                return true;
            }
            if (i10 == 2) {
                com.google.android.exoplayer2.source.c0 c0Var = (com.google.android.exoplayer2.source.c0) message.obj;
                if (this.f47087e.contains(c0Var)) {
                    c0Var.d(0L);
                }
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            com.google.android.exoplayer2.source.c0[] c0VarArr = this.f47092j;
            if (c0VarArr != null) {
                int length = c0VarArr.length;
                while (i11 < length) {
                    this.f47084b.k(c0VarArr[i11]);
                    i11++;
                }
            }
            this.f47084b.a(this);
            this.f47090h.removeCallbacksAndMessages(null);
            this.f47089g.quit();
            return true;
        }

        @Override // com.google.android.exoplayer2.source.c0.a
        public void q(com.google.android.exoplayer2.source.c0 c0Var) {
            this.f47087e.remove(c0Var);
            if (this.f47087e.isEmpty()) {
                this.f47090h.removeMessages(1);
                this.f47088f.sendEmptyMessage(0);
            }
        }
    }

    static {
        com.google.android.exoplayer2.trackselection.f.d dVarY = com.google.android.exoplayer2.trackselection.f.d.L3.d().F(true).y();
        f47061o = dVarY;
        f47062p = dVarY;
        f47063q = dVarY;
    }

    public DownloadHelper(i2 i2Var, @p0 com.google.android.exoplayer2.source.f0 f0Var, com.google.android.exoplayer2.trackselection.f.d dVar, o3[] o3VarArr) {
        this.f47064a = (i2.h) com.google.android.exoplayer2.util.a.g(i2Var.f46269c);
        this.f47065b = f0Var;
        a aVar = null;
        com.google.android.exoplayer2.trackselection.f fVar = new com.google.android.exoplayer2.trackselection.f(dVar, new d.a(aVar));
        this.f47066c = fVar;
        this.f47067d = o3VarArr;
        this.f47068e = new SparseIntArray();
        fVar.c(new com.google.android.exoplayer2.trackselection.w.a() { // from class: com.google.android.exoplayer2.offline.h
            @Override // com.google.android.exoplayer2.trackselection.w.a
            public final void a() {
                DownloadHelper.Q();
            }
        }, new e(aVar));
        this.f47069f = com.google.android.exoplayer2.util.u0.A();
        this.f47070g = new z3.d();
    }

    @Deprecated
    public static DownloadHelper A(Context context, Uri uri, @p0 String str) {
        return v(context, new i2.c().K(uri).l(str).a());
    }

    @Deprecated
    public static DownloadHelper B(Context context, Uri uri, com.google.android.exoplayer2.upstream.o.a aVar, q3 q3Var) {
        return D(uri, aVar, q3Var, null, E(context));
    }

    @Deprecated
    public static DownloadHelper C(Uri uri, com.google.android.exoplayer2.upstream.o.a aVar, q3 q3Var) {
        return D(uri, aVar, q3Var, null, f47061o);
    }

    @Deprecated
    public static DownloadHelper D(Uri uri, com.google.android.exoplayer2.upstream.o.a aVar, q3 q3Var, @p0 com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.trackselection.f.d dVar) {
        return y(new i2.c().K(uri).F(com.google.android.exoplayer2.util.y.f51589o0).a(), dVar, q3Var, aVar, uVar);
    }

    public static com.google.android.exoplayer2.trackselection.f.d E(Context context) {
        return com.google.android.exoplayer2.trackselection.f.d.p(context).d().F(true).y();
    }

    public static o3[] K(q3 q3Var) {
        m3[] m3VarArrA = q3Var.a(com.google.android.exoplayer2.util.u0.A(), new a(), new b(), new com.google.android.exoplayer2.text.m() { // from class: com.google.android.exoplayer2.offline.j
            @Override // com.google.android.exoplayer2.text.m
            public final void t(List list) {
                DownloadHelper.O(list);
            }
        }, new com.google.android.exoplayer2.metadata.e() { // from class: com.google.android.exoplayer2.offline.k
            @Override // com.google.android.exoplayer2.metadata.e
            public final void q(Metadata metadata) {
                DownloadHelper.P(metadata);
            }
        });
        o3[] o3VarArr = new o3[m3VarArrA.length];
        for (int i10 = 0; i10 < m3VarArrA.length; i10++) {
            o3VarArr[i10] = m3VarArrA[i10].r();
        }
        return o3VarArr;
    }

    private static boolean N(i2.h hVar) {
        return com.google.android.exoplayer2.util.u0.D0(hVar.f46345a, hVar.f46346b) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(Metadata metadata) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(IOException iOException) {
        ((c) com.google.android.exoplayer2.util.a.g(this.f47072i)).b(this, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        ((c) com.google.android.exoplayer2.util.a.g(this.f47072i)).a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(c cVar) {
        cVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(final IOException iOException) {
        ((Handler) com.google.android.exoplayer2.util.a.g(this.f47069f)).post(new Runnable() { // from class: com.google.android.exoplayer2.offline.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f47243b.R(iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        com.google.android.exoplayer2.util.a.g(this.f47073j);
        com.google.android.exoplayer2.util.a.g(this.f47073j.f47092j);
        com.google.android.exoplayer2.util.a.g(this.f47073j.f47091i);
        int length = this.f47073j.f47092j.length;
        int length2 = this.f47067d.length;
        this.f47076m = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        this.f47077n = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < length2; i11++) {
                this.f47076m[i10][i11] = new ArrayList();
                this.f47077n[i10][i11] = Collections.unmodifiableList(this.f47076m[i10][i11]);
            }
        }
        this.f47074k = new p1[length];
        this.f47075l = new com.google.android.exoplayer2.trackselection.l.a[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.f47074k[i12] = this.f47073j.f47092j[i12].o();
            this.f47066c.f(Z(i12).f50194e);
            this.f47075l[i12] = (com.google.android.exoplayer2.trackselection.l.a) com.google.android.exoplayer2.util.a.g(this.f47066c.k());
        }
        a0();
        ((Handler) com.google.android.exoplayer2.util.a.g(this.f47069f)).post(new Runnable() { // from class: com.google.android.exoplayer2.offline.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f47245b.S();
            }
        });
    }

    @mk.m({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private com.google.android.exoplayer2.trackselection.x Z(int i10) {
        boolean z10;
        try {
            com.google.android.exoplayer2.trackselection.x xVarG = this.f47066c.g(this.f47067d, this.f47074k[i10], new com.google.android.exoplayer2.source.f0.a(this.f47073j.f47091i.t(i10)), this.f47073j.f47091i);
            for (int i11 = 0; i11 < xVarG.f50190a; i11++) {
                com.google.android.exoplayer2.trackselection.j jVar = xVarG.f50192c[i11];
                if (jVar != null) {
                    List<com.google.android.exoplayer2.trackselection.j> list = this.f47076m[i10][i11];
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        com.google.android.exoplayer2.trackselection.j jVar2 = list.get(i12);
                        if (jVar2.h() == jVar.h()) {
                            this.f47068e.clear();
                            for (int i13 = 0; i13 < jVar2.length(); i13++) {
                                this.f47068e.put(jVar2.e(i13), 0);
                            }
                            for (int i14 = 0; i14 < jVar.length(); i14++) {
                                this.f47068e.put(jVar.e(i14), 0);
                            }
                            int[] iArr = new int[this.f47068e.size()];
                            for (int i15 = 0; i15 < this.f47068e.size(); i15++) {
                                iArr[i15] = this.f47068e.keyAt(i15);
                            }
                            list.set(i12, new d(jVar2.h(), iArr));
                            z10 = true;
                            break;
                        }
                        i12++;
                    }
                    if (!z10) {
                        list.add(jVar);
                    }
                }
            }
            return xVarG;
        } catch (ExoPlaybackException e10) {
            throw new UnsupportedOperationException(e10);
        }
    }

    @mk.m({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void a0() {
        this.f47071h = true;
    }

    @mk.d({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void m() {
        com.google.android.exoplayer2.util.a.i(this.f47071h);
    }

    public static com.google.android.exoplayer2.source.f0 o(DownloadRequest downloadRequest, com.google.android.exoplayer2.upstream.o.a aVar) {
        return p(downloadRequest, aVar, null);
    }

    public static com.google.android.exoplayer2.source.f0 p(DownloadRequest downloadRequest, com.google.android.exoplayer2.upstream.o.a aVar, @p0 com.google.android.exoplayer2.drm.u uVar) {
        return q(downloadRequest.d(), aVar, uVar);
    }

    private static com.google.android.exoplayer2.source.f0 q(i2 i2Var, com.google.android.exoplayer2.upstream.o.a aVar, @p0 com.google.android.exoplayer2.drm.u uVar) {
        return new com.google.android.exoplayer2.source.l(aVar, com.google.android.exoplayer2.extractor.q.f45683a).i(uVar).g(i2Var);
    }

    @Deprecated
    public static DownloadHelper r(Context context, Uri uri, com.google.android.exoplayer2.upstream.o.a aVar, q3 q3Var) {
        return s(uri, aVar, q3Var, null, E(context));
    }

    @Deprecated
    public static DownloadHelper s(Uri uri, com.google.android.exoplayer2.upstream.o.a aVar, q3 q3Var, @p0 com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.trackselection.f.d dVar) {
        return y(new i2.c().K(uri).F(com.google.android.exoplayer2.util.y.f51585m0).a(), dVar, q3Var, aVar, uVar);
    }

    @Deprecated
    public static DownloadHelper t(Context context, Uri uri, com.google.android.exoplayer2.upstream.o.a aVar, q3 q3Var) {
        return u(uri, aVar, q3Var, null, E(context));
    }

    @Deprecated
    public static DownloadHelper u(Uri uri, com.google.android.exoplayer2.upstream.o.a aVar, q3 q3Var, @p0 com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.trackselection.f.d dVar) {
        return y(new i2.c().K(uri).F(com.google.android.exoplayer2.util.y.f51587n0).a(), dVar, q3Var, aVar, uVar);
    }

    public static DownloadHelper v(Context context, i2 i2Var) {
        com.google.android.exoplayer2.util.a.a(N((i2.h) com.google.android.exoplayer2.util.a.g(i2Var.f46269c)));
        return y(i2Var, E(context), null, null, null);
    }

    public static DownloadHelper w(Context context, i2 i2Var, @p0 q3 q3Var, @p0 com.google.android.exoplayer2.upstream.o.a aVar) {
        return y(i2Var, E(context), q3Var, aVar, null);
    }

    public static DownloadHelper x(i2 i2Var, com.google.android.exoplayer2.trackselection.f.d dVar, @p0 q3 q3Var, @p0 com.google.android.exoplayer2.upstream.o.a aVar) {
        return y(i2Var, dVar, q3Var, aVar, null);
    }

    public static DownloadHelper y(i2 i2Var, com.google.android.exoplayer2.trackselection.f.d dVar, @p0 q3 q3Var, @p0 com.google.android.exoplayer2.upstream.o.a aVar, @p0 com.google.android.exoplayer2.drm.u uVar) {
        boolean zN = N((i2.h) com.google.android.exoplayer2.util.a.g(i2Var.f46269c));
        com.google.android.exoplayer2.util.a.a(zN || aVar != null);
        return new DownloadHelper(i2Var, zN ? null : q(i2Var, (com.google.android.exoplayer2.upstream.o.a) com.google.android.exoplayer2.util.u0.k(aVar), uVar), dVar, q3Var != null ? K(q3Var) : new o3[0]);
    }

    @Deprecated
    public static DownloadHelper z(Context context, Uri uri) {
        return v(context, new i2.c().K(uri).a());
    }

    public DownloadRequest F(String str, @p0 byte[] bArr) {
        DownloadRequest.b bVarE = new DownloadRequest.b(str, this.f47064a.f46345a).e(this.f47064a.f46346b);
        i2.f fVar = this.f47064a.f46347c;
        DownloadRequest.b bVarC = bVarE.d(fVar != null ? fVar.c() : null).b(this.f47064a.f46350f).c(bArr);
        if (this.f47065b == null) {
            return bVarC.a();
        }
        m();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.f47076m.length;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList2.clear();
            int length2 = this.f47076m[i10].length;
            for (int i11 = 0; i11 < length2; i11++) {
                arrayList2.addAll(this.f47076m[i10][i11]);
            }
            arrayList.addAll(this.f47073j.f47092j[i10].i(arrayList2));
        }
        return bVarC.f(arrayList).a();
    }

    public DownloadRequest G(@p0 byte[] bArr) {
        return F(this.f47064a.f46345a.toString(), bArr);
    }

    @p0
    public Object H() {
        if (this.f47065b == null) {
            return null;
        }
        m();
        if (this.f47073j.f47091i.w() > 0) {
            return this.f47073j.f47091i.u(0, this.f47070g).f52115e;
        }
        return null;
    }

    public com.google.android.exoplayer2.trackselection.l.a I(int i10) {
        m();
        return this.f47075l[i10];
    }

    public int J() {
        if (this.f47065b == null) {
            return 0;
        }
        m();
        return this.f47074k.length;
    }

    public p1 L(int i10) {
        m();
        return this.f47074k[i10];
    }

    public List<com.google.android.exoplayer2.trackselection.j> M(int i10, int i11) {
        m();
        return this.f47077n[i10][i11];
    }

    public void W(final c cVar) {
        com.google.android.exoplayer2.util.a.i(this.f47072i == null);
        this.f47072i = cVar;
        com.google.android.exoplayer2.source.f0 f0Var = this.f47065b;
        if (f0Var != null) {
            this.f47073j = new f(f0Var, this);
        } else {
            this.f47069f.post(new Runnable() { // from class: com.google.android.exoplayer2.offline.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47246b.T(cVar);
                }
            });
        }
    }

    public void X() {
        f fVar = this.f47073j;
        if (fVar != null) {
            fVar.f();
        }
    }

    public void Y(int i10, com.google.android.exoplayer2.trackselection.f.d dVar) {
        n(i10);
        k(i10, dVar);
    }

    public void i(String... strArr) {
        m();
        for (int i10 = 0; i10 < this.f47075l.length; i10++) {
            com.google.android.exoplayer2.trackselection.f.e eVarD = f47061o.d();
            com.google.android.exoplayer2.trackselection.l.a aVar = this.f47075l[i10];
            int iC = aVar.c();
            for (int i11 = 0; i11 < iC; i11++) {
                if (aVar.f(i11) != 1) {
                    eVarD.k1(i11, true);
                }
            }
            for (String str : strArr) {
                eVarD.Q(str);
                k(i10, eVarD.y());
            }
        }
    }

    public void j(boolean z10, String... strArr) {
        m();
        for (int i10 = 0; i10 < this.f47075l.length; i10++) {
            com.google.android.exoplayer2.trackselection.f.e eVarD = f47061o.d();
            com.google.android.exoplayer2.trackselection.l.a aVar = this.f47075l[i10];
            int iC = aVar.c();
            for (int i11 = 0; i11 < iC; i11++) {
                if (aVar.f(i11) != 3) {
                    eVarD.k1(i11, true);
                }
            }
            eVarD.c0(z10);
            for (String str : strArr) {
                eVarD.V(str);
                k(i10, eVarD.y());
            }
        }
    }

    public void k(int i10, com.google.android.exoplayer2.trackselection.f.d dVar) {
        m();
        this.f47066c.h(dVar);
        Z(i10);
    }

    public void l(int i10, int i11, com.google.android.exoplayer2.trackselection.f.d dVar, List<com.google.android.exoplayer2.trackselection.f.C0399f> list) {
        m();
        com.google.android.exoplayer2.trackselection.f.e eVarD = dVar.d();
        int i12 = 0;
        while (i12 < this.f47075l[i10].c()) {
            eVarD.k1(i12, i12 != i11);
            i12++;
        }
        if (list.isEmpty()) {
            k(i10, eVarD.y());
            return;
        }
        p1 p1VarG = this.f47075l[i10].g(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            eVarD.m1(i11, p1VarG, list.get(i13));
            k(i10, eVarD.y());
        }
    }

    public void n(int i10) {
        m();
        for (int i11 = 0; i11 < this.f47067d.length; i11++) {
            this.f47076m[i10][i11].clear();
        }
    }
}
