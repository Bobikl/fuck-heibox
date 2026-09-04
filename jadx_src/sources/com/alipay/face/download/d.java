package com.alipay.face.download;

/* JADX INFO: compiled from: BioModelFile.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38715e;

    @Override // com.alipay.face.download.b
    public String a() {
        return this.f38713c;
    }

    @Override // com.alipay.face.download.b
    public String b() {
        return this.f38715e;
    }

    @Override // com.alipay.face.download.b
    public void c(String str) {
        this.f38715e = str;
    }

    public void d(String str) {
        this.f38712b = str;
    }

    public void e(String str) {
        this.f38713c = str;
    }

    public void f(String str) {
        this.f38711a = str;
    }

    public void g(String str) {
        this.f38714d = str;
    }

    @Override // com.alipay.face.download.b
    public String getFileName() {
        return this.f38712b;
    }

    @Override // com.alipay.face.download.b
    public String getUrl() {
        return this.f38711a;
    }

    @Override // com.alipay.face.download.b
    public String getVersion() {
        return this.f38714d;
    }

    public String toString() {
        return "BioModelFile{url='" + this.f38711a + "', fileName='" + this.f38712b + "', md5='" + this.f38713c + "', version='" + this.f38714d + "', savePath='" + this.f38715e + "'}";
    }
}
