package com.huawei.hms.scankit.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DataMask.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f61844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f61845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f61846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1 f61847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g1 f61848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g1 f61849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g1 f61850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g1 f61851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ g1[] f61852i;

    /* JADX INFO: compiled from: DataMask.java */
    public final enum a extends g1 {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.huawei.hms.scankit.p.g1
        boolean a(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f61844a = aVar;
        g1 g1Var = new g1("DATA_MASK_001", 1) { // from class: com.huawei.hms.scankit.p.g1.b
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.g1
            boolean a(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f61845b = g1Var;
        g1 g1Var2 = new g1("DATA_MASK_010", 2) { // from class: com.huawei.hms.scankit.p.g1.c
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.g1
            boolean a(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f61846c = g1Var2;
        g1 g1Var3 = new g1("DATA_MASK_011", 3) { // from class: com.huawei.hms.scankit.p.g1.d
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.g1
            boolean a(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        f61847d = g1Var3;
        g1 g1Var4 = new g1("DATA_MASK_100", 4) { // from class: com.huawei.hms.scankit.p.g1.e
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.g1
            boolean a(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        f61848e = g1Var4;
        g1 g1Var5 = new g1("DATA_MASK_101", 5) { // from class: com.huawei.hms.scankit.p.g1.f
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.g1
            boolean a(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        f61849f = g1Var5;
        g1 g1Var6 = new g1("DATA_MASK_110", 6) { // from class: com.huawei.hms.scankit.p.g1.g
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.g1
            boolean a(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        f61850g = g1Var6;
        g1 g1Var7 = new g1("DATA_MASK_111", 7) { // from class: com.huawei.hms.scankit.p.g1.h
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.g1
            boolean a(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        f61851h = g1Var7;
        f61852i = new g1[]{aVar, g1Var, g1Var2, g1Var3, g1Var4, g1Var5, g1Var6, g1Var7};
    }

    private g1(String str, int i10) {
        super(str, i10);
    }

    /* synthetic */ g1(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) f61852i.clone();
    }

    final void a(s sVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (a(i11, i12)) {
                    sVar.a(i12, i11);
                }
            }
        }
    }

    abstract boolean a(int i10, int i11);
}
