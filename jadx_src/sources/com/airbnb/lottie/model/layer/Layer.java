package com.airbnb.lottie.model.layer;

import androidx.annotation.p0;
import com.airbnb.lottie.model.animatable.j;
import com.airbnb.lottie.model.animatable.k;
import com.airbnb.lottie.model.animatable.l;
import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class Layer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.c> f37589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.g f37590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f37592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayerType f37593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f37594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final String f37595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Mask> f37596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f37597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f37598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f37599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f37600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f37601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f37602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f37603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f37604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private final j f37605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private final k f37606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f37607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<Float>> f37608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final MatteType f37609u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f37610v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.content.a f37611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.parser.j f37612x;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<com.airbnb.lottie.model.content.c> list, com.airbnb.lottie.g gVar, String str, long j10, LayerType layerType, long j11, @p0 String str2, List<Mask> list2, l lVar, int i10, int i11, int i12, float f10, float f11, int i13, int i14, @p0 j jVar, @p0 k kVar, List<com.airbnb.lottie.value.a<Float>> list3, MatteType matteType, @p0 com.airbnb.lottie.model.animatable.b bVar, boolean z10, @p0 com.airbnb.lottie.model.content.a aVar, @p0 com.airbnb.lottie.parser.j jVar2) {
        this.f37589a = list;
        this.f37590b = gVar;
        this.f37591c = str;
        this.f37592d = j10;
        this.f37593e = layerType;
        this.f37594f = j11;
        this.f37595g = str2;
        this.f37596h = list2;
        this.f37597i = lVar;
        this.f37598j = i10;
        this.f37599k = i11;
        this.f37600l = i12;
        this.f37601m = f10;
        this.f37602n = f11;
        this.f37603o = i13;
        this.f37604p = i14;
        this.f37605q = jVar;
        this.f37606r = kVar;
        this.f37608t = list3;
        this.f37609u = matteType;
        this.f37607s = bVar;
        this.f37610v = z10;
        this.f37611w = aVar;
        this.f37612x = jVar2;
    }

    @p0
    public com.airbnb.lottie.model.content.a a() {
        return this.f37611w;
    }

    com.airbnb.lottie.g b() {
        return this.f37590b;
    }

    @p0
    public com.airbnb.lottie.parser.j c() {
        return this.f37612x;
    }

    public long d() {
        return this.f37592d;
    }

    List<com.airbnb.lottie.value.a<Float>> e() {
        return this.f37608t;
    }

    public LayerType f() {
        return this.f37593e;
    }

    List<Mask> g() {
        return this.f37596h;
    }

    MatteType h() {
        return this.f37609u;
    }

    String i() {
        return this.f37591c;
    }

    long j() {
        return this.f37594f;
    }

    int k() {
        return this.f37604p;
    }

    int l() {
        return this.f37603o;
    }

    @p0
    String m() {
        return this.f37595g;
    }

    List<com.airbnb.lottie.model.content.c> n() {
        return this.f37589a;
    }

    int o() {
        return this.f37600l;
    }

    int p() {
        return this.f37599k;
    }

    int q() {
        return this.f37598j;
    }

    float r() {
        return this.f37602n / this.f37590b.e();
    }

    @p0
    j s() {
        return this.f37605q;
    }

    @p0
    k t() {
        return this.f37606r;
    }

    public String toString() {
        return y("");
    }

    @p0
    com.airbnb.lottie.model.animatable.b u() {
        return this.f37607s;
    }

    float v() {
        return this.f37601m;
    }

    l w() {
        return this.f37597i;
    }

    public boolean x() {
        return this.f37610v;
    }

    public String y(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i());
        sb2.append("\n");
        Layer layerX = this.f37590b.x(j());
        if (layerX != null) {
            sb2.append("\t\tParents: ");
            sb2.append(layerX.i());
            Layer layerX2 = this.f37590b.x(layerX.j());
            while (layerX2 != null) {
                sb2.append("->");
                sb2.append(layerX2.i());
                layerX2 = this.f37590b.x(layerX2.j());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!g().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(g().size());
            sb2.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f37589a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.c cVar : this.f37589a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
