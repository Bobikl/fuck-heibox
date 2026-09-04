package com.igexin.push.core.b;

/* JADX INFO: loaded from: classes.dex */
public class y extends com.igexin.push.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f63550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f63551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f63552c;

    y(i iVar, boolean z10, String str) {
        this.f63552c = iVar;
        this.f63550a = z10;
        this.f63551b = str;
    }

    @Override // com.igexin.push.b.d
    public void a() throws Exception {
        i.a().a(this.f63328d, this.f63550a ? 50 : 49, this.f63552c.h(this.f63551b));
    }
}
