package org.apache.tools.ant.types;

import java.util.Objects;

/* JADX INFO: compiled from: ModuleVersion.java */
/* JADX INFO: loaded from: classes5.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f136218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f136220c;

    public String a() {
        return this.f136220c;
    }

    public String b() {
        return this.f136218a;
    }

    public String c() {
        return this.f136219b;
    }

    public void d(String str) {
        this.f136220c = str;
    }

    public void e(String str) {
        Objects.requireNonNull(str, "Version number cannot be null.");
        if (str.indexOf(45) >= 0 || str.indexOf(43) >= 0) {
            throw new IllegalArgumentException("Version number cannot contain '-' or '+'.");
        }
        this.f136218a = str;
    }

    public void f(String str) {
        if (str != null && str.indexOf(43) >= 0) {
            throw new IllegalArgumentException("Version's pre-release cannot contain '+'.");
        }
        this.f136219b = str;
    }

    public String g() {
        String str = this.f136218a;
        if (str == null) {
            throw new IllegalStateException("Version number cannot be null.");
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (this.f136219b != null || this.f136220c != null) {
            sb2.append('-');
            sb2.append(Objects.toString(this.f136219b, ""));
        }
        if (this.f136220c != null) {
            sb2.append('+');
            sb2.append(this.f136220c);
        }
        return sb2.toString();
    }

    public String toString() {
        return getClass().getName() + "[number=" + this.f136218a + ", preRelease=" + this.f136219b + ", build=" + this.f136220c + "]";
    }
}
