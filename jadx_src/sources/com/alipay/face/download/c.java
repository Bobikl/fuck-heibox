package com.alipay.face.download;

/* JADX INFO: compiled from: BioLibFile.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f38710f;

    @Override // com.alipay.face.download.b
    public String a() {
        return this.f38708d;
    }

    @Override // com.alipay.face.download.b
    public String b() {
        return this.f38710f;
    }

    @Override // com.alipay.face.download.b
    public void c(String str) {
        this.f38710f = str;
    }

    public String d() {
        return this.f38707c;
    }

    public void e(String str) {
        this.f38707c = str;
    }

    public void f(String str) {
        this.f38705a = str;
    }

    public void g(String str) {
        this.f38708d = str;
    }

    @Override // com.alipay.face.download.b
    public String getFileName() {
        return this.f38705a;
    }

    @Override // com.alipay.face.download.b
    public String getUrl() {
        return this.f38706b;
    }

    @Override // com.alipay.face.download.b
    public String getVersion() {
        return this.f38709e;
    }

    public void h(String str) {
        this.f38706b = str;
    }

    public void i(String str) {
        this.f38709e = str;
    }

    public String toString() {
        return "BioLibFile{fileName='" + this.f38705a + "', url='" + this.f38706b + "', arch='" + this.f38707c + "', md5='" + this.f38708d + "', version='" + this.f38709e + "', savePath='" + this.f38710f + "'}";
    }
}
