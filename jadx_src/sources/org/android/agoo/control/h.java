package org.android.agoo.control;

import android.content.Intent;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f132837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f132838b;

    h(g gVar, Intent intent) {
        this.f132838b = gVar;
        this.f132837a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f132838b.f132836a.onHandleIntent(this.f132837a);
    }
}
