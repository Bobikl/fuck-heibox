package com.max.xiaoheihe.accelworld;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldToast.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d String msg) {
        if (PatchProxy.proxy(new Object[]{msg}, null, changeQuickRedirect, true, bb.c.m.Oy, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(msg, "msg");
        com.max.hbutils.utils.c.f(msg);
    }
}
