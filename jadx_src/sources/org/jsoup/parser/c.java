package org.jsoup.parser;

/* JADX INFO: compiled from: ParseError.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f137940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f137941b;

    c(int i10, String str) {
        this.f137940a = i10;
        this.f137941b = str;
    }

    c(int i10, String str, Object... objArr) {
        this.f137941b = String.format(str, objArr);
        this.f137940a = i10;
    }

    public String a() {
        return this.f137941b;
    }

    public int b() {
        return this.f137940a;
    }

    public String toString() {
        return this.f137940a + ": " + this.f137941b;
    }
}
