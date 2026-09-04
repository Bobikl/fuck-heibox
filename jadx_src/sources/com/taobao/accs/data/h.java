package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f98264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f98265b;

    h(Context context, Intent intent) {
        this.f98264a = context;
        this.f98265b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        g.a().b(this.f98264a, this.f98265b);
    }
}
