package com.umeng.socialize;

/* JADX INFO: loaded from: classes4.dex */
public class SocializeException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f106042b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f106043a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f106044c;

    public SocializeException(int i10, String str) {
        super(str);
        this.f106043a = i10;
        this.f106044c = str;
    }

    public SocializeException(String str) {
        super(str);
        this.f106043a = 5000;
        this.f106044c = str;
    }

    public SocializeException(String str, Throwable th2) {
        super(str, th2);
        this.f106043a = 5000;
        this.f106044c = str;
    }

    public int getErrorCode() {
        return this.f106043a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f106044c;
    }
}
