package com.huawei.hms.scankit.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DataMask.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f61793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f61794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f61795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1 f61796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1 f61797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f1 f61798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f1 f61799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f1 f61800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ f1[] f61801i;

    /* JADX INFO: compiled from: DataMask.java */
    public final enum a extends f1 {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.huawei.hms.scankit.p.f1
        boolean a(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f61793a = aVar;
        f1 f1Var = new f1("DATA_MASK_001", 1) { // from class: com.huawei.hms.scankit.p.f1.b
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.f1
            boolean a(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f61794b = f1Var;
        f1 f1Var2 = new f1("DATA_MASK_010", 2) { // from class: com.huawei.hms.scankit.p.f1.c
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.f1
            boolean a(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f61795c = f1Var2;
        f1 f1Var3 = new f1("DATA_MASK_011", 3) { // from class: com.huawei.hms.scankit.p.f1.d
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.f1
            boolean a(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        f61796d = f1Var3;
        f1 f1Var4 = new f1("DATA_MASK_100", 4) { // from class: com.huawei.hms.scankit.p.f1.e
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.f1
            boolean a(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        f61797e = f1Var4;
        f1 f1Var5 = new f1("DATA_MASK_101", 5) { // from class: com.huawei.hms.scankit.p.f1.f
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.f1
            boolean a(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        f61798f = f1Var5;
        f1 f1Var6 = new f1("DATA_MASK_110", 6) { // from class: com.huawei.hms.scankit.p.f1.g
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.f1
            boolean a(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        f61799g = f1Var6;
        f1 f1Var7 = new f1("DATA_MASK_111", 7) { // from class: com.huawei.hms.scankit.p.f1.h
            {
                a aVar2 = null;
            }

            @Override // com.huawei.hms.scankit.p.f1
            boolean a(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        f61800h = f1Var7;
        f61801i = new f1[]{aVar, f1Var, f1Var2, f1Var3, f1Var4, f1Var5, f1Var6, f1Var7};
    }

    private f1(String str, int i10) {
        super(str, i10);
    }

    /* synthetic */ f1(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) f61801i.clone();
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
