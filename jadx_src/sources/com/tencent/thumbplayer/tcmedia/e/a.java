package com.tencent.thumbplayer.tcmedia.e;

import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f102613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f102614b;

    public a(b bVar) {
        this.f102614b = bVar;
        this.f102613a = bVar.a();
    }

    public a(b bVar, String str) {
        b bVar2 = new b(bVar, str);
        this.f102614b = bVar2;
        this.f102613a = bVar2.a();
    }

    public b a() {
        return this.f102614b;
    }

    public void a(b bVar) {
        if (bVar == null) {
            this.f102614b = new b(this.f102613a);
        } else {
            this.f102614b = bVar;
        }
    }

    public void a(Exception exc) {
        TPLogUtil.e(this.f102614b.a(), exc);
    }

    public void a(String str) {
        this.f102614b.a(str);
    }

    public String b() {
        return this.f102614b.a();
    }

    public void b(String str) {
        TPLogUtil.d(this.f102614b.a(), str);
    }

    public void c(String str) {
        TPLogUtil.i(this.f102614b.a(), str);
    }

    public void d(String str) {
        TPLogUtil.w(this.f102614b.a(), str);
    }

    public void e(String str) {
        TPLogUtil.e(this.f102614b.a(), str);
    }
}
