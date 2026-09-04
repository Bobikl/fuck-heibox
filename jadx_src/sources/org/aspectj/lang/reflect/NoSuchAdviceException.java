package org.aspectj.lang.reflect;

/* JADX INFO: loaded from: classes5.dex */
public class NoSuchAdviceException extends Exception {
    private static final long serialVersionUID = 3256444698657634352L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137693b;

    public NoSuchAdviceException(String str) {
        this.f137693b = str;
    }

    public String a() {
        return this.f137693b;
    }
}
