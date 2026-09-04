package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.l1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements HlsPlaylistTracker, Loader.b<i0<h>> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final HlsPlaylistTracker.a f48256q = new HlsPlaylistTracker.a() { // from class: com.google.android.exoplayer2.source.hls.playlist.b
        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.a
        public final HlsPlaylistTracker a(com.google.android.exoplayer2.source.hls.g gVar, g0 g0Var, i iVar) {
            return new c(gVar, g0Var, iVar);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double f48257r = 3.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.hls.g f48258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f48259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f48260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<Uri, C0384c> f48261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList<HlsPlaylistTracker.b> f48262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f48263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private n0.a f48264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private Loader f48265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private Handler f48266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private HlsPlaylistTracker.c f48267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private f f48268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private Uri f48269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private g f48270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f48271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f48272p;

    /* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
    public class b implements HlsPlaylistTracker.b {
        private b() {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
        public void b() {
            c.this.f48262f.remove(this);
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
        public boolean m(Uri uri, g0.d dVar, boolean z10) {
            C0384c c0384c;
            if (c.this.f48270n == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<f.b> list = ((f) u0.k(c.this.f48268l)).f48297e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0384c c0384c2 = (C0384c) c.this.f48261e.get(list.get(i11).f48310a);
                    if (c0384c2 != null && jElapsedRealtime < c0384c2.f48284i) {
                        i10++;
                    }
                }
                g0.b bVarB = c.this.f48260d.b(new g0.a(1, 0, c.this.f48268l.f48297e.size(), i10), dVar);
                if (bVarB != null && bVarB.f51117a == 2 && (c0384c = (C0384c) c.this.f48261e.get(uri)) != null) {
                    c0384c.h(bVarB.f51118b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
    public final class C0384c implements Loader.b<i0<h>> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f48274m = "_HLS_msn";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f48275n = "_HLS_part";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f48276o = "_HLS_skip";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f48277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Loader f48278c = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o f48279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private g f48280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f48281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f48282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f48283h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f48284i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f48285j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        private IOException f48286k;

        public C0384c(Uri uri) {
            this.f48277b = uri;
            this.f48279d = c.this.f48258b.a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long j10) {
            this.f48284i = SystemClock.elapsedRealtime() + j10;
            return this.f48277b.equals(c.this.f48269m) && !c.this.L();
        }

        private Uri i() {
            g gVar = this.f48280e;
            if (gVar != null) {
                g.C0385g c0385g = gVar.f48337v;
                if (c0385g.f48356a != com.google.android.exoplayer2.j.f46377b || c0385g.f48360e) {
                    Uri.Builder builderBuildUpon = this.f48277b.buildUpon();
                    g gVar2 = this.f48280e;
                    if (gVar2.f48337v.f48360e) {
                        builderBuildUpon.appendQueryParameter(f48274m, String.valueOf(gVar2.f48326k + ((long) gVar2.f48333r.size())));
                        g gVar3 = this.f48280e;
                        if (gVar3.f48329n != com.google.android.exoplayer2.j.f46377b) {
                            List<g.b> list = gVar3.f48334s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) l1.w(list)).f48339n) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter(f48275n, String.valueOf(size));
                        }
                    }
                    g.C0385g c0385g2 = this.f48280e.f48337v;
                    if (c0385g2.f48356a != com.google.android.exoplayer2.j.f46377b) {
                        builderBuildUpon.appendQueryParameter(f48276o, c0385g2.f48357b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f48277b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(Uri uri) {
            this.f48285j = false;
            n(uri);
        }

        private void n(Uri uri) {
            i0 i0Var = new i0(this.f48279d, uri, 4, c.this.f48259c.a(c.this.f48268l, this.f48280e));
            c.this.f48264h.z(new u(i0Var.f51129a, i0Var.f51130b, this.f48278c.n(i0Var, this, c.this.f48260d.d(i0Var.f51131c))), i0Var.f51131c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(final Uri uri) {
            this.f48284i = 0L;
            if (this.f48285j || this.f48278c.k() || this.f48278c.j()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f48283h) {
                n(uri);
            } else {
                this.f48285j = true;
                c.this.f48266j.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.source.hls.playlist.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48288b.l(uri);
                    }
                }, this.f48283h - jElapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(g gVar, u uVar) {
            IOException playlistStuckException;
            boolean z10;
            g gVar2 = this.f48280e;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f48281f = jElapsedRealtime;
            g gVarG = c.this.G(gVar2, gVar);
            this.f48280e = gVarG;
            if (gVarG != gVar2) {
                this.f48286k = null;
                this.f48282g = jElapsedRealtime;
                c.this.R(this.f48277b, gVarG);
            } else if (!gVarG.f48330o) {
                long size = gVar.f48326k + ((long) gVar.f48333r.size());
                g gVar3 = this.f48280e;
                if (size < gVar3.f48326k) {
                    playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(this.f48277b);
                    z10 = true;
                } else {
                    playlistStuckException = ((double) (jElapsedRealtime - this.f48282g)) > ((double) u0.B1(gVar3.f48328m)) * c.this.f48263g ? new HlsPlaylistTracker.PlaylistStuckException(this.f48277b) : null;
                    z10 = false;
                }
                if (playlistStuckException != null) {
                    this.f48286k = playlistStuckException;
                    c.this.N(this.f48277b, new g0.d(uVar, new y(4), playlistStuckException, 1), z10);
                }
            }
            long j10 = 0;
            g gVar4 = this.f48280e;
            if (!gVar4.f48337v.f48360e) {
                j10 = gVar4 != gVar2 ? gVar4.f48328m : gVar4.f48328m / 2;
            }
            this.f48283h = jElapsedRealtime + u0.B1(j10);
            if (!(this.f48280e.f48329n != com.google.android.exoplayer2.j.f46377b || this.f48277b.equals(c.this.f48269m)) || this.f48280e.f48330o) {
                return;
            }
            o(i());
        }

        @p0
        public g j() {
            return this.f48280e;
        }

        public boolean k() {
            int i10;
            if (this.f48280e == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, u0.B1(this.f48280e.f48336u));
            g gVar = this.f48280e;
            return gVar.f48330o || (i10 = gVar.f48319d) == 2 || i10 == 1 || this.f48281f + jMax > jElapsedRealtime;
        }

        public void m() {
            o(this.f48277b);
        }

        public void r() throws IOException {
            this.f48278c.b();
            IOException iOException = this.f48286k;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void p(i0<h> i0Var, long j10, long j11, boolean z10) {
            u uVar = new u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
            c.this.f48260d.c(i0Var.f51129a);
            c.this.f48264h.q(uVar, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void q(i0<h> i0Var, long j10, long j11) {
            h hVarE = i0Var.e();
            u uVar = new u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
            if (hVarE instanceof g) {
                w((g) hVarE, uVar);
                c.this.f48264h.t(uVar, 4);
            } else {
                this.f48286k = ParserException.c("Loaded playlist has unexpected type.", null);
                c.this.f48264h.x(uVar, 4, this.f48286k, true);
            }
            c.this.f48260d.c(i0Var.f51129a);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Loader.c s(i0<h> i0Var, long j10, long j11, IOException iOException, int i10) {
            Loader.c cVarI;
            u uVar = new u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
            boolean z10 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((i0Var.f().getQueryParameter(f48274m) != null) || z10) {
                int i11 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).f50871i : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f48283h = SystemClock.elapsedRealtime();
                    m();
                    ((n0.a) u0.k(c.this.f48264h)).x(uVar, i0Var.f51131c, iOException, true);
                    return Loader.f50885k;
                }
            }
            g0.d dVar = new g0.d(uVar, new y(i0Var.f51131c), iOException, i10);
            if (c.this.N(this.f48277b, dVar, false)) {
                long jA = c.this.f48260d.a(dVar);
                cVarI = jA != com.google.android.exoplayer2.j.f46377b ? Loader.i(false, jA) : Loader.f50886l;
            } else {
                cVarI = Loader.f50885k;
            }
            boolean zC = true ^ cVarI.c();
            c.this.f48264h.x(uVar, i0Var.f51131c, iOException, zC);
            if (zC) {
                c.this.f48260d.c(i0Var.f51129a);
            }
            return cVarI;
        }

        public void x() {
            this.f48278c.l();
        }
    }

    public c(com.google.android.exoplayer2.source.hls.g gVar, g0 g0Var, i iVar) {
        this(gVar, g0Var, iVar, 3.5d);
    }

    public c(com.google.android.exoplayer2.source.hls.g gVar, g0 g0Var, i iVar, double d10) {
        this.f48258b = gVar;
        this.f48259c = iVar;
        this.f48260d = g0Var;
        this.f48263g = d10;
        this.f48262f = new CopyOnWriteArrayList<>();
        this.f48261e = new HashMap<>();
        this.f48272p = com.google.android.exoplayer2.j.f46377b;
    }

    private void E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f48261e.put(uri, new C0384c(uri));
        }
    }

    private static g.e F(g gVar, g gVar2) {
        int i10 = (int) (gVar2.f48326k - gVar.f48326k);
        List<g.e> list = gVar.f48333r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g G(@p0 g gVar, g gVar2) {
        if (gVar2.f(gVar)) {
            return gVar2.c(I(gVar, gVar2), H(gVar, gVar2));
        }
        return gVar2.f48330o ? gVar.d() : gVar;
    }

    private int H(@p0 g gVar, g gVar2) {
        g.e eVarF;
        if (gVar2.f48324i) {
            return gVar2.f48325j;
        }
        g gVar3 = this.f48270n;
        int i10 = gVar3 != null ? gVar3.f48325j : 0;
        return (gVar == null || (eVarF = F(gVar, gVar2)) == null) ? i10 : (gVar.f48325j + eVarF.f48348e) - gVar2.f48333r.get(0).f48348e;
    }

    private long I(@p0 g gVar, g gVar2) {
        if (gVar2.f48331p) {
            return gVar2.f48323h;
        }
        g gVar3 = this.f48270n;
        long j10 = gVar3 != null ? gVar3.f48323h : 0L;
        if (gVar == null) {
            return j10;
        }
        int size = gVar.f48333r.size();
        g.e eVarF = F(gVar, gVar2);
        if (eVarF != null) {
            return gVar.f48323h + eVarF.f48349f;
        }
        return ((long) size) == gVar2.f48326k - gVar.f48326k ? gVar.e() : j10;
    }

    private Uri J(Uri uri) {
        g.d dVar;
        g gVar = this.f48270n;
        if (gVar == null || !gVar.f48337v.f48360e || (dVar = gVar.f48335t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar.f48341b));
        int i10 = dVar.f48342c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    private boolean K(Uri uri) {
        List<f.b> list = this.f48268l.f48297e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f48310a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        List<f.b> list = this.f48268l.f48297e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0384c c0384c = (C0384c) com.google.android.exoplayer2.util.a.g(this.f48261e.get(list.get(i10).f48310a));
            if (jElapsedRealtime > c0384c.f48284i) {
                Uri uri = c0384c.f48277b;
                this.f48269m = uri;
                c0384c.o(J(uri));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (uri.equals(this.f48269m) || !K(uri)) {
            return;
        }
        g gVar = this.f48270n;
        if (gVar == null || !gVar.f48330o) {
            this.f48269m = uri;
            C0384c c0384c = this.f48261e.get(uri);
            g gVar2 = c0384c.f48280e;
            if (gVar2 == null || !gVar2.f48330o) {
                c0384c.o(J(uri));
            } else {
                this.f48270n = gVar2;
                this.f48267k.i(gVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(Uri uri, g0.d dVar, boolean z10) {
        Iterator<HlsPlaylistTracker.b> it = this.f48262f.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().m(uri, dVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Uri uri, g gVar) {
        if (uri.equals(this.f48269m)) {
            if (this.f48270n == null) {
                this.f48271o = !gVar.f48330o;
                this.f48272p = gVar.f48323h;
            }
            this.f48270n = gVar;
            this.f48267k.i(gVar);
        }
        Iterator<HlsPlaylistTracker.b> it = this.f48262f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void p(i0<h> i0Var, long j10, long j11, boolean z10) {
        u uVar = new u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        this.f48260d.c(i0Var.f51129a);
        this.f48264h.q(uVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void q(i0<h> i0Var, long j10, long j11) {
        h hVarE = i0Var.e();
        boolean z10 = hVarE instanceof g;
        f fVarE = z10 ? f.e(hVarE.f48361a) : (f) hVarE;
        this.f48268l = fVarE;
        this.f48269m = fVarE.f48297e.get(0).f48310a;
        this.f48262f.add(new b());
        E(fVarE.f48296d);
        u uVar = new u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        C0384c c0384c = this.f48261e.get(this.f48269m);
        if (z10) {
            c0384c.w((g) hVarE, uVar);
        } else {
            c0384c.m();
        }
        this.f48260d.c(i0Var.f51129a);
        this.f48264h.t(uVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Loader.c s(i0<h> i0Var, long j10, long j11, IOException iOException, int i10) {
        u uVar = new u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        long jA = this.f48260d.a(new g0.d(uVar, new y(i0Var.f51131c), iOException, i10));
        boolean z10 = jA == com.google.android.exoplayer2.j.f46377b;
        this.f48264h.x(uVar, i0Var.f51131c, iOException, z10);
        if (z10) {
            this.f48260d.c(i0Var.f51129a);
        }
        return z10 ? Loader.f50886l : Loader.i(false, jA);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void a(HlsPlaylistTracker.b bVar) {
        this.f48262f.remove(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long b() {
        return this.f48272p;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @p0
    public f c() {
        return this.f48268l;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void d(Uri uri, n0.a aVar, HlsPlaylistTracker.c cVar) {
        this.f48266j = u0.y();
        this.f48264h = aVar;
        this.f48267k = cVar;
        i0 i0Var = new i0(this.f48258b.a(4), uri, 4, this.f48259c.b());
        com.google.android.exoplayer2.util.a.i(this.f48265i == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f48265i = loader;
        aVar.z(new u(i0Var.f51129a, i0Var.f51130b, loader.n(i0Var, this, this.f48260d.d(i0Var.f51131c))), i0Var.f51131c);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void e(Uri uri) throws IOException {
        this.f48261e.get(uri).r();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void f(Uri uri) {
        this.f48261e.get(uri).m();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void g(HlsPlaylistTracker.b bVar) {
        com.google.android.exoplayer2.util.a.g(bVar);
        this.f48262f.add(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean h(Uri uri) {
        return this.f48261e.get(uri).k();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean i() {
        return this.f48271o;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean j(Uri uri, long j10) {
        C0384c c0384c = this.f48261e.get(uri);
        if (c0384c != null) {
            return !c0384c.h(j10);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void k() throws IOException {
        Loader loader = this.f48265i;
        if (loader != null) {
            loader.b();
        }
        Uri uri = this.f48269m;
        if (uri != null) {
            e(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @p0
    public g l(Uri uri, boolean z10) {
        g gVarJ = this.f48261e.get(uri).j();
        if (gVarJ != null && z10) {
            M(uri);
        }
        return gVarJ;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f48269m = null;
        this.f48270n = null;
        this.f48268l = null;
        this.f48272p = com.google.android.exoplayer2.j.f46377b;
        this.f48265i.l();
        this.f48265i = null;
        Iterator<C0384c> it = this.f48261e.values().iterator();
        while (it.hasNext()) {
            it.next().x();
        }
        this.f48266j.removeCallbacksAndMessages(null);
        this.f48266j = null;
        this.f48261e.clear();
    }
}
