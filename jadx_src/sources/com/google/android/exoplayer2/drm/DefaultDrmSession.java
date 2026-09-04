package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public class DefaultDrmSession implements DrmSession {
    private static final String C = "DefaultDrmSession";
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 60;

    @androidx.annotation.p0
    private b0.b A;

    @androidx.annotation.p0
    private b0.h B;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final List<DrmInitData.SchemeData> f44580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b0 f44581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f44582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f44583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f44584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f44585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f44586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final HashMap<String, String> f44587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.j<s.a> f44588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g0 f44589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final m0 f44590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final UUID f44591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final e f44592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f44593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f44594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    private HandlerThread f44595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private c f44596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.decoder.c f44597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    private DrmSession.DrmSessionException f44598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    private byte[] f44599y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte[] f44600z;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@androidx.annotation.p0 Throwable th2) {
            super(th2);
        }
    }

    public interface a {
        void a(Exception exc, boolean z10);

        void b(DefaultDrmSession defaultDrmSession);

        void c();
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i10);

        void b(DefaultDrmSession defaultDrmSession, int i10);
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private boolean f44601a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f44604b) {
                return false;
            }
            int i10 = dVar.f44607e + 1;
            dVar.f44607e = i10;
            if (i10 > DefaultDrmSession.this.f44589o.d(3)) {
                return false;
            }
            long jA = DefaultDrmSession.this.f44589o.a(new com.google.android.exoplayer2.upstream.g0.d(new com.google.android.exoplayer2.source.u(dVar.f44603a, mediaDrmCallbackException.f44665b, mediaDrmCallbackException.f44666c, mediaDrmCallbackException.f44667d, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f44605c, mediaDrmCallbackException.f44668e), new com.google.android.exoplayer2.source.y(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.f44607e));
            if (jA == com.google.android.exoplayer2.j.f46377b) {
                return false;
            }
            synchronized (this) {
                if (this.f44601a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jA);
                return true;
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(com.google.android.exoplayer2.source.u.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f44601a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objB = defaultDrmSession.f44590p.b(defaultDrmSession.f44591q, (b0.h) dVar.f44606d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    objB = defaultDrmSession2.f44590p.a(defaultDrmSession2.f44591q, (b0.b) dVar.f44606d);
                }
            } catch (MediaDrmCallbackException e10) {
                boolean zA = a(message, e10);
                objB = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                com.google.android.exoplayer2.util.u.n(DefaultDrmSession.C, "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objB = e11;
            }
            DefaultDrmSession.this.f44589o.c(dVar.f44603a);
            synchronized (this) {
                if (!this.f44601a) {
                    DefaultDrmSession.this.f44592r.obtainMessage(message.what, Pair.create(dVar.f44606d, objB)).sendToTarget();
                }
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f44603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f44604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f44605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f44606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44607e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f44603a = j10;
            this.f44604b = z10;
            this.f44605c = j11;
            this.f44606d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                DefaultDrmSession.this.C(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                DefaultDrmSession.this.n(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, b0 b0Var, a aVar, b bVar, @androidx.annotation.p0 List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, @androidx.annotation.p0 byte[] bArr, HashMap<String, String> map, m0 m0Var, Looper looper, com.google.android.exoplayer2.upstream.g0 g0Var) {
        if (i10 == 1 || i10 == 3) {
            com.google.android.exoplayer2.util.a.g(bArr);
        }
        this.f44591q = uuid;
        this.f44582h = aVar;
        this.f44583i = bVar;
        this.f44581g = b0Var;
        this.f44584j = i10;
        this.f44585k = z10;
        this.f44586l = z11;
        if (bArr != null) {
            this.f44600z = bArr;
            this.f44580f = null;
        } else {
            this.f44580f = Collections.unmodifiableList((List) com.google.android.exoplayer2.util.a.g(list));
        }
        this.f44587m = map;
        this.f44590p = m0Var;
        this.f44588n = new com.google.android.exoplayer2.util.j<>();
        this.f44589o = g0Var;
        this.f44593s = 2;
        this.f44592r = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Object obj, Object obj2) {
        if (obj == this.B) {
            if (this.f44593s == 2 || j()) {
                this.B = null;
                if (obj2 instanceof Exception) {
                    this.f44582h.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f44581g.provideProvisionResponse((byte[]) obj2);
                    this.f44582h.c();
                } catch (Exception e10) {
                    this.f44582h.a(e10, true);
                }
            }
        }
    }

    @mk.e(expression = {"sessionId"}, result = true)
    private boolean D() {
        if (j()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.f44581g.openSession();
            this.f44599y = bArrOpenSession;
            this.f44597w = this.f44581g.g(bArrOpenSession);
            final int i10 = 3;
            this.f44593s = 3;
            f(new com.google.android.exoplayer2.util.i() { // from class: com.google.android.exoplayer2.drm.d
                @Override // com.google.android.exoplayer2.util.i
                public final void accept(Object obj) {
                    ((s.a) obj).k(i10);
                }
            });
            com.google.android.exoplayer2.util.a.g(this.f44599y);
            return true;
        } catch (NotProvisionedException unused) {
            this.f44582h.b(this);
            return false;
        } catch (Exception e10) {
            m(e10, 1);
            return false;
        }
    }

    private void E(byte[] bArr, int i10, boolean z10) {
        try {
            this.A = this.f44581g.j(bArr, this.f44580f, i10, this.f44587m);
            ((c) u0.k(this.f44596v)).b(1, com.google.android.exoplayer2.util.a.g(this.A), z10);
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    @mk.m({"sessionId", "offlineLicenseKeySetId"})
    private boolean G() {
        try {
            this.f44581g.restoreKeys(this.f44599y, this.f44600z);
            return true;
        } catch (Exception e10) {
            m(e10, 1);
            return false;
        }
    }

    private void f(com.google.android.exoplayer2.util.i<s.a> iVar) {
        Iterator<s.a> it = this.f44588n.c().iterator();
        while (it.hasNext()) {
            iVar.accept(it.next());
        }
    }

    @mk.m({"sessionId"})
    private void g(boolean z10) {
        if (this.f44586l) {
            return;
        }
        byte[] bArr = (byte[]) u0.k(this.f44599y);
        int i10 = this.f44584j;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f44600z == null || G()) {
                    E(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            com.google.android.exoplayer2.util.a.g(this.f44600z);
            com.google.android.exoplayer2.util.a.g(this.f44599y);
            E(this.f44600z, 3, z10);
            return;
        }
        if (this.f44600z == null) {
            E(bArr, 1, z10);
            return;
        }
        if (this.f44593s == 4 || G()) {
            long jH = h();
            if (this.f44584j != 0 || jH > 60) {
                if (jH <= 0) {
                    m(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f44593s = 4;
                    f(new com.google.android.exoplayer2.util.i() { // from class: com.google.android.exoplayer2.drm.f
                        @Override // com.google.android.exoplayer2.util.i
                        public final void accept(Object obj) {
                            ((s.a) obj).j();
                        }
                    });
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder(88);
            sb2.append("Offline license has expired or will expire soon. Remaining seconds: ");
            sb2.append(jH);
            com.google.android.exoplayer2.util.u.b(C, sb2.toString());
            E(bArr, 2, z10);
        }
    }

    private long h() {
        if (!com.google.android.exoplayer2.j.X1.equals(this.f44591q)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) com.google.android.exoplayer2.util.a.g(o0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @mk.e(expression = {"sessionId"}, result = true)
    private boolean j() {
        int i10 = this.f44593s;
        return i10 == 3 || i10 == 4;
    }

    private void m(final Exception exc, int i10) {
        this.f44598x = new DrmSession.DrmSessionException(exc, y.a(exc, i10));
        com.google.android.exoplayer2.util.u.e(C, "DRM session error", exc);
        f(new com.google.android.exoplayer2.util.i() { // from class: com.google.android.exoplayer2.drm.e
            @Override // com.google.android.exoplayer2.util.i
            public final void accept(Object obj) {
                ((s.a) obj).l(exc);
            }
        });
        if (this.f44593s != 4) {
            this.f44593s = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Object obj, Object obj2) {
        if (obj == this.A && j()) {
            this.A = null;
            if (obj2 instanceof Exception) {
                o((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f44584j == 3) {
                    this.f44581g.provideKeyResponse((byte[]) u0.k(this.f44600z), bArr);
                    f(new com.google.android.exoplayer2.util.i() { // from class: com.google.android.exoplayer2.drm.b
                        @Override // com.google.android.exoplayer2.util.i
                        public final void accept(Object obj3) {
                            ((s.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrProvideKeyResponse = this.f44581g.provideKeyResponse(this.f44599y, bArr);
                int i10 = this.f44584j;
                if ((i10 == 2 || (i10 == 0 && this.f44600z != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f44600z = bArrProvideKeyResponse;
                }
                this.f44593s = 4;
                f(new com.google.android.exoplayer2.util.i() { // from class: com.google.android.exoplayer2.drm.c
                    @Override // com.google.android.exoplayer2.util.i
                    public final void accept(Object obj3) {
                        ((s.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                o(e10, true);
            }
        }
    }

    private void o(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f44582h.b(this);
        } else {
            m(exc, z10 ? 1 : 2);
        }
    }

    private void p() {
        if (this.f44584j == 0 && this.f44593s == 4) {
            u0.k(this.f44599y);
            g(false);
        }
    }

    public void A() {
        if (D()) {
            g(true);
        }
    }

    public void B(Exception exc, boolean z10) {
        m(exc, z10 ? 1 : 3);
    }

    public void F() {
        this.B = this.f44581g.getProvisionRequest();
        ((c) u0.k(this.f44596v)).b(0, com.google.android.exoplayer2.util.a.g(this.B), true);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f44593s;
    }

    public boolean i(byte[] bArr) {
        return Arrays.equals(this.f44599y, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.p0
    public final DrmSession.DrmSessionException q() {
        if (this.f44593s == 1) {
            return this.f44598x;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void r(@androidx.annotation.p0 s.a aVar) {
        int i10 = this.f44594t;
        if (i10 <= 0) {
            com.google.android.exoplayer2.util.u.d(C, "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f44594t = i11;
        if (i11 == 0) {
            this.f44593s = 0;
            ((e) u0.k(this.f44592r)).removeCallbacksAndMessages(null);
            ((c) u0.k(this.f44596v)).c();
            this.f44596v = null;
            ((HandlerThread) u0.k(this.f44595u)).quit();
            this.f44595u = null;
            this.f44597w = null;
            this.f44598x = null;
            this.A = null;
            this.B = null;
            byte[] bArr = this.f44599y;
            if (bArr != null) {
                this.f44581g.closeSession(bArr);
                this.f44599y = null;
            }
        }
        if (aVar != null) {
            this.f44588n.b(aVar);
            if (this.f44588n.E1(aVar) == 0) {
                aVar.m();
            }
        }
        this.f44583i.a(this, this.f44594t);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean s() {
        return this.f44585k;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.p0
    public final com.google.android.exoplayer2.decoder.c t() {
        return this.f44597w;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.p0
    public Map<String, String> u() {
        byte[] bArr = this.f44599y;
        if (bArr == null) {
            return null;
        }
        return this.f44581g.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void v(@androidx.annotation.p0 s.a aVar) {
        int i10 = this.f44594t;
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Session reference count less than zero: ");
            sb2.append(i10);
            com.google.android.exoplayer2.util.u.d(C, sb2.toString());
            this.f44594t = 0;
        }
        if (aVar != null) {
            this.f44588n.a(aVar);
        }
        int i11 = this.f44594t + 1;
        this.f44594t = i11;
        if (i11 == 1) {
            com.google.android.exoplayer2.util.a.i(this.f44593s == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f44595u = handlerThread;
            handlerThread.start();
            this.f44596v = new c(this.f44595u.getLooper());
            if (D()) {
                g(true);
            }
        } else if (aVar != null && j() && this.f44588n.E1(aVar) == 1) {
            aVar.k(this.f44593s);
        }
        this.f44583i.b(this, this.f44594t);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID w() {
        return this.f44591q;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.p0
    public byte[] x() {
        return this.f44600z;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean y(String str) {
        return this.f44581g.h((byte[]) com.google.android.exoplayer2.util.a.k(this.f44599y), str);
    }

    public void z(int i10) {
        if (i10 != 2) {
            return;
        }
        p();
    }
}
