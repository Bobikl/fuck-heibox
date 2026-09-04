package com.taobao.accs.net;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f98366a;

    t(k kVar) {
        this.f98366a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            k kVar = this.f98366a;
            if (kVar.f98300d == null || TextUtils.isEmpty(kVar.i())) {
                return;
            }
            ALog.i(this.f98366a.d(), "mTryStartServiceRunable bindapp", new Object[0]);
            this.f98366a.k();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
