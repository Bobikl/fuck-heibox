package org.apache.tools.ant.types;

import java.net.URL;

/* JADX INFO: compiled from: ResourceLocation.java */
/* JADX INFO: loaded from: classes5.dex */
public class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f136662a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136663b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private URL f136664c = null;

    public URL a() {
        return this.f136664c;
    }

    public String b() {
        return this.f136663b;
    }

    public String c() {
        return this.f136662a;
    }

    public void d(URL url) {
        this.f136664c = url;
    }

    public void e(String str) {
        this.f136663b = str;
    }

    public void f(String str) {
        this.f136662a = str;
    }
}
