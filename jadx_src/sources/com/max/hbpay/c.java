package com.max.hbpay;

import com.alipay.sdk.app.EnvUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: PayUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.i.f33352m2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        EnvUtils.c(EnvUtils.EnvEnum.SANDBOX);
    }
}
