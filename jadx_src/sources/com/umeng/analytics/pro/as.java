package com.umeng.analytics.pro;

/* JADX INFO: compiled from: TApplicationException.java */
/* JADX INFO: loaded from: classes4.dex */
public class as extends az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104534a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104535b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104536c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104537d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104538e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104539f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104540g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104541h = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final bx f104542j = new bx("TApplicationException");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final bn f104543k = new bn("message", (byte) 11, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final bn f104544l = new bn("type", (byte) 8, 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f104545m = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f104546i;

    public as() {
        this.f104546i = 0;
    }

    public as(int i10) {
        this.f104546i = i10;
    }

    public as(int i10, String str) {
        super(str);
        this.f104546i = i10;
    }

    public as(String str) {
        super(str);
        this.f104546i = 0;
    }

    public static as a(bs bsVar) throws az {
        bsVar.j();
        String strZ = null;
        int iW = 0;
        while (true) {
            bn bnVarL = bsVar.l();
            byte b10 = bnVarL.f104628b;
            if (b10 == 0) {
                bsVar.k();
                return new as(iW, strZ);
            }
            short s10 = bnVarL.f104629c;
            if (s10 != 1) {
                if (s10 != 2) {
                    bv.a(bsVar, b10);
                } else if (b10 == 8) {
                    iW = bsVar.w();
                } else {
                    bv.a(bsVar, b10);
                }
            } else if (b10 == 11) {
                strZ = bsVar.z();
            } else {
                bv.a(bsVar, b10);
            }
            bsVar.m();
        }
    }

    public int a() {
        return this.f104546i;
    }

    public void b(bs bsVar) throws az {
        bsVar.a(f104542j);
        if (getMessage() != null) {
            bsVar.a(f104543k);
            bsVar.a(getMessage());
            bsVar.c();
        }
        bsVar.a(f104544l);
        bsVar.a(this.f104546i);
        bsVar.c();
        bsVar.d();
        bsVar.b();
    }
}
