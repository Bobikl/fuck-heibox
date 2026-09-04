package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: BoundingBox.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f61506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u6 f61507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u6 f61508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u6 f61509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u6 f61510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f61511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f61512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f61513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f61514i;

    a0(a0 a0Var) {
        this.f61506a = a0Var.f61506a;
        this.f61507b = a0Var.g();
        this.f61508c = a0Var.a();
        this.f61509d = a0Var.h();
        this.f61510e = a0Var.b();
        this.f61511f = a0Var.e();
        this.f61512g = a0Var.c();
        this.f61513h = a0Var.f();
        this.f61514i = a0Var.d();
    }

    a0(s sVar, u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4) throws a {
        boolean z10 = u6Var == null || u6Var2 == null;
        boolean z11 = u6Var3 == null || u6Var4 == null;
        if (z10 && z11) {
            throw a.a();
        }
        if (z10) {
            u6Var = new u6(0.0f, u6Var3.c());
            u6Var2 = new u6(0.0f, u6Var4.c());
        } else if (z11) {
            u6Var3 = new u6(sVar.e() - 1, u6Var.c());
            u6Var4 = new u6(sVar.e() - 1, u6Var2.c());
        }
        this.f61506a = sVar;
        this.f61507b = u6Var;
        this.f61508c = u6Var2;
        this.f61509d = u6Var3;
        this.f61510e = u6Var4;
        this.f61511f = (int) Math.min(u6Var.b(), u6Var2.b());
        this.f61512g = (int) Math.max(u6Var3.b(), u6Var4.b());
        this.f61513h = (int) Math.min(u6Var.c(), u6Var3.c());
        this.f61514i = (int) Math.max(u6Var2.c(), u6Var4.c());
    }

    static a0 a(a0 a0Var, a0 a0Var2) throws a {
        if (a0Var == null) {
            return a0Var2;
        }
        return a0Var2 == null ? a0Var : new a0(a0Var.f61506a, a0Var.f61507b, a0Var.f61508c, a0Var2.f61509d, a0Var2.f61510e);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    a0 a(int i10, int i11, boolean z10) throws a {
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        u6 u6Var5;
        int iC;
        u6 u6Var6;
        u6 u6Var7 = this.f61507b;
        u6 u6Var8 = this.f61508c;
        u6 u6Var9 = this.f61509d;
        u6 u6Var10 = this.f61510e;
        if (i10 > 0) {
            u6 u6Var11 = z10 ? u6Var7 : u6Var9;
            int iC2 = ((int) u6Var11.c()) - i10;
            if (iC2 < 0) {
                iC2 = 0;
            }
            u6 u6Var12 = new u6(u6Var11.b(), iC2);
            if (z10) {
                u6Var = u6Var12;
            } else {
                u6Var2 = u6Var12;
                u6Var = u6Var7;
            }
            if (i11 > 0) {
                if (z10) {
                    u6Var5 = this.f61508c;
                } else {
                    u6Var5 = this.f61510e;
                }
                iC = ((int) u6Var5.c()) + i11;
                if (iC >= this.f61506a.c()) {
                    iC = this.f61506a.c() - 1;
                }
                u6Var6 = new u6(u6Var5.b(), iC);
                if (z10) {
                    u6Var3 = u6Var6;
                } else {
                    u6Var4 = u6Var6;
                    u6Var3 = u6Var8;
                }
                return new a0(this.f61506a, u6Var, u6Var3, u6Var2, u6Var4);
            }
            u6Var3 = u6Var8;
            u6Var4 = u6Var10;
            return new a0(this.f61506a, u6Var, u6Var3, u6Var2, u6Var4);
        }
        u6Var = u6Var7;
        u6Var2 = u6Var9;
        if (i11 > 0) {
            if (z10) {
                u6Var5 = this.f61508c;
            } else {
                u6Var5 = this.f61510e;
            }
            iC = ((int) u6Var5.c()) + i11;
            if (iC >= this.f61506a.c()) {
                iC = this.f61506a.c() - 1;
            }
            u6Var6 = new u6(u6Var5.b(), iC);
            if (z10) {
                u6Var3 = u6Var6;
            } else {
                u6Var4 = u6Var6;
                u6Var3 = u6Var8;
            }
            return new a0(this.f61506a, u6Var, u6Var3, u6Var2, u6Var4);
        }
        u6Var3 = u6Var8;
        u6Var4 = u6Var10;
        return new a0(this.f61506a, u6Var, u6Var3, u6Var2, u6Var4);
    }

    u6 a() {
        return this.f61508c;
    }

    u6 b() {
        return this.f61510e;
    }

    int c() {
        return this.f61512g;
    }

    int d() {
        return this.f61514i;
    }

    int e() {
        return this.f61511f;
    }

    int f() {
        return this.f61513h;
    }

    u6 g() {
        return this.f61507b;
    }

    u6 h() {
        return this.f61509d;
    }
}
