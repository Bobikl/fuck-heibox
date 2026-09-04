package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.l1;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: RtspClient.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f48863s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f48864t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f48865u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f48866v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f48867w = "RtspClient";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f48868x = 30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f48869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f48870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f48871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f48872e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f48876i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private c0.a f48878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private String f48879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private b f48880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private m f48881n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f48883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f48884q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<s.d> f48873f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<f0> f48874g = new SparseArray<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f48875h = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private y f48877j = new y(new c());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f48885r = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f48882o = -1;

    /* JADX INFO: compiled from: RtspClient.java */
    public final class b implements Runnable, Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f48886b = u0.y();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f48887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f48888d;

        public b(long j10) {
            this.f48887c = j10;
        }

        public void a() {
            if (this.f48888d) {
                return;
            }
            this.f48888d = true;
            this.f48886b.postDelayed(this, this.f48887c);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f48888d = false;
            this.f48886b.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f48875h.e(n.this.f48876i, n.this.f48879l);
            this.f48886b.postDelayed(this, this.f48887c);
        }
    }

    /* JADX INFO: compiled from: RtspClient.java */
    public final class c implements y.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f48890a = u0.y();

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void h(List<String> list) {
            n.this.W(list);
            if (c0.d(list)) {
                g(list);
            } else {
                f(list);
            }
        }

        private void f(List<String> list) {
            n.this.f48875h.d(Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(c0.j(list).f48726c.e(q.f48918o))));
        }

        private void g(List<String> list) {
            g0 g0VarK = c0.k(list);
            int i10 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(g0VarK.f48742b.e(q.f48918o)));
            f0 f0Var = (f0) n.this.f48874g.get(i10);
            if (f0Var == null) {
                return;
            }
            n.this.f48874g.remove(i10);
            int i11 = f0Var.f48725b;
            try {
                int i12 = g0VarK.f48741a;
                if (i12 == 200) {
                    switch (i11) {
                        case 1:
                        case 3:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                            return;
                        case 2:
                            i(new p(i12, l0.b(g0VarK.f48743c)));
                            return;
                        case 4:
                            j(new d0(i12, c0.i(g0VarK.f48742b.e(q.f48924u))));
                            return;
                        case 5:
                            k();
                            return;
                        case 6:
                            String strE = g0VarK.f48742b.e("Range");
                            h0 h0VarD = strE == null ? h0.f48770c : h0.d(strE);
                            String strE2 = g0VarK.f48742b.e(q.f48926w);
                            l(new e0(g0VarK.f48741a, h0VarD, strE2 == null ? ImmutableList.B() : j0.a(strE2, n.this.f48876i)));
                            return;
                        case 10:
                            String strE3 = g0VarK.f48742b.e(q.f48929z);
                            String strE4 = g0VarK.f48742b.e(q.D);
                            if (strE3 == null || strE4 == null) {
                                throw ParserException.c("Missing mandatory session or transport header", null);
                            }
                            m(new i0(g0VarK.f48741a, c0.l(strE3), strE4));
                            return;
                        default:
                            throw new IllegalStateException();
                    }
                }
                if (i12 != 401) {
                    if (i12 == 301 || i12 == 302) {
                        if (n.this.f48882o != -1) {
                            n.this.f48882o = 0;
                        }
                        String strE5 = g0VarK.f48742b.e("Location");
                        if (strE5 == null) {
                            n.this.f48869b.a("Redirection without new location.", null);
                            return;
                        }
                        Uri uri = Uri.parse(strE5);
                        n.this.f48876i = c0.o(uri);
                        n.this.f48878k = c0.m(uri);
                        n.this.f48875h.c(n.this.f48876i, n.this.f48879l);
                        return;
                    }
                } else if (n.this.f48878k != null && !n.this.f48884q) {
                    String strE6 = g0VarK.f48742b.e("WWW-Authenticate");
                    if (strE6 == null) {
                        throw ParserException.c("Missing WWW-Authenticate header in a 401 response.", null);
                    }
                    n.this.f48881n = c0.n(strE6);
                    n.this.f48875h.b();
                    n.this.f48884q = true;
                    return;
                }
                n nVar = n.this;
                String strS = c0.s(i11);
                int i13 = g0VarK.f48741a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(strS).length() + 12);
                sb2.append(strS);
                sb2.append(" ");
                sb2.append(i13);
                nVar.R(new RtspMediaSource.RtspPlaybackException(sb2.toString()));
            } catch (ParserException e10) {
                n.this.R(new RtspMediaSource.RtspPlaybackException(e10));
            }
        }

        private void i(p pVar) {
            h0 h0VarD = h0.f48770c;
            String str = pVar.f48903b.f48806a.get(k0.f48802q);
            if (str != null) {
                try {
                    h0VarD = h0.d(str);
                } catch (ParserException e10) {
                    n.this.f48869b.a("SDP format error.", e10);
                    return;
                }
            }
            ImmutableList<x> immutableListP = n.P(pVar.f48903b, n.this.f48876i);
            if (immutableListP.isEmpty()) {
                n.this.f48869b.a("No playable track.", null);
            } else {
                n.this.f48869b.g(h0VarD, immutableListP);
                n.this.f48883p = true;
            }
        }

        private void j(d0 d0Var) {
            if (n.this.f48880m != null) {
                return;
            }
            if (n.c0(d0Var.f48694b)) {
                n.this.f48875h.c(n.this.f48876i, n.this.f48879l);
            } else {
                n.this.f48869b.a("DESCRIBE not supported.", null);
            }
        }

        private void k() {
            com.google.android.exoplayer2.util.a.i(n.this.f48882o == 2);
            n.this.f48882o = 1;
            if (n.this.f48885r != com.google.android.exoplayer2.j.f46377b) {
                n nVar = n.this;
                nVar.g0(u0.B1(nVar.f48885r));
            }
        }

        private void l(e0 e0Var) {
            com.google.android.exoplayer2.util.a.i(n.this.f48882o == 1);
            n.this.f48882o = 2;
            if (n.this.f48880m == null) {
                n nVar = n.this;
                nVar.f48880m = nVar.new b(30000L);
                n.this.f48880m.a();
            }
            n.this.f48870c.e(u0.U0(e0Var.f48699b.f48774a), e0Var.f48700c);
            n.this.f48885r = com.google.android.exoplayer2.j.f46377b;
        }

        private void m(i0 i0Var) {
            com.google.android.exoplayer2.util.a.i(n.this.f48882o != -1);
            n.this.f48882o = 1;
            n.this.f48879l = i0Var.f48777b.f48691a;
            n.this.Q();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.y.d
        public /* synthetic */ void a(List list, Exception exc) {
            z.b(this, list, exc);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.y.d
        public void b(final List<String> list) {
            this.f48890a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48897b.h(list);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.y.d
        public /* synthetic */ void c(Exception exc) {
            z.a(this, exc);
        }
    }

    /* JADX INFO: compiled from: RtspClient.java */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f48892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f0 f48893b;

        private d() {
        }

        private f0 a(int i10, @androidx.annotation.p0 String str, Map<String, String> map, Uri uri) {
            String str2 = n.this.f48871d;
            int i11 = this.f48892a;
            this.f48892a = i11 + 1;
            q.b bVar = new q.b(str2, str, i11);
            if (n.this.f48881n != null) {
                com.google.android.exoplayer2.util.a.k(n.this.f48878k);
                try {
                    bVar.b("Authorization", n.this.f48881n.a(n.this.f48878k, uri, i10));
                } catch (ParserException e10) {
                    n.this.R(new RtspMediaSource.RtspPlaybackException(e10));
                }
            }
            bVar.d(map);
            return new f0(uri, i10, bVar.e(), "");
        }

        private void h(f0 f0Var) {
            int i10 = Integer.parseInt((String) com.google.android.exoplayer2.util.a.g(f0Var.f48726c.e(q.f48918o)));
            com.google.android.exoplayer2.util.a.i(n.this.f48874g.get(i10) == null);
            n.this.f48874g.append(i10, f0Var);
            ImmutableList<String> immutableListP = c0.p(f0Var);
            n.this.W(immutableListP);
            n.this.f48877j.f(immutableListP);
            this.f48893b = f0Var;
        }

        private void i(g0 g0Var) {
            ImmutableList<String> immutableListQ = c0.q(g0Var);
            n.this.W(immutableListQ);
            n.this.f48877j.f(immutableListQ);
        }

        public void b() {
            com.google.android.exoplayer2.util.a.k(this.f48893b);
            ImmutableListMultimap<String, String> immutableListMultimapB = this.f48893b.f48726c.b();
            HashMap map = new HashMap();
            for (String str : immutableListMultimapB.keySet()) {
                if (!str.equals(q.f48918o) && !str.equals("User-Agent") && !str.equals(q.f48929z) && !str.equals("Authorization")) {
                    map.put(str, (String) l1.w(immutableListMultimapB.v(str)));
                }
            }
            h(a(this.f48893b.f48725b, n.this.f48879l, map, this.f48893b.f48724a));
        }

        public void c(Uri uri, @androidx.annotation.p0 String str) {
            h(a(2, str, ImmutableMap.v(), uri));
        }

        public void d(int i10) {
            i(new g0(405, new q.b(n.this.f48871d, n.this.f48879l, i10).e()));
            this.f48892a = Math.max(this.f48892a, i10 + 1);
        }

        public void e(Uri uri, @androidx.annotation.p0 String str) {
            h(a(4, str, ImmutableMap.v(), uri));
        }

        public void f(Uri uri, String str) {
            com.google.android.exoplayer2.util.a.i(n.this.f48882o == 2);
            h(a(5, str, ImmutableMap.v(), uri));
        }

        public void g(Uri uri, long j10, String str) {
            boolean z10 = true;
            if (n.this.f48882o != 1 && n.this.f48882o != 2) {
                z10 = false;
            }
            com.google.android.exoplayer2.util.a.i(z10);
            h(a(6, str, ImmutableMap.w("Range", h0.b(j10)), uri));
        }

        public void j(Uri uri, String str, @androidx.annotation.p0 String str2) {
            n.this.f48882o = 0;
            h(a(10, str2, ImmutableMap.w(q.D, str), uri));
        }

        public void k(Uri uri, String str) {
            if (n.this.f48882o == -1 || n.this.f48882o == 0) {
                return;
            }
            n.this.f48882o = 0;
            h(a(12, str, ImmutableMap.v(), uri));
        }
    }

    /* JADX INFO: compiled from: RtspClient.java */
    public interface e {
        void d();

        void e(long j10, ImmutableList<j0> immutableList);

        void f(RtspMediaSource.RtspPlaybackException rtspPlaybackException);
    }

    /* JADX INFO: compiled from: RtspClient.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* JADX INFO: compiled from: RtspClient.java */
    public interface g {
        void a(String str, @androidx.annotation.p0 Throwable th2);

        void g(h0 h0Var, ImmutableList<x> immutableList);
    }

    public n(g gVar, e eVar, String str, Uri uri, boolean z10) {
        this.f48869b = gVar;
        this.f48870c = eVar;
        this.f48871d = str;
        this.f48872e = z10;
        this.f48876i = c0.o(uri);
        this.f48878k = c0.m(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<x> P(k0 k0Var, Uri uri) {
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i10 = 0; i10 < k0Var.f48807b.size(); i10++) {
            com.google.android.exoplayer2.source.rtsp.b bVar = k0Var.f48807b.get(i10);
            if (k.b(bVar)) {
                aVar.a(new x(bVar, uri));
            }
        }
        return aVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        s.d dVarPollFirst = this.f48873f.pollFirst();
        if (dVarPollFirst == null) {
            this.f48870c.d();
        } else {
            this.f48875h.j(dVarPollFirst.c(), dVarPollFirst.d(), this.f48879l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Throwable th2) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = th2 instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th2 : new RtspMediaSource.RtspPlaybackException(th2);
        if (this.f48883p) {
            this.f48870c.f(rtspPlaybackException);
        } else {
            this.f48869b.a(com.google.common.base.b0.g(th2.getMessage()), th2);
        }
    }

    private static Socket S(Uri uri) throws IOException {
        com.google.android.exoplayer2.util.a.a(uri.getHost() != null);
        return SocketFactory.getDefault().createSocket((String) com.google.android.exoplayer2.util.a.g(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(List<String> list) {
        if (this.f48872e) {
            com.google.android.exoplayer2.util.u.b(f48867w, com.google.common.base.p.p("\n").k(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c0(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    public int V() {
        return this.f48882o;
    }

    public void Y(int i10, y.b bVar) {
        this.f48877j.e(i10, bVar);
    }

    public void Z() {
        try {
            close();
            y yVar = new y(new c());
            this.f48877j = yVar;
            yVar.d(S(this.f48876i));
            this.f48879l = null;
            this.f48884q = false;
            this.f48881n = null;
        } catch (IOException e10) {
            this.f48870c.f(new RtspMediaSource.RtspPlaybackException(e10));
        }
    }

    public void a0(long j10) {
        this.f48875h.f(this.f48876i, (String) com.google.android.exoplayer2.util.a.g(this.f48879l));
        this.f48885r = j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b bVar = this.f48880m;
        if (bVar != null) {
            bVar.close();
            this.f48880m = null;
            this.f48875h.k(this.f48876i, (String) com.google.android.exoplayer2.util.a.g(this.f48879l));
        }
        this.f48877j.close();
    }

    public void e0(List<s.d> list) {
        this.f48873f.addAll(list);
        Q();
    }

    public void f0() throws IOException {
        try {
            this.f48877j.d(S(this.f48876i));
            this.f48875h.e(this.f48876i, this.f48879l);
        } catch (IOException e10) {
            u0.p(this.f48877j);
            throw e10;
        }
    }

    public void g0(long j10) {
        this.f48875h.g(this.f48876i, j10, (String) com.google.android.exoplayer2.util.a.g(this.f48879l));
    }
}
