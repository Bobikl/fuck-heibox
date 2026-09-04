package og;

/* JADX INFO: compiled from: DimensionStatus.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f132295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f132296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f132297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f132298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f132299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f132300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f132301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f132302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f132303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f132304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f132305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f132306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a[] f132307o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f132308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f132309b;

    static {
        a aVar = new a(0, false);
        f132295c = aVar;
        a aVar2 = new a(1, true);
        f132296d = aVar2;
        a aVar3 = new a(2, false);
        f132297e = aVar3;
        a aVar4 = new a(3, true);
        f132298f = aVar4;
        a aVar5 = new a(4, false);
        f132299g = aVar5;
        a aVar6 = new a(5, true);
        f132300h = aVar6;
        a aVar7 = new a(6, false);
        f132301i = aVar7;
        a aVar8 = new a(7, true);
        f132302j = aVar8;
        a aVar9 = new a(8, false);
        f132303k = aVar9;
        a aVar10 = new a(9, true);
        f132304l = aVar10;
        a aVar11 = new a(10, false);
        f132305m = aVar11;
        a aVar12 = new a(10, true);
        f132306n = aVar12;
        f132307o = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
    }

    private a(int i10, boolean z10) {
        this.f132308a = i10;
        this.f132309b = z10;
    }

    public boolean a(a aVar) {
        int i10 = this.f132308a;
        int i11 = aVar.f132308a;
        return i10 < i11 || ((!this.f132309b || f132304l == this) && i10 == i11);
    }

    public a b() {
        return !this.f132309b ? f132307o[this.f132308a + 1] : this;
    }

    public a c() {
        if (!this.f132309b) {
            return this;
        }
        a aVar = f132307o[this.f132308a - 1];
        return !aVar.f132309b ? aVar : f132295c;
    }
}
