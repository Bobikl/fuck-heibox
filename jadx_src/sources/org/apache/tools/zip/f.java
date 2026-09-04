package org.apache.tools.zip;

/* JADX INFO: compiled from: GeneralPurposeBit.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f137402f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f137403g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f137404h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f137405i = 2048;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f137406b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f137407c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f137408d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f137409e = false;

    public static f c(byte[] bArr, int i10) {
        int iE = a0.e(bArr, i10);
        f fVar = new f();
        fVar.d((iE & 8) != 0);
        fVar.g((iE & 2048) != 0);
        fVar.f((iE & 64) != 0);
        fVar.e((iE & 1) != 0);
        return fVar;
    }

    public void a(byte[] bArr, int i10) {
        a0.f((this.f137407c ? 8 : 0) | (this.f137406b ? 2048 : 0) | (this.f137408d ? 1 : 0) | (this.f137409e ? 64 : 0), bArr, i10);
    }

    public byte[] b() {
        byte[] bArr = new byte[2];
        a(bArr, 0);
        return bArr;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", e10);
        }
    }

    public void d(boolean z10) {
        this.f137407c = z10;
    }

    public void e(boolean z10) {
        this.f137408d = z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f137408d == this.f137408d && fVar.f137409e == this.f137409e && fVar.f137406b == this.f137406b && fVar.f137407c == this.f137407c;
    }

    public void f(boolean z10) {
        this.f137409e = z10;
        if (z10) {
            e(true);
        }
    }

    public void g(boolean z10) {
        this.f137406b = z10;
    }

    public boolean h() {
        return this.f137407c;
    }

    public int hashCode() {
        return (((((((this.f137408d ? 1 : 0) * 17) + (this.f137409e ? 1 : 0)) * 13) + (this.f137406b ? 1 : 0)) * 7) + (this.f137407c ? 1 : 0)) * 3;
    }

    public boolean i() {
        return this.f137408d;
    }

    public boolean j() {
        return this.f137408d && this.f137409e;
    }

    public boolean k() {
        return this.f137406b;
    }
}
