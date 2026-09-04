package com.igexin.push.core.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class h implements com.igexin.push.core.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f63486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f63487b;

    h(g gVar, Object obj) {
        this.f63487b = gVar;
        this.f63486a = obj;
    }

    @Override // com.igexin.push.core.d.e
    public void a(boolean z10, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(com.igexin.push.core.d.av)) {
            com.igexin.push.core.b.i.a().g(str);
        }
        synchronized (this.f63486a) {
            this.f63487b.f63485b = false;
            this.f63486a.notifyAll();
        }
    }
}
