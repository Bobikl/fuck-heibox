package org.jsoup;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class HttpStatusException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137826c;

    public HttpStatusException(String str, int i10, String str2) {
        super(str);
        this.f137825b = i10;
        this.f137826c = str2;
    }

    public int a() {
        return this.f137825b;
    }

    public String b() {
        return this.f137826c;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Status=" + this.f137825b + ", URL=" + this.f137826c;
    }
}
