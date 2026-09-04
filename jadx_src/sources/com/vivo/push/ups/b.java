package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* JADX INFO: compiled from: VUpsManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements IPushActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPSRegisterCallback f106647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ VUpsManager f106648b;

    b(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback) {
        this.f106648b = vUpsManager;
        this.f106647a = uPSRegisterCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i10) {
        this.f106647a.onResult(new TokenResult(i10, ""));
    }
}
