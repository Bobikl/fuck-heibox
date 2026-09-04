package com.vivo.push.ups;

import android.content.Context;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;

/* JADX INFO: compiled from: VUpsManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements IPushActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPSRegisterCallback f106644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f106645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ VUpsManager f106646c;

    a(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback, Context context) {
        this.f106646c = vUpsManager;
        this.f106644a = uPSRegisterCallback;
        this.f106645b = context;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i10) {
        this.f106644a.onResult(new TokenResult(i10, PushClient.getInstance(this.f106645b).getRegId()));
    }
}
