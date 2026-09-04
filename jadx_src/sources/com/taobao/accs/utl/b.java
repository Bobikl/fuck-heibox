package com.taobao.accs.utl;

import android.content.Intent;
import com.taobao.accs.base.AccsDataListener;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AccsDataListener f98458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f98460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Intent f98461d;

    b(AccsDataListener accsDataListener, String str, int i10, Intent intent) {
        this.f98458a = accsDataListener;
        this.f98459b = str;
        this.f98460c = i10;
        this.f98461d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98458a.onBind(this.f98459b, this.f98460c, a.c(this.f98461d));
    }
}
