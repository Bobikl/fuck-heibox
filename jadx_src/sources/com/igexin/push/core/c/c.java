package com.igexin.push.core.c;

import com.igexin.push.util.d;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.igexin.push.f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f63653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f63654b;

    c(b bVar, byte[] bArr) {
        this.f63654b = bVar;
        this.f63653a = bArr;
    }

    @Override // com.igexin.push.f.b
    protected void a() throws Throwable {
        d.a(this.f63653a, com.igexin.push.core.d.f63671e.getFilesDir().getPath() + "/conf_n.pid", false);
    }
}
