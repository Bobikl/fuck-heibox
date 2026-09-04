package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* JADX INFO: compiled from: VUpsManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements IPushActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPSTurnCallback f106649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ VUpsManager f106650b;

    c(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.f106650b = vUpsManager;
        this.f106649a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i10) {
        this.f106649a.onResult(new CodeResult(i10));
    }
}
