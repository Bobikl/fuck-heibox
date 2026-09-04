package com.max.hbcommon.network;

import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: SilentObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public class p extends d<Result> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.hbcommon.network.d, io.reactivex.g0
    public void onComplete() {
    }

    @Override // com.max.hbcommon.network.d, io.reactivex.g0
    public void onError(Throwable th2) {
    }

    public void onNext(Result result) {
    }

    @Override // com.max.hbcommon.network.d, io.reactivex.g0
    public /* bridge */ /* synthetic */ void onNext(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.Uc, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        onNext((Result) obj);
    }
}
