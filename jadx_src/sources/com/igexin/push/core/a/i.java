package com.igexin.push.core.a;

import com.igexin.push.core.bean.PushTaskBean;

/* JADX INFO: loaded from: classes.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PushTaskBean f63488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f63489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f63490c;

    i(e eVar, PushTaskBean pushTaskBean, String str) {
        this.f63490c = eVar;
        this.f63488a = pushTaskBean;
        this.f63489b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f63490c.b(this.f63488a, this.f63489b);
    }
}
