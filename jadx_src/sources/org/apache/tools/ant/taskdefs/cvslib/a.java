package org.apache.tools.ant.taskdefs.cvslib;

import java.util.Date;
import java.util.Vector;

/* JADX INFO: compiled from: CVSEntry.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Date f133985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f133987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Vector<k> f133988d = new Vector<>();

    public a(Date date, String str, String str2) {
        this.f133985a = date;
        this.f133986b = str;
        this.f133987c = str2;
    }

    public void a(String str, String str2) {
        this.f133988d.add(new k(str, str2));
    }

    public void b(String str, String str2, String str3) {
        this.f133988d.add(new k(str, str2, str3));
    }

    public String c() {
        return this.f133986b;
    }

    public String d() {
        return this.f133987c;
    }

    public Date e() {
        return this.f133985a;
    }

    public Vector<k> f() {
        return this.f133988d;
    }

    public void g(String str) {
        this.f133986b = str;
    }

    public String toString() {
        return c() + "\n" + e() + "\n" + f() + "\n" + d();
    }
}
