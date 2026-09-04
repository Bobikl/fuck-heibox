package com.max.hbcommon.network;

import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ToastObserver.java */
/* JADX INFO: loaded from: classes9.dex */
public class q extends d<Result> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void onNext(Result result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.e.Vc, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNext(result);
        if (result == null || com.max.hbcommon.utils.c.u(result.getMsg())) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("成功");
        } else {
            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(result.getMsg());
        }
    }

    @Override // com.max.hbcommon.network.d, io.reactivex.g0
    public /* bridge */ /* synthetic */ void onNext(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.Wc, new Class[]{Object.class}, Void.TYPE).isSupported) {
            return;
        }
        onNext((Result) obj);
    }
}
