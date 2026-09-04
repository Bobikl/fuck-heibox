package org.apache.tools.ant.taskdefs.cvslib;

/* JADX INFO: compiled from: RCSFile.java */
/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f134018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f134019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f134020c;

    k(String str, String str2) {
        this(str, str2, null);
    }

    k(String str, String str2, String str3) {
        this.f134018a = str;
        this.f134019b = str2;
        if (str2.equals(str3)) {
            return;
        }
        this.f134020c = str3;
    }

    String a() {
        return this.f134018a;
    }

    String b() {
        return this.f134020c;
    }

    String c() {
        return this.f134019b;
    }
}
