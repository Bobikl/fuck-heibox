package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.view.View;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BottomBarManager.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@dl.d com.max.hbcommon.base.d dVar, @dl.e String str, @dl.e View view, int i10, @dl.d NotificationType type) {
        Context context;
        if (PatchProxy.proxy(new Object[]{dVar, str, view, new Integer(i10), type}, null, changeQuickRedirect, true, 39811, new Class[]{com.max.hbcommon.base.d.class, String.class, View.class, Integer.TYPE, NotificationType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dVar, "<this>");
        f0.p(type, "type");
        if (str == null || (context = dVar.getContext()) == null) {
            return;
        }
        WebProtocolObj webProtocolObj = l0.e0(str);
        BottomBarManager bottomBarManager = BottomBarManager.f89397a;
        f0.o(webProtocolObj, "webProtocolObj");
        bottomBarManager.c(view, webProtocolObj, context, i10, type);
    }
}
