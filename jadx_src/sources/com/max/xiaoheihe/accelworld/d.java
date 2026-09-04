package com.max.xiaoheihe.accelworld;

import android.content.Context;
import com.max.hbsearch.SearchNewFragment;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWordRouter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d Context context, @dl.d String src, @dl.e String str, @dl.d SearchNewFragment.ContainerConfig containerConfig) {
        if (PatchProxy.proxy(new Object[]{context, src, str, containerConfig}, null, changeQuickRedirect, true, bb.c.m.mv, new Class[]{Context.class, String.class, String.class, SearchNewFragment.ContainerConfig.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<this>");
        f0.p(src, "src");
        f0.p(containerConfig, "containerConfig");
        com.max.xiaoheihe.base.router.b.x0(context, SearchHelper.f91573a.a().f(src, str, containerConfig)).A();
    }
}
