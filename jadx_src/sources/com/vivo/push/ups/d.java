package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* JADX INFO: compiled from: VUpsManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements IPushActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPSTurnCallback f106651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ VUpsManager f106652b;

    d(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.f106652b = vUpsManager;
        this.f106651a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i10) {
        this.f106651a.onResult(new CodeResult(i10));
    }
}
