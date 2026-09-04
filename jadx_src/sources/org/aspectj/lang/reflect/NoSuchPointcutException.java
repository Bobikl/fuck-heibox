package org.aspectj.lang.reflect;

/* JADX INFO: loaded from: classes5.dex */
public class NoSuchPointcutException extends Exception {
    private static final long serialVersionUID = 3256444698657634352L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137694b;

    public NoSuchPointcutException(String str) {
        this.f137694b = str;
    }

    public String a() {
        return this.f137694b;
    }
}
