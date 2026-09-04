package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: QRCode.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u4 f61889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b3 f61890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b8 f61891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f61892d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c0 f61893e;

    public static boolean a(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public c0 a() {
        return this.f61893e;
    }

    public void a(b3 b3Var) {
        this.f61890b = b3Var;
    }

    public void a(b8 b8Var) {
        this.f61891c = b8Var;
    }

    public void a(c0 c0Var) {
        this.f61893e = c0Var;
    }

    public void a(u4 u4Var) {
        this.f61889a = u4Var;
    }

    public void b(int i10) {
        this.f61892d = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f61889a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f61890b);
        sb2.append("\n version: ");
        sb2.append(this.f61891c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f61892d);
        sb2.append(">>\n");
        return sb2.toString();
    }
}
