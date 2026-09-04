package com.max.xiaoheihe.module.miniprogram;

import androidx.navigation.NavController;
import com.max.xiaoheihe.accelworld.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramHostActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f91082a = "MiniProgramHostActivity";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final boolean a(@dl.d NavController navController) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{navController}, null, changeQuickRedirect, true, 42225, new Class[]{NavController.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(navController, "<this>");
        if (o.b(navController).size() <= 2) {
            return false;
        }
        return navController.L0();
    }
}
