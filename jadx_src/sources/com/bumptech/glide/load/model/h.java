package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: GlideUrl.java */
/* JADX INFO: loaded from: classes6.dex */
public class h implements com.bumptech.glide.load.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f41347j = "@#&=*+-_.,:!?()/~'%;$";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f41348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final URL f41349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final String f41350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private String f41351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private URL f41352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private volatile byte[] f41353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41354i;

    public h(String str) {
        this(str, i.f41356b);
    }

    public h(String str, i iVar) {
        this.f41349d = null;
        this.f41350e = com.bumptech.glide.util.m.c(str);
        this.f41348c = (i) com.bumptech.glide.util.m.e(iVar);
    }

    public h(URL url) {
        this(url, i.f41356b);
    }

    public h(URL url, i iVar) {
        this.f41349d = (URL) com.bumptech.glide.util.m.e(url);
        this.f41350e = null;
        this.f41348c = (i) com.bumptech.glide.util.m.e(iVar);
    }

    private byte[] d() {
        if (this.f41353h == null) {
            this.f41353h = c().getBytes(com.bumptech.glide.load.c.f40833b);
        }
        return this.f41353h;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f41351f)) {
            String string = this.f41350e;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) com.bumptech.glide.util.m.e(this.f41349d)).toString();
            }
            this.f41351f = Uri.encode(string, f41347j);
        }
        return this.f41351f;
    }

    private URL g() throws MalformedURLException {
        if (this.f41352g == null) {
            this.f41352g = new URL(f());
        }
        return this.f41352g;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f41350e;
        return str != null ? str : ((URL) com.bumptech.glide.util.m.e(this.f41349d)).toString();
    }

    public Map<String, String> e() {
        return this.f41348c.b();
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c().equals(hVar.c()) && this.f41348c.equals(hVar.f41348c);
    }

    public String h() {
        return f();
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        if (this.f41354i == 0) {
            int iHashCode = c().hashCode();
            this.f41354i = iHashCode;
            this.f41354i = (iHashCode * 31) + this.f41348c.hashCode();
        }
        return this.f41354i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }
}
