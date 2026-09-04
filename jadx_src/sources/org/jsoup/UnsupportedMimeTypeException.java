package org.jsoup;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class UnsupportedMimeTypeException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137828c;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.f137827b = str2;
        this.f137828c = str3;
    }

    public String a() {
        return this.f137827b;
    }

    public String b() {
        return this.f137828c;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.f137827b + ", URL=" + this.f137828c;
    }
}
