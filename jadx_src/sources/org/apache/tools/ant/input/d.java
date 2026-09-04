package org.apache.tools.ant.input;

/* JADX INFO: compiled from: InputRequest.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f133464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133466c;

    public d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("prompt must not be null");
        }
        this.f133464a = str;
    }

    public String a() {
        return this.f133466c;
    }

    public String b() {
        return this.f133465b;
    }

    public String c() {
        return this.f133464a;
    }

    public boolean d() {
        return true;
    }

    public void e(String str) {
        this.f133466c = str;
    }

    public void f(String str) {
        this.f133465b = str;
    }
}
