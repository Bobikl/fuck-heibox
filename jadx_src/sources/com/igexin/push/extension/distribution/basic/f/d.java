package com.igexin.push.extension.distribution.basic.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d extends com.igexin.a.a.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f63994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    byte[] f63995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f63996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f63997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f63998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f63999f;

    public d(String str) {
        this.f63994a = str;
    }

    public void a(Exception exc) {
    }

    public void a(byte[] bArr) throws Exception {
        this.f63999f = false;
        if (bArr != null && bArr.length >= 7 && bArr[5] == 111 && bArr[6] == 107) {
            this.f63999f = true;
        }
    }

    public String b() {
        return this.f63994a;
    }

    public void b(byte[] bArr) {
        this.f63995b = bArr;
    }

    public byte[] c() {
        return this.f63995b;
    }

    public boolean d() {
        return this.f63996c;
    }

    public boolean e() {
        return this.f63997d;
    }
}
