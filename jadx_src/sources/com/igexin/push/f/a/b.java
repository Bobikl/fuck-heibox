package com.igexin.push.f.a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends com.igexin.a.a.d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f64015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte[] f64016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64017e;

    public b(String str) {
        this.f64015c = str;
    }

    public void a(Exception exc) {
    }

    public void a(byte[] bArr) throws Exception {
        this.f64017e = false;
        if (bArr != null && bArr.length >= 7 && bArr[5] == 111 && bArr[6] == 107) {
            this.f64017e = true;
        }
    }

    public void b(byte[] bArr) {
        this.f64016d = bArr;
    }

    public String c() {
        return this.f64015c;
    }

    public byte[] d() {
        return this.f64016d;
    }
}
