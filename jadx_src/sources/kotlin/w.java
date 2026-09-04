package kotlin;

/* JADX INFO: compiled from: KotlinVersion.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.1")
public final class w implements Comparable<w> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f128652g = 255;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f128654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f128655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f128656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f128657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f128651f = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final w f128653h = x.a();

    /* JADX INFO: compiled from: KotlinVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public w(int i10, int i11) {
        this(i10, i11, 0);
    }

    public w(int i10, int i11, int i12) {
        this.f128654b = i10;
        this.f128655c = i11;
        this.f128656d = i12;
        this.f128657e = g(i10, i11, i12);
    }

    private final int g(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new fi.l(0, 255).s(i10) && new fi.l(0, 255).s(i11) && new fi.l(0, 255).s(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + lg.a.f131414g + i11 + lg.a.f131414g + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@dl.d w other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return this.f128657e - other.f128657e;
    }

    public final int b() {
        return this.f128654b;
    }

    public final int c() {
        return this.f128655c;
    }

    public final int d() {
        return this.f128656d;
    }

    public final boolean e(int i10, int i11) {
        int i12 = this.f128654b;
        return i12 > i10 || (i12 == i10 && this.f128655c >= i11);
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        w wVar = obj instanceof w ? (w) obj : null;
        return wVar != null && this.f128657e == wVar.f128657e;
    }

    public final boolean f(int i10, int i11, int i12) {
        int i13;
        int i14 = this.f128654b;
        return i14 > i10 || (i14 == i10 && ((i13 = this.f128655c) > i11 || (i13 == i11 && this.f128656d >= i12)));
    }

    public int hashCode() {
        return this.f128657e;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f128654b);
        sb2.append(lg.a.f131414g);
        sb2.append(this.f128655c);
        sb2.append(lg.a.f131414g);
        sb2.append(this.f128656d);
        return sb2.toString();
    }
}
