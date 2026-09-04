package com.max.xiaoheihe.accelworld;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.reflect.Field;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AccelWorldNavigation.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final String a(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.jx, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return "";
        }
        return "android-app://androidx.navigation/" + str;
    }

    @dl.d
    public static final kotlin.collections.i<NavBackStackEntry> b(@dl.d NavController navController) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{navController}, null, changeQuickRedirect, true, bb.c.m.ix, new Class[]{NavController.class}, kotlin.collections.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (kotlin.collections.i) patchProxyResultProxy.result;
        }
        f0.p(navController, "<this>");
        try {
            Field declaredField = NavController.class.getDeclaredField(RXScreenCaptureService.KEY_HEIGHT);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(navController);
            kotlin.collections.i<NavBackStackEntry> iVar = obj instanceof kotlin.collections.i ? (kotlin.collections.i) obj : null;
            return iVar == null ? new kotlin.collections.i<>() : iVar;
        } catch (Exception e10) {
            com.max.heybox.hblog.g.f74531b.v("[NavController] fastGetBackQueue error: " + e10.getMessage());
            return new kotlin.collections.i<>();
        }
    }
}
