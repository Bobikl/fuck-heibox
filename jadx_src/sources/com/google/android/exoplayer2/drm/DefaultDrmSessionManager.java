package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.w0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.b3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public class DefaultDrmSessionManager implements u {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;
    public static final int E = 3;
    public static final long F = 300000;
    private static final String G = "DefaultDrmSessionMgr";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f44609z = "PRCustomData";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UUID f44610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0.g f44611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m0 f44612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, String> f44613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f44614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f44615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f44616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f44617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g0 f44618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h f44619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f44620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<DefaultDrmSession> f44621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<f> f44622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set<DefaultDrmSession> f44623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f44624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private b0 f44625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private DefaultDrmSession f44626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private DefaultDrmSession f44627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Looper f44628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Handler f44629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f44630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    private byte[] f44631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    volatile d f44632y;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 29);
            sb2.append("Media does not support uuid: ");
            sb2.append(strValueOf);
            super(sb2.toString());
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f44636d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f44638f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f44633a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f44634b = com.google.android.exoplayer2.j.X1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b0.g f44635c = j0.f44716k;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.g0 f44639g = new com.google.android.exoplayer2.upstream.y();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f44637e = new int[0];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f44640h = 300000;

        public DefaultDrmSessionManager a(m0 m0Var) {
            return new DefaultDrmSessionManager(this.f44634b, this.f44635c, m0Var, this.f44633a, this.f44636d, this.f44637e, this.f44638f, this.f44639g, this.f44640h);
        }

        public b b(@androidx.annotation.p0 Map<String, String> map) {
            this.f44633a.clear();
            if (map != null) {
                this.f44633a.putAll(map);
            }
            return this;
        }

        public b c(com.google.android.exoplayer2.upstream.g0 g0Var) {
            this.f44639g = (com.google.android.exoplayer2.upstream.g0) com.google.android.exoplayer2.util.a.g(g0Var);
            return this;
        }

        public b d(boolean z10) {
            this.f44636d = z10;
            return this;
        }

        public b e(boolean z10) {
            this.f44638f = z10;
            return this;
        }

        public b f(long j10) {
            com.google.android.exoplayer2.util.a.a(j10 > 0 || j10 == com.google.android.exoplayer2.j.f46377b);
            this.f44640h = j10;
            return this;
        }

        public b g(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                com.google.android.exoplayer2.util.a.a(z10);
            }
            this.f44637e = (int[]) iArr.clone();
            return this;
        }

        public b h(UUID uuid, b0.g gVar) {
            this.f44634b = (UUID) com.google.android.exoplayer2.util.a.g(uuid);
            this.f44635c = (b0.g) com.google.android.exoplayer2.util.a.g(gVar);
            return this;
        }
    }

    public class c implements b0.d {
        private c() {
        }

        @Override // com.google.android.exoplayer2.drm.b0.d
        public void a(b0 b0Var, @androidx.annotation.p0 byte[] bArr, int i10, int i11, @androidx.annotation.p0 byte[] bArr2) {
            ((d) com.google.android.exoplayer2.util.a.g(DefaultDrmSessionManager.this.f44632y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f44621n) {
                if (defaultDrmSession.i(bArr)) {
                    defaultDrmSession.z(message.what);
                    return;
                }
            }
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public class f implements u.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private final s.a f44643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private DrmSession f44644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f44645d;

        public f(s.a aVar) {
            this.f44643b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(a2 a2Var) {
            if (DefaultDrmSessionManager.this.f44624q == 0 || this.f44645d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            this.f44644c = defaultDrmSessionManager.r((Looper) com.google.android.exoplayer2.util.a.g(defaultDrmSessionManager.f44628u), this.f44643b, a2Var, false);
            DefaultDrmSessionManager.this.f44622o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            if (this.f44645d) {
                return;
            }
            DrmSession drmSession = this.f44644c;
            if (drmSession != null) {
                drmSession.r(this.f44643b);
            }
            DefaultDrmSessionManager.this.f44622o.remove(this);
            this.f44645d = true;
        }

        public void c(final a2 a2Var) {
            ((Handler) com.google.android.exoplayer2.util.a.g(DefaultDrmSessionManager.this.f44629v)).post(new Runnable() { // from class: com.google.android.exoplayer2.drm.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44705b.d(a2Var);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.u.b
        public void release() {
            u0.e1((Handler) com.google.android.exoplayer2.util.a.g(DefaultDrmSessionManager.this.f44629v), new Runnable() { // from class: com.google.android.exoplayer2.drm.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44704b.e();
                }
            });
        }
    }

    public class g implements DefaultDrmSession.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<DefaultDrmSession> f44647a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private DefaultDrmSession f44648b;

        public g(DefaultDrmSessionManager defaultDrmSessionManager) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z10) {
            this.f44648b = null;
            ImmutableList immutableListV = ImmutableList.v(this.f44647a);
            this.f44647a.clear();
            b3 it = immutableListV.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).B(exc, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void b(DefaultDrmSession defaultDrmSession) {
            this.f44647a.add(defaultDrmSession);
            if (this.f44648b != null) {
                return;
            }
            this.f44648b = defaultDrmSession;
            defaultDrmSession.F();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void c() {
            this.f44648b = null;
            ImmutableList immutableListV = ImmutableList.v(this.f44647a);
            this.f44647a.clear();
            b3 it = immutableListV.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).A();
            }
        }

        public void d(DefaultDrmSession defaultDrmSession) {
            this.f44647a.remove(defaultDrmSession);
            if (this.f44648b == defaultDrmSession) {
                this.f44648b = null;
                if (this.f44647a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f44647a.iterator().next();
                this.f44648b = next;
                next.F();
            }
        }
    }

    public class h implements DefaultDrmSession.b {
        private h() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void a(final DefaultDrmSession defaultDrmSession, int i10) {
            if (i10 == 1 && DefaultDrmSessionManager.this.f44624q > 0 && DefaultDrmSessionManager.this.f44620m != com.google.android.exoplayer2.j.f46377b) {
                DefaultDrmSessionManager.this.f44623p.add(defaultDrmSession);
                ((Handler) com.google.android.exoplayer2.util.a.g(DefaultDrmSessionManager.this.f44629v)).postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.r(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f44620m);
            } else if (i10 == 0) {
                DefaultDrmSessionManager.this.f44621n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f44626s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f44626s = null;
                }
                if (DefaultDrmSessionManager.this.f44627t == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f44627t = null;
                }
                DefaultDrmSessionManager.this.f44617j.d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f44620m != com.google.android.exoplayer2.j.f46377b) {
                    ((Handler) com.google.android.exoplayer2.util.a.g(DefaultDrmSessionManager.this.f44629v)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f44623p.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.A();
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void b(DefaultDrmSession defaultDrmSession, int i10) {
            if (DefaultDrmSessionManager.this.f44620m != com.google.android.exoplayer2.j.f46377b) {
                DefaultDrmSessionManager.this.f44623p.remove(defaultDrmSession);
                ((Handler) com.google.android.exoplayer2.util.a.g(DefaultDrmSessionManager.this.f44629v)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    private DefaultDrmSessionManager(UUID uuid, b0.g gVar, m0 m0Var, HashMap<String, String> map, boolean z10, int[] iArr, boolean z11, com.google.android.exoplayer2.upstream.g0 g0Var, long j10) {
        com.google.android.exoplayer2.util.a.g(uuid);
        com.google.android.exoplayer2.util.a.b(!com.google.android.exoplayer2.j.V1.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f44610c = uuid;
        this.f44611d = gVar;
        this.f44612e = m0Var;
        this.f44613f = map;
        this.f44614g = z10;
        this.f44615h = iArr;
        this.f44616i = z11;
        this.f44618k = g0Var;
        this.f44617j = new g(this);
        this.f44619l = new h();
        this.f44630w = 0;
        this.f44621n = new ArrayList();
        this.f44622o = Sets.z();
        this.f44623p = Sets.z();
        this.f44620m = j10;
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, b0 b0Var, m0 m0Var, @androidx.annotation.p0 HashMap<String, String> map) {
        this(uuid, b0Var, m0Var, map == null ? new HashMap<>() : map, false, 3);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, b0 b0Var, m0 m0Var, @androidx.annotation.p0 HashMap<String, String> map, boolean z10) {
        this(uuid, b0Var, m0Var, map == null ? new HashMap<>() : map, z10, 3);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, b0 b0Var, m0 m0Var, @androidx.annotation.p0 HashMap<String, String> map, boolean z10, int i10) {
        this(uuid, new b0.a(b0Var), m0Var, map == null ? new HashMap<>() : map, z10, new int[0], false, new com.google.android.exoplayer2.upstream.y(i10), 300000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.f44625r != null && this.f44624q == 0 && this.f44621n.isEmpty() && this.f44622o.isEmpty()) {
            ((b0) com.google.android.exoplayer2.util.a.g(this.f44625r)).release();
            this.f44625r = null;
        }
    }

    private void B() {
        b3 it = ImmutableSet.w(this.f44623p).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).r(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void C() {
        b3 it = ImmutableSet.w(this.f44622o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    private void E(DrmSession drmSession, @androidx.annotation.p0 s.a aVar) {
        drmSession.r(aVar);
        if (this.f44620m != com.google.android.exoplayer2.j.f46377b) {
            drmSession.r(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @androidx.annotation.p0
    public DrmSession r(Looper looper, @androidx.annotation.p0 s.a aVar, a2 a2Var, boolean z10) {
        List<DrmInitData.SchemeData> listW;
        z(looper);
        DrmInitData drmInitData = a2Var.f43596p;
        if (drmInitData == null) {
            return y(com.google.android.exoplayer2.util.y.l(a2Var.f43593m), z10);
        }
        DefaultDrmSession defaultDrmSessionV = null;
        Object[] objArr = 0;
        if (this.f44631x == null) {
            listW = w((DrmInitData) com.google.android.exoplayer2.util.a.g(drmInitData), this.f44610c, false);
            if (listW.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f44610c);
                com.google.android.exoplayer2.util.u.e(G, "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new a0(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listW = null;
        }
        if (this.f44614g) {
            for (DefaultDrmSession defaultDrmSession : this.f44621n) {
                if (u0.c(defaultDrmSession.f44580f, listW)) {
                    defaultDrmSessionV = defaultDrmSession;
                    break;
                }
            }
        } else {
            defaultDrmSessionV = this.f44627t;
        }
        if (defaultDrmSessionV == null) {
            defaultDrmSessionV = v(listW, false, aVar, z10);
            if (!this.f44614g) {
                this.f44627t = defaultDrmSessionV;
            }
            this.f44621n.add(defaultDrmSessionV);
        } else {
            defaultDrmSessionV.v(aVar);
        }
        return defaultDrmSessionV;
    }

    private static boolean s(DrmSession drmSession) {
        return drmSession.getState() == 1 && (u0.f51536a < 19 || (((DrmSession.DrmSessionException) com.google.android.exoplayer2.util.a.g(drmSession.q())).getCause() instanceof ResourceBusyException));
    }

    private boolean t(DrmInitData drmInitData) {
        if (this.f44631x != null) {
            return true;
        }
        if (w(drmInitData, this.f44610c, true).isEmpty()) {
            if (drmInitData.f44653e != 1 || !drmInitData.f(0).d(com.google.android.exoplayer2.j.V1)) {
                return false;
            }
            String strValueOf = String.valueOf(this.f44610c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 72);
            sb2.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb2.append(strValueOf);
            com.google.android.exoplayer2.util.u.m(G, sb2.toString());
        }
        String str = drmInitData.f44652d;
        if (str == null || com.google.android.exoplayer2.j.Q1.equals(str)) {
            return true;
        }
        if (com.google.android.exoplayer2.j.T1.equals(str)) {
            return u0.f51536a >= 25;
        }
        return (com.google.android.exoplayer2.j.R1.equals(str) || com.google.android.exoplayer2.j.S1.equals(str)) ? false : true;
    }

    private DefaultDrmSession u(@androidx.annotation.p0 List<DrmInitData.SchemeData> list, boolean z10, @androidx.annotation.p0 s.a aVar) {
        com.google.android.exoplayer2.util.a.g(this.f44625r);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f44610c, this.f44625r, this.f44617j, this.f44619l, list, this.f44630w, this.f44616i | z10, z10, this.f44631x, this.f44613f, this.f44612e, (Looper) com.google.android.exoplayer2.util.a.g(this.f44628u), this.f44618k);
        defaultDrmSession.v(aVar);
        if (this.f44620m != com.google.android.exoplayer2.j.f46377b) {
            defaultDrmSession.v(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession v(@androidx.annotation.p0 List<DrmInitData.SchemeData> list, boolean z10, @androidx.annotation.p0 s.a aVar, boolean z11) {
        DefaultDrmSession defaultDrmSessionU = u(list, z10, aVar);
        if (s(defaultDrmSessionU) && !this.f44623p.isEmpty()) {
            B();
            E(defaultDrmSessionU, aVar);
            defaultDrmSessionU = u(list, z10, aVar);
        }
        if (!s(defaultDrmSessionU) || !z11 || this.f44622o.isEmpty()) {
            return defaultDrmSessionU;
        }
        C();
        if (!this.f44623p.isEmpty()) {
            B();
        }
        E(defaultDrmSessionU, aVar);
        return u(list, z10, aVar);
    }

    private static List<DrmInitData.SchemeData> w(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f44653e);
        for (int i10 = 0; i10 < drmInitData.f44653e; i10++) {
            DrmInitData.SchemeData schemeDataF = drmInitData.f(i10);
            if ((schemeDataF.d(uuid) || (com.google.android.exoplayer2.j.W1.equals(uuid) && schemeDataF.d(com.google.android.exoplayer2.j.V1))) && (schemeDataF.f44658f != null || z10)) {
                arrayList.add(schemeDataF);
            }
        }
        return arrayList;
    }

    @mk.d({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void x(Looper looper) {
        Looper looper2 = this.f44628u;
        if (looper2 == null) {
            this.f44628u = looper;
            this.f44629v = new Handler(looper);
        } else {
            com.google.android.exoplayer2.util.a.i(looper2 == looper);
            com.google.android.exoplayer2.util.a.g(this.f44629v);
        }
    }

    @androidx.annotation.p0
    private DrmSession y(int i10, boolean z10) {
        b0 b0Var = (b0) com.google.android.exoplayer2.util.a.g(this.f44625r);
        if ((b0Var.f() == 2 && c0.f44694d) || u0.N0(this.f44615h, i10) == -1 || b0Var.f() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f44626s;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionV = v(ImmutableList.B(), true, null, z10);
            this.f44621n.add(defaultDrmSessionV);
            this.f44626s = defaultDrmSessionV;
        } else {
            defaultDrmSession.v(null);
        }
        return this.f44626s;
    }

    private void z(Looper looper) {
        if (this.f44632y == null) {
            this.f44632y = new d(looper);
        }
    }

    public void D(int i10, @androidx.annotation.p0 byte[] bArr) {
        com.google.android.exoplayer2.util.a.i(this.f44621n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            com.google.android.exoplayer2.util.a.g(bArr);
        }
        this.f44630w = i10;
        this.f44631x = bArr;
    }

    @Override // com.google.android.exoplayer2.drm.u
    @androidx.annotation.p0
    public DrmSession a(Looper looper, @androidx.annotation.p0 s.a aVar, a2 a2Var) {
        com.google.android.exoplayer2.util.a.i(this.f44624q > 0);
        x(looper);
        return r(looper, aVar, a2Var, true);
    }

    @Override // com.google.android.exoplayer2.drm.u
    public int b(a2 a2Var) {
        int iF = ((b0) com.google.android.exoplayer2.util.a.g(this.f44625r)).f();
        DrmInitData drmInitData = a2Var.f43596p;
        if (drmInitData != null) {
            if (t(drmInitData)) {
                return iF;
            }
            return 1;
        }
        if (u0.N0(this.f44615h, com.google.android.exoplayer2.util.y.l(a2Var.f43593m)) != -1) {
            return iF;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.drm.u
    public u.b c(Looper looper, @androidx.annotation.p0 s.a aVar, a2 a2Var) {
        com.google.android.exoplayer2.util.a.i(this.f44624q > 0);
        x(looper);
        f fVar = new f(aVar);
        fVar.c(a2Var);
        return fVar;
    }

    @Override // com.google.android.exoplayer2.drm.u
    public final void prepare() {
        int i10 = this.f44624q;
        this.f44624q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f44625r == null) {
            b0 b0VarA = this.f44611d.a(this.f44610c);
            this.f44625r = b0VarA;
            b0VarA.b(new c());
        } else if (this.f44620m != com.google.android.exoplayer2.j.f46377b) {
            for (int i11 = 0; i11 < this.f44621n.size(); i11++) {
                this.f44621n.get(i11).v(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.u
    public final void release() {
        int i10 = this.f44624q - 1;
        this.f44624q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f44620m != com.google.android.exoplayer2.j.f46377b) {
            ArrayList arrayList = new ArrayList(this.f44621n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).r(null);
            }
        }
        C();
        A();
    }
}
