package com.taobao.accs.utl;

import android.content.Intent;
import com.taobao.accs.base.AccsDataListener;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AccsDataListener f98462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f98464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Intent f98465d;

    c(AccsDataListener accsDataListener, String str, int i10, Intent intent) {
        this.f98462a = accsDataListener;
        this.f98463b = str;
        this.f98464c = i10;
        this.f98465d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98462a.onUnbind(this.f98463b, this.f98464c, a.c(this.f98465d));
    }
}
