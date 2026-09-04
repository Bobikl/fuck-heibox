package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.d0;
import com.google.android.exoplayer2.extractor.e0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.c1;
import com.google.android.exoplayer2.source.d1;
import com.google.android.exoplayer2.source.e1;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.l1;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s implements Loader.b<com.google.android.exoplayer2.source.chunk.f>, Loader.f, e1, com.google.android.exoplayer2.extractor.m, c1.d {
    private static final String Y = "HlsSampleStreamWrapper";
    public static final int Z = -1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f48365a0 = -2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f48366b0 = -3;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Set<Integer> f48367c0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private a2 F;

    @p0
    private a2 G;
    private boolean H;
    private p1 I;
    private Set<n1> J;
    private int[] K;
    private int L;
    private boolean M;
    private boolean[] N;
    private boolean[] O;
    private long P;
    private long Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;

    @p0
    private DrmInitData W;

    @p0
    private j X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f48369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f48370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f48371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final a2 f48372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.u f48373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.s.a f48374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g0 f48375i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n0.a f48377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f48378l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList<j> f48380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<j> f48381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f48382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f48383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f48384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList<n> f48385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map<String, DrmInitData> f48386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private com.google.android.exoplayer2.source.chunk.f f48387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d[] f48388v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set<Integer> f48390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SparseIntArray f48391y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private e0 f48392z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Loader f48376j = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f.b f48379m = new f.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f48389w = new int[0];

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public interface b extends e1.a<s> {
        void c();

        void p(Uri uri);
    }

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public static class c implements e0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f48393j = "EmsgUnwrappingTrackOutput";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a2 f48394k = new a2.b().e0(y.f51591p0).E();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final a2 f48395l = new a2.b().e0(y.C0).E();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.google.android.exoplayer2.metadata.emsg.a f48396d = new com.google.android.exoplayer2.metadata.emsg.a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e0 f48397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a2 f48398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private a2 f48399g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte[] f48400h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f48401i;

        public c(e0 e0Var, int i10) {
            this.f48397e = e0Var;
            if (i10 == 1) {
                this.f48398f = f48394k;
            } else {
                if (i10 != 3) {
                    StringBuilder sb2 = new StringBuilder(33);
                    sb2.append("Unknown metadataType: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                this.f48398f = f48395l;
            }
            this.f48400h = new byte[0];
            this.f48401i = 0;
        }

        private boolean g(EventMessage eventMessage) {
            a2 a2VarJ0 = eventMessage.J0();
            return a2VarJ0 != null && u0.c(this.f48398f.f43593m, a2VarJ0.f43593m);
        }

        private void h(int i10) {
            byte[] bArr = this.f48400h;
            if (bArr.length < i10) {
                this.f48400h = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private com.google.android.exoplayer2.util.e0 i(int i10, int i11) {
            int i12 = this.f48401i - i11;
            com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(Arrays.copyOfRange(this.f48400h, i12 - i10, i12));
            byte[] bArr = this.f48400h;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f48401i = i11;
            return e0Var;
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public int a(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10, int i11) throws IOException {
            h(this.f48401i + i10);
            int i12 = kVar.read(this.f48400h, this.f48401i, i10);
            if (i12 != -1) {
                this.f48401i += i12;
                return i12;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public /* synthetic */ int b(com.google.android.exoplayer2.upstream.k kVar, int i10, boolean z10) {
            return d0.a(this, kVar, i10, z10);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public /* synthetic */ void c(com.google.android.exoplayer2.util.e0 e0Var, int i10) {
            d0.b(this, e0Var, i10);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public void d(a2 a2Var) {
            this.f48399g = a2Var;
            this.f48397e.d(this.f48398f);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public void e(long j10, int i10, int i11, int i12, @p0 e0.a aVar) {
            com.google.android.exoplayer2.util.a.g(this.f48399g);
            com.google.android.exoplayer2.util.e0 e0VarI = i(i11, i12);
            if (!u0.c(this.f48399g.f43593m, this.f48398f.f43593m)) {
                if (!y.C0.equals(this.f48399g.f43593m)) {
                    String strValueOf = String.valueOf(this.f48399g.f43593m);
                    com.google.android.exoplayer2.util.u.m(f48393j, strValueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(strValueOf) : new String("Ignoring sample for unsupported format: "));
                    return;
                } else {
                    EventMessage eventMessageC = this.f48396d.c(e0VarI);
                    if (!g(eventMessageC)) {
                        com.google.android.exoplayer2.util.u.m(f48393j, String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f48398f.f43593m, eventMessageC.J0()));
                        return;
                    }
                    e0VarI = new com.google.android.exoplayer2.util.e0((byte[]) com.google.android.exoplayer2.util.a.g(eventMessageC.v0()));
                }
            }
            int iA = e0VarI.a();
            this.f48397e.c(e0VarI, iA);
            this.f48397e.e(j10, i10, iA, i12, aVar);
        }

        @Override // com.google.android.exoplayer2.extractor.e0
        public void f(com.google.android.exoplayer2.util.e0 e0Var, int i10, int i11) {
            h(this.f48401i + i10);
            e0Var.k(this.f48400h, this.f48401i, i10);
            this.f48401i += i10;
        }
    }

    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public static final class d extends c1 {
        private final Map<String, DrmInitData> N;

        @p0
        private DrmInitData O;

        private d(com.google.android.exoplayer2.upstream.b bVar, Looper looper, com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.drm.s.a aVar, Map<String, DrmInitData> map) {
            super(bVar, looper, uVar, aVar);
            this.N = map;
        }

        @p0
        private Metadata i0(@p0 Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int iD = metadata.d();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iD) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry entryC = metadata.c(i11);
                if ((entryC instanceof PrivFrame) && j.L.equals(((PrivFrame) entryC).f46926c)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return metadata;
            }
            if (iD == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[iD - 1];
            while (i10 < iD) {
                if (i10 != i11) {
                    entryArr[i10 < i11 ? i10 : i10 - 1] = metadata.c(i10);
                }
                i10++;
            }
            return new Metadata(entryArr);
        }

        @Override // com.google.android.exoplayer2.source.c1, com.google.android.exoplayer2.extractor.e0
        public void e(long j10, int i10, int i11, int i12, @p0 e0.a aVar) {
            super.e(j10, i10, i11, i12, aVar);
        }

        public void j0(@p0 DrmInitData drmInitData) {
            this.O = drmInitData;
            J();
        }

        public void k0(j jVar) {
            g0(jVar.f48149k);
        }

        @Override // com.google.android.exoplayer2.source.c1
        public a2 x(a2 a2Var) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.O;
            if (drmInitData2 == null) {
                drmInitData2 = a2Var.f43596p;
            }
            if (drmInitData2 != null && (drmInitData = this.N.get(drmInitData2.f44652d)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadataI0 = i0(a2Var.f43591k);
            if (drmInitData2 != a2Var.f43596p || metadataI0 != a2Var.f43591k) {
                a2Var = a2Var.c().M(drmInitData2).X(metadataI0).E();
            }
            return super.x(a2Var);
        }
    }

    public s(int i10, b bVar, f fVar, Map<String, DrmInitData> map, com.google.android.exoplayer2.upstream.b bVar2, long j10, @p0 a2 a2Var, com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.drm.s.a aVar, g0 g0Var, n0.a aVar2, int i11) {
        this.f48368b = i10;
        this.f48369c = bVar;
        this.f48370d = fVar;
        this.f48386t = map;
        this.f48371e = bVar2;
        this.f48372f = a2Var;
        this.f48373g = uVar;
        this.f48374h = aVar;
        this.f48375i = g0Var;
        this.f48377k = aVar2;
        this.f48378l = i11;
        Set<Integer> set = f48367c0;
        this.f48390x = new HashSet(set.size());
        this.f48391y = new SparseIntArray(set.size());
        this.f48388v = new d[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList<j> arrayList = new ArrayList<>();
        this.f48380n = arrayList;
        this.f48381o = Collections.unmodifiableList(arrayList);
        this.f48385s = new ArrayList<>();
        this.f48382p = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f48192b.U();
            }
        };
        this.f48383q = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f48193b.d0();
            }
        };
        this.f48384r = u0.y();
        this.P = j10;
        this.Q = j10;
    }

    @mk.d({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void A() {
        int length = this.f48388v.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i12 >= length) {
                break;
            }
            String str = ((a2) com.google.android.exoplayer2.util.a.k(this.f48388v[i12].G())).f43593m;
            if (!y.t(str)) {
                i13 = y.p(str) ? 1 : y.s(str) ? 3 : -2;
            }
            if (O(i13) > O(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        n1 n1VarI = this.f48370d.i();
        int i14 = n1VarI.f48599b;
        this.L = -1;
        this.K = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.K[i15] = i15;
        }
        n1[] n1VarArr = new n1[length];
        for (int i16 = 0; i16 < length; i16++) {
            a2 a2Var = (a2) com.google.android.exoplayer2.util.a.k(this.f48388v[i16].G());
            if (i16 == i11) {
                a2[] a2VarArr = new a2[i14];
                if (i14 == 1) {
                    a2VarArr[0] = a2Var.B(n1VarI.c(0));
                } else {
                    for (int i17 = 0; i17 < i14; i17++) {
                        a2VarArr[i17] = G(n1VarI.c(i17), a2Var, true);
                    }
                }
                n1VarArr[i16] = new n1(a2VarArr);
                this.L = i16;
            } else {
                n1VarArr[i16] = new n1(G((i10 == 2 && y.p(a2Var.f43593m)) ? this.f48372f : null, a2Var, false));
            }
        }
        this.I = F(n1VarArr);
        com.google.android.exoplayer2.util.a.i(this.J == null);
        this.J = Collections.emptySet();
    }

    private boolean B(int i10) {
        for (int i11 = i10; i11 < this.f48380n.size(); i11++) {
            if (this.f48380n.get(i11).f48152n) {
                return false;
            }
        }
        j jVar = this.f48380n.get(i10);
        for (int i12 = 0; i12 < this.f48388v.length; i12++) {
            if (this.f48388v[i12].D() > jVar.m(i12)) {
                return false;
            }
        }
        return true;
    }

    private static com.google.android.exoplayer2.extractor.j D(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unmapped track with id ");
        sb2.append(i10);
        sb2.append(" of type ");
        sb2.append(i11);
        com.google.android.exoplayer2.util.u.m(Y, sb2.toString());
        return new com.google.android.exoplayer2.extractor.j();
    }

    private c1 E(int i10, int i11) {
        int length = this.f48388v.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f48371e, this.f48384r.getLooper(), this.f48373g, this.f48374h, this.f48386t);
        dVar.c0(this.P);
        if (z10) {
            dVar.j0(this.W);
        }
        dVar.b0(this.V);
        j jVar = this.X;
        if (jVar != null) {
            dVar.k0(jVar);
        }
        dVar.e0(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f48389w, i12);
        this.f48389w = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.f48388v = (d[]) u0.X0(this.f48388v, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.O, i12);
        this.O = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.M |= z10;
        this.f48390x.add(Integer.valueOf(i11));
        this.f48391y.append(i11, length);
        if (O(i11) > O(this.A)) {
            this.B = length;
            this.A = i11;
        }
        this.N = Arrays.copyOf(this.N, i12);
        return dVar;
    }

    private p1 F(n1[] n1VarArr) {
        for (int i10 = 0; i10 < n1VarArr.length; i10++) {
            n1 n1Var = n1VarArr[i10];
            a2[] a2VarArr = new a2[n1Var.f48599b];
            for (int i11 = 0; i11 < n1Var.f48599b; i11++) {
                a2 a2VarC = n1Var.c(i11);
                a2VarArr[i11] = a2VarC.e(this.f48373g.b(a2VarC));
            }
            n1VarArr[i10] = new n1(a2VarArr);
        }
        return new p1(n1VarArr);
    }

    private static a2 G(@p0 a2 a2Var, a2 a2Var2, boolean z10) {
        String strD;
        String strG;
        if (a2Var == null) {
            return a2Var2;
        }
        int iL = y.l(a2Var2.f43593m);
        if (u0.R(a2Var.f43590j, iL) == 1) {
            strD = u0.S(a2Var.f43590j, iL);
            strG = y.g(strD);
        } else {
            strD = y.d(a2Var.f43590j, a2Var2.f43593m);
            strG = a2Var2.f43593m;
        }
        a2.b bVarI = a2Var2.c().S(a2Var.f43582b).U(a2Var.f43583c).V(a2Var.f43584d).g0(a2Var.f43585e).c0(a2Var.f43586f).G(z10 ? a2Var.f43587g : -1).Z(z10 ? a2Var.f43588h : -1).I(strD);
        if (iL == 2) {
            bVarI.j0(a2Var.f43598r).Q(a2Var.f43599s).P(a2Var.f43600t);
        }
        if (strG != null) {
            bVarI.e0(strG);
        }
        int i10 = a2Var.f43606z;
        if (i10 != -1 && iL == 1) {
            bVarI.H(i10);
        }
        Metadata metadataB = a2Var.f43591k;
        if (metadataB != null) {
            Metadata metadata = a2Var2.f43591k;
            if (metadata != null) {
                metadataB = metadata.b(metadataB);
            }
            bVarI.X(metadataB);
        }
        return bVarI.E();
    }

    private void H(int i10) {
        com.google.android.exoplayer2.util.a.i(!this.f48376j.k());
        while (true) {
            if (i10 >= this.f48380n.size()) {
                i10 = -1;
                break;
            } else if (B(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = L().f47654h;
        j jVarI = I(i10);
        if (this.f48380n.isEmpty()) {
            this.Q = this.P;
        } else {
            ((j) l1.w(this.f48380n)).o();
        }
        this.T = false;
        this.f48377k.D(this.A, jVarI.f47653g, j10);
    }

    private j I(int i10) {
        j jVar = this.f48380n.get(i10);
        ArrayList<j> arrayList = this.f48380n;
        u0.h1(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f48388v.length; i11++) {
            this.f48388v[i11].v(jVar.m(i11));
        }
        return jVar;
    }

    private boolean J(j jVar) {
        int i10 = jVar.f48149k;
        int length = this.f48388v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.N[i11] && this.f48388v[i11].R() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean K(a2 a2Var, a2 a2Var2) {
        String str = a2Var.f43593m;
        String str2 = a2Var2.f43593m;
        int iL = y.l(str);
        if (iL != 3) {
            return iL == y.l(str2);
        }
        if (u0.c(str, str2)) {
            return !(y.f51593q0.equals(str) || y.f51595r0.equals(str)) || a2Var.E == a2Var2.E;
        }
        return false;
    }

    private j L() {
        ArrayList<j> arrayList = this.f48380n;
        return arrayList.get(arrayList.size() - 1);
    }

    @p0
    private e0 M(int i10, int i11) {
        com.google.android.exoplayer2.util.a.a(f48367c0.contains(Integer.valueOf(i11)));
        int i12 = this.f48391y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f48390x.add(Integer.valueOf(i11))) {
            this.f48389w[i12] = i10;
        }
        return this.f48389w[i12] == i10 ? this.f48388v[i12] : D(i10, i11);
    }

    private static int O(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void P(j jVar) {
        this.X = jVar;
        this.F = jVar.f47650d;
        this.Q = com.google.android.exoplayer2.j.f46377b;
        this.f48380n.add(jVar);
        ImmutableList.a aVarQ = ImmutableList.q();
        for (d dVar : this.f48388v) {
            aVarQ.a(Integer.valueOf(dVar.H()));
        }
        jVar.n(this, aVarQ.e());
        for (d dVar2 : this.f48388v) {
            dVar2.k0(jVar);
            if (jVar.f48152n) {
                dVar2.h0();
            }
        }
    }

    private static boolean Q(com.google.android.exoplayer2.source.chunk.f fVar) {
        return fVar instanceof j;
    }

    private boolean R() {
        return this.Q != com.google.android.exoplayer2.j.f46377b;
    }

    @mk.d({"trackGroupToSampleQueueIndex"})
    @mk.m({"trackGroups"})
    private void T() {
        int i10 = this.I.f48609b;
        int[] iArr = new int[i10];
        this.K = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f48388v;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (K((a2) com.google.android.exoplayer2.util.a.k(dVarArr[i12].G()), this.I.c(i11).c(0))) {
                    this.K[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<n> it = this.f48385s.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (!this.H && this.K == null && this.C) {
            for (d dVar : this.f48388v) {
                if (dVar.G() == null) {
                    return;
                }
            }
            if (this.I != null) {
                T();
                return;
            }
            A();
            m0();
            this.f48369c.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        this.C = true;
        U();
    }

    private void h0() {
        for (d dVar : this.f48388v) {
            dVar.X(this.R);
        }
        this.R = false;
    }

    private boolean i0(long j10) {
        int length = this.f48388v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f48388v[i10].a0(j10, false) && (this.O[i10] || !this.M)) {
                return false;
            }
        }
        return true;
    }

    @mk.m({"trackGroups", "optionalTrackGroups"})
    private void m0() {
        this.D = true;
    }

    private void r0(d1[] d1VarArr) {
        this.f48385s.clear();
        for (d1 d1Var : d1VarArr) {
            if (d1Var != null) {
                this.f48385s.add((n) d1Var);
            }
        }
    }

    @mk.d({"trackGroups", "optionalTrackGroups"})
    private void y() {
        com.google.android.exoplayer2.util.a.i(this.D);
        com.google.android.exoplayer2.util.a.g(this.I);
        com.google.android.exoplayer2.util.a.g(this.J);
    }

    public void C() {
        if (this.D) {
            return;
        }
        d(this.P);
    }

    public int N() {
        return this.L;
    }

    public boolean S(int i10) {
        return !R() && this.f48388v[i10].L(this.T);
    }

    public void V() throws IOException {
        this.f48376j.b();
        this.f48370d.m();
    }

    public void W(int i10) throws IOException {
        V();
        this.f48388v[i10].O();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void p(com.google.android.exoplayer2.source.chunk.f fVar, long j10, long j11, boolean z10) {
        this.f48387u = null;
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(fVar.f47647a, fVar.f47648b, fVar.f(), fVar.e(), j10, j11, fVar.b());
        this.f48375i.c(fVar.f47647a);
        this.f48377k.r(uVar, fVar.f47649c, this.f48368b, fVar.f47650d, fVar.f47651e, fVar.f47652f, fVar.f47653g, fVar.f47654h);
        if (z10) {
            return;
        }
        if (R() || this.E == 0) {
            h0();
        }
        if (this.E > 0) {
            this.f48369c.n(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void q(com.google.android.exoplayer2.source.chunk.f fVar, long j10, long j11) {
        this.f48387u = null;
        this.f48370d.o(fVar);
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(fVar.f47647a, fVar.f47648b, fVar.f(), fVar.e(), j10, j11, fVar.b());
        this.f48375i.c(fVar.f47647a);
        this.f48377k.u(uVar, fVar.f47649c, this.f48368b, fVar.f47650d, fVar.f47651e, fVar.f47652f, fVar.f47653g, fVar.f47654h);
        if (this.D) {
            this.f48369c.n(this);
        } else {
            d(this.P);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Loader.c s(com.google.android.exoplayer2.source.chunk.f fVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarI;
        int i11;
        boolean zQ = Q(fVar);
        if (zQ && !((j) fVar).q() && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i11 = ((HttpDataSource.InvalidResponseCodeException) iOException).f50871i) == 410 || i11 == 404)) {
            return Loader.f50883i;
        }
        long jB = fVar.b();
        com.google.android.exoplayer2.source.u uVar = new com.google.android.exoplayer2.source.u(fVar.f47647a, fVar.f47648b, fVar.f(), fVar.e(), j10, j11, jB);
        g0.d dVar = new g0.d(uVar, new com.google.android.exoplayer2.source.y(fVar.f47649c, this.f48368b, fVar.f47650d, fVar.f47651e, fVar.f47652f, u0.B1(fVar.f47653g), u0.B1(fVar.f47654h)), iOException, i10);
        g0.b bVarB = this.f48375i.b(com.google.android.exoplayer2.trackselection.v.a(this.f48370d.j()), dVar);
        boolean zL = (bVarB == null || bVarB.f51117a != 2) ? false : this.f48370d.l(fVar, bVarB.f51118b);
        if (zL) {
            if (zQ && jB == 0) {
                ArrayList<j> arrayList = this.f48380n;
                com.google.android.exoplayer2.util.a.i(arrayList.remove(arrayList.size() - 1) == fVar);
                if (this.f48380n.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((j) l1.w(this.f48380n)).o();
                }
            }
            cVarI = Loader.f50885k;
        } else {
            long jA = this.f48375i.a(dVar);
            cVarI = jA != com.google.android.exoplayer2.j.f46377b ? Loader.i(false, jA) : Loader.f50886l;
        }
        Loader.c cVar = cVarI;
        boolean z10 = !cVar.c();
        this.f48377k.w(uVar, fVar.f47649c, this.f48368b, fVar.f47650d, fVar.f47651e, fVar.f47652f, fVar.f47653g, fVar.f47654h, iOException, z10);
        if (z10) {
            this.f48387u = null;
            this.f48375i.c(fVar.f47647a);
        }
        if (zL) {
            if (this.D) {
                this.f48369c.n(this);
            } else {
                d(this.P);
            }
        }
        return cVar;
    }

    @Override // com.google.android.exoplayer2.source.e1
    public boolean a() {
        return this.f48376j.k();
    }

    public void a0() {
        this.f48390x.clear();
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public e0 b(int i10, int i11) {
        e0 e0VarE;
        if (!f48367c0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                e0[] e0VarArr = this.f48388v;
                if (i12 >= e0VarArr.length) {
                    e0VarE = null;
                    break;
                }
                if (this.f48389w[i12] == i10) {
                    e0VarE = e0VarArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            e0VarE = M(i10, i11);
        }
        if (e0VarE == null) {
            if (this.U) {
                return D(i10, i11);
            }
            e0VarE = E(i10, i11);
        }
        if (i11 != 5) {
            return e0VarE;
        }
        if (this.f48392z == null) {
            this.f48392z = new c(e0VarE, this.f48378l);
        }
        return this.f48392z;
    }

    public boolean b0(Uri uri, g0.d dVar, boolean z10) {
        g0.b bVarB;
        if (!this.f48370d.n(uri)) {
            return true;
        }
        long j10 = (z10 || (bVarB = this.f48375i.b(com.google.android.exoplayer2.trackselection.v.a(this.f48370d.j()), dVar)) == null || bVarB.f51117a != 2) ? -9223372036854775807L : bVarB.f51118b;
        return this.f48370d.p(uri, j10) && j10 != com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.source.c1.d
    public void c(a2 a2Var) {
        this.f48384r.post(this.f48382p);
    }

    public void c0() {
        if (this.f48380n.isEmpty()) {
            return;
        }
        j jVar = (j) l1.w(this.f48380n);
        int iB = this.f48370d.b(jVar);
        if (iB == 1) {
            jVar.v();
        } else if (iB == 2 && !this.T && this.f48376j.k()) {
            this.f48376j.g();
        }
    }

    @Override // com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        List<j> listEmptyList;
        long jMax;
        if (this.T || this.f48376j.k() || this.f48376j.j()) {
            return false;
        }
        if (R()) {
            listEmptyList = Collections.emptyList();
            jMax = this.Q;
            for (d dVar : this.f48388v) {
                dVar.c0(this.Q);
            }
        } else {
            listEmptyList = this.f48381o;
            j jVarL = L();
            jMax = jVarL.h() ? jVarL.f47654h : Math.max(this.P, jVarL.f47653g);
        }
        List<j> list = listEmptyList;
        long j11 = jMax;
        this.f48379m.a();
        this.f48370d.d(j10, j11, list, this.D || !list.isEmpty(), this.f48379m);
        f.b bVar = this.f48379m;
        boolean z10 = bVar.f48136b;
        com.google.android.exoplayer2.source.chunk.f fVar = bVar.f48135a;
        Uri uri = bVar.f48137c;
        if (z10) {
            this.Q = com.google.android.exoplayer2.j.f46377b;
            this.T = true;
            return true;
        }
        if (fVar == null) {
            if (uri != null) {
                this.f48369c.p(uri);
            }
            return false;
        }
        if (Q(fVar)) {
            P((j) fVar);
        }
        this.f48387u = fVar;
        this.f48377k.A(new com.google.android.exoplayer2.source.u(fVar.f47647a, fVar.f47648b, this.f48376j.n(fVar, this, this.f48375i.d(fVar.f47649c))), fVar.f47649c, this.f48368b, fVar.f47650d, fVar.f47651e, fVar.f47652f, fVar.f47653g, fVar.f47654h);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.e1
    public long e() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.Q;
        }
        long jMax = this.P;
        j jVarL = L();
        if (!jVarL.h()) {
            if (this.f48380n.size() > 1) {
                ArrayList<j> arrayList = this.f48380n;
                jVarL = arrayList.get(arrayList.size() - 2);
            } else {
                jVarL = null;
            }
        }
        if (jVarL != null) {
            jMax = Math.max(jMax, jVarL.f47654h);
        }
        if (this.C) {
            for (d dVar : this.f48388v) {
                jMax = Math.max(jMax, dVar.A());
            }
        }
        return jMax;
    }

    public void e0(n1[] n1VarArr, int i10, int... iArr) {
        this.I = F(n1VarArr);
        this.J = new HashSet();
        for (int i11 : iArr) {
            this.J.add(this.I.c(i11));
        }
        this.L = i10;
        Handler handler = this.f48384r;
        final b bVar = this.f48369c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.hls.q
            @Override // java.lang.Runnable
            public final void run() {
                bVar.c();
            }
        });
        m0();
    }

    @Override // com.google.android.exoplayer2.source.e1
    public void f(long j10) {
        if (this.f48376j.j() || R()) {
            return;
        }
        if (this.f48376j.k()) {
            com.google.android.exoplayer2.util.a.g(this.f48387u);
            if (this.f48370d.u(j10, this.f48387u, this.f48381o)) {
                this.f48376j.g();
                return;
            }
            return;
        }
        int size = this.f48381o.size();
        while (size > 0 && this.f48370d.b(this.f48381o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f48381o.size()) {
            H(size);
        }
        int iG = this.f48370d.g(j10, this.f48381o);
        if (iG < this.f48380n.size()) {
            H(iG);
        }
    }

    public int f0(int i10, b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (R()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f48380n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f48380n.size() - 1 && J(this.f48380n.get(i13))) {
                i13++;
            }
            u0.h1(this.f48380n, 0, i13);
            j jVar = this.f48380n.get(0);
            a2 a2Var = jVar.f47650d;
            if (!a2Var.equals(this.G)) {
                this.f48377k.i(this.f48368b, a2Var, jVar.f47651e, jVar.f47652f, jVar.f47653g);
            }
            this.G = a2Var;
        }
        if (!this.f48380n.isEmpty() && !this.f48380n.get(0).q()) {
            return -3;
        }
        int iT = this.f48388v[i10].T(b2Var, decoderInputBuffer, i11, this.T);
        if (iT == -5) {
            a2 a2VarB = (a2) com.google.android.exoplayer2.util.a.g(b2Var.f44366b);
            if (i10 == this.B) {
                int iR = this.f48388v[i10].R();
                while (i12 < this.f48380n.size() && this.f48380n.get(i12).f48149k != iR) {
                    i12++;
                }
                a2VarB = a2VarB.B(i12 < this.f48380n.size() ? this.f48380n.get(i12).f47650d : (a2) com.google.android.exoplayer2.util.a.g(this.F));
            }
            b2Var.f44366b = a2VarB;
        }
        return iT;
    }

    @Override // com.google.android.exoplayer2.source.e1
    public long g() {
        if (R()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return L().f47654h;
    }

    public void g0() {
        if (this.D) {
            for (d dVar : this.f48388v) {
                dVar.S();
            }
        }
        this.f48376j.m(this);
        this.f48384r.removeCallbacksAndMessages(null);
        this.H = true;
        this.f48385s.clear();
    }

    public boolean j0(long j10, boolean z10) {
        this.P = j10;
        if (R()) {
            this.Q = j10;
            return true;
        }
        if (this.C && !z10 && i0(j10)) {
            return false;
        }
        this.Q = j10;
        this.T = false;
        this.f48380n.clear();
        if (this.f48376j.k()) {
            if (this.C) {
                for (d dVar : this.f48388v) {
                    dVar.r();
                }
            }
            this.f48376j.g();
        } else {
            this.f48376j.h();
            h0();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    public boolean k0(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10, boolean z10) {
        boolean z11;
        boolean z12;
        y();
        int i10 = this.E;
        int i11 = 0;
        for (int i12 = 0; i12 < jVarArr.length; i12++) {
            n nVar = (n) d1VarArr[i12];
            if (nVar != null && (jVarArr[i12] == null || !zArr[i12])) {
                this.E--;
                nVar.e();
                d1VarArr[i12] = null;
            }
        }
        boolean z13 = z10 || (!this.S ? j10 == this.P : i10 != 0);
        com.google.android.exoplayer2.trackselection.j jVarJ = this.f48370d.j();
        boolean z14 = z13;
        com.google.android.exoplayer2.trackselection.j jVar = jVarJ;
        for (int i13 = 0; i13 < jVarArr.length; i13++) {
            com.google.android.exoplayer2.trackselection.j jVar2 = jVarArr[i13];
            if (jVar2 != null) {
                int iD = this.I.d(jVar2.h());
                if (iD == this.L) {
                    this.f48370d.t(jVar2);
                    jVar = jVar2;
                }
                if (d1VarArr[i13] == null) {
                    this.E++;
                    n nVar2 = new n(this, iD);
                    d1VarArr[i13] = nVar2;
                    zArr2[i13] = true;
                    if (this.K != null) {
                        nVar2.a();
                        if (!z14) {
                            d dVar = this.f48388v[this.K[iD]];
                            z14 = (dVar.a0(j10, true) || dVar.D() == 0) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.E == 0) {
            this.f48370d.q();
            this.G = null;
            this.R = true;
            this.f48380n.clear();
            if (this.f48376j.k()) {
                if (this.C) {
                    d[] dVarArr = this.f48388v;
                    int length = dVarArr.length;
                    while (i11 < length) {
                        dVarArr[i11].r();
                        i11++;
                    }
                }
                this.f48376j.g();
            } else {
                h0();
            }
        } else {
            if (this.f48380n.isEmpty() || u0.c(jVar, jVarJ)) {
                z11 = z10;
            } else {
                if (this.S) {
                    z12 = true;
                } else {
                    long j11 = j10 < 0 ? -j10 : 0L;
                    j jVarL = L();
                    jVar.k(j10, j11, com.google.android.exoplayer2.j.f46377b, this.f48381o, this.f48370d.a(jVarL, j10));
                    if (jVar.l() != this.f48370d.i().d(jVarL.f47650d)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    this.R = true;
                    z11 = true;
                    z14 = true;
                } else {
                    z11 = z10;
                }
            }
            if (z14) {
                j0(j10, z11);
                while (i11 < d1VarArr.length) {
                    if (d1VarArr[i11] != null) {
                        zArr2[i11] = true;
                    }
                    i11++;
                }
            }
        }
        r0(d1VarArr);
        this.S = true;
        return z14;
    }

    public void l0(@p0 DrmInitData drmInitData) {
        if (u0.c(this.W, drmInitData)) {
            return;
        }
        this.W = drmInitData;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f48388v;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.O[i10]) {
                dVarArr[i10].j0(drmInitData);
            }
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void m() {
        for (d dVar : this.f48388v) {
            dVar.U();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public void n() {
        this.U = true;
        this.f48384r.post(this.f48383q);
    }

    public void n0(boolean z10) {
        this.f48370d.s(z10);
    }

    public p1 o() {
        y();
        return this.I;
    }

    public void o0(long j10) {
        if (this.V != j10) {
            this.V = j10;
            for (d dVar : this.f48388v) {
                dVar.b0(j10);
            }
        }
    }

    public int p0(int i10, long j10) {
        if (R()) {
            return 0;
        }
        d dVar = this.f48388v[i10];
        int iF = dVar.F(j10, this.T);
        j jVar = (j) l1.x(this.f48380n, null);
        if (jVar != null && !jVar.q()) {
            iF = Math.min(iF, jVar.m(i10) - dVar.D());
        }
        dVar.f0(iF);
        return iF;
    }

    public void q0(int i10) {
        y();
        com.google.android.exoplayer2.util.a.g(this.K);
        int i11 = this.K[i10];
        com.google.android.exoplayer2.util.a.i(this.N[i11]);
        this.N[i11] = false;
    }

    @Override // com.google.android.exoplayer2.extractor.m
    public void t(b0 b0Var) {
    }

    public void u() throws IOException {
        V();
        if (this.T && !this.D) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    public void v(long j10, boolean z10) {
        if (!this.C || R()) {
            return;
        }
        int length = this.f48388v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f48388v[i10].q(j10, z10, this.N[i10]);
        }
    }

    public int z(int i10) {
        y();
        com.google.android.exoplayer2.util.a.g(this.K);
        int i11 = this.K[i10];
        if (i11 == -1) {
            return this.J.contains(this.I.c(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.N;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }
}
