package com.xiaomi.mipush.sdk;

import com.xiaomi.push.ir;

/* JADX INFO: loaded from: classes4.dex */
public class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C1063a f106742a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ ir f116a;

    aa(MiTinyDataClient.a.C1063a c1063a, ir irVar) {
        this.f106742a = c1063a;
        this.f116a = irVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f106742a.f111a.add(this.f116a);
        this.f106742a.a();
    }
}
