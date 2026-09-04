package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.u;
import com.google.android.exoplayer2.drm.x;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.a0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.i0;
import com.google.android.exoplayer2.upstream.u0;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.y1;
import com.google.android.exoplayer2.z3;
import com.google.common.math.LongMath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tools.ant.util.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class DashMediaSource extends com.google.android.exoplayer2.source.a {
    public static final long P = 30000;

    @Deprecated
    public static final long Q = 30000;
    public static final String R = "DashMediaSource";
    private static final long S = 5000;
    private static final long T = 5000000;
    private static final String U = "DashMediaSource";
    private Loader A;

    @p0
    private u0 B;
    private IOException C;
    private Handler D;
    private i2.g E;
    private Uri F;
    private Uri G;
    private com.google.android.exoplayer2.source.dash.manifest.c H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long N;
    private int O;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i2 f47727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f47728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o.a f47729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.dash.d.a f47730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.g f47731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u f47732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g0 f47733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.dash.b f47734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f47735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n0.a f47736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final i0.a<? extends com.google.android.exoplayer2.source.dash.manifest.c> f47737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e f47738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f47739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final SparseArray<com.google.android.exoplayer2.source.dash.e> f47740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f47741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f47742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final n.b f47743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final h0 f47744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.o f47745z;

    public static final class Factory implements com.google.android.exoplayer2.source.p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.dash.d.a f47746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final com.google.android.exoplayer2.upstream.o.a f47747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f47748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private x f47749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.android.exoplayer2.source.g f47750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g0 f47751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f47752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f47753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private i0.a<? extends com.google.android.exoplayer2.source.dash.manifest.c> f47754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<StreamKey> f47755k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @p0
        private Object f47756l;

        public Factory(com.google.android.exoplayer2.source.dash.d.a aVar, @p0 com.google.android.exoplayer2.upstream.o.a aVar2) {
            this.f47746b = (com.google.android.exoplayer2.source.dash.d.a) com.google.android.exoplayer2.util.a.g(aVar);
            this.f47747c = aVar2;
            this.f47749e = new com.google.android.exoplayer2.drm.j();
            this.f47751g = new y();
            this.f47752h = com.google.android.exoplayer2.j.f46377b;
            this.f47753i = 30000L;
            this.f47750f = new com.google.android.exoplayer2.source.j();
            this.f47755k = Collections.emptyList();
        }

        public Factory(com.google.android.exoplayer2.upstream.o.a aVar) {
            this(new l.a(aVar), aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ u o(u uVar, i2 i2Var) {
            return uVar;
        }

        @Override // com.google.android.exoplayer2.source.p0
        public int[] b() {
            return new int[]{0};
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DashMediaSource d(Uri uri) {
            return g(new i2.c().K(uri).F(com.google.android.exoplayer2.util.y.f51585m0).J(this.f47756l).a());
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public DashMediaSource g(i2 i2Var) {
            i2 i2VarA = i2Var;
            com.google.android.exoplayer2.util.a.g(i2VarA.f46269c);
            i0.a dVar = this.f47754j;
            if (dVar == null) {
                dVar = new com.google.android.exoplayer2.source.dash.manifest.d();
            }
            List<StreamKey> list = i2VarA.f46269c.f46349e.isEmpty() ? this.f47755k : i2VarA.f46269c.f46349e;
            i0.a a0Var = !list.isEmpty() ? new a0(dVar, list) : dVar;
            i2.h hVar = i2VarA.f46269c;
            boolean z10 = hVar.f46353i == null && this.f47756l != null;
            boolean z11 = hVar.f46349e.isEmpty() && !list.isEmpty();
            boolean z12 = i2VarA.f46271e.f46335b == com.google.android.exoplayer2.j.f46377b && this.f47752h != com.google.android.exoplayer2.j.f46377b;
            if (z10 || z11 || z12) {
                i2.c cVarC = i2Var.c();
                if (z10) {
                    cVarC.J(this.f47756l);
                }
                if (z11) {
                    cVarC.G(list);
                }
                if (z12) {
                    cVarC.x(i2VarA.f46271e.c().k(this.f47752h).f());
                }
                i2VarA = cVarC.a();
            }
            i2 i2Var2 = i2VarA;
            return new DashMediaSource(i2Var2, null, this.f47747c, a0Var, this.f47746b, this.f47750f, this.f47749e.a(i2Var2), this.f47751g, this.f47753i, null);
        }

        public DashMediaSource m(com.google.android.exoplayer2.source.dash.manifest.c cVar) {
            return n(cVar, new i2.c().K(Uri.EMPTY).D("DashMediaSource").F(com.google.android.exoplayer2.util.y.f51585m0).G(this.f47755k).J(this.f47756l).a());
        }

        public DashMediaSource n(com.google.android.exoplayer2.source.dash.manifest.c cVar, i2 i2Var) {
            com.google.android.exoplayer2.util.a.a(!cVar.f47876d);
            i2.c cVarF = i2Var.c().F(com.google.android.exoplayer2.util.y.f51585m0);
            if (i2Var.f46269c == null) {
                cVarF.K(Uri.EMPTY);
            }
            i2.h hVar = i2Var.f46269c;
            if (hVar == null || hVar.f46353i == null) {
                cVarF.J(this.f47756l);
            }
            i2.g gVar = i2Var.f46271e;
            if (gVar.f46335b == com.google.android.exoplayer2.j.f46377b) {
                cVarF.x(gVar.c().k(this.f47752h).f());
            }
            i2.h hVar2 = i2Var.f46269c;
            if (hVar2 == null || hVar2.f46349e.isEmpty()) {
                cVarF.G(this.f47755k);
            }
            i2 i2VarA = cVarF.a();
            if (!((i2.h) com.google.android.exoplayer2.util.a.g(i2VarA.f46269c)).f46349e.isEmpty()) {
                cVar = cVar.a(this.f47755k);
            }
            return new DashMediaSource(i2VarA, cVar, null, null, this.f47746b, this.f47750f, this.f47749e.a(i2VarA), this.f47751g, this.f47753i, null);
        }

        public Factory p(@p0 com.google.android.exoplayer2.source.g gVar) {
            if (gVar == null) {
                gVar = new com.google.android.exoplayer2.source.j();
            }
            this.f47750f = gVar;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Factory h(@p0 HttpDataSource.b bVar) {
            if (!this.f47748d) {
                ((com.google.android.exoplayer2.drm.j) this.f47749e).c(bVar);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Factory i(@p0 final u uVar) {
            if (uVar == null) {
                c(null);
            } else {
                c(new x() { // from class: com.google.android.exoplayer2.source.dash.h
                    @Override // com.google.android.exoplayer2.drm.x
                    public final u a(i2 i2Var) {
                        return DashMediaSource.Factory.o(uVar, i2Var);
                    }
                });
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Factory c(@p0 x xVar) {
            if (xVar != null) {
                this.f47749e = xVar;
                this.f47748d = true;
            } else {
                this.f47749e = new com.google.android.exoplayer2.drm.j();
                this.f47748d = false;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Factory a(@p0 String str) {
            if (!this.f47748d) {
                ((com.google.android.exoplayer2.drm.j) this.f47749e).d(str);
            }
            return this;
        }

        public Factory u(long j10) {
            this.f47753i = j10;
            return this;
        }

        @Deprecated
        public Factory v(long j10, boolean z10) {
            this.f47752h = z10 ? j10 : com.google.android.exoplayer2.j.f46377b;
            if (!z10) {
                u(j10);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public Factory e(@p0 g0 g0Var) {
            if (g0Var == null) {
                g0Var = new y();
            }
            this.f47751g = g0Var;
            return this;
        }

        public Factory x(@p0 i0.a<? extends com.google.android.exoplayer2.source.dash.manifest.c> aVar) {
            this.f47754j = aVar;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.p0
        @Deprecated
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Factory f(@p0 List<StreamKey> list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f47755k = list;
            return this;
        }

        @Deprecated
        public Factory z(@p0 Object obj) {
            this.f47756l = obj;
            return this;
        }
    }

    public class a implements com.google.android.exoplayer2.util.i0.b {
        a() {
        }

        @Override // com.google.android.exoplayer2.util.i0.b
        public void a(IOException iOException) {
            DashMediaSource.this.l0(iOException);
        }

        @Override // com.google.android.exoplayer2.util.i0.b
        public void b() {
            DashMediaSource.this.m0(com.google.android.exoplayer2.util.i0.h());
        }
    }

    public static final class b extends z3 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f47758g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f47759h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f47760i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f47761j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f47762k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final long f47763l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final long f47764m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.dash.manifest.c f47765n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final i2 f47766o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @p0
        private final i2.g f47767p;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, com.google.android.exoplayer2.source.dash.manifest.c cVar, i2 i2Var, @p0 i2.g gVar) {
            com.google.android.exoplayer2.util.a.i(cVar.f47876d == (gVar != null));
            this.f47758g = j10;
            this.f47759h = j11;
            this.f47760i = j12;
            this.f47761j = i10;
            this.f47762k = j13;
            this.f47763l = j14;
            this.f47764m = j15;
            this.f47765n = cVar;
            this.f47766o = i2Var;
            this.f47767p = gVar;
        }

        private long B(long j10) {
            i iVarL;
            long j11 = this.f47764m;
            if (!C(this.f47765n)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f47763l) {
                    return com.google.android.exoplayer2.j.f46377b;
                }
            }
            long j12 = this.f47762k + j11;
            long jG = this.f47765n.g(0);
            int i10 = 0;
            while (i10 < this.f47765n.e() - 1 && j12 >= jG) {
                j12 -= jG;
                i10++;
                jG = this.f47765n.g(i10);
            }
            com.google.android.exoplayer2.source.dash.manifest.g gVarD = this.f47765n.d(i10);
            int iA = gVarD.a(2);
            return (iA == -1 || (iVarL = gVarD.f47909c.get(iA).f47863c.get(0).l()) == null || iVarL.f(jG) == 0) ? j11 : (j11 + iVarL.c(iVarL.e(j12, jG))) - j12;
        }

        private static boolean C(com.google.android.exoplayer2.source.dash.manifest.c cVar) {
            return cVar.f47876d && cVar.f47877e != com.google.android.exoplayer2.j.f46377b && cVar.f47874b == com.google.android.exoplayer2.j.f46377b;
        }

        @Override // com.google.android.exoplayer2.z3
        public int g(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f47761j) >= 0 && iIntValue < n()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.z3
        public z3.b l(int i10, z3.b bVar, boolean z10) {
            com.google.android.exoplayer2.util.a.c(i10, 0, n());
            return bVar.x(z10 ? this.f47765n.d(i10).f47907a : null, z10 ? Integer.valueOf(this.f47761j + i10) : null, 0, this.f47765n.g(i10), com.google.android.exoplayer2.util.u0.U0(this.f47765n.d(i10).f47908b - this.f47765n.d(0).f47908b) - this.f47762k);
        }

        @Override // com.google.android.exoplayer2.z3
        public int n() {
            return this.f47765n.e();
        }

        @Override // com.google.android.exoplayer2.z3
        public Object t(int i10) {
            com.google.android.exoplayer2.util.a.c(i10, 0, n());
            return Integer.valueOf(this.f47761j + i10);
        }

        @Override // com.google.android.exoplayer2.z3
        public z3.d v(int i10, z3.d dVar, long j10) {
            com.google.android.exoplayer2.util.a.c(i10, 0, 1);
            long jB = B(j10);
            Object obj = z3.d.f52104s;
            i2 i2Var = this.f47766o;
            com.google.android.exoplayer2.source.dash.manifest.c cVar = this.f47765n;
            return dVar.n(obj, i2Var, cVar, this.f47758g, this.f47759h, this.f47760i, true, C(cVar), this.f47767p, jB, this.f47763l, 0, n() - 1, this.f47762k);
        }

        @Override // com.google.android.exoplayer2.z3
        public int w() {
            return 1;
        }
    }

    public final class c implements n.b {
        private c() {
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.source.dash.n.b
        public void a(long j10) {
            DashMediaSource.this.d0(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.n.b
        public void b() {
            DashMediaSource.this.e0();
        }
    }

    public static final class d implements i0.a<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Pattern f47769b = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // com.google.android.exoplayer2.upstream.i0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, com.google.common.base.c.f56721c)).readLine();
            try {
                Matcher matcher = f47769b.matcher(line);
                if (!matcher.matches()) {
                    String strValueOf = String.valueOf(line);
                    throw ParserException.c(strValueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(strValueOf) : new String("Couldn't parse timestamp: "), null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d0.f136744e, Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * ((((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw ParserException.c(null, e10);
            }
        }
    }

    public final class e implements Loader.b<i0<com.google.android.exoplayer2.source.dash.manifest.c>> {
        private e() {
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void p(i0<com.google.android.exoplayer2.source.dash.manifest.c> i0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.f0(i0Var, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void q(i0<com.google.android.exoplayer2.source.dash.manifest.c> i0Var, long j10, long j11) {
            DashMediaSource.this.g0(i0Var, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c s(i0<com.google.android.exoplayer2.source.dash.manifest.c> i0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.h0(i0Var, j10, j11, iOException, i10);
        }
    }

    public final class f implements h0 {
        f() {
        }

        private void c() throws IOException {
            if (DashMediaSource.this.C != null) {
                throw DashMediaSource.this.C;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.h0
        public void a(int i10) throws IOException {
            DashMediaSource.this.A.a(i10);
            c();
        }

        @Override // com.google.android.exoplayer2.upstream.h0
        public void b() throws IOException {
            DashMediaSource.this.A.b();
            c();
        }
    }

    public final class g implements Loader.b<i0<Long>> {
        private g() {
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void p(i0<Long> i0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.f0(i0Var, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void q(i0<Long> i0Var, long j10, long j11) {
            DashMediaSource.this.i0(i0Var, j10, j11);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c s(i0<Long> i0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.k0(i0Var, j10, j11, iOException);
        }
    }

    public static final class h implements i0.a<Long> {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.upstream.i0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(com.google.android.exoplayer2.util.u0.c1(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        y1.a("goog.exo.dash");
    }

    private DashMediaSource(i2 i2Var, @p0 com.google.android.exoplayer2.source.dash.manifest.c cVar, @p0 com.google.android.exoplayer2.upstream.o.a aVar, @p0 i0.a<? extends com.google.android.exoplayer2.source.dash.manifest.c> aVar2, com.google.android.exoplayer2.source.dash.d.a aVar3, com.google.android.exoplayer2.source.g gVar, u uVar, g0 g0Var, long j10) {
        this.f47727h = i2Var;
        this.E = i2Var.f46271e;
        this.F = ((i2.h) com.google.android.exoplayer2.util.a.g(i2Var.f46269c)).f46345a;
        this.G = i2Var.f46269c.f46345a;
        this.H = cVar;
        this.f47729j = aVar;
        this.f47737r = aVar2;
        this.f47730k = aVar3;
        this.f47732m = uVar;
        this.f47733n = g0Var;
        this.f47735p = j10;
        this.f47731l = gVar;
        this.f47734o = new com.google.android.exoplayer2.source.dash.b();
        boolean z10 = cVar != null;
        this.f47728i = z10;
        a aVar4 = null;
        this.f47736q = x(null);
        this.f47739t = new Object();
        this.f47740u = new SparseArray<>();
        this.f47743x = new c(this, aVar4);
        this.N = com.google.android.exoplayer2.j.f46377b;
        this.L = com.google.android.exoplayer2.j.f46377b;
        if (!z10) {
            this.f47738s = new e(this, aVar4);
            this.f47744y = new f();
            this.f47741v = new Runnable() { // from class: com.google.android.exoplayer2.source.dash.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47821b.w0();
                }
            };
            this.f47742w = new Runnable() { // from class: com.google.android.exoplayer2.source.dash.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47822b.b0();
                }
            };
            return;
        }
        com.google.android.exoplayer2.util.a.i(true ^ cVar.f47876d);
        this.f47738s = null;
        this.f47741v = null;
        this.f47742w = null;
        this.f47744y = new h0.a();
    }

    /* synthetic */ DashMediaSource(i2 i2Var, com.google.android.exoplayer2.source.dash.manifest.c cVar, com.google.android.exoplayer2.upstream.o.a aVar, i0.a aVar2, com.google.android.exoplayer2.source.dash.d.a aVar3, com.google.android.exoplayer2.source.g gVar, u uVar, g0 g0Var, long j10, a aVar4) {
        this(i2Var, cVar, aVar, aVar2, aVar3, gVar, uVar, g0Var, j10);
    }

    private static long R(com.google.android.exoplayer2.source.dash.manifest.g gVar, long j10, long j11) {
        long jU0 = com.google.android.exoplayer2.util.u0.U0(gVar.f47908b);
        boolean Z = Z(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f47909c.size(); i10++) {
            com.google.android.exoplayer2.source.dash.manifest.a aVar = gVar.f47909c.get(i10);
            List<com.google.android.exoplayer2.source.dash.manifest.j> list = aVar.f47863c;
            if ((!Z || aVar.f47862b != 3) && !list.isEmpty()) {
                i iVarL = list.get(0).l();
                if (iVarL == null) {
                    return jU0 + j10;
                }
                long j12 = iVarL.j(j10, j11);
                if (j12 == 0) {
                    return jU0;
                }
                long jB = (iVarL.b(j10, j11) + j12) - 1;
                jMin = Math.min(jMin, iVarL.a(jB, j10) + iVarL.c(jB) + jU0);
            }
        }
        return jMin;
    }

    private static long S(com.google.android.exoplayer2.source.dash.manifest.g gVar, long j10, long j11) {
        long jU0 = com.google.android.exoplayer2.util.u0.U0(gVar.f47908b);
        boolean Z = Z(gVar);
        long jMax = jU0;
        for (int i10 = 0; i10 < gVar.f47909c.size(); i10++) {
            com.google.android.exoplayer2.source.dash.manifest.a aVar = gVar.f47909c.get(i10);
            List<com.google.android.exoplayer2.source.dash.manifest.j> list = aVar.f47863c;
            if ((!Z || aVar.f47862b != 3) && !list.isEmpty()) {
                i iVarL = list.get(0).l();
                if (iVarL == null || iVarL.j(j10, j11) == 0) {
                    return jU0;
                }
                jMax = Math.max(jMax, iVarL.c(iVarL.b(j10, j11)) + jU0);
            }
        }
        return jMax;
    }

    private static long V(com.google.android.exoplayer2.source.dash.manifest.c cVar, long j10) {
        i iVarL;
        int iE = cVar.e() - 1;
        com.google.android.exoplayer2.source.dash.manifest.g gVarD = cVar.d(iE);
        long jU0 = com.google.android.exoplayer2.util.u0.U0(gVarD.f47908b);
        long jG = cVar.g(iE);
        long jU1 = com.google.android.exoplayer2.util.u0.U0(j10);
        long jU2 = com.google.android.exoplayer2.util.u0.U0(cVar.f47873a);
        long jU3 = com.google.android.exoplayer2.util.u0.U0(5000L);
        for (int i10 = 0; i10 < gVarD.f47909c.size(); i10++) {
            List<com.google.android.exoplayer2.source.dash.manifest.j> list = gVarD.f47909c.get(i10).f47863c;
            if (!list.isEmpty() && (iVarL = list.get(0).l()) != null) {
                long jD = ((jU2 + jU0) + iVarL.d(jG, jU1)) - jU1;
                if (jD < jU3 - 100000 || (jD > jU3 && jD < jU3 + 100000)) {
                    jU3 = jD;
                }
            }
        }
        return LongMath.g(jU3, 1000L, RoundingMode.CEILING);
    }

    private long X() {
        return Math.min((this.M - 1) * 1000, 5000);
    }

    private static boolean Z(com.google.android.exoplayer2.source.dash.manifest.g gVar) {
        for (int i10 = 0; i10 < gVar.f47909c.size(); i10++) {
            int i11 = gVar.f47909c.get(i10).f47862b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean a0(com.google.android.exoplayer2.source.dash.manifest.g gVar) {
        for (int i10 = 0; i10 < gVar.f47909c.size(); i10++) {
            i iVarL = gVar.f47909c.get(i10).f47863c.get(0).l();
            if (iVarL == null || iVarL.i()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0() {
        n0(false);
    }

    private void c0() {
        com.google.android.exoplayer2.util.i0.j(this.A, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(IOException iOException) {
        com.google.android.exoplayer2.util.u.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        n0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(long j10) {
        this.L = j10;
        n0(true);
    }

    private void n0(boolean z10) {
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.f47740u.size(); i10++) {
            int iKeyAt = this.f47740u.keyAt(i10);
            if (iKeyAt >= this.O) {
                this.f47740u.valueAt(i10).N(this.H, iKeyAt - this.O);
            }
        }
        com.google.android.exoplayer2.source.dash.manifest.g gVarD = this.H.d(0);
        int iE = this.H.e() - 1;
        com.google.android.exoplayer2.source.dash.manifest.g gVarD2 = this.H.d(iE);
        long jG = this.H.g(iE);
        long jU0 = com.google.android.exoplayer2.util.u0.U0(com.google.android.exoplayer2.util.u0.l0(this.L));
        long jS = S(gVarD, this.H.g(0), jU0);
        long jR = R(gVarD2, jG, jU0);
        boolean z11 = this.H.f47876d && !a0(gVarD2);
        if (z11) {
            long j12 = this.H.f47878f;
            if (j12 != com.google.android.exoplayer2.j.f46377b) {
                jS = Math.max(jS, jR - com.google.android.exoplayer2.util.u0.U0(j12));
            }
        }
        long j13 = jR - jS;
        com.google.android.exoplayer2.source.dash.manifest.c cVar = this.H;
        if (cVar.f47876d) {
            com.google.android.exoplayer2.util.a.i(cVar.f47873a != com.google.android.exoplayer2.j.f46377b);
            long jU1 = (jU0 - com.google.android.exoplayer2.util.u0.U0(this.H.f47873a)) - jS;
            x0(jU1, j13);
            long jB1 = this.H.f47873a + com.google.android.exoplayer2.util.u0.B1(jS);
            long jU2 = jU1 - com.google.android.exoplayer2.util.u0.U0(this.E.f46335b);
            long jMin = Math.min(T, j13 / 2);
            j10 = jB1;
            j11 = jU2 < jMin ? jMin : jU2;
        } else {
            j10 = com.google.android.exoplayer2.j.f46377b;
            j11 = 0;
        }
        long jU3 = jS - com.google.android.exoplayer2.util.u0.U0(gVarD.f47908b);
        com.google.android.exoplayer2.source.dash.manifest.c cVar2 = this.H;
        E(new b(cVar2.f47873a, j10, this.L, this.O, jU3, j13, j11, cVar2, this.f47727h, cVar2.f47876d ? this.E : null));
        if (this.f47728i) {
            return;
        }
        this.D.removeCallbacks(this.f47742w);
        if (z11) {
            this.D.postDelayed(this.f47742w, V(this.H, com.google.android.exoplayer2.util.u0.l0(this.L)));
        }
        if (this.I) {
            w0();
            return;
        }
        if (z10) {
            com.google.android.exoplayer2.source.dash.manifest.c cVar3 = this.H;
            if (cVar3.f47876d) {
                long j14 = cVar3.f47877e;
                if (j14 != com.google.android.exoplayer2.j.f46377b) {
                    if (j14 == 0) {
                        j14 = 5000;
                    }
                    u0(Math.max(0L, (this.J + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void p0(com.google.android.exoplayer2.source.dash.manifest.o oVar) {
        String str = oVar.f47971a;
        if (com.google.android.exoplayer2.util.u0.c(str, "urn:mpeg:dash:utc:direct:2014") || com.google.android.exoplayer2.util.u0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            s0(oVar);
            return;
        }
        if (com.google.android.exoplayer2.util.u0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || com.google.android.exoplayer2.util.u0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            t0(oVar, new d());
            return;
        }
        if (com.google.android.exoplayer2.util.u0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || com.google.android.exoplayer2.util.u0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            t0(oVar, new h(null));
        } else if (com.google.android.exoplayer2.util.u0.c(str, "urn:mpeg:dash:utc:ntp:2014") || com.google.android.exoplayer2.util.u0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            c0();
        } else {
            l0(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void s0(com.google.android.exoplayer2.source.dash.manifest.o oVar) {
        try {
            m0(com.google.android.exoplayer2.util.u0.c1(oVar.f47972b) - this.K);
        } catch (ParserException e10) {
            l0(e10);
        }
    }

    private void t0(com.google.android.exoplayer2.source.dash.manifest.o oVar, i0.a<Long> aVar) {
        v0(new i0(this.f47745z, Uri.parse(oVar.f47972b), 5, aVar), new g(this, null), 1);
    }

    private void u0(long j10) {
        this.D.postDelayed(this.f47741v, j10);
    }

    private <T> void v0(i0<T> i0Var, Loader.b<i0<T>> bVar, int i10) {
        this.f47736q.z(new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, this.A.n(i0Var, bVar, i10)), i0Var.f51131c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        Uri uri;
        this.D.removeCallbacks(this.f47741v);
        if (this.A.j()) {
            return;
        }
        if (this.A.k()) {
            this.I = true;
            return;
        }
        synchronized (this.f47739t) {
            uri = this.F;
        }
        this.I = false;
        v0(new i0(this.f47745z, uri, 4, this.f47737r), this.f47738s, this.f47733n.d(4));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    private void x0(long j10, long j11) {
        long j12;
        float f10;
        long jB1 = this.f47727h.f46271e.f46337d;
        if (jB1 == com.google.android.exoplayer2.j.f46377b) {
            com.google.android.exoplayer2.source.dash.manifest.l lVar = this.H.f47882j;
            if (lVar != null) {
                jB1 = lVar.f47953c;
                if (jB1 == com.google.android.exoplayer2.j.f46377b) {
                    jB1 = com.google.android.exoplayer2.util.u0.B1(j10);
                }
            } else {
                jB1 = com.google.android.exoplayer2.util.u0.B1(j10);
            }
        }
        long jB2 = this.f47727h.f46271e.f46336c;
        if (jB2 == com.google.android.exoplayer2.j.f46377b) {
            com.google.android.exoplayer2.source.dash.manifest.l lVar2 = this.H.f47882j;
            if (lVar2 != null) {
                jB2 = lVar2.f47952b;
                if (jB2 == com.google.android.exoplayer2.j.f46377b) {
                    jB2 = com.google.android.exoplayer2.util.u0.B1(j10 - j11);
                    if (jB2 < 0 && jB1 > 0) {
                        jB2 = 0;
                    }
                    j12 = this.H.f47875c;
                    if (j12 != com.google.android.exoplayer2.j.f46377b) {
                        jB2 = Math.min(jB2 + j12, jB1);
                    }
                }
            } else {
                jB2 = com.google.android.exoplayer2.util.u0.B1(j10 - j11);
                if (jB2 < 0) {
                    jB2 = 0;
                }
                j12 = this.H.f47875c;
                if (j12 != com.google.android.exoplayer2.j.f46377b) {
                    jB2 = Math.min(jB2 + j12, jB1);
                }
            }
        }
        long j13 = jB2;
        long j14 = this.E.f46335b;
        if (j14 == com.google.android.exoplayer2.j.f46377b) {
            com.google.android.exoplayer2.source.dash.manifest.c cVar = this.H;
            com.google.android.exoplayer2.source.dash.manifest.l lVar3 = cVar.f47882j;
            if (lVar3 != null) {
                long j15 = lVar3.f47951a;
                if (j15 != com.google.android.exoplayer2.j.f46377b) {
                    j14 = j15;
                } else {
                    j14 = cVar.f47879g;
                    if (j14 == com.google.android.exoplayer2.j.f46377b) {
                        j14 = this.f47735p;
                    }
                }
            } else {
                j14 = cVar.f47879g;
                if (j14 == com.google.android.exoplayer2.j.f46377b) {
                    j14 = this.f47735p;
                }
            }
        }
        if (j14 < j13) {
            j14 = j13;
        }
        long jT = j14 > jB1 ? com.google.android.exoplayer2.util.u0.t(com.google.android.exoplayer2.util.u0.B1(j10 - Math.min(T, j11 / 2)), j13, jB1) : j14;
        i2.g gVar = this.f47727h.f46271e;
        float f11 = gVar.f46338e;
        if (f11 == -3.4028235E38f) {
            com.google.android.exoplayer2.source.dash.manifest.l lVar4 = this.H.f47882j;
            f11 = lVar4 != null ? lVar4.f47954d : -3.4028235E38f;
        }
        float f12 = gVar.f46339f;
        if (f12 == -3.4028235E38f) {
            com.google.android.exoplayer2.source.dash.manifest.l lVar5 = this.H.f47882j;
            if (lVar5 != null) {
                f12 = lVar5.f47955e;
                f10 = f12;
            } else {
                f10 = -3.4028235E38f;
            }
        } else {
            f10 = f12;
        }
        this.E = new i2.g(jT, j13, jB1, f11, f10);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void D(@p0 u0 u0Var) {
        this.B = u0Var;
        this.f47732m.prepare();
        if (this.f47728i) {
            n0(false);
            return;
        }
        this.f47745z = this.f47729j.a();
        this.A = new Loader("DashMediaSource");
        this.D = com.google.android.exoplayer2.util.u0.y();
        w0();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void F() {
        this.I = false;
        this.f47745z = null;
        Loader loader = this.A;
        if (loader != null) {
            loader.l();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.f47728i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = com.google.android.exoplayer2.j.f46377b;
        this.M = 0;
        this.N = com.google.android.exoplayer2.j.f46377b;
        this.O = 0;
        this.f47740u.clear();
        this.f47734o.i();
        this.f47732m.release();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return this.f47727h;
    }

    void d0(long j10) {
        long j11 = this.N;
        if (j11 == com.google.android.exoplayer2.j.f46377b || j11 < j10) {
            this.N = j10;
        }
    }

    void e0() {
        this.D.removeCallbacks(this.f47742w);
        w0();
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void f() throws IOException {
        this.f47744y.b();
    }

    void f0(i0<?> i0Var, long j10, long j11) {
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        this.f47733n.c(i0Var.f51129a);
        this.f47736q.q(uVar, i0Var.f51131c);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    void g0(i0<com.google.android.exoplayer2.source.dash.manifest.c> i0Var, long j10, long j11) {
        boolean z10;
        int i10;
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        this.f47733n.c(i0Var.f51129a);
        this.f47736q.t(uVar, i0Var.f51131c);
        com.google.android.exoplayer2.source.dash.manifest.c cVarE = i0Var.e();
        com.google.android.exoplayer2.source.dash.manifest.c cVar = this.H;
        int iE = cVar == null ? 0 : cVar.e();
        long j12 = cVarE.d(0).f47908b;
        int i11 = 0;
        while (i11 < iE && this.H.d(i11).f47908b < j12) {
            i11++;
        }
        if (cVarE.f47876d) {
            if (iE - i11 > cVarE.e()) {
                com.google.android.exoplayer2.util.u.m("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.N;
                if (j13 != com.google.android.exoplayer2.j.f46377b) {
                    long j14 = cVarE.f47880h;
                    if (1000 * j14 <= j13) {
                        StringBuilder sb2 = new StringBuilder(73);
                        sb2.append("Loaded stale dynamic manifest: ");
                        sb2.append(j14);
                        sb2.append(", ");
                        sb2.append(j13);
                        com.google.android.exoplayer2.util.u.m("DashMediaSource", sb2.toString());
                    }
                    if (z10) {
                        i10 = this.M;
                        this.M = i10 + 1;
                        if (i10 < this.f47733n.d(i0Var.f51131c)) {
                            u0(X());
                            return;
                        } else {
                            this.C = new DashManifestStaleException();
                            return;
                        }
                    }
                    this.M = 0;
                }
                z10 = false;
                if (z10) {
                    i10 = this.M;
                    this.M = i10 + 1;
                    if (i10 < this.f47733n.d(i0Var.f51131c)) {
                        u0(X());
                        return;
                    } else {
                        this.C = new DashManifestStaleException();
                        return;
                    }
                }
                this.M = 0;
            }
            z10 = true;
            if (z10) {
                i10 = this.M;
                this.M = i10 + 1;
                if (i10 < this.f47733n.d(i0Var.f51131c)) {
                    u0(X());
                    return;
                } else {
                    this.C = new DashManifestStaleException();
                    return;
                }
            }
            this.M = 0;
        }
        this.H = cVarE;
        this.I = cVarE.f47876d & this.I;
        this.J = j10 - j11;
        this.K = j10;
        synchronized (this.f47739t) {
            if (i0Var.f51130b.f51194a == this.F) {
                Uri uriF = this.H.f47883k;
                if (uriF == null) {
                    uriF = i0Var.f();
                }
                this.F = uriF;
            }
        }
        if (iE != 0) {
            this.O += i11;
            n0(true);
            return;
        }
        com.google.android.exoplayer2.source.dash.manifest.c cVar2 = this.H;
        if (!cVar2.f47876d) {
            n0(true);
            return;
        }
        com.google.android.exoplayer2.source.dash.manifest.o oVar = cVar2.f47881i;
        if (oVar != null) {
            p0(oVar);
        } else {
            c0();
        }
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        int iIntValue = ((Integer) aVar.f47719a).intValue() - this.O;
        n0.a aVarY = y(aVar, this.H.d(iIntValue).f47908b);
        com.google.android.exoplayer2.source.dash.e eVar = new com.google.android.exoplayer2.source.dash.e(iIntValue + this.O, this.H, this.f47734o, iIntValue, this.f47730k, this.B, this.f47732m, v(aVar), this.f47733n, aVarY, this.L, this.f47744y, bVar, this.f47731l, this.f47743x);
        this.f47740u.put(eVar.f47788b, eVar);
        return eVar;
    }

    Loader.c h0(i0<com.google.android.exoplayer2.source.dash.manifest.c> i0Var, long j10, long j11, IOException iOException, int i10) {
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        long jA = this.f47733n.a(new g0.d(uVar, new com.google.android.exoplayer2.source.y(i0Var.f51131c), iOException, i10));
        Loader.c cVarI = jA == com.google.android.exoplayer2.j.f46377b ? Loader.f50886l : Loader.i(false, jA);
        boolean z10 = !cVarI.c();
        this.f47736q.x(uVar, i0Var.f51131c, iOException, z10);
        if (z10) {
            this.f47733n.c(i0Var.f51129a);
        }
        return cVarI;
    }

    void i0(i0<Long> i0Var, long j10, long j11) {
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b());
        this.f47733n.c(i0Var.f51129a);
        this.f47736q.t(uVar, i0Var.f51131c);
        m0(i0Var.e().longValue() - j10);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        com.google.android.exoplayer2.source.dash.e eVar = (com.google.android.exoplayer2.source.dash.e) c0Var;
        eVar.J();
        this.f47740u.remove(eVar.f47788b);
    }

    Loader.c k0(i0<Long> i0Var, long j10, long j11, IOException iOException) {
        this.f47736q.x(new com.google.android.exoplayer2.source.u(i0Var.f51129a, i0Var.f51130b, i0Var.f(), i0Var.d(), j10, j11, i0Var.b()), i0Var.f51131c, iOException, true);
        this.f47733n.c(i0Var.f51129a);
        l0(iOException);
        return Loader.f50885k;
    }

    public void o0(Uri uri) {
        synchronized (this.f47739t) {
            this.F = uri;
            this.G = uri;
        }
    }
}
