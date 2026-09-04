package com.max.hbcommon.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: BaseObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public class d<T> extends io.reactivex.observers.d<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // io.reactivex.g0
    public void onComplete() {
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.e.f32009sb, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        a.a(th2, true);
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
    }
}
