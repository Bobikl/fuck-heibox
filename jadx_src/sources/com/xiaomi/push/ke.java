package com.xiaomi.push;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kj f107782a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final kq f916a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ByteArrayOutputStream f917a;

    public ke() {
        this(new kf.a());
    }

    public ke(kl klVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f917a = byteArrayOutputStream;
        kq kqVar = new kq(byteArrayOutputStream);
        this.f916a = kqVar;
        this.f107782a = klVar.a(kqVar);
    }

    public byte[] a(jy jyVar) {
        this.f917a.reset();
        jyVar.b(this.f107782a);
        return this.f917a.toByteArray();
    }
}
