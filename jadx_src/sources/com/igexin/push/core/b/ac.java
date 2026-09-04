package com.igexin.push.core.b;

import com.igexin.push.util.EncryptUtils;

/* JADX INFO: loaded from: classes.dex */
public class ac extends com.igexin.push.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f63508a;

    ac(i iVar) {
        this.f63508a = iVar;
    }

    @Override // com.igexin.push.b.d
    public void a() throws Exception {
        i.a().a(this.f63328d, 1, EncryptUtils.getBytesEncrypted(String.valueOf(com.igexin.push.core.d.f63684r).getBytes()));
        i.a().a(this.f63328d, 20, this.f63508a.h(com.igexin.push.core.d.f63685s));
        com.igexin.push.core.e.d.a().b(com.igexin.push.core.d.f63671e, com.igexin.push.core.d.f63685s);
        com.igexin.push.core.e.d.a().a(com.igexin.push.core.d.f63671e, com.igexin.push.core.d.f63684r);
    }
}
